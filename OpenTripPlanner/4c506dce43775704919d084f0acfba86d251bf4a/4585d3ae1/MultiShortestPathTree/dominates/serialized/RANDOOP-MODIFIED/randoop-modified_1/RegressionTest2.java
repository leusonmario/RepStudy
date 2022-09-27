import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1799();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState178();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1402();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState350();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState214();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState602();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1141();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1334();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1042();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState995();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState149();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1465();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState546();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex13 = serializedObjectSupporter0.deserializeObjectVertex2();
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
        org.junit.Assert.assertNotNull(intersectionVertex13);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState618();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1940();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState543();
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
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1802();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex43();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge50();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1946();
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
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1857();
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState561();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge70();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState10();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1949();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState874();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1841();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState214();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState302();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState269();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState467();
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
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState309();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState58();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState57();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState165();
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState210();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState166();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1010();
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
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState467();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState40();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex45();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState443();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter7.deserializeObjectState378();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter7.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter7.deserializeObjectState627();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter7.deserializeObjectState820();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge13 = serializedObjectSupporter7.deserializeObjectEdge41();
        intersectionVertex6.addIncoming((org.opentripplanner.routing.graph.Edge) streetEdge13);
        double double15 = intersectionVertex6.getLat();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(streetEdge13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.7282399d + "'", double15 == 40.7282399d);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState983();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState222();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState505();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState389();
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
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1685();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState843();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState843();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1236();
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState675();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState436();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState447();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState109();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState309();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState58();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1416();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState207();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1210();
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1671();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState707();
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
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState191();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState376();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState709();
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
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1721();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1773();
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
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState468();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState574();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState155();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1059();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState835();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState754();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1713();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState965();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState318();
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
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState144();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState44();
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
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState804();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState826();
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
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1081();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1195();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1880();
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState426();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState462();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1275();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1056();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState470();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState897();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState802();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1669();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1477();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState875();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1116();
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1027();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1718();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1924();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState714();
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
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState382();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState760();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1949();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState585();
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
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1094();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState675();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1349();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateData8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState12();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1181();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1848();
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
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1356();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState467();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState129();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1147();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState747();
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
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState852();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState100();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState12();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1181();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1136();
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
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState840();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1983();
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
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1984();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge92();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState465();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState197();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(stateData8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex3 = serializedObjectSupporter0.deserializeObjectVertex5();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState790();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1289();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1542();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(intersectionVertex3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1683();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState601();
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
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState893();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1908();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState806();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState562();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState355();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState733();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState546();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState538();
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1843();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1030();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1355();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1574();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState879();
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState394();
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
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState10();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1601();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1186();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState928();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState360();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex35();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState594();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState459();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1455();
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
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState804();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState48();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState399();
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
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState363();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1967();
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
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState144();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState239();
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
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1738();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1978();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1832();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1291();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState609();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState4();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex22();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState641();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
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
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState699();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1847();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState690();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(stateData9);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1396();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState824();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1182();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState875();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1695();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState461();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState327();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex11 = serializedObjectSupporter0.deserializeObjectVertex32();
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState598();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState289();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge38();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1030();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState669();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1609();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge7();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState548();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1790();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1369();
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
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState731();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState965();
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1800();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState699();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1518();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState896();
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
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1309();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState539();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState544();
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
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState999();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1408();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState320();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1258();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState995();
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
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1522();
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState579();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState399();
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState454();
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
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState517();
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
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState997();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState886();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1817();
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
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState47();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1359();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState533();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1954();
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
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1237();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState538();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState583();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState362();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1985();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState219();
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
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1416();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1061();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1688();
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
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState689();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1224();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState432();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1984();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState238();
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
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState117();
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
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState671();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1276();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1573();
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
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState382();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState760();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1949();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState788();
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
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState216();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1252();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1438();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1963();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1214();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1033();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1229();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState864();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState600();
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
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState772();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState668();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1487();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState622();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1423();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1427();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState188();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1800();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState882();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1926();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState453();
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
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1960();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState808();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState837();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState440();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(stateData9);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1044();
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
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1491();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1518();
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
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState555();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1034();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge22();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge100();
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
        org.junit.Assert.assertNotNull(streetEdge11);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1736();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1214();
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
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1937();
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
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState300();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState932();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1429();
        org.opentripplanner.routing.core.StateData stateData10 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1398();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1823();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(stateData10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1799();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge88();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState820();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1761();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState732();
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
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge83();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState518();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState715();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState83();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex25();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1226();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1463();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge82();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1858();
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
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState828();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState465();
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
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1900();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1561();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState977();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState138();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState835();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState787();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState331();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1910();
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
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState763();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1213();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState279();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge6();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1567();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        long long0 = org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1000000L) + "'", long0 == (-1000000L));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1969();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1102();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1698();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState770();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1719();
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
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1574();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge3();
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
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState999();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1037();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState215();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState881();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState274();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState964();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1698();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1730();
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
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1900();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState987();
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
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState664();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState847();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1190();
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
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1218();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1503();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex35();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1323();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState439();
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
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState983();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState446();
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
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState184();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState573();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState654();
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
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState784();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1700();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1040();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1476();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1130();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState366();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
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
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex25();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1226();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1463();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge82();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(stateData9);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1275();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1813();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1233();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState706();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1352();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState432();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1396();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1467();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState770();
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
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState549();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1116();
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
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState997();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState886();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState778();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState467();
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
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState395();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState448();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge15();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1150();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState99();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1666();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1015();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1052();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState485();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1134();
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1224();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState27();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState650();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState447();
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
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState158();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState838();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1891();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState967();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState137();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex47();
        java.util.Collection<org.opentripplanner.routing.graph.Edge> edgeCollection6 = intersectionVertex5.getOutgoing();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(edgeCollection6);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1439();
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
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1309();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1996();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1769();
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
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1186();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState17();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1683();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1157();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState932();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1253();
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
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState110();
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
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1706();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1180();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1139();
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
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState421();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1398();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1321();
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
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1102();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1698();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState463();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState699();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1847();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1758();
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
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1678();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState40();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState22();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex30();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge73();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1580();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState386();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1818();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState155();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1516();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState10();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1601();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1152();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1293();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1214();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1033();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1229();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState265();
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
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex2();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter6.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter6.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter6.deserializeObjectState310();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter6.deserializeObjectState651();
        org.opentripplanner.routing.core.StateData stateData11 = serializedObjectSupporter6.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter6.deserializeObjectState272();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge13 = serializedObjectSupporter6.deserializeObjectEdge130();
        boolean boolean14 = intersectionVertex5.removeIncoming((org.opentripplanner.routing.graph.Edge) streetEdge13);
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(stateData11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(streetEdge13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1032();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState625();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState76();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState970();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState830();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState216();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1732();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1347();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState999();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge130();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState574();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1485();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState312();
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
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState366();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState18();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState224();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState290();
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
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1909();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1637();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateData8);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1015();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1943();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState337();
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
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1083();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1116();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState240();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState779();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState825();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1767();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge32();
        org.opentripplanner.routing.core.StateData stateData10 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNull(stateData10);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1984();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge92();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState826();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState720();
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
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1291();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState609();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState4();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1826();
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
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState483();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1014();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1329();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState33();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState517();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1320();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState554();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex28();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState144();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState505();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge39();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1586();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1885();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState772();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState461();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState800();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1223();
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
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1345();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState579();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1933();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState363();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1780();
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
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1356();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState467();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState101();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1693();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState365();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge19();
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
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState10();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1601();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState781();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState803();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState450();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1161();
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
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState354();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge124();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState196();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState210();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState735();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex18();
        java.lang.String str9 = intersectionVertex8.toString();
        intersectionVertex8.setStreetName("MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<osm:node:42439530 lat,lng=40.726496,-74.00235>" + "'", str9, "<osm:node:42439530 lat,lng=40.726496,-74.00235>");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1984();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1286();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState359();
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
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1189();
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
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState639();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1051();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex35();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1323();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge23();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState495();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState845();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState349();
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
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1279();
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
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1488();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex14();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1133();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1139();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState3();
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
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState22();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex9();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState373();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState342();
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
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState170();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState631();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState210();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState724();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1988();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState392();
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
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState76();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1604();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateData8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState450();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState760();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState753();
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
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge36();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1711();
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
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState760();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState159();
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
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState804();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState48();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState78();
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
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1452();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState719();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1231();
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
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1775();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState420();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState210();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState166();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState300();
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
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1800();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1510();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1915();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState345();
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
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex35();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1323();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1514();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1272();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState468();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState659();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState39();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1800();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1647();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1780();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState60();
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
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1224();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState432();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1984();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1058();
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
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState699();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1847();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState690();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState434();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState216();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1252();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1809();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1331();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1356();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState467();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1736();
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
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState300();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState932();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1429();
        org.opentripplanner.routing.core.StateData stateData10 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(stateData10);
        org.junit.Assert.assertNotNull(streetEdge11);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        int int0 = org.opentripplanner.routing.graph.Vertex.getMaxIndex();
// flaky:         org.junit.Assert.assertTrue("'" + int0 + "' != '" + 119793 + "'", int0 == 119793);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1685();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState843();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState280();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1258();
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
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState983();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState222();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1338();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1440();
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
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1615();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState422();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1942();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState991();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1129();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1372();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1232();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState394();
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
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState950();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1536();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1336();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState868();
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
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState769();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1242();
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
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState760();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1087();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1040();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState889();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex35();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState568();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1723();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState488();
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
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1767();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1900();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1137();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState500();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState455();
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
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState763();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1218();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState22();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex9();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState873();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState322();
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
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge16();
        boolean boolean8 = streetEdge7.isRoundabout();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1511();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1528();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge95();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1710();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1609();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState226();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1275();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState269();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState755();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1342();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState65();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1626();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1150();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1931();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1456();
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
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1845();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1562();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(stateData9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1978();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1091();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(stateData6);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1683();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1157();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState466();
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
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1845();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.StateData stateData12 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(stateData9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(stateData12);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1112();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1993();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1923();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState426();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1326();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1877();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState542();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState73();
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
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState67();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState104();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge25();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState87();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1579();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState914();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        int int11 = streetEdge10.detach();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1736();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1314();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState572();
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
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1137();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState60();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState974();
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
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1621();
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
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState699();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1448();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState657();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState829();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1322();
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
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState897();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1802();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState280();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState208();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1250();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState249();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1584();
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
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1825();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1430();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1502();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1714();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex45();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1894();
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
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1015();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1052();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState474();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState561();
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
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState450();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState164();
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
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState548();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1857();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1032();
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
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState461();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState810();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1661();
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
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1933();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState383();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState628();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1261();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState473();
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
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState331();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1247();
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
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState276();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1588();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1025();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1097();
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
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1671();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState61();
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
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1844();
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
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1712();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState116();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1941();
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
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState272();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1607();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState389();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1732();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState787();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1332();
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
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState712();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState105();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState447();
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
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1138();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1962();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState431();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState300();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState675();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge30();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1652();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge87();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1511();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1528();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge32();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState341();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState639();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState182();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState820();
        org.opentripplanner.routing.core.StateData stateData13 = serializedObjectSupporter0.deserializeObjectStateData1();
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
        org.junit.Assert.assertNull(stateData13);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState723();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState862();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1648();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1690();
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
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState300();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState932();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1429();
        org.opentripplanner.routing.core.StateData stateData10 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.StateData stateData11 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(stateData10);
        org.junit.Assert.assertNull(stateData11);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState272();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState490();
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
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState731();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState194();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1376();
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
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState47();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1212();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState257();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1464();
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
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1145();
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
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState143();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge39();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1305();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState177();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1477();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex33();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState971();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState385();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState932();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState114();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState288();
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
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1771();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState548();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState184();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState781();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1035();
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
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge16();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1883();
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
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState682();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge91();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState576();
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
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState964();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1698();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState977();
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
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState24();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState557();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState808();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge122();
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
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1760();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1540();
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
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1942();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState40();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState135();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1396();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1981();
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
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge44();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1558();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1194();
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
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState594();
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
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState147();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState403();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState922();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1685();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState843();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState618();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1852();
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
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge28();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState914();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState530();
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
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1685();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState24();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState557();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState808();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1855();
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
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState212();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState484();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex35();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState78();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1291();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState609();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState4();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1297();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1112();
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
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1618();
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
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        org.opentripplanner.routing.core.StateData stateData10 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
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
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1015();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState145();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState650();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState699();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1847();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge9();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1480();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter0.deserializeObjectState1915();
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
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState149();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState154();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState23();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState326();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState226();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1752();
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
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex45();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1639();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState996();
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
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1685();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState843();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState843();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState718();
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
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1800();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1510();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1915();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState659();
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
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1141();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1640();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1008();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1867();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState289();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1232();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState551();
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
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState137();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge6();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1331();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1386();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1080();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1872();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState342();
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
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge47();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState865();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState983();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1281();
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
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState395();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState448();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge96();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1984();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState117();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1094();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState675();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState564();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateData8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState108();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1825();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState73();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1702();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter0.deserializeObjectEdge62();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1730();
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
        org.junit.Assert.assertNotNull(streetEdge12);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1800();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1647();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState324();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1091();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState710();
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
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState591();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState347();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1010();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState69();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1702();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState639();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1945();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1161();
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
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1784();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1990();
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
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState618();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1940();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1487();
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
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1262();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState489();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1498();
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
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1420();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState758();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState967();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState137();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex47();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState731();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1363();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1085();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState9();
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
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1030();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState117();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState850();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState545();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1584();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState466();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState44();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState886();
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
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1511();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState212();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState386();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState748();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1030();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState117();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState916();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState67();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState481();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1798();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge21();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1391();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1417();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState64();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1542();
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
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState385();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge18();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState466();
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
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState173();
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
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState177();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1731();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState950();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1473();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1514();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState530();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge47();
        org.opentripplanner.routing.core.State state4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state5 = streetEdge3.traverse(state4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1420();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState758();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState619();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1416();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge81();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1131();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState887();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState555();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState124();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState719();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState494();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState139();
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
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1043();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex8();
        double double8 = intersectionVertex7.getLon();
        java.util.Collection<org.opentripplanner.routing.graph.Edge> edgeCollection9 = intersectionVertex7.getIncoming();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-73.9975706d) + "'", double8 == (-73.9975706d));
        org.junit.Assert.assertNotNull(edgeCollection9);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex25();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1379();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1546();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1375();
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
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState302();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1269();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1275();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1813();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1233();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1718();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState340();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState795();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState562();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1599();
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
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1723();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState890();
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
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex35();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1323();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1263();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge140();
        boolean boolean7 = streetEdge6.isPartial();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1355();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1368();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState462();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1759();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState890();
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
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1730();
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
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1472();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState981();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState124();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState81();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1382();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState309();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState225();
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
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState486();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState238();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState236();
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
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1926();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1604();
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
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex3();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState131();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1900();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1419();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1282();
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
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1762();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState950();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1623();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1190();
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
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState648();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1025();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState19();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState644();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1736();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1396();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState222();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1154();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState878();
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
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState977();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(stateData9);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState628();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState532();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1040();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState740();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState520();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState599();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
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
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1532();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState58();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState406();
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
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState10();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1601();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1751();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState822();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1574();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1835();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex35();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex29();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState298();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState12();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex11 = serializedObjectSupporter0.deserializeObjectVertex6();
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
        org.junit.Assert.assertNotNull(intersectionVertex11);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1053();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState605();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1859();
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
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        org.opentripplanner.routing.core.State state3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = multiShortestPathTree1.add(state3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge141();
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
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1759();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1232();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1668();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState223();
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
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState177();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState477();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1825();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1674();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1358();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1374();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState70();
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
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState702();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1927();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState964();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1870();
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
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState350();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState336();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState210();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1860();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1607();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex34();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.StateData stateData3 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1625();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1078();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(stateData3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1386();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1488();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge134();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState575();
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
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState924();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState529();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState999();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState724();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1173();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState158();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState267();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1158();
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
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1356();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1867();
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
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter0.deserializeObjectState624();
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
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState775();
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
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState200();
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
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState688();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1890();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1600();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1772();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1241();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState603();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState761();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge44();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1583();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState40();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1897();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState774();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge49();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState103();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState210();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1860();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1257();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1760();
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
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState875();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1695();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState461();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1546();
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
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1224();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1060();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState594();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState544();
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
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState818();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1373();
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
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1760();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1311();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState866();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1425();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData1();
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
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1224();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState27();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState540();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState268();
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
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState545();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1584();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.StateData stateData3 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1861();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1443();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(stateData3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState191();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState623();
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
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1565();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1837();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1236();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1558();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1591();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1835();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState274();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState832();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1098();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.StateData stateData3 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState429();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(stateData3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState683();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1795();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1940();
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
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState657();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1441();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1249();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge20();
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
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1488();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1957();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1319();
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
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState546();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1320();
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
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState699();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1847();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1668();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = null;
        multiShortestPathTree1.setstateSets(vertexMap2);
        long long4 = multiShortestPathTree1.getserialVersionUID();
        double double5 = multiShortestPathTree1.getTIME_EPSILON();
        double double6 = multiShortestPathTree1.getWEIGHT_EPSILON();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1000000L) + "'", long4 == (-1000000L));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.02d + "'", double5 == 0.02d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.02d + "'", double6 == 0.02d);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState674();
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
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState158();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState441();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState149();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState492();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge8();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState420();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1555();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState222();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState946();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState953();
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
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState67();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1116();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1648();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1173();
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
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState300();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState518();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState155();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1166();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState382();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState760();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1411();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState628();
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
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState555();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState124();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState102();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState159();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter0.deserializeObjectEdge8();
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
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(streetEdge12);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1984();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge92();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState465();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1997();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(stateData8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1909();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1007();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1429();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1692();
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
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1969();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState340();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1386();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex28();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1289();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState729();
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
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState466();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState193();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState991();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState49();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState243();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState708();
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
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex35();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState241();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState931();
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
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1344();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1316();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1611();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState26();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1775();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState726();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1755();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1224();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState27();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState650();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateData8);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState428();
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
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateData8);
        org.junit.Assert.assertNull(stateData9);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1877();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState832();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1107();
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
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1736();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1396();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState266();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge28();
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
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState395();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState938();
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
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState598();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState883();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1638();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState950();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1536();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1141();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState179();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1521();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1918();
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
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState804();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge52();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState309();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1498();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.graph.Vertex vertex9 = streetEdge8.getFromVertex();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter10.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter10.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter10.deserializeObjectState368();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter10.deserializeObjectState1704();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex15 = serializedObjectSupporter10.deserializeObjectVertex35();
        com.vividsolutions.jts.geom.Coordinate coordinate16 = intersectionVertex15.getCoordinate();
        double double17 = vertex9.azimuthTo(coordinate16);
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(vertex9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(streetEdge12);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNotNull(intersectionVertex15);
        org.junit.Assert.assertNotNull(coordinate16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 82.09396813753744d + "'", double17 == 82.09396813753744d);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1501();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState351();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge95();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState685();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState994();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState611();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState214();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1030();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState669();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1926();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState276();
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
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1615();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1294();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState10();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1744();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState570();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState70();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1597();
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
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState504();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState406();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1430();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState723();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState862();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1648();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge141();
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
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState318();
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
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1870();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState170();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState370();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1027();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1718();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState908();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState921();
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
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1511();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1304();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState228();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1926();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1896();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge52();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState332();
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
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex35();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1323();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1026();
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
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1825();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState528();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState994();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1531();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1578();
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
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge9();
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
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1287();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState464();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState685();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState147();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState36();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState980();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState815();
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
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState10();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1744();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState759();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState288();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }
}
