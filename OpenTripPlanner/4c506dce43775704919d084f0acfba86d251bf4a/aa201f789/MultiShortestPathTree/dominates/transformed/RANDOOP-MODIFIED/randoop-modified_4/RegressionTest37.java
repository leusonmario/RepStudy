import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest37 {

    public static boolean debug = false;

    @Test
    public void test18501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18501");
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
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state19 = null;
        multiShortestPathTree1.postVisit(state19);
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.core.State state23 = multiShortestPathTree1.getState(vertex22);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertNull(stateList16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertNull(state23);
    }

    @Test
    public void test18502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18502");
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
        java.lang.String str19 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection20);
        org.junit.Assert.assertNotNull(vertexSet21);
    }

    @Test
    public void test18503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18503");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest34 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest35 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state36 = null;
        multiShortestPathTree1.postVisit(state36);
        org.opentripplanner.routing.core.RoutingRequest routingRequest38 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree39 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest38);
        org.opentripplanner.routing.core.State state40 = null;
        multiShortestPathTree39.postVisit(state40);
        int int42 = multiShortestPathTree39.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection43 = multiShortestPathTree39.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection44 = multiShortestPathTree39.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection45 = multiShortestPathTree39.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet46 = multiShortestPathTree39.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection47 = multiShortestPathTree39.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex48 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList49 = multiShortestPathTree39.getStates(vertex48);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection50 = multiShortestPathTree39.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap51 = multiShortestPathTree39.stateSets;
        multiShortestPathTree1.stateSets = vertexMap51;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap53 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex54 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList56 = multiShortestPathTree1.getPaths(vertex54, false);
        java.lang.String str57 = multiShortestPathTree1.toString();
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
        org.junit.Assert.assertNull(routingRequest34);
        org.junit.Assert.assertNull(routingRequest35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(stateCollection43);
        org.junit.Assert.assertNotNull(stateCollection44);
        org.junit.Assert.assertNotNull(stateCollection45);
        org.junit.Assert.assertNotNull(vertexSet46);
        org.junit.Assert.assertNotNull(stateCollection47);
        org.junit.Assert.assertNull(stateList49);
        org.junit.Assert.assertNotNull(stateCollection50);
        org.junit.Assert.assertNotNull(vertexMap51);
        org.junit.Assert.assertNotNull(vertexMap53);
        org.junit.Assert.assertNotNull(graphPathList56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "MultiSPT(0 vertices)" + "'", str57, "MultiSPT(0 vertices)");
    }

    @Test
    public void test18504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18504");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree1.stateSets;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertNotNull(vertexMap18);
    }

    @Test
    public void test18505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18505");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        org.opentripplanner.routing.core.State state21 = null;
        multiShortestPathTree20.postVisit(state21);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet23 = multiShortestPathTree20.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath26 = multiShortestPathTree20.getPath(vertex24, true);
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList29 = multiShortestPathTree20.getPaths(vertex27, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet30 = multiShortestPathTree20.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        org.opentripplanner.routing.core.State state32 = multiShortestPathTree20.getState(vertex31);
        org.opentripplanner.routing.graph.Vertex vertex33 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList34 = multiShortestPathTree20.getStates(vertex33);
        org.opentripplanner.routing.core.RoutingRequest routingRequest35 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree36 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest35);
        org.opentripplanner.routing.core.State state37 = null;
        multiShortestPathTree36.postVisit(state37);
        int int39 = multiShortestPathTree36.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection40 = multiShortestPathTree36.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap41 = multiShortestPathTree36.stateSets;
        multiShortestPathTree20.stateSets = vertexMap41;
        org.opentripplanner.routing.core.RoutingRequest routingRequest43 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree44 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest43);
        org.opentripplanner.routing.core.State state45 = null;
        multiShortestPathTree44.postVisit(state45);
        int int47 = multiShortestPathTree44.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex48 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath50 = multiShortestPathTree44.getPath(vertex48, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest51 = multiShortestPathTree44.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection52 = multiShortestPathTree44.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap53 = multiShortestPathTree44.stateSets;
        multiShortestPathTree20.stateSets = vertexMap53;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree55 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state56 = null;
        multiShortestPathTree55.postVisit(state56);
        org.opentripplanner.routing.core.RoutingRequest routingRequest58 = multiShortestPathTree55.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest59 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree60 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest59);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap61 = multiShortestPathTree60.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex62 = null;
        org.opentripplanner.routing.core.State state63 = multiShortestPathTree60.getState(vertex62);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap64 = multiShortestPathTree60.stateSets;
        multiShortestPathTree55.stateSets = vertexMap64;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap66 = multiShortestPathTree55.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex67 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList69 = multiShortestPathTree55.getPaths(vertex67, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest70 = multiShortestPathTree55.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest71 = multiShortestPathTree55.options;
        java.lang.String str72 = multiShortestPathTree55.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap73 = multiShortestPathTree55.stateSets;
        multiShortestPathTree20.stateSets = vertexMap73;
        multiShortestPathTree1.stateSets = vertexMap73;
        org.opentripplanner.routing.core.RoutingRequest routingRequest76 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state77 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = multiShortestPathTree1.visit(state77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNotNull(vertexSet18);
        org.junit.Assert.assertNotNull(vertexSet23);
        org.junit.Assert.assertNull(graphPath26);
        org.junit.Assert.assertNotNull(graphPathList29);
        org.junit.Assert.assertNotNull(vertexSet30);
        org.junit.Assert.assertNull(state32);
        org.junit.Assert.assertNull(stateList34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(stateCollection40);
        org.junit.Assert.assertNotNull(vertexMap41);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(graphPath50);
        org.junit.Assert.assertNull(routingRequest51);
        org.junit.Assert.assertNotNull(stateCollection52);
        org.junit.Assert.assertNotNull(vertexMap53);
        org.junit.Assert.assertNull(routingRequest58);
        org.junit.Assert.assertNotNull(vertexMap61);
        org.junit.Assert.assertNull(state63);
        org.junit.Assert.assertNotNull(vertexMap64);
        org.junit.Assert.assertNotNull(vertexMap66);
        org.junit.Assert.assertNotNull(graphPathList69);
        org.junit.Assert.assertNull(routingRequest70);
        org.junit.Assert.assertNull(routingRequest71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "MultiSPT(0 vertices)" + "'", str72, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap73);
        org.junit.Assert.assertNull(routingRequest76);
    }

    @Test
    public void test18506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18506");
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
        java.lang.String str19 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree1.postVisit(state20);
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = multiShortestPathTree1.options;
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertNull(routingRequest23);
    }

    @Test
    public void test18507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18507");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        int int11 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree14.postVisit(state15);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree14.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree14.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree14.getPaths(vertex19, true);
        java.lang.String str22 = multiShortestPathTree14.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet23 = multiShortestPathTree14.getVertices();
        java.lang.String str24 = multiShortestPathTree14.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree14.stateSets;
        multiShortestPathTree1.stateSets = vertexMap25;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection27 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state28 = null;
        multiShortestPathTree1.postVisit(state28);
        org.opentripplanner.routing.core.State state30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = multiShortestPathTree1.visit(state30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertNotNull(graphPathList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MultiSPT(0 vertices)" + "'", str24, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap25);
        org.junit.Assert.assertNotNull(stateCollection27);
    }

    @Test
    public void test18508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18508");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.State state2 = null;
        multiShortestPathTree1.postVisit(state2);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest12);
    }

    @Test
    public void test18509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18509");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        int int19 = multiShortestPathTree1.getVertexCount();
        java.lang.String str20 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.core.State state23 = multiShortestPathTree1.getState(vertex22);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree25 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest24);
        org.opentripplanner.routing.core.State state26 = null;
        multiShortestPathTree25.postVisit(state26);
        int int28 = multiShortestPathTree25.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath31 = multiShortestPathTree25.getPath(vertex29, false);
        org.opentripplanner.routing.graph.Vertex vertex32 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath34 = multiShortestPathTree25.getPath(vertex32, true);
        java.lang.String str35 = multiShortestPathTree25.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection36 = multiShortestPathTree25.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection37 = multiShortestPathTree25.getAllStates();
        org.opentripplanner.routing.core.State state38 = null;
        multiShortestPathTree25.postVisit(state38);
        org.opentripplanner.routing.core.RoutingRequest routingRequest40 = multiShortestPathTree25.getOptions();
        int int41 = multiShortestPathTree25.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap42 = multiShortestPathTree25.stateSets;
        multiShortestPathTree1.stateSets = vertexMap42;
        int int44 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertNull(state23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(graphPath31);
        org.junit.Assert.assertNull(graphPath34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "MultiSPT(0 vertices)" + "'", str35, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection36);
        org.junit.Assert.assertNotNull(stateCollection37);
        org.junit.Assert.assertNull(routingRequest40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(vertexMap42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test18510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18510");
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
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        org.opentripplanner.routing.core.State state21 = null;
        multiShortestPathTree20.postVisit(state21);
        int int23 = multiShortestPathTree20.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath26 = multiShortestPathTree20.getPath(vertex24, true);
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        org.opentripplanner.routing.core.State state28 = multiShortestPathTree20.getState(vertex27);
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList31 = multiShortestPathTree20.getPaths(vertex29, true);
        org.opentripplanner.routing.graph.Vertex vertex32 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList33 = multiShortestPathTree20.getStates(vertex32);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree20.stateSets;
        multiShortestPathTree1.stateSets = vertexMap34;
        org.opentripplanner.routing.graph.Vertex vertex36 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath38 = multiShortestPathTree1.getPath(vertex36, false);
        org.opentripplanner.routing.graph.Vertex vertex39 = null;
        org.opentripplanner.routing.core.State state40 = multiShortestPathTree1.getState(vertex39);
        int int41 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertNotNull(graphPathList14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(graphPath26);
        org.junit.Assert.assertNull(state28);
        org.junit.Assert.assertNotNull(graphPathList31);
        org.junit.Assert.assertNull(stateList33);
        org.junit.Assert.assertNotNull(vertexMap34);
        org.junit.Assert.assertNull(graphPath38);
        org.junit.Assert.assertNull(state40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test18511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18511");
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
        int int25 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList28 = multiShortestPathTree1.getPaths(vertex26, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state30 = null;
        multiShortestPathTree1.postVisit(state30);
        org.opentripplanner.routing.core.RoutingRequest routingRequest32 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest33 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet34 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(vertexMap2);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(graphPathList28);
        org.junit.Assert.assertNotNull(vertexMap29);
        org.junit.Assert.assertNull(routingRequest32);
        org.junit.Assert.assertNull(routingRequest33);
        org.junit.Assert.assertNotNull(vertexSet34);
    }

    @Test
    public void test18512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18512");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest34 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap35 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex36 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList38 = multiShortestPathTree1.getPaths(vertex36, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet39 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex40 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath42 = multiShortestPathTree1.getPath(vertex40, true);
        // The following exception was thrown during execution in test generation
        try {
            multiShortestPathTree1.dump();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNull(routingRequest34);
        org.junit.Assert.assertNotNull(vertexMap35);
        org.junit.Assert.assertNotNull(graphPathList38);
        org.junit.Assert.assertNotNull(vertexSet39);
        org.junit.Assert.assertNull(graphPath42);
    }

    @Test
    public void test18513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18513");
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
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, true);
        org.opentripplanner.routing.core.State state23 = null;
        multiShortestPathTree1.postVisit(state23);
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNotNull(vertexMap13);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertNull(state18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNotNull(graphPathList22);
    }

    @Test
    public void test18514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18514");
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
        java.lang.String str17 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, true);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree1.getPaths(vertex21, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree26 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest25);
        org.opentripplanner.routing.core.State state27 = null;
        multiShortestPathTree26.postVisit(state27);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet29 = multiShortestPathTree26.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex30 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath32 = multiShortestPathTree26.getPath(vertex30, true);
        org.opentripplanner.routing.graph.Vertex vertex33 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList35 = multiShortestPathTree26.getPaths(vertex33, false);
        java.lang.String str36 = multiShortestPathTree26.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection37 = multiShortestPathTree26.getAllStates();
        org.opentripplanner.routing.core.State state38 = null;
        multiShortestPathTree26.postVisit(state38);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet40 = multiShortestPathTree26.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex41 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath43 = multiShortestPathTree26.getPath(vertex41, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap44 = multiShortestPathTree26.stateSets;
        java.lang.String str45 = multiShortestPathTree26.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap46 = multiShortestPathTree26.stateSets;
        multiShortestPathTree1.stateSets = vertexMap46;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNotNull(graphPathList23);
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertNotNull(vertexSet29);
        org.junit.Assert.assertNull(graphPath32);
        org.junit.Assert.assertNotNull(graphPathList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "MultiSPT(0 vertices)" + "'", str36, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection37);
        org.junit.Assert.assertNotNull(vertexSet40);
        org.junit.Assert.assertNull(graphPath43);
        org.junit.Assert.assertNotNull(vertexMap44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "MultiSPT(0 vertices)" + "'", str45, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap46);
    }

    @Test
    public void test18515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18515");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree17.postVisit(state18);
        int int20 = multiShortestPathTree17.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree17.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree17.stateSets;
        multiShortestPathTree1.stateSets = vertexMap22;
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree25 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest24);
        org.opentripplanner.routing.core.State state26 = null;
        multiShortestPathTree25.postVisit(state26);
        int int28 = multiShortestPathTree25.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath31 = multiShortestPathTree25.getPath(vertex29, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest32 = multiShortestPathTree25.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection33 = multiShortestPathTree25.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree25.stateSets;
        multiShortestPathTree1.stateSets = vertexMap34;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree36 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.State state37 = null;
        multiShortestPathTree36.postVisit(state37);
        org.opentripplanner.routing.core.RoutingRequest routingRequest39 = multiShortestPathTree36.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest40 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree41 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest40);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap42 = multiShortestPathTree41.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex43 = null;
        org.opentripplanner.routing.core.State state44 = multiShortestPathTree41.getState(vertex43);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap45 = multiShortestPathTree41.stateSets;
        multiShortestPathTree36.stateSets = vertexMap45;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap47 = multiShortestPathTree36.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex48 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList50 = multiShortestPathTree36.getPaths(vertex48, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest51 = multiShortestPathTree36.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest52 = multiShortestPathTree36.options;
        java.lang.String str53 = multiShortestPathTree36.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap54 = multiShortestPathTree36.stateSets;
        multiShortestPathTree1.stateSets = vertexMap54;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap56 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet57 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest58 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree59 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest58);
        org.opentripplanner.routing.core.State state60 = null;
        multiShortestPathTree59.postVisit(state60);
        org.opentripplanner.routing.core.RoutingRequest routingRequest62 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree63 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest62);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap64 = multiShortestPathTree63.stateSets;
        multiShortestPathTree59.stateSets = vertexMap64;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet66 = multiShortestPathTree59.getVertices();
        org.opentripplanner.routing.core.State state67 = null;
        multiShortestPathTree59.postVisit(state67);
        org.opentripplanner.routing.graph.Vertex vertex69 = null;
        org.opentripplanner.routing.core.State state70 = multiShortestPathTree59.getState(vertex69);
        org.opentripplanner.routing.core.State state71 = null;
        multiShortestPathTree59.postVisit(state71);
        org.opentripplanner.routing.core.RoutingRequest routingRequest73 = multiShortestPathTree59.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap74 = multiShortestPathTree59.stateSets;
        multiShortestPathTree1.stateSets = vertexMap74;
        org.opentripplanner.routing.graph.Vertex vertex76 = null;
        org.opentripplanner.routing.core.State state77 = multiShortestPathTree1.getState(vertex76);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet78 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex79 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList80 = multiShortestPathTree1.getStates(vertex79);
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(stateCollection21);
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(graphPath31);
        org.junit.Assert.assertNull(routingRequest32);
        org.junit.Assert.assertNotNull(stateCollection33);
        org.junit.Assert.assertNotNull(vertexMap34);
        org.junit.Assert.assertNull(routingRequest39);
        org.junit.Assert.assertNotNull(vertexMap42);
        org.junit.Assert.assertNull(state44);
        org.junit.Assert.assertNotNull(vertexMap45);
        org.junit.Assert.assertNotNull(vertexMap47);
        org.junit.Assert.assertNotNull(graphPathList50);
        org.junit.Assert.assertNull(routingRequest51);
        org.junit.Assert.assertNull(routingRequest52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "MultiSPT(0 vertices)" + "'", str53, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap54);
        org.junit.Assert.assertNotNull(vertexMap56);
        org.junit.Assert.assertNotNull(vertexSet57);
        org.junit.Assert.assertNotNull(vertexMap64);
        org.junit.Assert.assertNotNull(vertexSet66);
        org.junit.Assert.assertNull(state70);
        org.junit.Assert.assertNull(routingRequest73);
        org.junit.Assert.assertNotNull(vertexMap74);
        org.junit.Assert.assertNull(state77);
        org.junit.Assert.assertNotNull(vertexSet78);
        org.junit.Assert.assertNull(stateList80);
    }
}
