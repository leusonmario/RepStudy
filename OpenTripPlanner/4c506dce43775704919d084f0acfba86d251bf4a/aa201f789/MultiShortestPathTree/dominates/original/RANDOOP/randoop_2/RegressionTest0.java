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
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
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
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
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
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
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
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
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
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
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
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = graphPath4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
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
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.add(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
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
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
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
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(graphPath14);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
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
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
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
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.lang.Class<?> wildcardClass4 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        java.lang.Class<?> wildcardClass6 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.add(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
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
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
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
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = multiShortestPathTree1.add(state3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
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
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
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
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.visit(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
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
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
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
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.visit(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(stateCollection5);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
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
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
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
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass6 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
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
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (-1L), routingRequest3);
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
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.visit(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        int int8 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = routingRequest9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.visit(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
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
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
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
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(graphPathList8);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
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
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList8);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
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
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
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
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) (short) 10, routingRequest3);
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
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.lang.Class<?> wildcardClass10 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
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
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) 10, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = state7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.lang.Class<?> wildcardClass10 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        java.lang.String str11 = multiShortestPathTree1.toString();
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.visit(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.visit(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.lang.Class<?> wildcardClass5 = graphPathList4.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
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
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
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
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(graphPath16);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
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
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        java.lang.Class<?> wildcardClass8 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
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
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        java.lang.String str5 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.visit(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        java.lang.Class<?> wildcardClass5 = graphPathList4.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.lang.String str6 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
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
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        multiShortestPathTree1.dump();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(graphPathList13);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
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
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.add(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass13 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.visit(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest6);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = state6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        java.lang.String str11 = multiShortestPathTree1.toString();
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.visit(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.visit(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(graphPathList13);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, false);
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(graphPath11);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
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
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet11);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
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
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.visit(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = multiShortestPathTree1.add(state5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
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
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.add(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNotNull(stateCollection16);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection9);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(routingRequest10);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.visit(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(vertexSet8);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath10);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
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
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.visit(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.add(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
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
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, 10L, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
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
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
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
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
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
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.visit(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNotNull(stateCollection15);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
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
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
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
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(graphPath14);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        int int15 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        java.lang.String str17 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = multiShortestPathTree1.visit(state18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, false);
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(graphPath11);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
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
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
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
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNotNull(vertexSet15);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.add(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vertexSet7);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        java.lang.Class<?> wildcardClass11 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.lang.Class<?> wildcardClass10 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.lang.String str8 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
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
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(stateList14);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
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
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, true);
        org.opentripplanner.routing.core.State state18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = multiShortestPathTree1.visit(state18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertNotNull(graphPathList17);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        int int8 = multiShortestPathTree1.getVertexCount();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(graphPathList11);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        int int8 = multiShortestPathTree1.getVertexCount();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.core.State state18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = multiShortestPathTree1.visit(state18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(graphPathList12);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(state17);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        java.lang.String str11 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass16 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
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
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList10);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(stateCollection5);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        java.lang.String str9 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(graphPath10);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(stateCollection11);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        java.lang.Class<?> wildcardClass16 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        java.lang.String str11 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        java.lang.String str13 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.add(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.Class<?> wildcardClass7 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNull(stateList20);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, true);
        java.lang.Class<?> wildcardClass19 = graphPathList18.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(stateList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = stateList14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNull(stateList14);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass8 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass8 = vertexSet7.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        java.lang.Class<?> wildcardClass11 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(stateList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        java.lang.Class<?> wildcardClass11 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.add(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(stateCollection5);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList8);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass19 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(stateCollection18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        java.lang.String str19 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.add(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(state14);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        java.lang.String str8 = multiShortestPathTree1.toString();
        int int9 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass10 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.visit(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        multiShortestPathTree1.dump();
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        java.lang.String str9 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree1.getState(vertex19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath23 = multiShortestPathTree1.getPath(vertex21, false);
        java.lang.Class<?> wildcardClass24 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNull(state20);
        org.junit.Assert.assertNull(graphPath23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vertexSet12);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.lang.String str9 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.add(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNotNull(vertexSet16);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(graphPathList13);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(stateCollection14);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        java.lang.String str8 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
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
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass13 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.add(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNotNull(stateCollection15);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.lang.String str9 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(stateList13);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        java.lang.String str6 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.lang.String str12 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass14 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection4 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = multiShortestPathTree1.visit(state5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(stateCollection4);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        int int16 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
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
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(graphPath10);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(stateCollection10);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass6 = vertexSet5.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNotNull(vertexSet16);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
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
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(graphPathList9);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(graphPath14);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        multiShortestPathTree1.dump();
        java.lang.String str13 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.visit(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.core.State state18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = multiShortestPathTree1.add(state18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state17);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.add(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
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
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        int int8 = multiShortestPathTree1.getVertexCount();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree1.getPath(vertex18, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(graphPathList12);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNull(graphPath20);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.visit(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        java.lang.String str11 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(stateList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        int int7 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        int int8 = multiShortestPathTree1.getVertexCount();
        int int9 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(stateCollection11);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
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
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.add(state19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNotNull(stateCollection18);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        int int9 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = state12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNotNull(vertexSet12);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNotNull(graphPathList8);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNotNull(vertexSet14);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        java.lang.String str5 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass15 = stateCollection14.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.visit(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(routingRequest16);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        multiShortestPathTree1.dump();
        java.lang.Class<?> wildcardClass13 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet11);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
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
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.add(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(vertexSet6);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(graphPathList16);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = routingRequest10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(routingRequest10);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
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
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.add(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(routingRequest13);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(stateCollection11);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        int int7 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(vertexSet7);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        int int7 = multiShortestPathTree1.getVertexCount();
        java.lang.String str8 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        java.lang.String str18 = multiShortestPathTree1.toString();
        int int19 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet20 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = multiShortestPathTree1.add(state21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vertexSet20);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
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
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        java.lang.Class<?> wildcardClass12 = graphPathList11.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass14 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        java.lang.String str18 = multiShortestPathTree1.toString();
        int int19 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.add(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNotNull(graphPathList8);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, false);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        java.lang.Class<?> wildcardClass15 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(graphPathList13);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        int int7 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = state10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        java.lang.String str12 = multiShortestPathTree1.toString();
        java.lang.Class<?> wildcardClass13 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        java.lang.String str20 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = multiShortestPathTree1.visit(state21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        java.lang.String str12 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.visit(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state14);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass4 = vertexSet3.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
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
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNull(graphPath16);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.lang.String str6 = multiShortestPathTree1.toString();
        int int7 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        int int11 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        int int16 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass17 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(stateCollection14);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        java.lang.String str5 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        int int9 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.add(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        java.lang.Class<?> wildcardClass16 = graphPathList15.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        java.lang.Class<?> wildcardClass15 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexSet18);
        org.junit.Assert.assertNotNull(stateCollection19);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.add(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNotNull(stateCollection16);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.visit(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection6);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.add(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        java.lang.String str11 = multiShortestPathTree1.toString();
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(routingRequest13);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        java.lang.String str8 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state16 = null;
        multiShortestPathTree1.postVisit(state16);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath21 = multiShortestPathTree1.getPath(vertex19, false);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNotNull(stateCollection18);
        org.junit.Assert.assertNull(graphPath21);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
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
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath21 = multiShortestPathTree1.getPath(vertex19, true);
        org.opentripplanner.routing.core.State state22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = multiShortestPathTree1.add(state22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNull(graphPath21);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, true);
        java.lang.Class<?> wildcardClass20 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList4 = multiShortestPathTree1.getStates(vertex3);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList4);
        org.junit.Assert.assertNull(stateList6);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.add(state19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(stateCollection18);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.add(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = multiShortestPathTree1.add(state18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNotNull(stateCollection17);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
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
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, false);
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.visit(state19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNull(graphPath18);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
        java.lang.Class<?> wildcardClass18 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNull(stateList14);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet11);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        java.lang.Class<?> wildcardClass16 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = graphPath15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(graphPath15);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass11 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        int int15 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.add(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = state14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(state14);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        java.lang.String str18 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection19);
        org.junit.Assert.assertNotNull(graphPathList22);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        java.lang.String str18 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath22 = multiShortestPathTree1.getPath(vertex20, false);
        java.lang.Class<?> wildcardClass23 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection19);
        org.junit.Assert.assertNull(graphPath22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        java.lang.String str11 = multiShortestPathTree1.toString();
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        int int9 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(stateCollection9);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList9);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
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
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(graphPath14);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
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
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vertexSet12);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.lang.String str6 = multiShortestPathTree1.toString();
        int int7 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        multiShortestPathTree1.dump();
        java.lang.Class<?> wildcardClass8 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.lang.String str6 = multiShortestPathTree1.toString();
        int int7 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        int int11 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, true);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        org.opentripplanner.routing.core.State state21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = multiShortestPathTree1.visit(state21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(graphPath18);
        org.junit.Assert.assertNull(stateList20);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = routingRequest13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(routingRequest13);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        java.lang.Class<?> wildcardClass9 = graphPathList8.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        java.lang.String str12 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.add(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        int int9 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(stateList11);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(vertexSet7);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        java.lang.Class<?> wildcardClass15 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        int int8 = multiShortestPathTree1.getVertexCount();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.visit(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(graphPathList12);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree1.getStates(vertex18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNull(stateList19);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.visit(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNotNull(vertexSet13);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(vertexSet7);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.add(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(graphPathList13);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = state14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(state14);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
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
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        java.lang.String str12 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        java.lang.String str15 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.visit(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree1.getState(vertex18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = state19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(state19);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        java.lang.Class<?> wildcardClass13 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(graphPathList7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = stateList13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(stateList13);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList9);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        org.opentripplanner.routing.core.State state21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = multiShortestPathTree1.visit(state21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNotNull(graphPathList20);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.visit(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(routingRequest13);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.lang.Class<?> wildcardClass8 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(graphPath11);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.add(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(routingRequest10);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.add(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList8);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        java.lang.Class<?> wildcardClass9 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(vertexSet9);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, true);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, false);
        java.lang.String str19 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.visit(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        java.lang.String str5 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = state7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection22 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList24 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNull(stateList21);
        org.junit.Assert.assertNotNull(stateCollection22);
        org.junit.Assert.assertNull(routingRequest23);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(graphPathList7);
        org.junit.Assert.assertNotNull(vertexSet8);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        multiShortestPathTree1.dump();
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.add(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(graphPath19);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(state17);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.visit(state19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertNull(routingRequest18);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = state17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(state17);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList11);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
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
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass12 = stateCollection11.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state16 = null;
        multiShortestPathTree1.postVisit(state16);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        java.lang.String str16 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass18 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.visit(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        org.opentripplanner.routing.core.State state18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = multiShortestPathTree1.visit(state18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(stateList17);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        multiShortestPathTree1.dump();
        java.lang.String str12 = multiShortestPathTree1.toString();
        java.lang.Class<?> wildcardClass13 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        java.lang.Class<?> wildcardClass14 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass15 = vertexSet14.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.add(state19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNull(routingRequest18);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        java.lang.String str11 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass14 = vertexSet13.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
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
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        java.lang.String str9 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
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
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = graphPath19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(graphPath19);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        int int8 = multiShortestPathTree1.getVertexCount();
        int int9 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, true);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree1.getState(vertex20);
        org.opentripplanner.routing.core.State state22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = multiShortestPathTree1.visit(state22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNotNull(graphPathList19);
        org.junit.Assert.assertNull(state21);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.add(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest6);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.visit(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(stateCollection16);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.visit(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(stateCollection16);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        multiShortestPathTree1.dump();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        int int14 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, false);
        java.lang.Class<?> wildcardClass19 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        multiShortestPathTree1.dump();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertNull(stateList10);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList7);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        multiShortestPathTree1.dump();
        int int9 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        java.lang.String str8 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        multiShortestPathTree1.dump();
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.lang.String str9 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, true);
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.add(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath13);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        int int12 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath11);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.lang.Class<?> wildcardClass10 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        int int10 = multiShortestPathTree1.getVertexCount();
        java.lang.String str11 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList8);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.add(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiShortestPathTree1.add(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNotNull(vertexSet13);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        java.lang.Class<?> wildcardClass16 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree1.getState(vertex19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = state20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(stateCollection18);
        org.junit.Assert.assertNull(state20);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.add(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateList8);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        int int16 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass17 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = routingRequest7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        java.lang.String str13 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNotNull(graphPathList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList16);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(vertexSet16);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        java.lang.String str11 = multiShortestPathTree1.toString();
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, true);
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.visit(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(graphPath16);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        int int8 = multiShortestPathTree1.getVertexCount();
        int int9 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, false);
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.add(state19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(graphPathList18);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNotNull(stateCollection14);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNull(graphPath16);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        java.lang.String str9 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.add(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(graphPath13);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection4 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.add(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(stateCollection4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNotNull(stateCollection6);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = routingRequest6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest6);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        java.lang.Class<?> wildcardClass13 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.add(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNull(state18);
        org.junit.Assert.assertNull(routingRequest19);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        multiShortestPathTree1.dump();
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.add(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.add(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(vertexSet12);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, false);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.visit(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList13);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.add(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(vertexSet7);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        int int9 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        int int11 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        java.lang.String str18 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree1.getVertices();
        java.lang.String str20 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = multiShortestPathTree1.add(state21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(vertexSet7);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
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
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(stateList14);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNotNull(graphPathList16);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        java.lang.Class<?> wildcardClass6 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        int int15 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = multiShortestPathTree1.add(state18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNull(routingRequest17);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass6 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(stateCollection12);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass17 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, false);
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.add(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList7);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, true);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.visit(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(graphPath8);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
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
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(stateList15);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, true);
        org.opentripplanner.routing.core.State state19 = null;
        multiShortestPathTree1.postVisit(state19);
        org.opentripplanner.routing.core.State state21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = multiShortestPathTree1.visit(state21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(graphPathList18);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = multiShortestPathTree1.visit(state5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree1.getState(vertex18);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree1.getState(vertex20);
        org.opentripplanner.routing.core.State state22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = multiShortestPathTree1.visit(state22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(state19);
        org.junit.Assert.assertNull(state21);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
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
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(graphPathList8);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.visit(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        int int8 = multiShortestPathTree1.getVertexCount();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        multiShortestPathTree1.dump();
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree1.getPath(vertex18, true);
        org.opentripplanner.routing.core.State state21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = multiShortestPathTree1.visit(state21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(graphPathList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNull(graphPath20);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass18 = stateCollection17.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = multiShortestPathTree1.visit(state18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNotNull(vertexSet15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNotNull(vertexSet17);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = routingRequest7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNull(stateList21);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        int int13 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(stateCollection14);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        org.opentripplanner.routing.core.State state22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = multiShortestPathTree1.visit(state22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNull(stateList21);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiShortestPathTree1.visit(state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.lang.String str9 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.visit(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.add(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(graphPath14);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(routingRequest10);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiShortestPathTree1.add(state9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(vertexSet8);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = state9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(stateCollection8);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.add(state19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNotNull(stateCollection18);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass11 = vertexSet10.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        multiShortestPathTree1.dump();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        int int14 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, false);
        java.lang.Class<?> wildcardClass19 = graphPathList18.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList23 = multiShortestPathTree1.getStates(vertex22);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state25 = null;
        multiShortestPathTree1.postVisit(state25);
        org.opentripplanner.routing.core.State state27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = multiShortestPathTree1.add(state27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNull(stateList20);
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertNull(stateList23);
        org.junit.Assert.assertNull(routingRequest24);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
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
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNotNull(graphPathList12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(stateList15);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.visit(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.lang.String str8 = multiShortestPathTree1.toString();
        int int9 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass10 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.add(state17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(graphPath16);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        java.lang.String str11 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = multiShortestPathTree1.add(state14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet13);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        int int8 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        multiShortestPathTree1.dump();
        java.lang.Class<?> wildcardClass10 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, true);
        org.opentripplanner.routing.core.State state7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiShortestPathTree1.visit(state7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNull(graphPath6);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = multiShortestPathTree1.visit(state10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(graphPath8);
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(graphPath11);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(state15);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        java.lang.String str11 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass13 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        int int17 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        int int7 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.lang.Class<?> wildcardClass13 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.visit(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(routingRequest13);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        java.lang.String str18 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        int int15 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        int int19 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.add(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNull(state18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = state17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state17);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, true);
        java.lang.Class<?> wildcardClass15 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNotNull(graphPathList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(graphPathList7);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        java.lang.String str12 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        java.lang.String str15 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.add(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.visit(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNull(routingRequest19);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(routingRequest16);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        java.lang.String str14 = multiShortestPathTree1.toString();
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
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList16);
        org.junit.Assert.assertNotNull(stateCollection17);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree1.getStates(vertex17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNull(stateList18);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList14);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        java.lang.String str13 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNotNull(graphPathList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, true);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(graphPath8);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree1.postVisit(state18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(stateCollection16);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        int int9 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.visit(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        java.lang.String str16 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest17);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.lang.String str9 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
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
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList13);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass13 = stateCollection12.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

