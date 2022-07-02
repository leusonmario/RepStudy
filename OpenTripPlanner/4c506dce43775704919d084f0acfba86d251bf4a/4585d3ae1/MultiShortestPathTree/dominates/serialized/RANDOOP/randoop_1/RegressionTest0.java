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
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) (short) 100, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.slf4j.Logger logger0 = org.opentripplanner.routing.core.State.LOG;
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int0 = org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_DIFF_MARGIN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 30 + "'", int0 == 30);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
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
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        double double3 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.State state4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = multiShortestPathTree1.add(state4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        double double0 = org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.05d + "'", double0 == 0.05d);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        double double3 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.State state4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = multiShortestPathTree1.visit(state4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList4 = multiShortestPathTree1.getStates(vertex3);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNull(stateList4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int0 = org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_DIFF_MARGIN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 30 + "'", int0 == 30);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = multiShortestPathTree1.visit(state4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        double double0 = org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.02d + "'", double0 == 0.02d);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
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
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (-1L), routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        long long0 = org.opentripplanner.routing.spt.MultiShortestPathTree.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1000000L) + "'", long0 == (-1000000L));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList3 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) 10, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        multiShortestPathTree1.setstateSets(vertexMap14);
        double double16 = multiShortestPathTree1.getWEIGHT_EPSILON();
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.visit(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.02d + "'", double16 == 0.02d);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(stateCollection6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) 'a', routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) (byte) -1, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        double double0 = org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.02d + "'", double0 == 0.02d);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) (byte) 0, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter9 = multiShortestPathTree8.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree8.getVertices();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree8.postVisit(state11);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree8.getstateSets();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree8.getstateSets();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter17 = multiShortestPathTree16.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree16.getVertices();
        org.opentripplanner.routing.core.State state19 = null;
        multiShortestPathTree16.postVisit(state19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree16.getstateSets();
        double double22 = multiShortestPathTree16.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter25 = multiShortestPathTree24.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet26 = multiShortestPathTree24.getVertices();
        org.opentripplanner.routing.core.State state27 = null;
        multiShortestPathTree24.postVisit(state27);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree24.getstateSets();
        multiShortestPathTree16.setstateSets(vertexMap29);
        multiShortestPathTree8.stateSets = vertexMap29;
        multiShortestPathTree1.setstateSets(vertexMap29);
        org.opentripplanner.routing.core.State state33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = multiShortestPathTree1.add(state33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(graphPath6);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNotNull(vertexMap13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNotNull(vertexSet18);
        org.junit.Assert.assertNotNull(vertexMap21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.02d + "'", double22 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNotNull(vertexSet26);
        org.junit.Assert.assertNotNull(vertexMap29);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.add(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(graphPath6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) '#', routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        double double4 = multiShortestPathTree1.getTIME_EPSILON();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02d + "'", double4 == 0.02d);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, 100L, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.lang.Class<?> wildcardClass6 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        multiShortestPathTree1.setstateSets(vertexMap14);
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(graphPath19);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        double double3 = multiShortestPathTree1.getTIME_EPSILON();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.getstateSets();
        double double5 = multiShortestPathTree1.getTIME_EPSILON();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
        org.junit.Assert.assertNotNull(vertexMap4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.02d + "'", double5 == 0.02d);
        org.junit.Assert.assertNotNull(vertexMap6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        double double4 = multiShortestPathTree1.getTIME_EPSILON();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.getstateSets();
        java.lang.Class<?> wildcardClass6 = vertexMap5.getClass();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02d + "'", double4 == 0.02d);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.lang.Class<?> wildcardClass3 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        int int4 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        org.opentripplanner.routing.core.State state5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = multiShortestPathTree1.visit(state5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexSet6);
        org.junit.Assert.assertNotNull(vertexSet7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter7;
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexSet6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.core.State state5 = multiShortestPathTree1.getState(vertex4);
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.add(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.getstateSets();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        double double15 = multiShortestPathTree9.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter18 = multiShortestPathTree17.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree17.getVertices();
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree17.postVisit(state20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree17.getstateSets();
        multiShortestPathTree9.setstateSets(vertexMap22);
        multiShortestPathTree1.stateSets = vertexMap22;
        java.lang.Class<?> wildcardClass25 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.02d + "'", double15 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        double double3 = multiShortestPathTree1.getTIME_EPSILON();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.getstateSets();
        int int5 = multiShortestPathTree1.getTIME_DIFF_MARGIN();
        java.lang.Class<?> wildcardClass6 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
        org.junit.Assert.assertNotNull(vertexMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 30 + "'", int5 == 30);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        int int4 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        int int5 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        double double6 = multiShortestPathTree1.getWALK_DIST_EPSILON();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 30 + "'", int5 == 30);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05d + "'", double6 == 0.05d);
        org.junit.Assert.assertNull(graphPath9);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.getstateSets();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        double double15 = multiShortestPathTree9.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter18 = multiShortestPathTree17.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree17.getVertices();
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree17.postVisit(state20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree17.getstateSets();
        multiShortestPathTree9.setstateSets(vertexMap22);
        multiShortestPathTree1.stateSets = vertexMap22;
        org.opentripplanner.routing.core.State state25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = multiShortestPathTree1.add(state25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.02d + "'", double15 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNotNull(vertexMap22);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        multiShortestPathTree1.setstateSets(vertexMap14);
        double double16 = multiShortestPathTree1.getWALK_DIST_EPSILON();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.05d + "'", double16 == 0.05d);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        multiShortestPathTree1.setstateSets(vertexMap14);
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, true);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree1.getState(vertex20);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNull(state21);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, 100L, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        multiShortestPathTree1.setstateSets(vertexMap14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        int int18 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) (-1), routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        multiShortestPathTree1.setstateSets(vertexMap14);
        int int16 = multiShortestPathTree1.getVertexCount();
        double double17 = multiShortestPathTree1.getTIME_EPSILON();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.02d + "'", double17 == 0.02d);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) (short) 1, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) (byte) 100, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) 0, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(routingRequest4);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (-1000000L), routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(routingRequest4);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) (byte) 1, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        double double4 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02d + "'", double4 == 0.02d);
        org.junit.Assert.assertNull(routingRequest5);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        double double3 = multiShortestPathTree1.getTIME_EPSILON();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.getstateSets();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter5 = multiShortestPathTree1.serializedObjectSupporter;
        int int6 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
        org.junit.Assert.assertNotNull(vertexMap4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        int int5 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass6 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNotNull(vertexMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.getstateSets();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        double double15 = multiShortestPathTree9.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter18 = multiShortestPathTree17.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree17.getVertices();
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree17.postVisit(state20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree17.getstateSets();
        multiShortestPathTree9.setstateSets(vertexMap22);
        multiShortestPathTree1.stateSets = vertexMap22;
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = multiShortestPathTree1.options;
        double double26 = multiShortestPathTree1.getWEIGHT_EPSILON();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.02d + "'", double15 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNull(routingRequest25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.02d + "'", double26 == 0.02d);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        int int8 = multiShortestPathTree1.getTIME_DIFF_MARGIN();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexSet6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter11 = multiShortestPathTree1.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexSet6);
        org.junit.Assert.assertNull(stateList10);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        double double3 = multiShortestPathTree1.getTIME_EPSILON();
        double double4 = multiShortestPathTree1.getWEIGHT_EPSILON();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02d + "'", double4 == 0.02d);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        double double3 = multiShortestPathTree1.getTIME_EPSILON();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.getstateSets();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.visit(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
        org.junit.Assert.assertNotNull(vertexMap4);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        multiShortestPathTree1.setstateSets(vertexMap14);
        double double16 = multiShortestPathTree1.getWEIGHT_EPSILON();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree1.stateSets;
        int int18 = multiShortestPathTree1.getTIME_DIFF_MARGIN();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.02d + "'", double16 == 0.02d);
        org.junit.Assert.assertNotNull(vertexMap17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30 + "'", int18 == 30);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter9 = multiShortestPathTree8.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree8.getVertices();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree8.postVisit(state11);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree8.getstateSets();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree8.getstateSets();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter17 = multiShortestPathTree16.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree16.getVertices();
        org.opentripplanner.routing.core.State state19 = null;
        multiShortestPathTree16.postVisit(state19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree16.getstateSets();
        double double22 = multiShortestPathTree16.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter25 = multiShortestPathTree24.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet26 = multiShortestPathTree24.getVertices();
        org.opentripplanner.routing.core.State state27 = null;
        multiShortestPathTree24.postVisit(state27);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree24.getstateSets();
        multiShortestPathTree16.setstateSets(vertexMap29);
        multiShortestPathTree8.stateSets = vertexMap29;
        multiShortestPathTree1.setstateSets(vertexMap29);
        java.lang.Class<?> wildcardClass33 = vertexMap29.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(graphPath6);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNotNull(vertexMap13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNotNull(vertexSet18);
        org.junit.Assert.assertNotNull(vertexMap21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.02d + "'", double22 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNotNull(vertexSet26);
        org.junit.Assert.assertNotNull(vertexMap29);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        double double4 = multiShortestPathTree1.getTIME_EPSILON();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.getstateSets();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02d + "'", double4 == 0.02d);
        org.junit.Assert.assertNotNull(vertexMap5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        multiShortestPathTree1.setstateSets(vertexMap14);
        double double16 = multiShortestPathTree1.getWEIGHT_EPSILON();
        long long17 = multiShortestPathTree1.getserialVersionUID();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.02d + "'", double16 == 0.02d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1000000L) + "'", long17 == (-1000000L));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) 10, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        java.lang.Class<?> wildcardClass7 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNotNull(graphPathList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        multiShortestPathTree1.setstateSets(vertexMap14);
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, true);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, true);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNotNull(graphPathList22);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        double double3 = multiShortestPathTree1.getTIME_EPSILON();
        int int4 = multiShortestPathTree1.getTIME_DIFF_MARGIN();
        int int5 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 30 + "'", int5 == 30);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.junit.Assert.assertNotNull(vertexMap2);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        double double3 = multiShortestPathTree1.getWALK_DIST_EPSILON();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter6;
        int int8 = multiShortestPathTree1.getTIME_DIFF_MARGIN();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.05d + "'", double3 == 0.05d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        int int4 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        double double3 = multiShortestPathTree1.getWALK_DIST_EPSILON();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter6;
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = multiShortestPathTree1.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.05d + "'", double3 == 0.05d);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        double double10 = multiShortestPathTree1.getWEIGHT_EPSILON();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexSet6);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.02d + "'", double10 == 0.02d);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        double double4 = multiShortestPathTree1.getTIME_EPSILON();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.getstateSets();
        double double6 = multiShortestPathTree1.getWEIGHT_EPSILON();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02d + "'", double4 == 0.02d);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.02d + "'", double6 == 0.02d);
        org.junit.Assert.assertNotNull(vertexSet7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        double double4 = multiShortestPathTree1.getWALK_DIST_EPSILON();
        org.opentripplanner.routing.core.State state5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = multiShortestPathTree1.add(state5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.05d + "'", double4 == 0.05d);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexSet6);
        org.junit.Assert.assertNull(stateList10);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        double double4 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, true);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter8;
        double double10 = multiShortestPathTree1.getTIME_EPSILON();
        int int11 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02d + "'", double4 == 0.02d);
        org.junit.Assert.assertNotNull(graphPathList7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.02d + "'", double10 == 0.02d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter4;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(vertexSet7);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.core.State state5 = multiShortestPathTree1.getState(vertex4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = state5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexSet6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap9);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        multiShortestPathTree1.setstateSets(vertexMap14);
        int int16 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass17 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = multiShortestPathTree1.visit(state4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        java.lang.String str8 = multiShortestPathTree1.toString();
        int int9 = multiShortestPathTree1.getTIME_DIFF_MARGIN();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexSet6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter4;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(stateCollection8);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        double double4 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, true);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter8;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.getstateSets();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02d + "'", double4 == 0.02d);
        org.junit.Assert.assertNotNull(graphPathList7);
        org.junit.Assert.assertNotNull(vertexMap10);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter4;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.getstateSets();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNull(graphPath9);
        org.junit.Assert.assertNotNull(vertexMap10);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = multiShortestPathTree5.serializedObjectSupporter;
        java.lang.String str7 = multiShortestPathTree5.toString();
        double double8 = multiShortestPathTree5.getTIME_EPSILON();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree5.getPaths(vertex9, true);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter12 = null;
        multiShortestPathTree5.serializedObjectSupporter = serializedObjectSupporter12;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree5.getstateSets();
        multiShortestPathTree1.stateSets = vertexMap14;
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.02d + "'", double8 == 0.02d);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(vertexMap14);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter4;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        double double8 = multiShortestPathTree1.getWEIGHT_EPSILON();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.02d + "'", double8 == 0.02d);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.getstateSets();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        double double15 = multiShortestPathTree9.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter18 = multiShortestPathTree17.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree17.getVertices();
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree17.postVisit(state20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree17.getstateSets();
        multiShortestPathTree9.setstateSets(vertexMap22);
        multiShortestPathTree1.stateSets = vertexMap22;
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.02d + "'", double15 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNull(routingRequest25);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        int int4 = multiShortestPathTree1.getVertexCount();
        int int5 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.getstateSets();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter8;
        int int10 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter11 = multiShortestPathTree1.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        double double3 = multiShortestPathTree1.getTIME_EPSILON();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.getstateSets();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter5 = multiShortestPathTree1.serializedObjectSupporter;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        int int8 = multiShortestPathTree7.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree7.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree7.getPath(vertex10, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree7.stateSets;
        java.lang.String str14 = multiShortestPathTree7.toString();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter15 = multiShortestPathTree7.serializedObjectSupporter;
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter18 = multiShortestPathTree17.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree17.getVertices();
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree17.postVisit(state20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree17.getstateSets();
        double double23 = multiShortestPathTree17.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree25 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest24);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter26 = multiShortestPathTree25.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet27 = multiShortestPathTree25.getVertices();
        org.opentripplanner.routing.core.State state28 = null;
        multiShortestPathTree25.postVisit(state28);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap30 = multiShortestPathTree25.getstateSets();
        multiShortestPathTree17.setstateSets(vertexMap30);
        multiShortestPathTree7.stateSets = vertexMap30;
        multiShortestPathTree1.setstateSets(vertexMap30);
        org.opentripplanner.routing.graph.Vertex vertex34 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList36 = multiShortestPathTree1.getPaths(vertex34, true);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
        org.junit.Assert.assertNotNull(vertexMap4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertNotNull(vertexMap9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNotNull(vertexMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.02d + "'", double23 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter26);
        org.junit.Assert.assertNotNull(vertexSet27);
        org.junit.Assert.assertNotNull(vertexMap30);
        org.junit.Assert.assertNotNull(graphPathList36);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        multiShortestPathTree1.setstateSets(vertexMap14);
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        int int20 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(state18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        double double8 = multiShortestPathTree1.getWEIGHT_EPSILON();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(graphPath6);
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.02d + "'", double8 == 0.02d);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.getstateSets();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        double double15 = multiShortestPathTree9.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter18 = multiShortestPathTree17.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree17.getVertices();
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree17.postVisit(state20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree17.getstateSets();
        multiShortestPathTree9.setstateSets(vertexMap22);
        multiShortestPathTree1.stateSets = vertexMap22;
        int int25 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        org.opentripplanner.routing.core.State state26 = null;
        multiShortestPathTree1.postVisit(state26);
        org.opentripplanner.routing.core.RoutingRequest routingRequest28 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree29 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest28);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter30 = multiShortestPathTree29.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet31 = multiShortestPathTree29.getVertices();
        org.opentripplanner.routing.core.State state32 = null;
        multiShortestPathTree29.postVisit(state32);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree29.getstateSets();
        double double35 = multiShortestPathTree29.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest36 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree37 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest36);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter38 = multiShortestPathTree37.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet39 = multiShortestPathTree37.getVertices();
        org.opentripplanner.routing.core.State state40 = null;
        multiShortestPathTree37.postVisit(state40);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap42 = multiShortestPathTree37.getstateSets();
        multiShortestPathTree29.setstateSets(vertexMap42);
        multiShortestPathTree1.setstateSets(vertexMap42);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.02d + "'", double15 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 30 + "'", int25 == 30);
        org.junit.Assert.assertNull(serializedObjectSupporter30);
        org.junit.Assert.assertNotNull(vertexSet31);
        org.junit.Assert.assertNotNull(vertexMap34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.02d + "'", double35 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter38);
        org.junit.Assert.assertNotNull(vertexSet39);
        org.junit.Assert.assertNotNull(vertexMap42);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.getstateSets();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter8;
        int int10 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        int int11 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        int int14 = multiShortestPathTree13.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree13.stateSets;
        multiShortestPathTree1.setstateSets(vertexMap15);
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.add(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertNotNull(vertexMap15);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        double double3 = multiShortestPathTree1.getTIME_EPSILON();
        int int4 = multiShortestPathTree1.getTIME_DIFF_MARGIN();
        java.lang.Class<?> wildcardClass5 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = multiShortestPathTree1.add(state4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.lang.String str4 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.getstateSets();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexSet6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.lang.String str8 = multiShortestPathTree1.toString();
        int int9 = multiShortestPathTree1.getTIME_DIFF_MARGIN();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(graphPath6);
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        double double3 = multiShortestPathTree1.getTIME_EPSILON();
        double double4 = multiShortestPathTree1.getWEIGHT_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        int int7 = multiShortestPathTree6.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree6.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree6.getPath(vertex9, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap12 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.setstateSets(vertexMap12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree15 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest14);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter16 = multiShortestPathTree15.serializedObjectSupporter;
        double double17 = multiShortestPathTree15.getTIME_EPSILON();
        double double18 = multiShortestPathTree15.getWEIGHT_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        int int21 = multiShortestPathTree20.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree20.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath25 = multiShortestPathTree20.getPath(vertex23, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree20.stateSets;
        multiShortestPathTree15.setstateSets(vertexMap26);
        multiShortestPathTree1.setstateSets(vertexMap26);
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02d + "'", double4 == 0.02d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 30 + "'", int7 == 30);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNotNull(vertexMap12);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.02d + "'", double17 == 0.02d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.02d + "'", double18 == 0.02d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNull(graphPath25);
        org.junit.Assert.assertNotNull(vertexMap26);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.core.State state5 = multiShortestPathTree1.getState(vertex4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter7;
        long long9 = multiShortestPathTree1.getserialVersionUID();
        double double10 = multiShortestPathTree1.getWALK_DIST_EPSILON();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1000000L) + "'", long9 == (-1000000L));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.05d + "'", double10 == 0.05d);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        double double4 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, true);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter8;
        double double10 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        long long13 = multiShortestPathTree1.getserialVersionUID();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree1.stateSets;
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02d + "'", double4 == 0.02d);
        org.junit.Assert.assertNotNull(graphPathList7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.02d + "'", double10 == 0.02d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1000000L) + "'", long13 == (-1000000L));
        org.junit.Assert.assertNotNull(vertexMap14);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        double double7 = multiShortestPathTree1.getWEIGHT_EPSILON();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(graphPath6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNull(graphPath10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.core.State state5 = multiShortestPathTree1.getState(vertex4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        double double7 = multiShortestPathTree1.getWEIGHT_EPSILON();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        double double4 = multiShortestPathTree1.getTIME_EPSILON();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.getstateSets();
        int int6 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02d + "'", double4 == 0.02d);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter4;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree1.serializedObjectSupporter;
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter11 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter11;
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter13 = multiShortestPathTree1.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNull(graphPath9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexSet6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        int int3 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.core.State state5 = multiShortestPathTree1.getState(vertex4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter7;
        long long9 = multiShortestPathTree1.getserialVersionUID();
        double double10 = multiShortestPathTree1.getTIME_EPSILON();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1000000L) + "'", long9 == (-1000000L));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.02d + "'", double10 == 0.02d);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        multiShortestPathTree1.setstateSets(vertexMap14);
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, true);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter20 = multiShortestPathTree1.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNull(serializedObjectSupporter20);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState781();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1211();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState891();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState831();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1230();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1131();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection2 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(stateCollection2);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState408();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState298();
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
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1648();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState997();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1158();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState472();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex6();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state8 = new org.opentripplanner.routing.core.State((org.opentripplanner.routing.graph.Vertex) intersectionVertex5, (long) ' ', routingRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1516();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState612();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge85();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1098();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState761();
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
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1441();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.getstateSets();
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1697();
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState625();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState946();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1906();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1729();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1643();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex39();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState188();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1654();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1498();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1862();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState686();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1243();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge75();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState616();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1000();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState257();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState162();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState155();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState250();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex27();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState766();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1357();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState301();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState812();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1148();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1682();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.getstateSets();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        double double15 = multiShortestPathTree9.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter18 = multiShortestPathTree17.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree17.getVertices();
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree17.postVisit(state20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree17.getstateSets();
        multiShortestPathTree9.setstateSets(vertexMap22);
        multiShortestPathTree1.stateSets = vertexMap22;
        double double25 = multiShortestPathTree1.getWEIGHT_EPSILON();
        double double26 = multiShortestPathTree1.getTIME_EPSILON();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList27 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.02d + "'", double15 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.02d + "'", double25 == 0.02d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.02d + "'", double26 == 0.02d);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1081();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1103();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1618();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState127();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1338();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1598();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState136();
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState839();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState715();
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
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState732();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge4();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState306();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState177();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter0.deserializeObjectState1062();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter0.deserializeObjectState380();
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
        org.junit.Assert.assertNotNull(streetEdge11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(state15);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1149();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState216();
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState301();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState812();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1506();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1887();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState82();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState64();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex6();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1837();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState63();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1199();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge60();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1164();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1491();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1838();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState670();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1474();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState772();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1972();
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1887();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState924();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState868();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1359();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState936();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1660();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState335();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState193();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState205();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState940();
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
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex6();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState941();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState327();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.lang.String str3 = multiShortestPathTree1.toString();
        double double4 = multiShortestPathTree1.getTIME_EPSILON();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.getstateSets();
        int int6 = multiShortestPathTree1.getTIME_DIFF_MARGIN();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiSPT(0 vertices)" + "'", str3, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02d + "'", double4 == 0.02d);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge60();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1199();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1995();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1472();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1814();
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex27();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState217();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1436();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1160();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1055();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1925();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1149();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState603();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1948();
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1726();
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState983();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1808();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex9();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState861();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState217();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1436();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1981();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState732();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex10 = serializedObjectSupporter0.deserializeObjectVertex17();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1662();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1096();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(intersectionVertex10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.getstateSets();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState217();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1436();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState227();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1723();
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
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState41();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1068();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1121();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState778();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState839();
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1308();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1118();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState50();
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
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge75();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState616();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState453();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1068();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1121();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState778();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState283();
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
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState34();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex6();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1683();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState483();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex39();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState814();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState335();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge32();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState961();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState301();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState812();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1016();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1867();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState593();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1618();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState127();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState466();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1149();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState603();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1996();
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
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1648();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1891();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState849();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1305();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex12();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState755();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState285();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1993();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState301();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState812();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1016();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1867();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge133();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState562();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1031();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1149();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState191();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1887();
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1887();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1877();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1933();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState492();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1937();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1308();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1070();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState447();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState532();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1390();
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
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge82();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState583();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1334();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1325();
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState612();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge85();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1355();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState760();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex6();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState217();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1436();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1686();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1699();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex46();
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState301();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState812();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1016();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1867();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState243();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState911();
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
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState33();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState951();
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
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(stateCollection6);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge75();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState616();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState437();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState557();
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState793();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1164();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState645();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge60();
        org.junit.Assert.assertNotNull(streetEdge1);
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState335();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1343();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState73();
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex39();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState188();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1654();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1498();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1862();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState686();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState783();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState217();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1436();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState885();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1050();
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState334();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState505();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1230();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1397();
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
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge15();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1814();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1216();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1690();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState88();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState468();
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge52();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1322();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState23();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState607();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState612();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge85();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState820();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex30();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState217();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1436();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1686();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1250();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState408();
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
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex12();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1835();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState27();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1380();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1751();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState732();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState356();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState798();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState619();
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter5 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter5.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter5.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter5.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter5.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter5.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter5.deserializeObjectState1231();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex12 = serializedObjectSupporter5.deserializeObjectVertex39();
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates((org.opentripplanner.routing.graph.Vertex) intersectionVertex12);
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(intersectionVertex12);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1861();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1046();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState5();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1993();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge138();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState577();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState830();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.core.State state5 = multiShortestPathTree1.getState(vertex4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(stateCollection7);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState34();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex6();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1683();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1691();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNotNull(streetEdge11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge15();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1814();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1216();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1690();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1414();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1407();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState466();
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1149();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex28();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1530();
        org.junit.Assert.assertNotNull(streetEdge1);
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
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState589();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState812();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1104();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState927();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState475();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState90();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState176();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1272();
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1786();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState165();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState96();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1022();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState187();
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
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState715();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState103();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1899();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState793();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState856();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge73();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState674();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState260();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
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
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState217();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState716();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState517();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1326();
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState976();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1688();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1977();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState163();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState81();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState214();
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
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState334();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState169();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1453();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge21();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState373();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        double double7 = multiShortestPathTree1.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        multiShortestPathTree1.setstateSets(vertexMap14);
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.getOptions();
        java.lang.String str21 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(state18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiSPT(0 vertices)" + "'", str21, "MultiSPT(0 vertices)");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState915();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1432();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState521();
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1453();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge21();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState68();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1400();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState732();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge4();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState306();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState177();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter0.deserializeObjectState1062();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter0.deserializeObjectState1743();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter0.deserializeObjectState1610();
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
        org.junit.Assert.assertNotNull(streetEdge11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNull(state16);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1453();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge21();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1803();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState444();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState103();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState589();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1432();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState927();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState475();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState90();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState176();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1120();
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
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1581();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1507();
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1474();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState419();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1412();
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1788();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1362();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1382();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1062();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.lang.String str4 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState544();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState809();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState866();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState331();
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
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState936();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState571();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1992();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex48();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge91();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1865();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState301();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState812();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1148();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1789();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex12();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState703();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1869();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1090();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState561();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState331();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState335();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState193();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex48();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState453();
        org.junit.Assert.assertNotNull(streetEdge1);
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState335();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState120();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1574();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState526();
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
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState524();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState386();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1331();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1419();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1271();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1149();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState603();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1385();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState350();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState740();
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState625();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState946();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState621();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState871();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1818();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState551();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState915();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge134();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState714();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1568();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState96();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState108();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState915();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge134();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState714();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1568();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState608();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge34();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1980();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState732();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge4();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState306();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState177();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter0.deserializeObjectState1062();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter0.deserializeObjectState418();
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
        org.junit.Assert.assertNotNull(streetEdge11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(state15);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState838();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1621();
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState641();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge63();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge23();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1453();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge21();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState153();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState246();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1935();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1022();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1788();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1970();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1194();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState575();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState927();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState475();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1552();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex41();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState915();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge134();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState714();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1568();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1971();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1652();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1174();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1220();
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1788();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1970();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1698();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState793();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1164();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState645();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState39();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState90();
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState641();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1904();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge27();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1351();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState304();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1418();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1807();
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1750();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1828();
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState34();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1937();
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
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1754();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState52();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState313();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState561();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1167();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1788();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1349();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState840();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1589();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1768();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState675();
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
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1491();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState987();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1917();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState486();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1838();
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1195();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState395();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState759();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState253();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState253();
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState295();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState877();
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState80();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState694();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1810();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState29();
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
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1869();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState724();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex27();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState530();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge140();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1518();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1724();
        org.junit.Assert.assertNotNull(streetEdge1);
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
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState253();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState983();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1336();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState612();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge85();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge49();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1609();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1599();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1534();
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
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1453();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge21();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState153();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState642();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState17();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge120();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState226();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState631();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1613();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1373();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState972();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState852();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge84();
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
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState612();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge85();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState820();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1864();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState906();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState193();
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
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1933();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState492();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1540();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1821();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState22();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState641();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1719();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1851();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1324();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState148();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1394();
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
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex3 = serializedObjectSupporter0.deserializeObjectVertex11();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(intersectionVertex3);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState739();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1117();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState524();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState386();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1355();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        int int2 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        double double3 = multiShortestPathTree1.getWALK_DIST_EPSILON();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = null;
        multiShortestPathTree1.serializedObjectSupporter = serializedObjectSupporter6;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.getstateSets();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.05d + "'", double3 == 0.05d);
        org.junit.Assert.assertNotNull(vertexMap8);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1455();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1196();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState472();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex6();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1236();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState994();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState641();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1719();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1724();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState353();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1701();
        org.opentripplanner.routing.core.StateData stateData12 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge13 = serializedObjectSupporter0.deserializeObjectEdge30();
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
        org.junit.Assert.assertNull(stateData12);
        org.junit.Assert.assertNotNull(streetEdge13);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.getstateSets();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.getstateSets();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = multiShortestPathTree9.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree9.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree9.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.getstateSets();
        double double15 = multiShortestPathTree9.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter18 = multiShortestPathTree17.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree17.getVertices();
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree17.postVisit(state20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree17.getstateSets();
        multiShortestPathTree9.setstateSets(vertexMap22);
        multiShortestPathTree1.stateSets = vertexMap22;
        int int25 = multiShortestPathTree1.getWEIGHT_DIFF_MARGIN();
        org.opentripplanner.routing.core.State state26 = null;
        multiShortestPathTree1.postVisit(state26);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection28 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.02d + "'", double15 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 30 + "'", int25 == 30);
        org.junit.Assert.assertNotNull(stateCollection28);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1491();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1497();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState586();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState17();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1597();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState392();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1735();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1220();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState301();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState915();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge134();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState714();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1568();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1885();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState60();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState331();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1020();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState641();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1719();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1724();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1604();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState335();
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
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1993();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1417();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState634();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState612();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge85();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1977();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge60();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1377();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState527();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge27();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1351();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState304();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex20();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1187();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex10 = serializedObjectSupporter0.deserializeObjectVertex16();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(intersectionVertex10);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1143();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1380();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState429();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState82();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1786();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState165();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState34();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1041();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState891();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState595();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState107();
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
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1149();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState603();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1385();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1677();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex11 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState753();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1524();
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
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState625();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState946();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState621();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState871();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1818();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState266();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState732();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge4();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState306();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState177();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter0.deserializeObjectState1337();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter0.deserializeObjectState1698();
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
        org.junit.Assert.assertNotNull(streetEdge11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(state15);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1788();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1591();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState732();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState356();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState798();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1706();
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge82();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState583();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1334();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState704();
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState472();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex6();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state7 = new org.opentripplanner.routing.core.State((org.opentripplanner.routing.graph.Vertex) intersectionVertex5, routingRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1149();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1898();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState207();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1605();
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex12();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState755();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState38();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1070();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState840();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState20();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex39();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState188();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1654();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1498();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState44();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter0.deserializeObjectEdge77();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
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
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState641();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1719();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1724();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1219();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState292();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter0.deserializeObjectEdge38();
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
        org.junit.Assert.assertNotNull(streetEdge12);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge75();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState616();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1676();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1515();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState472();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex6();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1282();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1905();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1453();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState313();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState510();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge58();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge27();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1351();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState635();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1935();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState235();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState762();
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
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState301();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState582();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1883();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1460();
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
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1788();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1349();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState840();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1589();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1695();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1786();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState165();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1516();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1931();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState335();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState193();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex48();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1140();
        org.junit.Assert.assertNotNull(streetEdge1);
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
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState103();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState146();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1581();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1694();
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
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState408();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1595();
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1708();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1887();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1288();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState217();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1110();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex34();
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
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex12();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState703();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState706();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState301();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState812();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState404();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1834();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1429();
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
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1068();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1121();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState778();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1687();
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
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1788();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1349();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState840();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1589();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1768();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState617();
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
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState612();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge85();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState820();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1020();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState85();
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1063();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState217();
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState128();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState134();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1679();
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
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState798();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState730();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1380();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState936();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState448();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState512();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState233();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1952();
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState766();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1938();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1960();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1210();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1496();
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex39();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState188();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1084();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1030();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState172();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState152();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1993();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge138();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState577();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1507();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState544();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState808();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState987();
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1609();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1599();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1378();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1556();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState936();
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
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState128();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1344();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState54();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState334();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState505();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1310();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1853();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState641();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1113();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState860();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState51();
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState871();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState373();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1311();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1741();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState502();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState976();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1688();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1733();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState261();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1618();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState429();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex12();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1872();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge83();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState932();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState424();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge60();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex47();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge52();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1599();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1502();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1699();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1691();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1750();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1945();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState621();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter0.deserializeObjectEdge114();
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
        org.junit.Assert.assertNotNull(streetEdge12);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1373();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState972();
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
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge91();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState222();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState376();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1618();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState127();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1820();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState641();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1719();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1724();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState353();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex11 = serializedObjectSupporter0.deserializeObjectVertex12();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1203();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState886();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter0.deserializeObjectState1373();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter0.deserializeObjectState1934();
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
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(state15);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1149();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState603();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1385();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1904();
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1788();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState933();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1225();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex28();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState376();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge27();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1773();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState447();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState181();
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
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1453();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1497();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState641();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1719();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1724();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState353();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex11 = serializedObjectSupporter0.deserializeObjectVertex12();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1203();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState886();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter0.deserializeObjectState1373();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter0.deserializeObjectState1490();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter0.deserializeObjectState389();
        org.opentripplanner.routing.core.State state17 = serializedObjectSupporter0.deserializeObjectState1031();
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
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNull(state16);
        org.junit.Assert.assertNull(state17);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState641();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1719();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1470();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState565();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState231();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1504();
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge27();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState538();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1436();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1826();
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
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1991();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1149();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState603();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1385();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState350();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState219();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState324();
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1455();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState869();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1886();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState295();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState359();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge60();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState972();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge60();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState250();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1652();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1997();
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState334();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState505();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState868();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState916();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState516();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState823();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState405();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState34();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex6();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1503();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1078();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState855();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1149();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState603();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1385();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1677();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState257();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState452();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1239();
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState34();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1588();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState526();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState627();
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
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState544();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState418();
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
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState472();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1037();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1080();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1232();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1376();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState410();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1911();
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1069();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState959();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState689();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1987();
        org.junit.Assert.assertNotNull(streetEdge1);
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState732();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState356();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1749();
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1055();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1121();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1165();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1885();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge141();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1026();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1380();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1866();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1101();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState947();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1096();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState469();
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState334();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState505();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState899();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1967();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1373();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1349();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState494();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState766();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1874();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1207();
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState301();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState500();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1093();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1786();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState165();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1089();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState187();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState334();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState505();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1230();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1895();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState693();
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
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex39();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState188();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1608();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1958();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1195();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1322();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState793();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1474();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge11();
        org.junit.Assert.assertNotNull(streetEdge1);
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState766();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1254();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState793();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1164();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState921();
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
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge52();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1599();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1502();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1699();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState362();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState217();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1436();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState885();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState751();
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1068();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1121();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState187();
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge27();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1351();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState635();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1935();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState973();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState178();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1243();
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1885();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1912();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState943();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1453();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1097();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1365();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex2();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1149();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex28();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1036();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState839();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState927();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState475();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState90();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState176();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState924();
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState793();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1164();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState393();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState910();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState30();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge111();
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
        org.junit.Assert.assertNotNull(streetEdge11);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1788();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1075();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1567();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1550();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1909();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState619();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1186();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1455();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1899();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1245();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1771();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1280();
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1345();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState387();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState793();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1164();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState393();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState910();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState420();
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState17();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1597();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState999();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1161();
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
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1455();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState953();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex20();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1499();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1574();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1914();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1692();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState793();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState612();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge85();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState820();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1864();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1827();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1567();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1085();
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge27();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1351();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge37();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1266();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1491();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState508();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState104();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState936();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1463();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex39();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState188();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1654();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1291();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex11 = serializedObjectSupporter0.deserializeObjectVertex35();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNotNull(intersectionVertex11);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState217();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState593();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState197();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState733();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1293();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1652();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex8();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1788();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1865();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState641();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1113();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState860();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = state7.getClass();
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
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState295();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1853();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState955();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex24();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1969();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1149();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState603();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1385();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState350();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState219();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1395();
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge27();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1351();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState635();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1935();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState973();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState178();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1052();
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState516();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState823();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1119();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1446();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1367();
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState34();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState182();
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1788();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1362();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState946();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1474();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState862();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState837();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1786();
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
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1373();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState972();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState109();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState811();
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState612();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge85();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge134();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1918();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1788();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1349();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState304();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState334();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState505();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1230();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1895();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1565();
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1914();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState488();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState178();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge27();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1351();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState232();
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge60();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex16();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1303();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState515();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState539();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState128();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState189();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1750();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1945();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState621();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1168();
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
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState80();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState5();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState295();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState259();
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState408();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1283();
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState915();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1432();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1953();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1699();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1017();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState879();
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1036();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState518();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState435();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState915();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1432();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1953();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1699();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1017();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState361();
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState732();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex10 = serializedObjectSupporter0.deserializeObjectVertex17();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1693();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1320();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(intersectionVertex10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge27();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1773();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1393();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1430();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState5();
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex39();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState188();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1654();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1498();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1670();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState438();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = multiShortestPathTree1.serializedObjectSupporter;
        double double3 = multiShortestPathTree1.getTIME_EPSILON();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.getstateSets();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter5 = multiShortestPathTree1.serializedObjectSupporter;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        int int8 = multiShortestPathTree7.getWEIGHT_DIFF_MARGIN();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree7.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree7.getPath(vertex10, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree7.stateSets;
        java.lang.String str14 = multiShortestPathTree7.toString();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter15 = multiShortestPathTree7.serializedObjectSupporter;
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter18 = multiShortestPathTree17.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree17.getVertices();
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree17.postVisit(state20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree17.getstateSets();
        double double23 = multiShortestPathTree17.getTIME_EPSILON();
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree25 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest24);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter26 = multiShortestPathTree25.serializedObjectSupporter;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet27 = multiShortestPathTree25.getVertices();
        org.opentripplanner.routing.core.State state28 = null;
        multiShortestPathTree25.postVisit(state28);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap30 = multiShortestPathTree25.getstateSets();
        multiShortestPathTree17.setstateSets(vertexMap30);
        multiShortestPathTree7.stateSets = vertexMap30;
        multiShortestPathTree1.setstateSets(vertexMap30);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList34 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(serializedObjectSupporter2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02d + "'", double3 == 0.02d);
        org.junit.Assert.assertNotNull(vertexMap4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertNotNull(vertexMap9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNotNull(vertexMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.02d + "'", double23 == 0.02d);
        org.junit.Assert.assertNull(serializedObjectSupporter26);
        org.junit.Assert.assertNotNull(vertexSet27);
        org.junit.Assert.assertNotNull(vertexMap30);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1607();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1612();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1453();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge21();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1252();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1865();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1325();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1345();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1007();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1764();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge27();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1351();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState9();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState895();
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState870();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState548();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState210();
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState295();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1598();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1214();
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState472();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState181();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex12();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1872();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1515();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1453();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge21();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1803();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState593();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1053();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1345();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState409();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1831();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1373();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState972();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1171();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState699();
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1455();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1899();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1245();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState78();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState295();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState781();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState390();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1453();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge21();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1255();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState977();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1504();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState420();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1824();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
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
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState80();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex40();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1970();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1330();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState793();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1164();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState393();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1639();
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState335();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState193();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge103();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1670();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1786();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1453();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState322();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1788();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1349();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState840();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1647();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState638();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState301();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState812();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1016();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1867();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge118();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState399();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1225();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState676();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState537();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1933();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1921();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState789();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1149();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState603();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1385();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1677();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1465();
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState625();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1359();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1144();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex39();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState188();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1654();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1498();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1862();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter0.deserializeObjectEdge102();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState80();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState694();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge84();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1812();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1636();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState732();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState356();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState798();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState959();
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1100();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1311();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1890();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex39();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState188();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1654();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1498();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState543();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState520();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState608();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1474();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState868();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1052();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState284();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge41();
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
        org.junit.Assert.assertNotNull(streetEdge11);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1491();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState870();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState337();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1648();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1891();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState849();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState844();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1105();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState641();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1719();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1724();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState353();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1701();
        org.opentripplanner.routing.core.StateData stateData12 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1659();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter0.deserializeObjectState1695();
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
        org.junit.Assert.assertNull(stateData12);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state14);
    }
}

