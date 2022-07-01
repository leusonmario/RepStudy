import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest45 {

    public static boolean debug = false;

    @Test
    public void test22501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22501");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        int int11 = multiShortestPathTree1.getVertexCount();
        int int12 = multiShortestPathTree1.getVertexCount();
        java.lang.String str13 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(graphPathList5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertNotNull(vertexSet15);
    }

    @Test
    public void test22502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22502");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.core.State state3 = multiShortestPathTree1.getState(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        java.lang.String str10 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(graphPath6);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(stateList15);
    }

    @Test
    public void test22503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22503");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList4 = multiShortestPathTree1.getStates(vertex3);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNotNull(stateCollection15);
    }

    @Test
    public void test22504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22504");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        java.lang.String str16 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, true);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet23 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList26 = multiShortestPathTree1.getPaths(vertex24, true);
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList28 = multiShortestPathTree1.getStates(vertex27);
        int int29 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(graphPathList5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNotNull(graphPathList22);
        org.junit.Assert.assertNotNull(vertexSet23);
        org.junit.Assert.assertNotNull(graphPathList26);
        org.junit.Assert.assertNull(stateList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test22505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22505");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        int int20 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass21 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(graphPathList12);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertNull(state18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test22506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22506");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.core.State state3 = multiShortestPathTree1.getState(vertex2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        java.lang.String str15 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22507");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, true);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        java.lang.String str17 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree1.getState(vertex19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList22 = multiShortestPathTree1.getStates(vertex21);
        org.opentripplanner.routing.core.State state23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = multiShortestPathTree1.add(state23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNull(state20);
        org.junit.Assert.assertNull(stateList22);
    }

    @Test
    public void test22508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22508");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNotNull(vertexSet16);
    }

    @Test
    public void test22509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22509");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList22 = multiShortestPathTree1.getStates(vertex21);
        org.opentripplanner.routing.core.State state23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = multiShortestPathTree1.visit(state23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertNull(stateList22);
    }

    @Test
    public void test22510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22510");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(stateCollection15);
    }

    @Test
    public void test22511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22511");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, true);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, true);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree1.postVisit(state18);
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree1.postVisit(state20);
        org.junit.Assert.assertNotNull(graphPathList5);
        org.junit.Assert.assertNull(graphPath8);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNotNull(graphPathList17);
    }

    @Test
    public void test22512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22512");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(stateList14);
    }

    @Test
    public void test22513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22513");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.core.State state3 = multiShortestPathTree1.getState(vertex2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, true);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(graphPath8);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(graphPathList14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(routingRequest17);
    }

    @Test
    public void test22514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22514");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        int int10 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, false);
        java.lang.String str15 = multiShortestPathTree1.toString();
        java.lang.String str16 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertNotNull(graphPathList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNotNull(vertexSet18);
        org.junit.Assert.assertNotNull(stateCollection19);
    }

    @Test
    public void test22515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22515");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree1.getState(vertex15);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree1.getPath(vertex18, true);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath23 = multiShortestPathTree1.getPath(vertex21, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.getOptions();
        java.lang.String str25 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = multiShortestPathTree1.visit(state26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(state16);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertNull(graphPath20);
        org.junit.Assert.assertNull(graphPath23);
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MultiSPT(0 vertices)" + "'", str25, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22516");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.core.State state3 = multiShortestPathTree1.getState(vertex2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, true);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(graphPath8);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
    }

    @Test
    public void test22517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22517");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths(vertex3, false);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        int int15 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        int int17 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(graphPathList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test22518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22518");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree1.getState(vertex15);
        int int17 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNotNull(graphPathList5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNull(state16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test22519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22519");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        int int19 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree1.getState(vertex20);
        org.junit.Assert.assertNotNull(graphPathList5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(state21);
    }

    @Test
    public void test22520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22520");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiShortestPathTree1.add(state15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNotNull(stateCollection14);
    }

    @Test
    public void test22521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22521");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths(vertex3, false);
        int int6 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(stateCollection18);
    }

    @Test
    public void test22522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22522");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, true);
        int int15 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath21 = multiShortestPathTree1.getPath(vertex19, false);
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList23 = multiShortestPathTree1.getStates(vertex22);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList26 = multiShortestPathTree1.getPaths(vertex24, false);
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(graphPathList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNotNull(stateCollection18);
        org.junit.Assert.assertNull(graphPath21);
        org.junit.Assert.assertNull(stateList23);
        org.junit.Assert.assertNotNull(graphPathList26);
    }

    @Test
    public void test22523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22523");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.core.State state3 = multiShortestPathTree1.getState(vertex2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNull(routingRequest16);
    }

    @Test
    public void test22524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22524");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.core.State state3 = multiShortestPathTree1.getState(vertex2);
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        int int8 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        java.lang.String str16 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree1.getPath(vertex18, true);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(graphPathList6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath20);
    }

    @Test
    public void test22525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22525");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.core.State state3 = multiShortestPathTree1.getState(vertex2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        java.lang.String str11 = multiShortestPathTree1.toString();
        int int12 = multiShortestPathTree1.getVertexCount();
        java.lang.Class<?> wildcardClass13 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

