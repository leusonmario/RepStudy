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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge49();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState450();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1383();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState630();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState749();
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
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState905();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1277();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState562();
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState134();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1663();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1383();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1668();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        long long7 = state6.getTimeInMillis();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1638887710000L + "'", long7 == 1638887710000L);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState686();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1541();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1794();
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState436();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1396();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState661();
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
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState607();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState918();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1147();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState190();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState872();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1209();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1154();
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
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1089();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState79();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState61();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState95();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1804();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState36();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState390();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge118();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState184();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1403();
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
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1511();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1892();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1660();
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
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1741();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState160();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState833();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1130();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge3();
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState199();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState827();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState463();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge65();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1577();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState112();
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
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1515();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1439();
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1263();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState309();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1422();
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
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1943();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1727();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState976();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1885();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1084();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1439();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState600();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter7.deserializeObjectState898();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter7.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter7.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter7.deserializeObjectState536();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex13 = serializedObjectSupporter7.deserializeObjectVertex47();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter7.deserializeObjectState934();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter7.deserializeObjectState371();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter7.deserializeObjectState451();
        org.opentripplanner.routing.core.State state17 = serializedObjectSupporter7.deserializeObjectState1539();
        org.opentripplanner.routing.core.State state18 = serializedObjectSupporter7.deserializeObjectState1859();
        org.opentripplanner.routing.core.State state19 = serializedObjectSupporter7.deserializeObjectState279();
        org.opentripplanner.routing.core.State state20 = serializedObjectSupporter7.deserializeObjectState723();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter21 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state22 = serializedObjectSupporter21.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state23 = serializedObjectSupporter21.deserializeObjectState990();
        org.opentripplanner.routing.core.State state24 = serializedObjectSupporter21.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state25 = serializedObjectSupporter21.deserializeObjectState503();
        org.opentripplanner.routing.core.State state26 = serializedObjectSupporter21.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state27 = serializedObjectSupporter21.deserializeObjectState1394();
        org.opentripplanner.routing.core.StateData stateData28 = serializedObjectSupporter21.deserializeObjectStateData2();
        state20.setstateData(stateData28);
        state6.stateData = stateData28;
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
        org.junit.Assert.assertNotNull(intersectionVertex13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertNotNull(state17);
        org.junit.Assert.assertNotNull(state18);
        org.junit.Assert.assertNotNull(state19);
        org.junit.Assert.assertNotNull(state20);
        org.junit.Assert.assertNotNull(state22);
        org.junit.Assert.assertNotNull(state23);
        org.junit.Assert.assertNotNull(state24);
        org.junit.Assert.assertNotNull(state25);
        org.junit.Assert.assertNotNull(state26);
        org.junit.Assert.assertNotNull(state27);
        org.junit.Assert.assertNotNull(stateData28);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1751();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1297();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1597();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState555();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1774();
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
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState534();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1474();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState508();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState486();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1152();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1071();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1862();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1152();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1071();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState334();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1377();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState950();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1976();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1290();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState124();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState106();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1020();
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
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState259();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1892();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1538();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1300();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState565();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState133();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1040();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1927();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1422();
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
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1447();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState307();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1011();
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1990();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1753();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState233();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState199();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState121();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState179();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState890();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1318();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState537();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState607();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState8();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1932();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState249();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState241();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState573();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState436();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1729();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState678();
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
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1969();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState739();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState158();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState563();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState74();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1573();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1317();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState18();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge64();
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
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState771();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState471();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1244();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1590();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState688();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState273();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge52();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState802();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState855();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1337();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1976();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState910();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState422();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1885();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1084();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1547();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState161();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState774();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1971();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge16();
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
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1612();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState119();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge67();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1364();
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
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState765();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter0.deserializeObjectState1723();
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
        org.junit.Assert.assertNotNull(state14);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState228();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState214();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1887();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState248();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1550();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1996();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState714();
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
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1936();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState405();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState457();
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
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1834();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState318();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState462();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState686();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState686();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1541();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState548();
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
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState21();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge44();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState438();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState233();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1314();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1533();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1475();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1127();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState171();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1569();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1573();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1317();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState18();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1248();
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
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge67();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1523();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1832();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1544();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1466();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1906();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1977();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState890();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState967();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1675();
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
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1615();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState377();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState890();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1318();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState974();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState199();
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
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1834();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge24();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState683();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState805();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState251();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1451();
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState676();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState776();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1489();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState700();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState112();
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
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1568();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1995();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState943();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1320();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState686();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1541();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState795();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1963();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1446();
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
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState467();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1935();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState983();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1354();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState878();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge130();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1178();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState462();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge17();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1025();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState462();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1841();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1610();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState620();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState878();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge130();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState38();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState805();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState956();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1187();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1158();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1536();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter5 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter5.deserializeObjectState600();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter5.deserializeObjectState898();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter5.deserializeObjectState944();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter5.deserializeObjectState1144();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter5.deserializeObjectState965();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter5.deserializeObjectEdge101();
        state4.backEdge = streetEdge11;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(streetEdge11);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1154();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState777();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState31();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1285();
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1691();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState875();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState643();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge75();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1988();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1644();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState926();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1784();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1949();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1759();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1499();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1612();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState945();
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState676();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1602();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState21();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState675();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState445();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState71();
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState870();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState21();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState242();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState297();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState133();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1850();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState78();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1148();
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
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState248();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState649();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1358();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1277();
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex16();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1710();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1612();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState68();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState597();
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
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex36();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1633();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState333();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState248();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState555();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1550();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex5();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge141();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge65();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState203();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState643();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1559();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1847();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState950();
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
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1468();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState358();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState713();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState700();
        org.opentripplanner.routing.graph.Edge edge6 = state5.getBackEdge();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(edge6);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState534();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1625();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState949();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex23();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1951();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1810();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState855();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState217();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge134();
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
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1889();
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
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState890();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1992();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1597();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1795();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1442();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState656();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1966();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter0.deserializeObjectState593();
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
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState762();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1771();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState840();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState573();
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
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState610();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1949();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1451();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1481();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState467();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex39();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1832();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1544();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState395();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState772();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState299();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState52();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState844();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState782();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState142();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState676();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState181();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState748();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1264();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState133();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1524();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1442();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState403();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState102();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState931();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState305();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1746();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1612();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1896();
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
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1829();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState873();
        org.opentripplanner.routing.graph.Edge edge9 = state8.backEdge;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(edge9);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState978();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState812();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState510();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge13();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState190();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1669();
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
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState171();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState34();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState710();
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState125();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState575();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1617();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.slf4j.Logger logger0 = org.opentripplanner.routing.core.State.LOG;
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1127();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState182();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState956();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState676();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState776();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1483();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState525();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState245();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState727();
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1488();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1357();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1259();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState241();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1632();
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
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1039();
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
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState52();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState282();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1530();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState486();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState63();
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
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1855();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState976();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1907();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState518();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1198();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState55();
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
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState976();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1907();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState518();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1198();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1940();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState493();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1422();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState722();
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState516();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge112();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1045();
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
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex48();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge65();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1647();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState195();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1259();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState635();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1152();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1071();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState334();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1377();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState341();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState467();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1935();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge114();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1824();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1246();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1279();
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
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex29();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge45();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState339();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState579();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1940();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState493();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1325();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1241();
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState905();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState680();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex21();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1940();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState356();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState926();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1217();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1564();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState98();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1623();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1089();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge46();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState530();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1447();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1564();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1664();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState961();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1239();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1799();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1178();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState604();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1737();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState225();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1985();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState823();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1618();
        state10.dumpPath();
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
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState593();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1152();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1801();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState961();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1629();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState719();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState516();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge112();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState562();
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
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1968();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1774();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState415();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState833();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1380();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState224();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState242();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1508();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1976();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1290();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState124();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState106();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState741();
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
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState400();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState297();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState639();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1753();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState649();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState173();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState432();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState857();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1178();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState202();
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
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState646();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState977();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1257();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1974();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState75();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState422();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1259();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState347();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1587();
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
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1154();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState777();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState31();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1296();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge49();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1198();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge128();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1291();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1594();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1832();
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState248();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState649();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState950();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1181();
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
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1824();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1906();
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
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState403();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState137();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1074();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState568();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1751();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1767();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState17();
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
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState99();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge60();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1225();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1335();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1709();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState941();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1843();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1516();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1885();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1084();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1547();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState161();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1122();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex16();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex1 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1663();
        org.junit.Assert.assertNotNull(intersectionVertex1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1187();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1158();
        long long6 = state5.getActiveTime();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 593L + "'", long6 == 593L);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1363();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1915();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1544();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState937();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState908();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1155();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState483();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1145();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState695();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex25();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState431();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1929();
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
        org.junit.Assert.assertNotNull(state13);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1850();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState513();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState727();
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
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState976();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1907();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState518();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState438();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1721();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1384();
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
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1515();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState103();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = state9.getOptions();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(routingRequest10);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState83();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1650();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge13();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState760();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1467();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1737();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1751();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1297();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge84();
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
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState125();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState149();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState403();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState541();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge49();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1818();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState13();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex16();
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
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState870();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1700();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1489();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState541();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge65();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1577();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1427();
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
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1195();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState941();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState338();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1925();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1295();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1569();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState656();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1627();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1063();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1733();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1372();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1076();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState942();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1573();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1317();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge144();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState612();
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
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState362();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1165();
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
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex16();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState209();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1922();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex16();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState625();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1792();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1383();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1668();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1082();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1645();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1838();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState741();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1969();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState739();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1574();
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1770();
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
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState855();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1802();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1708();
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
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1155();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState96();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState67();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState542();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1259();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge34();
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
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge134();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState847();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge66();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState390();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge118();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1105();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1315();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1223();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1452();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1603();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge134();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState847();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState275();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState97();
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
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState337();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState563();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState163();
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
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState676();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState776();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1483();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1618();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState392();
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
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState436();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1984();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState531();
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState514();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1829();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge66();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState246();
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
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1187();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1405();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1024();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1951();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1896();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState686();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1541();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState568();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState563();
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
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.slf4j.Logger logger2 = multiShortestPathTree1.getLOG();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection3 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter4.deserializeObjectState600();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter4.deserializeObjectState132();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter4.deserializeObjectState1578();
        org.opentripplanner.routing.graph.Vertex vertex8 = state7.vertex;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(stateCollection3);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(vertex8);
        org.junit.Assert.assertNull(stateList9);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState36();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1945();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1777();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1447();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1962();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState901();
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState228();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState948();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1314();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1533();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState105();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState501();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState691();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1867();
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
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState926();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1784();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState821();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1515();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1312();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState342();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState286();
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
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1515();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState146();
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
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState764();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1997();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState428();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState907();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState951();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState564();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState415();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1394();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1656();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState91();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState827();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1568();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState936();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1434();
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
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1152();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1508();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex39();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState793();
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
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1127();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState387();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1099();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1836();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState138();
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
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState259();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1354();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState344();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState999();
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
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1139();
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
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState366();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState841();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge79();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState398();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1834();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState927();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState506();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1210();
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
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1522();
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
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.slf4j.Logger logger2 = multiShortestPathTree1.getLOG();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree4.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree4.getAllStates();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState600();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter7.deserializeObjectState898();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter7.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter7.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter7.deserializeObjectState536();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex13 = serializedObjectSupporter7.deserializeObjectVertex47();
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree4.getStates((org.opentripplanner.routing.graph.Vertex) intersectionVertex13);
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates((org.opentripplanner.routing.graph.Vertex) intersectionVertex13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = null;
        multiShortestPathTree1.setstateSets(vertexMap16);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter18 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state19 = serializedObjectSupporter18.deserializeObjectState600();
        org.opentripplanner.routing.core.State state20 = serializedObjectSupporter18.deserializeObjectState898();
        org.opentripplanner.routing.core.State state21 = serializedObjectSupporter18.deserializeObjectState944();
        org.opentripplanner.routing.core.State state22 = serializedObjectSupporter18.deserializeObjectState196();
        org.opentripplanner.routing.core.State state23 = serializedObjectSupporter18.deserializeObjectState1494();
        multiShortestPathTree1.postVisit(state23);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(intersectionVertex13);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertNotNull(state19);
        org.junit.Assert.assertNotNull(state20);
        org.junit.Assert.assertNotNull(state21);
        org.junit.Assert.assertNotNull(state22);
        org.junit.Assert.assertNotNull(state23);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1001();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1433();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState723();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter0.deserializeObjectState1301();
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
        org.junit.Assert.assertNotNull(state14);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState313();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState75();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1775();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState883();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState143();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState676();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState776();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1489();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState700();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState890();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1539();
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
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState646();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState977();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1802();
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
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState846();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1737();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1829();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState901();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState516();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1582();
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
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState125();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1408();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1489();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1726();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState797();
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
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1538();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1334();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1089();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState879();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1498();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1132();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1328();
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
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState985();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState687();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1816();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1661();
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
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1515();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState103();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState763();
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
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState275();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState183();
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState985();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1943();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState626();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState366();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1621();
        state4.checkNegativeWeight();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState52();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState297();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState333();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1834();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge24();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState67();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex12();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1847();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState529();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1186();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState927();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge96();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1110();
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
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1074();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1877();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState646();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState977();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1693();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge36();
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
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1127();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState387();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1099();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1977();
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
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState607();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1393();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1263();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState289();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState708();
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
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge145();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState534();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1221();
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
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1678();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1392();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState607();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState183();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1203();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState681();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState894();
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
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState125();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1835();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1678();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1510();
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
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState246();
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1447();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState294();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1689();
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
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1775();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState883();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1543();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState680();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1334();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1305();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState686();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1806();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState273();
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
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState771();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState471();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1502();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1063();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1046();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex48();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1649();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1323();
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
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState943();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1887();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState875();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState346();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState774();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1380();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1058();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState373();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1125();
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
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge115();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState14();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1990();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1753();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1117();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState320();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1590();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState374();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState21();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1118();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState386();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1736();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState985();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState687();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1800();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState845();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState692();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1528();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState293();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1263();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState805();
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
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState52();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState297();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge84();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1864();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1787();
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
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState259();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1354();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState344();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState300();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1281();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1565();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState516();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState516();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1435();
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
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1968();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1606();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge122();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState749();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1295();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1569();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1667();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1985();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState514();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1564();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge91();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1636();
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
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1568();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState631();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1885();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1084();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1547();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState161();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1252();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1548();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState776();
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
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState814();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState955();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState572();
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
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1314();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1533();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState105();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState501();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1975();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState686();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1806();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1257();
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
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState870();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState496();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1829();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState505();
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
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1155();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState96();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1754();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState890();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1318();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1519();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState610();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge134();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1265();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1834();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState927();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1669();
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1187();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge101();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1232();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState653();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState432();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState857();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1178();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1406();
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
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState902();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1823();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState147();
        org.junit.Assert.assertNotNull(state1);
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState52();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState282();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1625();
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
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1039();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1262();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1738();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState711();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1751();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1270();
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
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1741();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState160();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState923();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1082();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1849();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState672();
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
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge65();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1577();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1703();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState573();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge88();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState771();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState471();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState892();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1152();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1508();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState328();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState805();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState30();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1295();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1569();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState803();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState524();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1857();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState872();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState356();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1655();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState427();
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
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState291();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1378();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1218();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState448();
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex47();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState934();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState371();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState646();
        org.opentripplanner.routing.core.TraverseMode traverseMode10 = state9.getNonTransitMode();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertTrue("'" + traverseMode10 + "' != '" + org.opentripplanner.routing.core.TraverseMode.WALK + "'", traverseMode10.equals(org.opentripplanner.routing.core.TraverseMode.WALK));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState908();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1524();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState639();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge75();
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
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState676();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1007();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1785();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1167();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1653();
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
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1550();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState240();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter9 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter9.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter9.deserializeObjectState728();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter9.deserializeObjectState503();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter9.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter9.deserializeObjectState646();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter9.deserializeObjectState977();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter9.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state17 = serializedObjectSupporter9.deserializeObjectState1257();
        org.opentripplanner.routing.core.State state18 = serializedObjectSupporter9.deserializeObjectState1838();
        org.opentripplanner.routing.core.StateData stateData19 = state18.stateData;
        state8.setstateData(stateData19);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
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
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertNotNull(state17);
        org.junit.Assert.assertNotNull(state18);
        org.junit.Assert.assertNotNull(stateData19);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1832();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1544();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1322();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1600();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState633();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState976();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1907();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState518();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1198();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState244();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1233();
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
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState99();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1744();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge115();
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
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState228();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1086();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState249();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState241();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState400();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1783();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState52();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState282();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1530();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState486();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState273();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState349();
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState837();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState133();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1039();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState571();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1511();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState850();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1590();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1992();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1315();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1885();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1084();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1547();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState44();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1412();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState963();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1591();
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
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState610();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1949();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState485();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState254();
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
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState339();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState306();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex16();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState692();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1570();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1004();
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
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState985();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1943();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState144();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1943();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1642();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge60();
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1645();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState745();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState637();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1654();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1514();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState7();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState572();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState814();
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState209();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1519();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1285();
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
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1741();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1928();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState139();
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState36();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1403();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState605();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState619();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState676();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1007();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1229();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1913();
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
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1727();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState514();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(stateList3);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1155();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState96();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState869();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1263();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState954();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1061();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge35();
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
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1411();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge63();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge30();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1867();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState415();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1394();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1656();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState528();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1155();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState483();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState975();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1474();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1881();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1799();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1645();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState745();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState637();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState512();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex31();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState336();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1612();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState920();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1229();
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
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex1 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState446();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1651();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState509();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1981();
        org.junit.Assert.assertNotNull(intersectionVertex1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1751();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1297();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1597();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState641();
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
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1955();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1806();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState701();
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
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState902();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState454();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge98();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1550();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState893();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1990();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1753();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1117();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState27();
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge134();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState396();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1986();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1197();
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
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1039();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState571();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1391();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState436();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState666();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(stateData6);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState259();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1892();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1538();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1300();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1371();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1259();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1996();
        int int7 = state6.getTimeDeltaSeconds();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 28 + "'", int7 == 28);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState433();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState744();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState993();
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState252();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState764();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1997();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1866();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState514();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1564();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge91();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1263();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1123();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
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
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState384();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState25();
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
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1940();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState493();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1325();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState759();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge33();
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
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1564();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState91();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1086();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState278();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState480();
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
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState534();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1474();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState508();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1418();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1625();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge22();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1296();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1828();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState403();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1917();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1941();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1037();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1062();
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
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1515();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState588();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1513();
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1771();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState378();
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
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState872();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState356();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1627();
        boolean boolean10 = state8.exceedsWeightLimit((-1.0d));
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState415();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1394();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1656();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState474();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1259();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState347();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1587();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1060();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1557();
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
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState421();
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
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1263();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1523();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1242();
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
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState593();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1152();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1349();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge78();
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
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState771();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState471();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1178();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState41();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState587();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState475();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState404();
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
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState646();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState977();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState250();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1989();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState987();
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
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1500();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState92();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1163();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge65();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1577();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1473();
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
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState386();
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
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge65();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1541();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1836();
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
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState532();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState643();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1926();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1872();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState362();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1016();
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState316();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState390();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState260();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1479();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge42();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge142();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1741();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState14();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1321();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState700();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1577();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1977();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1609();
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
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState99();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge60();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState659();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge75();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1011();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1857();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex16();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1994();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1468();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1915();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState955();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState34();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1145();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1527();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1512();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1259();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1713();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState214();
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
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1474();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1000();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1678();
        long long7 = state6.getActiveTime();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 352L + "'", long7 == 352L);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState433();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1912();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState541();
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
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState134();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState481();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1669();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState744();
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
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState676();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1007();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1229();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState406();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState664();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState460();
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
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1568();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1842();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1383();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1668();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState83();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1968();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1606();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge122();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1498();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState9();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1759();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1545();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1024();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1892();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState129();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState543();
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
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1968();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1606();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState806();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1111();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1665();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState929();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState959();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState377();
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
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1187();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge117();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1515();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge84();
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
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState610();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1949();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState125();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1431();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex47();
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
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState878();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge130();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState765();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState657();
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1820();
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
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1429();
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
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState853();
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState785();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState542();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1407();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState353();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState106();
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
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState462();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge17();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState577();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState26();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState951();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge112();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState162();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge126();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState438();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1461();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1024();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1251();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1447();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1962();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1093();
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
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState415();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState833();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState783();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1127();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState765();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex1 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1285();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState929();
        org.junit.Assert.assertNotNull(intersectionVertex1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1468();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1915();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1260();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1705();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1574();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState465();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState807();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1439();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter0.deserializeObjectState139();
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
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState478();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState114();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1652();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1913();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState738();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1490();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState802();
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1969();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState739();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState594();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState581();
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
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1127();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState171();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState29();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState872();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState356();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState828();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge51();
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
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState455();
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
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1612();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1947();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState962();
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
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1990();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState148();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState905();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState588();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState119();
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState219();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState556();
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
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState467();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1935();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState983();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState125();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState646();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState977();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState250();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState784();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1132();
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState668();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState138();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState433();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState744();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState474();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1577();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1769();
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
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1489();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1169();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1182();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1158();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState214();
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
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1455();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1712();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1376();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState924();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState726();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState367();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge14();
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
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1834();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge24();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState67();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1713();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState821();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState4();
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
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState366();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1621();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1994();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge13();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState760();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1467();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1471();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState21();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1602();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1490();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1834();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState927();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1256();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState211();
        state8.dumpPath();
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1144();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1761();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1144();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState965();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1035();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1155();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState96();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState67();
        java.lang.String str6 = state5.toStringVerbose();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<State Tue Dec 07 11:29:19 BRT 2021 w=724.4559999999999 t=729 d=665.056 p=0 b=0 br=false pr=false>" + "'", str6, "<State Tue Dec 07 11:29:19 BRT 2021 w=724.4559999999999 t=729 d=665.056 p=0 b=0 br=false pr=false>");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1259();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1010();
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
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState64();
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
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState366();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1621();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1504();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1098();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex46();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1262();
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
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge97();
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
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1144();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState965();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState225();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState639();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1888();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState782();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState982();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge13();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState760();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1467();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1315();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState48();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState593();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState871();
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
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1127();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState594();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState631();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1988();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1907();
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
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState181();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState194();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1024();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1099();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex32();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState917();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge91();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState686();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1695();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState423();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState219();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1618();
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
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1489();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1169();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1182();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState290();
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
}

