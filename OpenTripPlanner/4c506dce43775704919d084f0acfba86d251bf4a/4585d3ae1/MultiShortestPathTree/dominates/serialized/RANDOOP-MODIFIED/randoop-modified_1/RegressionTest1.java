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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState195();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1036();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1576();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1964();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState682();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge91();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1207();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1271();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1913();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState225();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState363();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1608();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1033();
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState65();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1243();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState329();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1933();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState181();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState534();
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
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState309();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge18();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState598();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState356();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1230();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState202();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1331();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState248();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState648();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState176();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState488();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState389();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1790();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge130();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1295();
        org.opentripplanner.routing.core.StateData stateData11 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1356();
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
        org.junit.Assert.assertNull(stateData11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1027();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1718();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState658();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState475();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1173();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(stateData9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState65();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1243();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState772();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState697();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState47();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState862();
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1962();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState495();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1082();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState781();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState864();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1491();
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
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex25();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1226();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1463();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge82();
        org.opentripplanner.routing.graph.Vertex vertex9 = streetEdge8.getFromVertex();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(vertex9);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1736();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1052();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge51();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex45();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState625();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState910();
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
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState828();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1331();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState203();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge139();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1356();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1910();
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.core.State state3 = multiShortestPathTree1.getState(vertex2);
        long long4 = multiShortestPathTree1.getserialVersionUID();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter5 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter5.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter5.deserializeObjectState672();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter5.deserializeObjectVertex5();
        boolean boolean9 = intersectionVertex8.edgeTypesValid();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter10.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData12 = serializedObjectSupporter10.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter10.deserializeObjectState564();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter10.deserializeObjectState794();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter10.deserializeObjectState662();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex16 = serializedObjectSupporter10.deserializeObjectVertex26();
        double double17 = intersectionVertex8.azimuthTo((org.opentripplanner.routing.graph.Vertex) intersectionVertex16);
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree1.getStates((org.opentripplanner.routing.graph.Vertex) intersectionVertex16);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1000000L) + "'", long4 == (-1000000L));
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(stateData12);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNotNull(intersectionVertex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 115.58392222008641d + "'", double17 == 115.58392222008641d);
        org.junit.Assert.assertNull(stateList18);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState67();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState644();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1829();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1837();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState45();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState863();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState780();
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState995();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState149();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1530();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState804();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState826();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState253();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState627();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState556();
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState177();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1477();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex33();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState101();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1754();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState277();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1275();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1954();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState466();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState193();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1057();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState835();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState754();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState918();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1409();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState373();
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState545();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState370();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState899();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState861();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState663();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1438();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState216();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState444();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState47();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1359();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1108();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState688();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState527();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1713();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1883();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1294();
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
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge9();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState213();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState779();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState276();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState595();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1309();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1181();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1304();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState967();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState137();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1154();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState120();
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
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1357();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1233();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1365();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState781();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1610();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge60();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1936();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1420();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge8();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState210();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1411();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1327();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1386();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1488();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge134();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState188();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1097();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1741();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState544();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1577();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(stateData9);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1083();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1116();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState814();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState682();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge91();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState525();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState272();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1396();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState642();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState214();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState769();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1333();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState421();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState850();
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
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex41();
        com.vividsolutions.jts.geom.Coordinate coordinate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = intersectionVertex4.azimuthTo(coordinate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1236();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1072();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState65();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState355();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1617();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter3 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter3.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter3.deserializeObjectVertex26();
        streetEdge2.attachFrom((org.opentripplanner.routing.graph.Vertex) intersectionVertex5);
        double double7 = intersectionVertex5.getX();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter8.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter8.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter8.deserializeObjectState368();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter8.deserializeObjectState336();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex13 = serializedObjectSupporter8.deserializeObjectVertex25();
        java.lang.String str14 = intersectionVertex13.toString();
        double double15 = intersectionVertex5.azimuthTo((org.opentripplanner.routing.graph.Vertex) intersectionVertex13);
        java.util.List<org.opentripplanner.routing.graph.Edge> edgeList16 = intersectionVertex5.getOutgoingStreetEdges();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-73.9958121d) + "'", double7 == (-73.9958121d));
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(intersectionVertex13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<osm:node:42442273 lat,lng=40.723795,-74.000367>" + "'", str14, "<osm:node:42442273 lat,lng=40.723795,-74.000367>");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-113.19706475287364d) + "'", double15 == (-113.19706475287364d));
        org.junit.Assert.assertNotNull(edgeList16);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1949();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState650();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1245();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1657();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState995();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1837();
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
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState702();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge16();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1572();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1069();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1933();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState181();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1151();
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1224();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState432();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1582();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState84();
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
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState627();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState975();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1195();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1386();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1488();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge134();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1336();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge44();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState361();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState367();
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState389();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1732();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1432();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState475();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1969();
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
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter0.deserializeObjectState1371();
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
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1216();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState179();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1521();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState315();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1149();
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
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1216();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState314();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1027();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge101();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1940();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1736();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1033();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState240();
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1800();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1647();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1780();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState984();
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState966();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex25();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1275();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1386();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState208();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState561();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1621();
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
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1555();
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
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1533();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState804();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState590();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState541();
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState139();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState577();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState945();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1345();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState761();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1466();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState500();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState325();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState579();
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
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1396();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState380();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState609();
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1097();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1741();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1260();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState486();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1870();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1738();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1040();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState180();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState830();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState372();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState926();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1118();
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
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState540();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState723();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState862();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1648();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState219();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState100();
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
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1685();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState843();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState843();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(stateData9);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState970();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge12();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState380();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState723();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState862();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1648();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(stateData9);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState385();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState932();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1756();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1736();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState310();
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1015();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1052();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1512();
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1127();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge44();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1734();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1816();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState683();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1315();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState338();
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
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1633();
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
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1186();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState973();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1032();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState625();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState127();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState802();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState65();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1614();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState115();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState350();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1468();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState991();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState214();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState769();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1942();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge67();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState283();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState449();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState461();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState796();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState785();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState660();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState144();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1406();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState153();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState696();
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
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1900();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1158();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState372();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1890();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState302();
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
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1030();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState669();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1609();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1934();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        double double15 = intersectionVertex12.getX();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-74.000367d) + "'", double15 == (-74.000367d));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = null;
        multiShortestPathTree1.setstateSets(vertexMap2);
        int int4 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1736();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1396();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1453();
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
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge16();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState423();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1243();
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
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState464();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState494();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState49();
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState648();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState176();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge37();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter6.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter6.deserializeObjectEdge57();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter9 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter9.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex11 = serializedObjectSupporter9.deserializeObjectVertex26();
        streetEdge8.attachFrom((org.opentripplanner.routing.graph.Vertex) intersectionVertex11);
        streetEdge5.attachFrom((org.opentripplanner.routing.graph.Vertex) intersectionVertex11);
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNotNull(intersectionVertex11);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState505();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge49();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState774();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1311();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1909();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1637();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1804();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1962();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState495();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1040();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1056();
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge4();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState400();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.core.State state3 = multiShortestPathTree1.getState(vertex2);
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1355();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState866();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1425();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1171();
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
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState395();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState448();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState924();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1769();
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
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1356();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1827();
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
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1081();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1545();
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
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter0.deserializeObjectEdge104();
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
        org.junit.Assert.assertNotNull(streetEdge12);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1490();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState214();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState769();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1942();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState651();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1825();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState59();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1942();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState40();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1421();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState227();
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
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState983();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1150();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1376();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1321();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1631();
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
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState31();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1529();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState23();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState798();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1797();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1909();
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
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState950();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1132();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge63();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1368();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState462();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1759();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge30();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState691();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge83();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState138();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState781();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge99();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState764();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState277();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1195();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState671();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1716();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1119();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState139();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState38();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1738();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState671();
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
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge67();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState688();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState459();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState835();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState754();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState918();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1672();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1151();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState685();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState315();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1756();
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
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState158();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1677();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState364();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
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
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState309();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1498();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1334();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState680();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge38();
        org.junit.Assert.assertNull(state1);
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
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState946();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge76();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter0.deserializeObjectEdge77();
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
        org.junit.Assert.assertNotNull(streetEdge12);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState22();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex9();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState385();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState343();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState693();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1130();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState413();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateData8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState158();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState854();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1825();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState528();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1338();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1993();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1348();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState971();
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
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1291();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState609();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState247();
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
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState682();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge91();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState389();
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1472();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1376();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState59();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1529();
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
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1825();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1430();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1502();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState268();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1083();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1116();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState240();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState60();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1043();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex8();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1729();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1422();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1393();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState879();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState905();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1619();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1227();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1097();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1741();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState544();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState797();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState120();
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        int int4 = streetEdge3.detach();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState688();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1890();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1442();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1420();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState758();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1099();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1135();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1648();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1984();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge92();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState54();
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
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge6();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1808();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState392();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState346();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1210();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState342();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState939();
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
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState712();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState100();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge110();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState772();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState661();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1097();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1741();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState544();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState797();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState424();
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
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState712();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1009();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex47();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1150();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1376();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState174();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState828();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState728();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState603();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState693();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1028();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1053();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1550();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState255();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState81();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState745();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
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
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1650();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState265();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.StateData stateData3 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1625();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState632();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1014();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(stateData3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter0.deserializeObjectState157();
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
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1133();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState593();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState750();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState837();
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
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1759();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1232();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1668();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState934();
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
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState702();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1927();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1015();
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
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState142();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1889();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1448();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState346();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState805();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState195();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1825();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState528();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState994();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1317();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState627();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState818();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState179();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1521();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1767();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1650();
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
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState385();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState22();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1065();
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
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1130();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1481();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState144();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1406();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState153();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1655();
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
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1218();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1401();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState158();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState903();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState659();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge16();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState423();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1417();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState149();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState576();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1429();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1900();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState980();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1600();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState555();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState124();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState719();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState494();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1308();
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1027();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1180();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1499();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState417();
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
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState964();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState107();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState399();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1800();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1647();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState324();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1256();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState372();
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1150();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1376();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1321();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1624();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState197();
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
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState504();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState229();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState300();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState932();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState112();
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
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1706();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1554();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1503();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState860();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge4();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState47();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge139();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState981();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1051();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState627();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1159();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState712();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState182();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1635();
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1030();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState669();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1926();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1180();
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
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1015();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState293();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState176();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState348();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1800();
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
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState78();
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
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState999();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge40();
        double double5 = streetEdge4.getAzimuth();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.006827699004596d + "'", double5 == 32.006827699004596d);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState860();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1598();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState650();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1285();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex3 = serializedObjectSupporter0.deserializeObjectVertex5();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState350();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(intersectionVertex3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState612();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState325();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1396();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState380();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1663();
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
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.StateData stateData3 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1625();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState632();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1047();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1370();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(stateData3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1898();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1165();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1063();
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
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState300();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1781();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge102();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1651();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState762();
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
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1262();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState253();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1138();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState808();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState837();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1419();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1196();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.StateData stateData10 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1550();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(stateData10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState272();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState693();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState585();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1053();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState885();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1817();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState863();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1263();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState358();
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
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState10();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1744();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState466();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState568();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState688();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState321();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1416();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState694();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState394();
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
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1133();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1139();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState405();
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
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1274();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1987();
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
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1275();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1067();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState545();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1119();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState160();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState359();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1615();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState157();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1861();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex45();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState652();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState914();
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
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1396();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState380();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState295();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1506();
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
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1683();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1157();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState743();
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
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState707();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1347();
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
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter0.deserializeObjectState325();
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
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1275();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState225();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1793();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1905();
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
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState828();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1331();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1915();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState995();
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
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1396();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge3();
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState921();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1634();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1309();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState216();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1436();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1699();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1749();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState823();
        org.opentripplanner.routing.core.StateData stateData11 = serializedObjectSupporter0.deserializeObjectStateData2();
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
        org.junit.Assert.assertNull(stateData11);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState835();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1855();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge47();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1983();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState434();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1581();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState789();
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
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState781();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState864();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState540();
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
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState361();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1386();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex28();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1618();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1411();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState342();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1346();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1849();
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
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1531();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState363();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState140();
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
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1416();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1061();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge130();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState667();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState342();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1715();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState818();
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState784();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge56();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1016();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState464();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState494();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState888();
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
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1594();
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
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1760();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1605();
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
        org.junit.Assert.assertNotNull(streetEdge11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1825();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1776();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState300();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge6();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1240();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState811();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState960();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState309();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1498();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1334();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState680();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1462();
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
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState500();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState305();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1917();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1823();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState158();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1677();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState142();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
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
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1699();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1749();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1675();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState152();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState350();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1208();
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
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState219();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState144();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1673();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1139();
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
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState806();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState343();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1094();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState675();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState760();
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1568();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState22();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex30();
        intersectionVertex5.removeAllEdges();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1564();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState4();
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
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState214();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState769();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1942();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge67();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1325();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState534();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState22();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex9();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState873();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState43();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState10();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1135();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState530();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1472();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1728();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState143();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1041();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1468();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState213();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1416();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState694();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState36();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1607();
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
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1511();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge88();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1082();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1164();
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
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1501();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState195();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1985();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState302();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1261();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState255();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState158();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1809();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex22();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState699();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState50();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1130();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1567();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState732();
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
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1416();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1061();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1314();
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
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState894();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState812();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState874();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState309();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState58();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1906();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1410();
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge56();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter5 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter5.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter5.deserializeObjectEdge57();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter8.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex10 = serializedObjectSupporter8.deserializeObjectVertex26();
        streetEdge7.attachFrom((org.opentripplanner.routing.graph.Vertex) intersectionVertex10);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter12 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter12.deserializeObjectState443();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter12.deserializeObjectState378();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge15 = serializedObjectSupporter12.deserializeObjectEdge113();
        boolean boolean16 = intersectionVertex10.removeIncoming((org.opentripplanner.routing.graph.Edge) streetEdge15);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter17 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge18 = serializedObjectSupporter17.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex19 = serializedObjectSupporter17.deserializeObjectVertex26();
        org.opentripplanner.routing.graph.Vertex.ValidEdgeTypes validEdgeTypes20 = intersectionVertex19.getValidOutgoingEdgeTypes();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter21 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge22 = serializedObjectSupporter21.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state23 = serializedObjectSupporter21.deserializeObjectState672();
        org.opentripplanner.routing.core.State state24 = serializedObjectSupporter21.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state25 = serializedObjectSupporter21.deserializeObjectState596();
        org.opentripplanner.routing.core.State state26 = serializedObjectSupporter21.deserializeObjectState541();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex27 = serializedObjectSupporter21.deserializeObjectVertex45();
        streetEdge15.attach((org.opentripplanner.routing.graph.Vertex) intersectionVertex19, (org.opentripplanner.routing.graph.Vertex) intersectionVertex27);
        streetEdge4.attachTo((org.opentripplanner.routing.graph.Vertex) intersectionVertex19);
        int int30 = intersectionVertex19.getIndex();
        org.opentripplanner.routing.graph.Vertex.ValidEdgeTypes validEdgeTypes31 = intersectionVertex19.getValidOutgoingEdgeTypes();
        double double32 = intersectionVertex19.getLon();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNotNull(intersectionVertex10);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNotNull(streetEdge15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(streetEdge18);
        org.junit.Assert.assertNotNull(intersectionVertex19);
        org.junit.Assert.assertNotNull(validEdgeTypes20);
        org.junit.Assert.assertNotNull(streetEdge22);
        org.junit.Assert.assertNull(state23);
        org.junit.Assert.assertNull(state24);
        org.junit.Assert.assertNull(state25);
        org.junit.Assert.assertNull(state26);
        org.junit.Assert.assertNotNull(intersectionVertex27);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 95174 + "'", int30 == 95174);
        org.junit.Assert.assertNotNull(validEdgeTypes31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-73.9958121d) + "'", double32 == (-73.9958121d));
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState389();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1698();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1820();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1649();
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
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1933();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1718();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState356();
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState363();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState573();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1022();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1796();
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
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState999();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState724();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState778();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1993();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1287();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1250();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1420();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState758();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState390();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1946();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState263();
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
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState47();
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
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1962();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState495();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1425();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState721();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1194();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1468();
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
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1258();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1343();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1697();
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
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState177();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState576();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState214();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState769();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState807();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState607();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1618();
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
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState524();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState997();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState886();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState859();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState606();
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
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState835();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState754();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState918();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1672();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1151();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1494();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState667();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState483();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1669();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState331();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1056();
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1964();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState28();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState234();
        org.opentripplanner.routing.core.StateData stateData12 = serializedObjectSupporter0.deserializeObjectStateData2();
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
        org.junit.Assert.assertNull(stateData12);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState177();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState16();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1458();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateData8);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1309();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1496();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1321();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState403();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1196();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1685();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState843();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState328();
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
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter0.deserializeObjectState1758();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter0.deserializeObjectState467();
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
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1137();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1751();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState479();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState25();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState784();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState813();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState127();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState885();
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1472();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1376();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState59();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState506();
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState830();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1472();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1728();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState619();
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
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1386();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1076();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState957();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState54();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState825();
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
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1097();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge73();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1002();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState699();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState997();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState886();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState111();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState796();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1704();
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
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState22();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex9();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState873();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState795();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState664();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState847();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState835();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState532();
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
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1224();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState432();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1582();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1413();
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
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState752();
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1118();
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
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState997();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState886();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState859();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1832();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1709();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1398();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1900();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1419();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1251();
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
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState983();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1188();
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex25();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1226();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1463();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge82();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1975();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1470();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1501();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1839();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState112();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState793();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge120();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState424();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState417();
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
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState363();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState34();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1779();
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
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1214();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1033();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1229();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(stateData9);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState276();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1588();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1326();
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
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1699();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateData8);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState155();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState156();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState10();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1744();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1931();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState363();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState573();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1789();
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
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState805();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1274();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState743();
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
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState147();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState403();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1004();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState65();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState555();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState483();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1655();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1942();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1499();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1264();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1700();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1657();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1555();
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
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState555();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState612();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge109();
        int int2 = streetEdge1.getId();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 221 + "'", int2 == 221);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1224();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState432();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1582();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge135();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState67();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState481();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState166();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState773();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState408();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1472();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1728();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState143();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState278();
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
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState309();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1498();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState879();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1637();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState579();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.StateData stateData3 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1817();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(stateData3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1027();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1718();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1387();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState41();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState141();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1472();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1726();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1557();
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
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1933();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge25();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState214();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState769();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState179();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState981();
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
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState276();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1746();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge63();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        int int0 = org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 30 + "'", int0 == 30);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState723();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState276();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState773();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState262();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1274();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState388();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState23();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState326();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState492();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState532();
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
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState243();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState415();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState684();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1501();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState743();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState843();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1472();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState148();
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
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState806();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1279();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1389();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1274();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState388();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState757();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState177();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState16();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1458();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1625();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState804();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState826();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState253();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState317();
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
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        org.opentripplanner.routing.graph.Vertex.ValidEdgeTypes validEdgeTypes11 = intersectionVertex10.getValidIncomingEdgeTypes();
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
        org.junit.Assert.assertNotNull(validEdgeTypes11);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1043();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex8();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1050();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState999();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState202();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1601();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1713();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState690();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1933();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1718();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState362();
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState821();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState443();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1506();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1763();
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
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState773();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1571();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState623();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1551();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1214();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1033();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1229();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState864();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1255();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState558();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState941();
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
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.core.State state3 = multiShortestPathTree1.getState(vertex2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(routingRequest4);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState640();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState539();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1416();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState694();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState36();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState845();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState793();
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
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState999();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1137();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState60();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState137();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex28();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState999();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter5 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter5.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter5.deserializeObjectVertex26();
        streetEdge4.attachTo((org.opentripplanner.routing.graph.Vertex) intersectionVertex7);
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState309();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState58();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState57();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1659();
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
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState586();
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
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1546();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1773();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter24 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state25 = serializedObjectSupporter24.deserializeObjectState747();
        org.opentripplanner.routing.core.State state26 = serializedObjectSupporter24.deserializeObjectState567();
        org.opentripplanner.routing.core.State state27 = serializedObjectSupporter24.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state28 = serializedObjectSupporter24.deserializeObjectState962();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge29 = serializedObjectSupporter24.deserializeObjectEdge135();
        intersectionVertex22.addOutgoing((org.opentripplanner.routing.graph.Edge) streetEdge29);
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
        org.junit.Assert.assertNull(state25);
        org.junit.Assert.assertNull(state26);
        org.junit.Assert.assertNull(state27);
        org.junit.Assert.assertNull(state28);
        org.junit.Assert.assertNotNull(streetEdge29);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1942();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1499();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1264();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1154();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateData8);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState579();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState567();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1411();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState149();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState576();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1154();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState395();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState860();
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState47();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1359();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1151();
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
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState501();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex11 = serializedObjectSupporter0.deserializeObjectVertex8();
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
        org.junit.Assert.assertNotNull(intersectionVertex11);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState45();
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
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1713();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState58();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState591();
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
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState441();
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex35();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState241();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState497();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1587();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1278();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState835();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState754();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState918();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1672();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState819();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState213();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState300();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge6();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1240();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState811();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1257();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1386();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex28();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1289();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState941();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex7();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState785();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState313();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState522();
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
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1995();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState852();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1852();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateData8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1275();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState259();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState813();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex2();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1368();
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
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1180();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState863();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState332();
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
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1260();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState146();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1101();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1518();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState627();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1266();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1933();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState276();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState418();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState557();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1256();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1232();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState482();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState322();
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
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1102();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1698();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1796();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState521();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1262();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1190();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState805();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        org.opentripplanner.routing.core.StateData stateData11 = serializedObjectSupporter0.deserializeObjectStateData1();
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
        org.junit.Assert.assertNull(stateData11);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState840();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1373();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1920();
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
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState607();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1216();
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
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1800();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState209();
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState682();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1944();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1970();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState122();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1561();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex10 = serializedObjectSupporter0.deserializeObjectVertex21();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
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
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState335();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState22();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex9();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState873();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState435();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1262();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1210();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1224();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState432();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1984();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1209();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex41();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState866();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1425();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState76();
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
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState699();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1847();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState28();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1501();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1839();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1772();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1133();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState593();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1082();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1726();
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState395();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1415();
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
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1393();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState34();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState210();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1980();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1730();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState300();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState932();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1860();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1127();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState390();
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
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState999();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1949();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        org.opentripplanner.routing.core.StateData stateData11 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1339();
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
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge9();
        boolean boolean5 = streetEdge4.isRoundabout();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1736();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1033();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState293();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState561();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1713();
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
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1137();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1801();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1683();
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
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1501();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1839();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState492();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1081();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState330();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1007();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState38();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState864();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1678();
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
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState598();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState758();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1071();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState541();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState688();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState179();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState545();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState47();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1359();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1868();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1719();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1056();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
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
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex25();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1379();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState292();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState953();
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
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState808();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState837();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1419();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1196();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.StateData stateData10 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(stateData10);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState31();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1529();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
    }
}
