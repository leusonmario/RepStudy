import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) '4', routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
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
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
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
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.State state3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = multiShortestPathTree0.add(state3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
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
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) 'a', routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
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
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        java.lang.Class<?> wildcardClass3 = multiShortestPathTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
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
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
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
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
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
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.slf4j.Logger logger0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree.LOG = logger0;
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.Class<?> wildcardClass2 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = multiShortestPathTree0.getVertexCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.opentripplanner.routing.core.State> stateCollection4 = multiShortestPathTree0.getAllStates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree0.getPaths(vertex3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.slf4j.Logger logger0 = org.opentripplanner.routing.spt.MultiShortestPathTree.LOG;
        org.junit.Assert.assertNull(logger0);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
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
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = multiShortestPathTree1.visit(state5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.State state4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = multiShortestPathTree1.add(state4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree0.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree0.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(vertexMap3);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
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
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
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
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree0.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.options;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree0.getStates(vertex4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree0.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) 100, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree0.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = multiShortestPathTree0.getVertexCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(vertexMap3);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.core.State state4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = multiShortestPathTree0.visit(state4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(vertexMap3);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, 1L, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = multiShortestPathTree1.visit(state2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree0.getPath(vertex4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(vertexMap3);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) (byte) 10, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) ' ', routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) 100, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
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
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = multiShortestPathTree0.options;
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree0.getStates(vertex2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest1);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass6 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = multiShortestPathTree0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
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
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.graph.Vertex vertex1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state2 = multiShortestPathTree0.getState(vertex1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
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
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) (byte) 100, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
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
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) (short) 100, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass7 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, 10L, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = multiShortestPathTree0.add(state1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass7 = vertexMap6.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, 0L, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) 0, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) (short) 0, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) (byte) 0, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) (short) 0, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = multiShortestPathTree0.getVertexCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, 10L, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree0.getStates(vertex4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) '#', routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = multiShortestPathTree0.options;
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree0.getPaths(vertex2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest1);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
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
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass7 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.options;
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree0.postVisit(state4);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree0.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
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
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.visit(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(graphPathList8);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.options;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = multiShortestPathTree0.getVertexCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.visit(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, 1L, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) 1, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        java.lang.Class<?> wildcardClass5 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
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
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNotNull(vertexMap5);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = multiShortestPathTree1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree5.postVisit(state6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        multiShortestPathTree5.stateSets = vertexMap10;
        multiShortestPathTree1.stateSets = vertexMap10;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNotNull(vertexMap10);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.lang.Class<?> wildcardClass4 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = state9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass10 = stateCollection9.getClass();
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (-1L), routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest4);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) (short) -1, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) ' ', routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.lang.Class<?> wildcardClass8 = vertexMap6.getClass();
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap14;
        java.lang.Class<?> wildcardClass16 = vertexMap14.getClass();
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
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
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest6);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNull(stateList10);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = routingRequest9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.visit(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNotNull(vertexMap5);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, false);
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(graphPathList7);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.getOptions();
        org.opentripplanner.routing.core.State state4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = multiShortestPathTree0.visit(state4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(stateList12);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList3 = multiShortestPathTree0.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = routingRequest3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree5.postVisit(state6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        multiShortestPathTree5.stateSets = vertexMap10;
        multiShortestPathTree1.stateSets = vertexMap10;
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.visit(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNotNull(vertexMap10);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) 1, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        java.lang.String str7 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.lang.String str11 = multiShortestPathTree1.toString();
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) (short) 1, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree0.getPaths(vertex3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        int int8 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = multiShortestPathTree1.add(state4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet11);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.getOptions();
        java.lang.Class<?> wildcardClass4 = multiShortestPathTree0.getClass();
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
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
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(vertexMap6);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) (short) 10, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.core.State state4 = multiShortestPathTree1.getState(vertex3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(vertexMap6);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap14;
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.add(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(vertexMap14);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = multiShortestPathTree1.getVertexCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.add(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(routingRequest10);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree9.getOptions();
        java.lang.String str15 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree17.postVisit(state18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        multiShortestPathTree9.stateSets = vertexMap22;
        multiShortestPathTree1.stateSets = vertexMap22;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap22);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        int int9 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.lang.Class<?> wildcardClass8 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) (byte) -1, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        java.lang.Class<?> wildcardClass10 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) (byte) 1, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(stateList9);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, 0L, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        java.lang.Class<?> wildcardClass10 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        java.lang.String str12 = multiShortestPathTree11.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree14.stateSets;
        multiShortestPathTree11.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree11.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.visit(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap15);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexMap18);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree5.postVisit(state6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        multiShortestPathTree5.stateSets = vertexMap10;
        multiShortestPathTree1.stateSets = vertexMap10;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(stateList15);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.visit(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(graphPathList13);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.lang.String str7 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection8);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) (-1), routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass8 = stateCollection7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap8);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.add(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(stateList5);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(graphPath9);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        java.lang.String str12 = multiShortestPathTree11.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree14.stateSets;
        multiShortestPathTree11.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree11.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap15);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexMap18);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, false);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(graphPathList7);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        int int7 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        java.lang.Class<?> wildcardClass11 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        java.lang.String str12 = multiShortestPathTree11.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree14.stateSets;
        multiShortestPathTree11.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree11.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        org.opentripplanner.routing.core.State state22 = null;
        multiShortestPathTree21.postVisit(state22);
        int int24 = multiShortestPathTree21.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection25 = multiShortestPathTree21.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList28 = multiShortestPathTree21.getPaths(vertex26, false);
        java.lang.String str29 = multiShortestPathTree21.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        java.lang.String str32 = multiShortestPathTree31.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap33 = multiShortestPathTree31.stateSets;
        multiShortestPathTree21.stateSets = vertexMap33;
        multiShortestPathTree1.stateSets = vertexMap33;
        java.lang.String str36 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass38 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap15);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(stateCollection25);
        org.junit.Assert.assertNotNull(graphPathList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "MultiSPT(0 vertices)" + "'", str29, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MultiSPT(0 vertices)" + "'", str32, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "MultiSPT(0 vertices)" + "'", str36, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree9.getState(vertex11);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree9.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree16.postVisit(state17);
        int int19 = multiShortestPathTree16.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree16.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree16.getOptions();
        java.lang.String str22 = multiShortestPathTree16.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        org.opentripplanner.routing.core.State state25 = null;
        multiShortestPathTree24.postVisit(state25);
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest27);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree28.stateSets;
        multiShortestPathTree24.stateSets = vertexMap29;
        multiShortestPathTree16.stateSets = vertexMap29;
        multiShortestPathTree9.stateSets = vertexMap29;
        multiShortestPathTree1.stateSets = vertexMap29;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList34 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(vertexMap13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(stateCollection20);
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap29);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.visit(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.lang.String str8 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = multiShortestPathTree1.getVertexCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest6);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, false);
        java.lang.Class<?> wildcardClass8 = graphPathList7.getClass();
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(graphPathList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state3 = new org.opentripplanner.routing.core.State(vertex0, (long) (byte) 10, routingRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = multiShortestPathTree1.add(state5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest4);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap14;
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree1.getPaths(vertex21, false);
        org.opentripplanner.routing.core.State state24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = multiShortestPathTree1.visit(state24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNotNull(graphPathList23);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree9.getOptions();
        java.lang.String str15 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree17.postVisit(state18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        multiShortestPathTree9.stateSets = vertexMap22;
        multiShortestPathTree1.stateSets = vertexMap22;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet26 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNotNull(vertexSet26);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.core.State state4 = multiShortestPathTree1.getState(vertex3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree8.postVisit(state9);
        int int11 = multiShortestPathTree8.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree8.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree8.getOptions();
        java.lang.String str14 = multiShortestPathTree8.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree16.postVisit(state17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree20.stateSets;
        multiShortestPathTree16.stateSets = vertexMap21;
        multiShortestPathTree8.stateSets = vertexMap21;
        multiShortestPathTree1.stateSets = vertexMap21;
        org.opentripplanner.routing.core.State state25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = multiShortestPathTree1.visit(state25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap21);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(stateCollection7);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) (short) -1, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass13 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(stateCollection12);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertNotNull(vertexMap8);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(graphPath8);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass11 = vertexMap10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.core.State state4 = multiShortestPathTree1.getState(vertex3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(vertexMap5);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.add(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.lang.Class<?> wildcardClass11 = graphPathList10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNotNull(vertexSet15);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.getOptions();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree0.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree0.getOptions();
        java.lang.Class<?> wildcardClass7 = multiShortestPathTree0.getClass();
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.lang.String str6 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        java.lang.String str9 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, true);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.add(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList12);
        org.junit.Assert.assertNull(graphPath15);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, true);
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.visit(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(graphPathList13);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        int int9 = multiShortestPathTree1.getVertexCount();
        java.lang.String str10 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.add(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.add(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = graphPath8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(graphPath8);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.add(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(vertexMap6);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        java.lang.Class<?> wildcardClass10 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass4 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
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
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = multiShortestPathTree0.getState(vertex3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(graphPath9);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree9.getOptions();
        java.lang.String str15 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree17.postVisit(state18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        multiShortestPathTree9.stateSets = vertexMap22;
        multiShortestPathTree1.stateSets = vertexMap22;
        org.opentripplanner.routing.core.State state26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = multiShortestPathTree1.visit(state26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap22);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(graphPathList14);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.add(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.core.State state4 = multiShortestPathTree1.getState(vertex3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree8.postVisit(state9);
        int int11 = multiShortestPathTree8.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree8.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree8.getOptions();
        java.lang.String str14 = multiShortestPathTree8.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree16.postVisit(state17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree20.stateSets;
        multiShortestPathTree16.stateSets = vertexMap21;
        multiShortestPathTree8.stateSets = vertexMap21;
        multiShortestPathTree1.stateSets = vertexMap21;
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree26 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest25);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree26.stateSets;
        multiShortestPathTree1.stateSets = vertexMap27;
        java.lang.Class<?> wildcardClass29 = vertexMap27.getClass();
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap21);
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        java.lang.String str9 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.add(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNull(routingRequest15);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.State state3 = null;
        multiShortestPathTree0.postVisit(state3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree0.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree0.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(vertexMap5);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        java.lang.String str9 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.add(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection6);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(vertexSet11);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.add(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.lang.String str13 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = multiShortestPathTree1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.getOptions();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree0.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree0.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = null;
        multiShortestPathTree0.stateSets = vertexMap7;
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree0.visit(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest6);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.State state3 = null;
        multiShortestPathTree0.postVisit(state3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree0.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = multiShortestPathTree0.getVertexCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(vertexMap5);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        int int9 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(routingRequest12);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree5.postVisit(state6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        multiShortestPathTree5.stateSets = vertexMap10;
        multiShortestPathTree1.stateSets = vertexMap10;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.add(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNotNull(vertexSet13);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.getOptions();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree0.postVisit(state4);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree0.getPaths(vertex6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(vertexSet11);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        java.lang.String str12 = multiShortestPathTree11.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree14.stateSets;
        multiShortestPathTree11.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree11.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        org.opentripplanner.routing.core.State state22 = null;
        multiShortestPathTree21.postVisit(state22);
        int int24 = multiShortestPathTree21.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection25 = multiShortestPathTree21.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList28 = multiShortestPathTree21.getPaths(vertex26, false);
        java.lang.String str29 = multiShortestPathTree21.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        java.lang.String str32 = multiShortestPathTree31.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap33 = multiShortestPathTree31.stateSets;
        multiShortestPathTree21.stateSets = vertexMap33;
        multiShortestPathTree1.stateSets = vertexMap33;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap15);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(stateCollection25);
        org.junit.Assert.assertNotNull(graphPathList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "MultiSPT(0 vertices)" + "'", str29, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MultiSPT(0 vertices)" + "'", str32, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap33);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.add(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(graphPathList8);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = routingRequest8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree1.stateSets;
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNotNull(vertexMap15);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.Class<?> wildcardClass7 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        int int9 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass11 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexSet8);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        java.lang.String str12 = multiShortestPathTree11.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree14.stateSets;
        multiShortestPathTree11.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree11.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.add(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap15);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexMap18);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree16.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree16.getState(vertex18);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree16.stateSets;
        multiShortestPathTree1.stateSets = vertexMap20;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNotNull(vertexMap17);
        org.junit.Assert.assertNull(state19);
        org.junit.Assert.assertNotNull(vertexMap20);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.add(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexMap10);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(stateList9);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = multiShortestPathTree0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, false);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertNotNull(graphPathList14);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass3 = vertexMap2.getClass();
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap12 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap12;
        java.lang.Class<?> wildcardClass14 = vertexMap12.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexMap12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.add(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state14);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap14;
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = multiShortestPathTree1.add(state22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNotNull(stateCollection21);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree9.getOptions();
        java.lang.String str15 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree17.postVisit(state18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        multiShortestPathTree9.stateSets = vertexMap22;
        multiShortestPathTree1.stateSets = vertexMap22;
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest27);
        org.opentripplanner.routing.core.State state29 = null;
        multiShortestPathTree28.postVisit(state29);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet31 = multiShortestPathTree28.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap32 = multiShortestPathTree28.stateSets;
        multiShortestPathTree1.stateSets = vertexMap32;
        java.lang.Class<?> wildcardClass34 = vertexMap32.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNull(routingRequest26);
        org.junit.Assert.assertNotNull(vertexSet31);
        org.junit.Assert.assertNotNull(vertexMap32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree9.getState(vertex11);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree9.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree16.postVisit(state17);
        int int19 = multiShortestPathTree16.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree16.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree16.getOptions();
        java.lang.String str22 = multiShortestPathTree16.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        org.opentripplanner.routing.core.State state25 = null;
        multiShortestPathTree24.postVisit(state25);
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest27);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree28.stateSets;
        multiShortestPathTree24.stateSets = vertexMap29;
        multiShortestPathTree16.stateSets = vertexMap29;
        multiShortestPathTree9.stateSets = vertexMap29;
        multiShortestPathTree1.stateSets = vertexMap29;
        org.opentripplanner.routing.core.State state34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = multiShortestPathTree1.add(state34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(vertexMap13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(stateCollection20);
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap29);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.core.State state4 = multiShortestPathTree1.getState(vertex3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree8.postVisit(state9);
        int int11 = multiShortestPathTree8.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree8.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree8.getOptions();
        java.lang.String str14 = multiShortestPathTree8.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree16.postVisit(state17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree20.stateSets;
        multiShortestPathTree16.stateSets = vertexMap21;
        multiShortestPathTree8.stateSets = vertexMap21;
        multiShortestPathTree1.stateSets = vertexMap21;
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree26 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest25);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree26.stateSets;
        multiShortestPathTree1.stateSets = vertexMap27;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap21);
        org.junit.Assert.assertNotNull(vertexMap27);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.options;
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree0.postVisit(state4);
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree0.postVisit(state6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree0.getPath(vertex8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, true);
        java.lang.Class<?> wildcardClass16 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap14;
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNotNull(stateCollection21);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap8);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass4 = vertexSet3.getClass();
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(graphPathList8);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(stateCollection12);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(graphPath9);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree9.getState(vertex11);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree9.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree16.postVisit(state17);
        int int19 = multiShortestPathTree16.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree16.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree16.getOptions();
        java.lang.String str22 = multiShortestPathTree16.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        org.opentripplanner.routing.core.State state25 = null;
        multiShortestPathTree24.postVisit(state25);
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest27);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree28.stateSets;
        multiShortestPathTree24.stateSets = vertexMap29;
        multiShortestPathTree16.stateSets = vertexMap29;
        multiShortestPathTree9.stateSets = vertexMap29;
        multiShortestPathTree1.stateSets = vertexMap29;
        org.opentripplanner.routing.graph.Vertex vertex34 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList36 = multiShortestPathTree1.getPaths(vertex34, true);
        java.lang.Class<?> wildcardClass37 = graphPathList36.getClass();
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(vertexMap13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(stateCollection20);
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap29);
        org.junit.Assert.assertNotNull(graphPathList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.core.State state4 = multiShortestPathTree1.getState(vertex3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree8.postVisit(state9);
        int int11 = multiShortestPathTree8.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree8.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree8.getOptions();
        java.lang.String str14 = multiShortestPathTree8.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree16.postVisit(state17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree20.stateSets;
        multiShortestPathTree16.stateSets = vertexMap21;
        multiShortestPathTree8.stateSets = vertexMap21;
        multiShortestPathTree1.stateSets = vertexMap21;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection25 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = multiShortestPathTree1.add(state26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap21);
        org.junit.Assert.assertNotNull(stateCollection25);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        int int9 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNotNull(graphPathList13);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexMap9);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
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
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(stateList12);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree9.getPath(vertex13, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree9.stateSets;
        int int17 = multiShortestPathTree9.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree19 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest18);
        java.lang.String str20 = multiShortestPathTree19.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree22 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest21);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap23 = multiShortestPathTree22.stateSets;
        multiShortestPathTree19.stateSets = vertexMap23;
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = multiShortestPathTree19.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree19.stateSets;
        multiShortestPathTree9.stateSets = vertexMap26;
        multiShortestPathTree1.stateSets = vertexMap26;
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = multiShortestPathTree1.getOptions();
        java.lang.String str30 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNotNull(vertexMap16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap23);
        org.junit.Assert.assertNull(routingRequest25);
        org.junit.Assert.assertNotNull(vertexMap26);
        org.junit.Assert.assertNull(routingRequest29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MultiSPT(0 vertices)" + "'", str30, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, true);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath9);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.lang.String str10 = multiShortestPathTree9.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree9.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree13.postVisit(state14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree17.stateSets;
        multiShortestPathTree13.stateSets = vertexMap18;
        multiShortestPathTree9.stateSets = vertexMap18;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath24 = multiShortestPathTree1.getPath(vertex22, true);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertNull(graphPath24);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        org.opentripplanner.routing.core.State state19 = null;
        multiShortestPathTree18.postVisit(state19);
        int int21 = multiShortestPathTree18.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath24 = multiShortestPathTree18.getPath(vertex22, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree18.stateSets;
        int int26 = multiShortestPathTree18.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = multiShortestPathTree18.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest28 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree29 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest28);
        org.opentripplanner.routing.core.State state30 = null;
        multiShortestPathTree29.postVisit(state30);
        int int32 = multiShortestPathTree29.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex33 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath35 = multiShortestPathTree29.getPath(vertex33, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap36 = multiShortestPathTree29.stateSets;
        multiShortestPathTree18.stateSets = vertexMap36;
        multiShortestPathTree1.stateSets = vertexMap36;
        java.lang.Class<?> wildcardClass39 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(graphPath24);
        org.junit.Assert.assertNotNull(vertexMap25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(routingRequest27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(graphPath35);
        org.junit.Assert.assertNotNull(vertexMap36);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection4 = multiShortestPathTree1.getAllStates();
        int int5 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.visit(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(stateCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        java.lang.Class<?> wildcardClass13 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        java.lang.String str12 = multiShortestPathTree11.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree14.stateSets;
        multiShortestPathTree11.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree11.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        org.opentripplanner.routing.core.State state22 = null;
        multiShortestPathTree21.postVisit(state22);
        int int24 = multiShortestPathTree21.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection25 = multiShortestPathTree21.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList28 = multiShortestPathTree21.getPaths(vertex26, false);
        java.lang.String str29 = multiShortestPathTree21.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        java.lang.String str32 = multiShortestPathTree31.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap33 = multiShortestPathTree31.stateSets;
        multiShortestPathTree21.stateSets = vertexMap33;
        multiShortestPathTree1.stateSets = vertexMap33;
        java.lang.String str36 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree1.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap15);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(stateCollection25);
        org.junit.Assert.assertNotNull(graphPathList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "MultiSPT(0 vertices)" + "'", str29, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MultiSPT(0 vertices)" + "'", str32, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "MultiSPT(0 vertices)" + "'", str36, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap37);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.lang.String str12 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.lang.String str5 = multiShortestPathTree1.toString();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection7);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap14;
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree1.getAllStates();
        java.lang.String str22 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = multiShortestPathTree1.add(state23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNotNull(stateCollection21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.lang.Class<?> wildcardClass11 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree5.getState(vertex7);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree5.stateSets;
        multiShortestPathTree0.stateSets = vertexMap9;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree0.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(vertexMap9);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        java.lang.String str11 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap12 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.visit(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap12);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        java.lang.Class<?> wildcardClass11 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree9.getOptions();
        java.lang.String str15 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree17.postVisit(state18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        multiShortestPathTree9.stateSets = vertexMap22;
        multiShortestPathTree1.stateSets = vertexMap22;
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = multiShortestPathTree1.getOptions();
        int int28 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass29 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNull(routingRequest26);
        org.junit.Assert.assertNull(routingRequest27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.lang.Class<?> wildcardClass7 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.lang.String str13 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        java.lang.Class<?> wildcardClass16 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNull(stateList10);
        org.junit.Assert.assertNotNull(stateCollection11);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNotNull(stateCollection12);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.visit(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(vertexMap8);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        int int9 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree12.postVisit(state13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree16.stateSets;
        multiShortestPathTree12.stateSets = vertexMap17;
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree12.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree12.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree12.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree12.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection23 = multiShortestPathTree12.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree12.stateSets;
        multiShortestPathTree1.stateSets = vertexMap24;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection26 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList27 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNotNull(vertexMap17);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNotNull(stateCollection20);
        org.junit.Assert.assertNotNull(vertexSet21);
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertNotNull(stateCollection23);
        org.junit.Assert.assertNotNull(vertexMap24);
        org.junit.Assert.assertNotNull(stateCollection26);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNull(stateList10);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.add(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vertexSet5);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(routingRequest12);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass13 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNull(stateList5);
        org.junit.Assert.assertNull(stateList7);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.getOptions();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree0.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree0.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = null;
        multiShortestPathTree0.stateSets = vertexMap7;
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree0.getClass();
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree1.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNotNull(vertexMap13);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.lang.String str11 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.graph.Vertex vertex1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList3 = multiShortestPathTree0.getPaths(vertex1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree9.getState(vertex11);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree9.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree16.postVisit(state17);
        int int19 = multiShortestPathTree16.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree16.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree16.getOptions();
        java.lang.String str22 = multiShortestPathTree16.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        org.opentripplanner.routing.core.State state25 = null;
        multiShortestPathTree24.postVisit(state25);
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest27);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree28.stateSets;
        multiShortestPathTree24.stateSets = vertexMap29;
        multiShortestPathTree16.stateSets = vertexMap29;
        multiShortestPathTree9.stateSets = vertexMap29;
        multiShortestPathTree1.stateSets = vertexMap29;
        org.opentripplanner.routing.graph.Vertex vertex34 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList36 = multiShortestPathTree1.getPaths(vertex34, true);
        int int37 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest38 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree39 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest38);
        java.lang.String str40 = multiShortestPathTree39.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest41 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree42 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest41);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap43 = multiShortestPathTree42.stateSets;
        multiShortestPathTree39.stateSets = vertexMap43;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection45 = multiShortestPathTree39.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest46 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree47 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest46);
        org.opentripplanner.routing.core.State state48 = null;
        multiShortestPathTree47.postVisit(state48);
        int int50 = multiShortestPathTree47.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection51 = multiShortestPathTree47.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest52 = multiShortestPathTree47.getOptions();
        java.lang.String str53 = multiShortestPathTree47.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest54 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree55 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest54);
        org.opentripplanner.routing.core.State state56 = null;
        multiShortestPathTree55.postVisit(state56);
        org.opentripplanner.routing.core.RoutingRequest routingRequest58 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree59 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest58);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap60 = multiShortestPathTree59.stateSets;
        multiShortestPathTree55.stateSets = vertexMap60;
        multiShortestPathTree47.stateSets = vertexMap60;
        multiShortestPathTree39.stateSets = vertexMap60;
        org.opentripplanner.routing.core.RoutingRequest routingRequest64 = multiShortestPathTree39.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest65 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree66 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest65);
        org.opentripplanner.routing.core.State state67 = null;
        multiShortestPathTree66.postVisit(state67);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet69 = multiShortestPathTree66.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap70 = multiShortestPathTree66.stateSets;
        multiShortestPathTree39.stateSets = vertexMap70;
        multiShortestPathTree1.stateSets = vertexMap70;
        int int73 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state74 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = multiShortestPathTree1.add(state74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(vertexMap13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(stateCollection20);
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap29);
        org.junit.Assert.assertNotNull(graphPathList36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "MultiSPT(0 vertices)" + "'", str40, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap43);
        org.junit.Assert.assertNotNull(stateCollection45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(stateCollection51);
        org.junit.Assert.assertNull(routingRequest52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "MultiSPT(0 vertices)" + "'", str53, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap60);
        org.junit.Assert.assertNull(routingRequest64);
        org.junit.Assert.assertNotNull(vertexSet69);
        org.junit.Assert.assertNotNull(vertexMap70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertNotNull(vertexSet4);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.State state3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = multiShortestPathTree0.visit(state3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, true);
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.add(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(graphPathList13);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.lang.String str13 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass15 = vertexSet14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(graphPathList8);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.add(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap14;
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree1.getPaths(vertex21, false);
        org.opentripplanner.routing.core.State state24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = multiShortestPathTree1.add(state24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNotNull(graphPathList23);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.add(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertNull(stateList13);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass7 = stateCollection6.getClass();
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        java.lang.String str11 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection12);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, true);
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.visit(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(graphPathList12);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.options;
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree0.postVisit(state4);
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree0.postVisit(state6);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree0.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.visit(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(graphPath16);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap14;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree1.getPath(vertex18, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(graphPath20);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet11);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(graphPathList9);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.State state3 = null;
        multiShortestPathTree0.postVisit(state3);
        java.lang.Class<?> wildcardClass5 = multiShortestPathTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.core.State state4 = multiShortestPathTree1.getState(vertex3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree8.postVisit(state9);
        int int11 = multiShortestPathTree8.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree8.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree8.getOptions();
        java.lang.String str14 = multiShortestPathTree8.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree16.postVisit(state17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree20.stateSets;
        multiShortestPathTree16.stateSets = vertexMap21;
        multiShortestPathTree8.stateSets = vertexMap21;
        multiShortestPathTree1.stateSets = vertexMap21;
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree26 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest25);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree26.stateSets;
        multiShortestPathTree1.stateSets = vertexMap27;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet29 = multiShortestPathTree1.getVertices();
        int int30 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass31 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap21);
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertNotNull(vertexSet29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.lang.String str12 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.visit(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.visit(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNotNull(vertexSet15);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap14;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree1.getStates(vertex18);
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.add(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(stateList19);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree9.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree9.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree9.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree9.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap19;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNull(stateList6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertNotNull(vertexMap19);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath7);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree8.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree8.getVertices();
        java.lang.String str11 = multiShortestPathTree8.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap12 = multiShortestPathTree8.stateSets;
        multiShortestPathTree1.stateSets = vertexMap12;
        int int14 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(vertexMap9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        java.lang.String str9 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass12 = stateCollection11.getClass();
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        int int6 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree9.getOptions();
        java.lang.String str15 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree17.postVisit(state18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        multiShortestPathTree9.stateSets = vertexMap22;
        multiShortestPathTree1.stateSets = vertexMap22;
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNull(routingRequest26);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass9 = vertexMap8.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        java.lang.Class<?> wildcardClass17 = graphPathList16.getClass();
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(graphPathList10);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        int int9 = multiShortestPathTree1.getVertexCount();
        java.lang.String str10 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        java.lang.String str12 = multiShortestPathTree11.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree14.stateSets;
        multiShortestPathTree11.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree11.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        org.opentripplanner.routing.core.State state22 = null;
        multiShortestPathTree21.postVisit(state22);
        int int24 = multiShortestPathTree21.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection25 = multiShortestPathTree21.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList28 = multiShortestPathTree21.getPaths(vertex26, false);
        java.lang.String str29 = multiShortestPathTree21.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        java.lang.String str32 = multiShortestPathTree31.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap33 = multiShortestPathTree31.stateSets;
        multiShortestPathTree21.stateSets = vertexMap33;
        multiShortestPathTree1.stateSets = vertexMap33;
        java.lang.String str36 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree1.stateSets;
        int int38 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state39 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = multiShortestPathTree1.add(state39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap15);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(stateCollection25);
        org.junit.Assert.assertNotNull(graphPathList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "MultiSPT(0 vertices)" + "'", str29, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MultiSPT(0 vertices)" + "'", str32, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "MultiSPT(0 vertices)" + "'", str36, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass10 = vertexSet9.getClass();
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.Class<?> wildcardClass7 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        int int14 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass15 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.core.State state4 = multiShortestPathTree1.getState(vertex3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree8.postVisit(state9);
        int int11 = multiShortestPathTree8.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree8.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree8.getOptions();
        java.lang.String str14 = multiShortestPathTree8.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree16.postVisit(state17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree20.stateSets;
        multiShortestPathTree16.stateSets = vertexMap21;
        multiShortestPathTree8.stateSets = vertexMap21;
        multiShortestPathTree1.stateSets = vertexMap21;
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree26 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest25);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree26.stateSets;
        multiShortestPathTree1.stateSets = vertexMap27;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet29 = multiShortestPathTree1.getVertices();
        int int30 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath33 = multiShortestPathTree1.getPath(vertex31, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest34 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex35 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList37 = multiShortestPathTree1.getPaths(vertex35, false);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap21);
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertNotNull(vertexSet29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(graphPath33);
        org.junit.Assert.assertNull(routingRequest34);
        org.junit.Assert.assertNotNull(graphPathList37);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        java.lang.String str12 = multiShortestPathTree11.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree14.stateSets;
        multiShortestPathTree11.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree11.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        org.opentripplanner.routing.core.State state22 = null;
        multiShortestPathTree21.postVisit(state22);
        int int24 = multiShortestPathTree21.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection25 = multiShortestPathTree21.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList28 = multiShortestPathTree21.getPaths(vertex26, false);
        java.lang.String str29 = multiShortestPathTree21.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        java.lang.String str32 = multiShortestPathTree31.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap33 = multiShortestPathTree31.stateSets;
        multiShortestPathTree21.stateSets = vertexMap33;
        multiShortestPathTree1.stateSets = vertexMap33;
        java.lang.String str36 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass38 = vertexMap37.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap15);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(stateCollection25);
        org.junit.Assert.assertNotNull(graphPathList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "MultiSPT(0 vertices)" + "'", str29, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MultiSPT(0 vertices)" + "'", str32, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "MultiSPT(0 vertices)" + "'", str36, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.lang.String str13 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.add(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNull(stateList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(vertexSet14);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree9.getPath(vertex13, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree9.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = null;
        multiShortestPathTree1.stateSets = vertexMap20;
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.core.State> stateList23 = multiShortestPathTree1.getStates(vertex22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertNotNull(vertexMap18);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        java.lang.String str11 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNotNull(stateCollection13);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.add(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        int int9 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass10 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(stateList15);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest5);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree10.postVisit(state11);
        int int13 = multiShortestPathTree10.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree10.getPath(vertex14, false);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree10.getPath(vertex17, true);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree10.getStates(vertex20);
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree10.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet23 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree25 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest24);
        java.lang.String str26 = multiShortestPathTree25.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest27);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree28.stateSets;
        multiShortestPathTree25.stateSets = vertexMap29;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection31 = multiShortestPathTree25.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest32 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree33 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest32);
        org.opentripplanner.routing.core.State state34 = null;
        multiShortestPathTree33.postVisit(state34);
        int int36 = multiShortestPathTree33.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection37 = multiShortestPathTree33.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest38 = multiShortestPathTree33.getOptions();
        java.lang.String str39 = multiShortestPathTree33.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest40 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree41 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest40);
        org.opentripplanner.routing.core.State state42 = null;
        multiShortestPathTree41.postVisit(state42);
        org.opentripplanner.routing.core.RoutingRequest routingRequest44 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree45 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest44);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap46 = multiShortestPathTree45.stateSets;
        multiShortestPathTree41.stateSets = vertexMap46;
        multiShortestPathTree33.stateSets = vertexMap46;
        multiShortestPathTree25.stateSets = vertexMap46;
        org.opentripplanner.routing.core.RoutingRequest routingRequest50 = multiShortestPathTree25.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest51 = multiShortestPathTree25.getOptions();
        int int52 = multiShortestPathTree25.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap53 = multiShortestPathTree25.stateSets;
        multiShortestPathTree10.stateSets = vertexMap53;
        multiShortestPathTree1.stateSets = vertexMap53;
        java.lang.Class<?> wildcardClass56 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNull(stateList21);
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertNotNull(vertexSet23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MultiSPT(0 vertices)" + "'", str26, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap29);
        org.junit.Assert.assertNotNull(stateCollection31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(stateCollection37);
        org.junit.Assert.assertNull(routingRequest38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "MultiSPT(0 vertices)" + "'", str39, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap46);
        org.junit.Assert.assertNull(routingRequest50);
        org.junit.Assert.assertNull(routingRequest51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(vertexMap53);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        java.lang.String str11 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        java.lang.String str15 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree9.getOptions();
        java.lang.String str15 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree17.postVisit(state18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        multiShortestPathTree9.stateSets = vertexMap22;
        multiShortestPathTree1.stateSets = vertexMap22;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet26 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = multiShortestPathTree1.visit(state27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNotNull(vertexSet26);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        int int10 = multiShortestPathTree1.getVertexCount();
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, false);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(graphPathList14);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        int int13 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.core.State> stateList4 = multiShortestPathTree0.getStates(vertex3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        java.lang.String str13 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.lang.String str7 = multiShortestPathTree1.toString();
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        java.lang.Class<?> wildcardClass10 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree9.getOptions();
        java.lang.String str15 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree17.postVisit(state18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        multiShortestPathTree9.stateSets = vertexMap22;
        multiShortestPathTree1.stateSets = vertexMap22;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet26 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList28 = multiShortestPathTree1.getStates(vertex27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList29 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNotNull(vertexSet26);
        org.junit.Assert.assertNull(stateList28);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap14;
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree1.getPaths(vertex21, false);
        java.lang.Class<?> wildcardClass24 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNotNull(graphPathList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.visit(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = graphPath17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNull(graphPath17);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.add(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNotNull(vertexMap14);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        int int9 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(stateList12);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.lang.Class<?> wildcardClass3 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        java.lang.String str17 = multiShortestPathTree16.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree19 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest18);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree19.stateSets;
        multiShortestPathTree16.stateSets = vertexMap20;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection22 = multiShortestPathTree16.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        org.opentripplanner.routing.core.State state25 = null;
        multiShortestPathTree24.postVisit(state25);
        int int27 = multiShortestPathTree24.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection28 = multiShortestPathTree24.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = multiShortestPathTree24.getOptions();
        java.lang.String str30 = multiShortestPathTree24.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest31 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree32 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest31);
        org.opentripplanner.routing.core.State state33 = null;
        multiShortestPathTree32.postVisit(state33);
        org.opentripplanner.routing.core.RoutingRequest routingRequest35 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree36 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest35);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree36.stateSets;
        multiShortestPathTree32.stateSets = vertexMap37;
        multiShortestPathTree24.stateSets = vertexMap37;
        multiShortestPathTree16.stateSets = vertexMap37;
        org.opentripplanner.routing.core.RoutingRequest routingRequest41 = multiShortestPathTree16.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest42 = multiShortestPathTree16.getOptions();
        int int43 = multiShortestPathTree16.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap44 = multiShortestPathTree16.stateSets;
        multiShortestPathTree1.stateSets = vertexMap44;
        org.opentripplanner.routing.core.State state46 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = multiShortestPathTree1.visit(state46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap20);
        org.junit.Assert.assertNotNull(stateCollection22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(stateCollection28);
        org.junit.Assert.assertNull(routingRequest29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MultiSPT(0 vertices)" + "'", str30, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap37);
        org.junit.Assert.assertNull(routingRequest41);
        org.junit.Assert.assertNull(routingRequest42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(vertexMap44);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.lang.String str13 = multiShortestPathTree1.toString();
        int int14 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.lang.String str11 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.visit(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection12);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass7 = stateCollection6.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree9.getOptions();
        java.lang.String str15 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree17.postVisit(state18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        multiShortestPathTree9.stateSets = vertexMap22;
        multiShortestPathTree1.stateSets = vertexMap22;
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest27);
        org.opentripplanner.routing.core.State state29 = null;
        multiShortestPathTree28.postVisit(state29);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet31 = multiShortestPathTree28.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap32 = multiShortestPathTree28.stateSets;
        multiShortestPathTree1.stateSets = vertexMap32;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass35 = vertexMap34.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNull(routingRequest26);
        org.junit.Assert.assertNotNull(vertexSet31);
        org.junit.Assert.assertNotNull(vertexMap32);
        org.junit.Assert.assertNotNull(vertexMap34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass7 = stateCollection6.getClass();
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree9.getPath(vertex13, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree9.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = null;
        multiShortestPathTree1.stateSets = vertexMap20;
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.spt.GraphPath graphPath24 = multiShortestPathTree1.getPath(vertex22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertNotNull(vertexMap18);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(stateCollection7);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree13.postVisit(state14);
        int int16 = multiShortestPathTree13.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree13.getPath(vertex17, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree13.stateSets;
        int int21 = multiShortestPathTree13.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        java.lang.String str24 = multiShortestPathTree23.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree26 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest25);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree26.stateSets;
        multiShortestPathTree23.stateSets = vertexMap27;
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = multiShortestPathTree23.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap30 = multiShortestPathTree23.stateSets;
        multiShortestPathTree13.stateSets = vertexMap30;
        org.opentripplanner.routing.core.RoutingRequest routingRequest32 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree33 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest32);
        org.opentripplanner.routing.core.State state34 = null;
        multiShortestPathTree33.postVisit(state34);
        int int36 = multiShortestPathTree33.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection37 = multiShortestPathTree33.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex38 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList40 = multiShortestPathTree33.getPaths(vertex38, false);
        java.lang.String str41 = multiShortestPathTree33.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest42 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree43 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest42);
        java.lang.String str44 = multiShortestPathTree43.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap45 = multiShortestPathTree43.stateSets;
        multiShortestPathTree33.stateSets = vertexMap45;
        multiShortestPathTree13.stateSets = vertexMap45;
        multiShortestPathTree1.stateSets = vertexMap45;
        org.opentripplanner.routing.core.State state49 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = multiShortestPathTree1.add(state49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNotNull(vertexMap20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MultiSPT(0 vertices)" + "'", str24, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertNull(routingRequest29);
        org.junit.Assert.assertNotNull(vertexMap30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(stateCollection37);
        org.junit.Assert.assertNotNull(graphPathList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "MultiSPT(0 vertices)" + "'", str41, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "MultiSPT(0 vertices)" + "'", str44, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap45);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        int int15 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass16 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNull(routingRequest5);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        int int10 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree5.postVisit(state6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        multiShortestPathTree5.stateSets = vertexMap10;
        multiShortestPathTree1.stateSets = vertexMap10;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass14 = vertexSet13.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.core.State state4 = multiShortestPathTree1.getState(vertex3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree8.postVisit(state9);
        int int11 = multiShortestPathTree8.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree8.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree8.getOptions();
        java.lang.String str14 = multiShortestPathTree8.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree16.postVisit(state17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree20.stateSets;
        multiShortestPathTree16.stateSets = vertexMap21;
        multiShortestPathTree8.stateSets = vertexMap21;
        multiShortestPathTree1.stateSets = vertexMap21;
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree26 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest25);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree26.stateSets;
        multiShortestPathTree1.stateSets = vertexMap27;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet29 = multiShortestPathTree1.getVertices();
        int int30 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath33 = multiShortestPathTree1.getPath(vertex31, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest34 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state35 = null;
        multiShortestPathTree1.postVisit(state35);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection37 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex38 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList39 = multiShortestPathTree1.getStates(vertex38);
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap21);
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertNotNull(vertexSet29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(graphPath33);
        org.junit.Assert.assertNull(routingRequest34);
        org.junit.Assert.assertNotNull(stateCollection37);
        org.junit.Assert.assertNull(stateList39);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNull(stateList5);
        org.junit.Assert.assertNull(stateList7);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = stateList20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(stateList20);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNull(stateList6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.visit(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(graphPath8);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree9.getOptions();
        java.lang.String str15 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree17.postVisit(state18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        multiShortestPathTree9.stateSets = vertexMap22;
        multiShortestPathTree1.stateSets = vertexMap22;
        java.lang.Class<?> wildcardClass26 = vertexMap22.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.lang.String str12 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.lang.String str8 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = multiShortestPathTree1.visit(state3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet2);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        java.lang.String str15 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = graphPath19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(graphPath19);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        int int9 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree12.postVisit(state13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree16.stateSets;
        multiShortestPathTree12.stateSets = vertexMap17;
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree12.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree12.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree12.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree12.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection23 = multiShortestPathTree12.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree12.stateSets;
        multiShortestPathTree1.stateSets = vertexMap24;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection26 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass27 = stateCollection26.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNotNull(vertexMap17);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNotNull(stateCollection20);
        org.junit.Assert.assertNotNull(vertexSet21);
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertNotNull(stateCollection23);
        org.junit.Assert.assertNotNull(vertexMap24);
        org.junit.Assert.assertNotNull(stateCollection26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree9.getOptions();
        java.lang.String str15 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree17.postVisit(state18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        multiShortestPathTree9.stateSets = vertexMap22;
        multiShortestPathTree1.stateSets = vertexMap22;
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList28 = multiShortestPathTree1.getPaths(vertex26, true);
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList30 = multiShortestPathTree1.getStates(vertex29);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNotNull(graphPathList28);
        org.junit.Assert.assertNull(stateList30);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet2 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.core.State state4 = multiShortestPathTree1.getState(vertex3);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.add(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet2);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, true);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.add(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNotNull(graphPathList16);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        java.lang.String str12 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        java.lang.String str12 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree16.postVisit(state17);
        int int19 = multiShortestPathTree16.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath22 = multiShortestPathTree16.getPath(vertex20, false);
        int int23 = multiShortestPathTree16.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree16.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree16.stateSets;
        multiShortestPathTree1.stateSets = vertexMap25;
        java.lang.Class<?> wildcardClass27 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(graphPath22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertNotNull(vertexMap25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        int int7 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(routingRequest13);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.visit(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNull(stateList5);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree5.postVisit(state6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        multiShortestPathTree5.stateSets = vertexMap10;
        multiShortestPathTree1.stateSets = vertexMap10;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        int int14 = multiShortestPathTree1.getVertexCount();
        int int15 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.visit(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        int int10 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.add(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(routingRequest10);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass13 = stateCollection12.getClass();
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.add(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest6);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        int int11 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(stateCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(graphPath10);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, false);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state19 = null;
        multiShortestPathTree18.postVisit(state19);
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree18.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree23.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        org.opentripplanner.routing.core.State state26 = multiShortestPathTree23.getState(vertex25);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree23.stateSets;
        multiShortestPathTree18.stateSets = vertexMap27;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree18.stateSets;
        multiShortestPathTree1.stateSets = vertexMap29;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList31 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertNotNull(vertexMap24);
        org.junit.Assert.assertNull(state26);
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertNotNull(vertexMap29);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass11 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        java.lang.String str11 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass13 = stateCollection12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.lang.String str13 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        java.lang.String str15 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass18 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, false);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNotNull(graphPathList14);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.lang.String str5 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, true);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, true);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet6);
        org.junit.Assert.assertNull(graphPath9);
        org.junit.Assert.assertNotNull(graphPathList12);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap14;
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree19 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest18);
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree19.postVisit(state20);
        int int22 = multiShortestPathTree19.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection23 = multiShortestPathTree19.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree19.getOptions();
        java.lang.String str25 = multiShortestPathTree19.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree27 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest26);
        org.opentripplanner.routing.core.State state28 = null;
        multiShortestPathTree27.postVisit(state28);
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap32 = multiShortestPathTree31.stateSets;
        multiShortestPathTree27.stateSets = vertexMap32;
        multiShortestPathTree19.stateSets = vertexMap32;
        multiShortestPathTree1.stateSets = vertexMap32;
        java.lang.String str36 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = multiShortestPathTree1.add(state37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(stateCollection23);
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MultiSPT(0 vertices)" + "'", str25, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "MultiSPT(0 vertices)" + "'", str36, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree13.stateSets;
        multiShortestPathTree9.stateSets = vertexMap14;
        multiShortestPathTree1.stateSets = vertexMap14;
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.add(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap14);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        int int7 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = multiShortestPathTree0.options;
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree0.getPaths(vertex2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest1);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.graph.Vertex vertex1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList3 = multiShortestPathTree0.getPaths(vertex1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree9.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree9.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree9.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree9.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap19;
        org.opentripplanner.routing.core.State state21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = multiShortestPathTree1.visit(state21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNull(stateList6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertNotNull(vertexMap19);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.lang.String str13 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet14);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass11 = vertexSet10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass15 = vertexSet14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList5 = multiShortestPathTree1.getStates(vertex4);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNull(stateList5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(graphPath13);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap14;
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        org.opentripplanner.routing.core.State state21 = null;
        multiShortestPathTree1.postVisit(state21);
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = multiShortestPathTree1.options;
        int int24 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList27 = multiShortestPathTree1.getStates(vertex26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList28 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNull(routingRequest23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(vertexMap25);
        org.junit.Assert.assertNull(stateList27);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        java.lang.String str12 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList14);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest7);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        java.lang.Class<?> wildcardClass16 = graphPathList15.getClass();
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        java.lang.String str14 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet15);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(vertexSet14);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.visit(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNotNull(graphPathList16);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        java.lang.String str14 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.add(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet15);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(graphPath13);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, true);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(graphPath9);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        java.lang.String str15 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.visit(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree13.stateSets;
        multiShortestPathTree9.stateSets = vertexMap14;
        multiShortestPathTree1.stateSets = vertexMap14;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree1.getState(vertex18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNull(state19);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.core.State state4 = multiShortestPathTree1.getState(vertex3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree8.postVisit(state9);
        int int11 = multiShortestPathTree8.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree8.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree8.getOptions();
        java.lang.String str14 = multiShortestPathTree8.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree16.postVisit(state17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree20.stateSets;
        multiShortestPathTree16.stateSets = vertexMap21;
        multiShortestPathTree8.stateSets = vertexMap21;
        multiShortestPathTree1.stateSets = vertexMap21;
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree26 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest25);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree26.stateSets;
        multiShortestPathTree1.stateSets = vertexMap27;
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList31 = multiShortestPathTree1.getPaths(vertex29, true);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap21);
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertNotNull(graphPathList31);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap12 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, true);
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.add(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(vertexMap12);
        org.junit.Assert.assertNull(graphPath15);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(stateCollection8);
        org.junit.Assert.assertNotNull(stateCollection9);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = multiShortestPathTree1.visit(state18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNull(stateList16);
        org.junit.Assert.assertNotNull(stateCollection17);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNull(state14);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree15 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest14);
        org.opentripplanner.routing.core.State state16 = null;
        multiShortestPathTree15.postVisit(state16);
        int int18 = multiShortestPathTree15.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree15.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree15.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree15.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath24 = multiShortestPathTree15.getPath(vertex22, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection25 = multiShortestPathTree15.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree15.stateSets;
        multiShortestPathTree1.stateSets = vertexMap26;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet28 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList29 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(stateCollection19);
        org.junit.Assert.assertNotNull(vertexMap20);
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertNull(graphPath24);
        org.junit.Assert.assertNotNull(stateCollection25);
        org.junit.Assert.assertNotNull(vertexMap26);
        org.junit.Assert.assertNotNull(vertexSet28);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = multiShortestPathTree0.options;
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree0.getPath(vertex2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest1);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree3.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree7.stateSets;
        multiShortestPathTree3.stateSets = vertexMap8;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = graphPath16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(graphPath16);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        java.lang.String str12 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        java.lang.String str12 = multiShortestPathTree11.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree14.stateSets;
        multiShortestPathTree11.stateSets = vertexMap15;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree11.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        org.opentripplanner.routing.core.State state22 = null;
        multiShortestPathTree21.postVisit(state22);
        int int24 = multiShortestPathTree21.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection25 = multiShortestPathTree21.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList28 = multiShortestPathTree21.getPaths(vertex26, false);
        java.lang.String str29 = multiShortestPathTree21.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        java.lang.String str32 = multiShortestPathTree31.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap33 = multiShortestPathTree31.stateSets;
        multiShortestPathTree21.stateSets = vertexMap33;
        multiShortestPathTree1.stateSets = vertexMap33;
        java.lang.String str36 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree1.stateSets;
        int int38 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state39 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = multiShortestPathTree1.visit(state39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap15);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(stateCollection25);
        org.junit.Assert.assertNotNull(graphPathList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "MultiSPT(0 vertices)" + "'", str29, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MultiSPT(0 vertices)" + "'", str32, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "MultiSPT(0 vertices)" + "'", str36, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        java.lang.String str15 = multiShortestPathTree1.toString();
        java.lang.Class<?> wildcardClass16 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        int int7 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, false);
        java.lang.Class<?> wildcardClass15 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNotNull(graphPathList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, false);
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.add(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNotNull(graphPathList19);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.lang.String str13 = multiShortestPathTree1.toString();
        int int14 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass15 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.add(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath14);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = null;
        multiShortestPathTree1.stateSets = vertexMap4;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest6);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        java.lang.String str12 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree16.postVisit(state17);
        int int19 = multiShortestPathTree16.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath22 = multiShortestPathTree16.getPath(vertex20, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap23 = multiShortestPathTree16.stateSets;
        int int24 = multiShortestPathTree16.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = multiShortestPathTree16.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree27 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest26);
        org.opentripplanner.routing.core.State state28 = null;
        multiShortestPathTree27.postVisit(state28);
        int int30 = multiShortestPathTree27.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath33 = multiShortestPathTree27.getPath(vertex31, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree27.stateSets;
        multiShortestPathTree16.stateSets = vertexMap34;
        multiShortestPathTree1.stateSets = vertexMap34;
        org.opentripplanner.routing.core.RoutingRequest routingRequest37 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree38 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest37);
        java.lang.String str39 = multiShortestPathTree38.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest40 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree41 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest40);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap42 = multiShortestPathTree41.stateSets;
        multiShortestPathTree38.stateSets = vertexMap42;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection44 = multiShortestPathTree38.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest45 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree46 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest45);
        org.opentripplanner.routing.core.State state47 = null;
        multiShortestPathTree46.postVisit(state47);
        int int49 = multiShortestPathTree46.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection50 = multiShortestPathTree46.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest51 = multiShortestPathTree46.getOptions();
        java.lang.String str52 = multiShortestPathTree46.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest53 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree54 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest53);
        org.opentripplanner.routing.core.State state55 = null;
        multiShortestPathTree54.postVisit(state55);
        org.opentripplanner.routing.core.RoutingRequest routingRequest57 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree58 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest57);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap59 = multiShortestPathTree58.stateSets;
        multiShortestPathTree54.stateSets = vertexMap59;
        multiShortestPathTree46.stateSets = vertexMap59;
        multiShortestPathTree38.stateSets = vertexMap59;
        org.opentripplanner.routing.core.RoutingRequest routingRequest63 = multiShortestPathTree38.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap64 = multiShortestPathTree38.stateSets;
        multiShortestPathTree1.stateSets = vertexMap64;
        org.opentripplanner.routing.core.State state66 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = multiShortestPathTree1.add(state66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(graphPath22);
        org.junit.Assert.assertNotNull(vertexMap23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(routingRequest25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(graphPath33);
        org.junit.Assert.assertNotNull(vertexMap34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "MultiSPT(0 vertices)" + "'", str39, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap42);
        org.junit.Assert.assertNotNull(stateCollection44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(stateCollection50);
        org.junit.Assert.assertNull(routingRequest51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "MultiSPT(0 vertices)" + "'", str52, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap59);
        org.junit.Assert.assertNull(routingRequest63);
        org.junit.Assert.assertNotNull(vertexMap64);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree9.getOptions();
        java.lang.String str15 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree17.postVisit(state18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        multiShortestPathTree9.stateSets = vertexMap22;
        multiShortestPathTree1.stateSets = vertexMap22;
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList28 = multiShortestPathTree1.getPaths(vertex26, true);
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList30 = multiShortestPathTree1.getStates(vertex29);
        org.opentripplanner.routing.core.RoutingRequest routingRequest31 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNotNull(graphPathList28);
        org.junit.Assert.assertNull(stateList30);
        org.junit.Assert.assertNull(routingRequest31);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree8.postVisit(state9);
        int int11 = multiShortestPathTree8.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree8.getPath(vertex12, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree8.stateSets;
        multiShortestPathTree1.stateSets = vertexMap15;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass18 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNotNull(vertexMap15);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.lang.String str13 = multiShortestPathTree1.toString();
        int int14 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(graphPathList17);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, true);
        java.lang.String str5 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.visit(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(stateList15);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vertexSet5);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList3 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state1 = null;
        multiShortestPathTree0.postVisit(state1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.options;
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree0.postVisit(state4);
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree0.visit(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        int int10 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap14;
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNull(stateList17);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree13.postVisit(state14);
        int int16 = multiShortestPathTree13.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree13.getPath(vertex17, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree13.stateSets;
        int int21 = multiShortestPathTree13.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        java.lang.String str24 = multiShortestPathTree23.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree26 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest25);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree26.stateSets;
        multiShortestPathTree23.stateSets = vertexMap27;
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = multiShortestPathTree23.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap30 = multiShortestPathTree23.stateSets;
        multiShortestPathTree13.stateSets = vertexMap30;
        org.opentripplanner.routing.core.RoutingRequest routingRequest32 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree33 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest32);
        org.opentripplanner.routing.core.State state34 = null;
        multiShortestPathTree33.postVisit(state34);
        int int36 = multiShortestPathTree33.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection37 = multiShortestPathTree33.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex38 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList40 = multiShortestPathTree33.getPaths(vertex38, false);
        java.lang.String str41 = multiShortestPathTree33.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest42 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree43 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest42);
        java.lang.String str44 = multiShortestPathTree43.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap45 = multiShortestPathTree43.stateSets;
        multiShortestPathTree33.stateSets = vertexMap45;
        multiShortestPathTree13.stateSets = vertexMap45;
        multiShortestPathTree1.stateSets = vertexMap45;
        org.opentripplanner.routing.core.RoutingRequest routingRequest49 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state50 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = multiShortestPathTree1.visit(state50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNotNull(vertexMap20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MultiSPT(0 vertices)" + "'", str24, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertNull(routingRequest29);
        org.junit.Assert.assertNotNull(vertexMap30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(stateCollection37);
        org.junit.Assert.assertNotNull(graphPathList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "MultiSPT(0 vertices)" + "'", str41, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "MultiSPT(0 vertices)" + "'", str44, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap45);
        org.junit.Assert.assertNull(routingRequest49);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        java.lang.String str9 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, true);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, true);
        java.lang.Class<?> wildcardClass18 = graphPathList17.getClass();
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertNotNull(graphPathList14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNotNull(graphPathList14);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        int int10 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass12 = stateCollection11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(graphPath14);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.visit(state19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexMap18);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNull(routingRequest7);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = multiShortestPathTree1.visit(state18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertNull(routingRequest17);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.lang.String str7 = multiShortestPathTree1.toString();
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.add(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(stateList15);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(graphPathList10);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, true);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.visit(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNotNull(graphPathList16);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexSet8);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass14 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        java.lang.String str15 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(graphPath19);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.lang.String str10 = multiShortestPathTree9.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree9.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree13.postVisit(state14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree17.stateSets;
        multiShortestPathTree13.stateSets = vertexMap18;
        multiShortestPathTree9.stateSets = vertexMap18;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath24 = multiShortestPathTree1.getPath(vertex22, false);
        org.opentripplanner.routing.core.State state25 = null;
        multiShortestPathTree1.postVisit(state25);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = multiShortestPathTree1.add(state28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertNull(graphPath24);
        org.junit.Assert.assertNotNull(vertexMap27);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree9.getOptions();
        java.lang.String str15 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree17.postVisit(state18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        multiShortestPathTree9.stateSets = vertexMap22;
        multiShortestPathTree1.stateSets = vertexMap22;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet26 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass27 = vertexSet26.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNotNull(vertexSet26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree1.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNull(stateList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNotNull(vertexMap15);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.core.State state4 = multiShortestPathTree1.getState(vertex3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertNull(stateList9);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(routingRequest10);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNotNull(stateCollection14);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        java.lang.String str15 = multiShortestPathTree1.toString();
        java.lang.Class<?> wildcardClass16 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree5.postVisit(state6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree9.stateSets;
        multiShortestPathTree5.stateSets = vertexMap10;
        multiShortestPathTree1.stateSets = vertexMap10;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNotNull(vertexSet13);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(graphPath14);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.visit(state19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertNull(routingRequest18);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, false);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNotNull(graphPathList16);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree9.getPath(vertex13, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree9.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree9.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, false);
        org.opentripplanner.routing.core.State state23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = multiShortestPathTree1.add(state23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertNotNull(graphPathList22);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree4.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree9.postVisit(state10);
        int int12 = multiShortestPathTree9.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree9.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree9.getOptions();
        java.lang.String str15 = multiShortestPathTree9.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree17.postVisit(state18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree21.stateSets;
        multiShortestPathTree17.stateSets = vertexMap22;
        multiShortestPathTree9.stateSets = vertexMap22;
        multiShortestPathTree1.stateSets = vertexMap22;
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest27);
        org.opentripplanner.routing.core.State state29 = null;
        multiShortestPathTree28.postVisit(state29);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet31 = multiShortestPathTree28.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap32 = multiShortestPathTree28.stateSets;
        multiShortestPathTree1.stateSets = vertexMap32;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList34 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNull(routingRequest26);
        org.junit.Assert.assertNotNull(vertexSet31);
        org.junit.Assert.assertNotNull(vertexMap32);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap6;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet9);
    }
}

