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
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
    }

    @Test
    public void test22502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22502");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList24 = multiShortestPathTree1.getPaths(vertex22, true);
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList26 = multiShortestPathTree1.getStates(vertex25);
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNotNull(graphPathList24);
        org.junit.Assert.assertNull(stateList26);
    }

    @Test
    public void test22503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22503");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.options;
        int int21 = multiShortestPathTree1.getVertexCount();
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
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test22504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22504");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, false);
        java.lang.String str12 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        int int14 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test22505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22505");
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
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        java.lang.String str22 = multiShortestPathTree1.toString();
        java.lang.String str23 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection24 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNull(stateList16);
        org.junit.Assert.assertNull(stateList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiSPT(0 vertices)" + "'", str23, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection24);
    }

    @Test
    public void test22506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22506");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test22507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22507");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        java.lang.String str12 = multiShortestPathTree1.toString();
        java.lang.String str13 = multiShortestPathTree1.toString();
        int int14 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, false);
        java.lang.String str18 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree1.getState(vertex19);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state20);
        org.junit.Assert.assertNotNull(vertexSet21);
        org.junit.Assert.assertNull(routingRequest22);
    }

    @Test
    public void test22508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22508");
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
        multiShortestPathTree1.postVisit(state18);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, true);
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList25 = multiShortestPathTree1.getPaths(vertex23, true);
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath28 = multiShortestPathTree1.getPath(vertex26, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet29 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        org.opentripplanner.routing.core.State state32 = multiShortestPathTree1.getState(vertex31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass33 = state32.getClass();
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
        org.junit.Assert.assertNotNull(graphPathList22);
        org.junit.Assert.assertNotNull(graphPathList25);
        org.junit.Assert.assertNull(graphPath28);
        org.junit.Assert.assertNotNull(vertexSet29);
        org.junit.Assert.assertNull(routingRequest30);
        org.junit.Assert.assertNull(state32);
    }

    @Test
    public void test22509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22509");
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
        org.opentripplanner.routing.core.State state17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiShortestPathTree1.add(state17);
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
    }

    @Test
    public void test22510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22510");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, true);
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNotNull(graphPathList14);
    }

    @Test
    public void test22511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22511");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        java.lang.String str10 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree1.getState(vertex18);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(graphPath8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNull(state19);
    }

    @Test
    public void test22512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22512");
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
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass18 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test22513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22513");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test22514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22514");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNull(routingRequest15);
    }

    @Test
    public void test22515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22515");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree1.getPath(vertex18, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList24 = multiShortestPathTree1.getPaths(vertex22, false);
        java.lang.String str25 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = multiShortestPathTree1.getOptions();
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
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNull(graphPath20);
        org.junit.Assert.assertNotNull(graphPathList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MultiSPT(0 vertices)" + "'", str25, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest26);
    }

    @Test
    public void test22516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22516");
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
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath21 = multiShortestPathTree1.getPath(vertex19, false);
        org.opentripplanner.routing.core.State state22 = null;
        multiShortestPathTree1.postVisit(state22);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertNull(graphPath21);
    }

    @Test
    public void test22517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22517");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, true);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(stateCollection8);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertNull(graphPath18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertNull(routingRequest22);
    }

    @Test
    public void test22518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22518");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        java.lang.String str8 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNotNull(graphPathList17);
    }

    @Test
    public void test22519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22519");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        java.lang.String str5 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.core.State state13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiShortestPathTree1.visit(state13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(stateList10);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test22520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22520");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        java.lang.String str13 = multiShortestPathTree1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22521");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = multiShortestPathTree1.add(state22);
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
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertNull(routingRequest21);
    }

    @Test
    public void test22522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22522");
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
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, true);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree1.getState(vertex19);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNull(state20);
    }

    @Test
    public void test22523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22523");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        java.lang.String str15 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, false);
        multiShortestPathTree1.dump();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList18);
    }

    @Test
    public void test22524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22524");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
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
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexSet10);
    }

    @Test
    public void test22525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22525");
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
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        java.lang.String str22 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = multiShortestPathTree1.options;
        int int24 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath27 = multiShortestPathTree1.getPath(vertex25, false);
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList29 = multiShortestPathTree1.getStates(vertex28);
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
        org.junit.Assert.assertNull(stateList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(graphPath27);
        org.junit.Assert.assertNull(stateList29);
    }

    @Test
    public void test22526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22526");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        java.lang.String str5 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, false);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.core.State state23 = multiShortestPathTree1.getState(vertex22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList24 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(stateList16);
        org.junit.Assert.assertNotNull(graphPathList19);
        org.junit.Assert.assertNull(stateList21);
        org.junit.Assert.assertNull(state23);
    }

    @Test
    public void test22527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22527");
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
        multiShortestPathTree1.postVisit(state12);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        java.lang.String str16 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree1.getPath(vertex18, false);
        multiShortestPathTree1.dump();
        int int22 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test22528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22528");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        int int20 = multiShortestPathTree1.getVertexCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths();
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
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test22529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22529");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        int int13 = multiShortestPathTree1.getVertexCount();
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
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test22530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22530");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.lang.String str10 = multiShortestPathTree1.toString();
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath14);
    }

    @Test
    public void test22531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22531");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNull(state17);
    }

    @Test
    public void test22532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22532");
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
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        java.lang.String str15 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state16 = null;
        multiShortestPathTree1.postVisit(state16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22533");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(stateCollection13);
    }

    @Test
    public void test22534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22534");
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
        java.lang.String str13 = multiShortestPathTree1.toString();
        int int14 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state16 = null;
        multiShortestPathTree1.postVisit(state16);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(routingRequest15);
    }

    @Test
    public void test22535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22535");
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
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.options;
        java.lang.String str21 = multiShortestPathTree1.toString();
        java.lang.String str22 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection23 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet25 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList27 = multiShortestPathTree1.getStates(vertex26);
        org.opentripplanner.routing.core.State state28 = null;
        multiShortestPathTree1.postVisit(state28);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiSPT(0 vertices)" + "'", str21, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection23);
        org.junit.Assert.assertNotNull(vertexSet25);
        org.junit.Assert.assertNull(stateList27);
    }

    @Test
    public void test22536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22536");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, false);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree1.getState(vertex19);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet22 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet23 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNull(graphPath18);
        org.junit.Assert.assertNull(state20);
        org.junit.Assert.assertNotNull(stateCollection21);
        org.junit.Assert.assertNotNull(vertexSet22);
        org.junit.Assert.assertNotNull(vertexSet23);
    }

    @Test
    public void test22537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22537");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, false);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        org.opentripplanner.routing.core.State state22 = null;
        multiShortestPathTree1.postVisit(state22);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNotNull(graphPathList19);
        org.junit.Assert.assertNull(stateList21);
    }

    @Test
    public void test22538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22538");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        java.lang.String str8 = multiShortestPathTree1.toString();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        int int17 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(routingRequest18);
    }

    @Test
    public void test22539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22539");
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
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, false);
        int int19 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet22 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(stateList21);
        org.junit.Assert.assertNotNull(vertexSet22);
        org.junit.Assert.assertNull(routingRequest23);
    }

    @Test
    public void test22540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22540");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        int int15 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test22541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22541");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
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
        org.junit.Assert.assertNotNull(graphPathList7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(stateCollection11);
    }

    @Test
    public void test22542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22542");
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
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, false);
        java.lang.String str18 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList22 = multiShortestPathTree1.getStates(vertex21);
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList24 = multiShortestPathTree1.getStates(vertex23);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertNull(stateList22);
        org.junit.Assert.assertNull(stateList24);
    }

    @Test
    public void test22543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22543");
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
        java.lang.String str19 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree1.getState(vertex20);
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.core.State state23 = multiShortestPathTree1.getState(vertex22);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state21);
        org.junit.Assert.assertNull(state23);
    }

    @Test
    public void test22544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22544");
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
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree1.getPath(vertex18, true);
        org.opentripplanner.routing.core.State state21 = null;
        multiShortestPathTree1.postVisit(state21);
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList25 = multiShortestPathTree1.getPaths(vertex23, false);
        multiShortestPathTree1.dump();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet27 = multiShortestPathTree1.getVertices();
        java.lang.String str28 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList31 = multiShortestPathTree1.getPaths(vertex29, false);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNull(graphPath20);
        org.junit.Assert.assertNotNull(graphPathList25);
        org.junit.Assert.assertNotNull(vertexSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "MultiSPT(0 vertices)" + "'", str28, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList31);
    }

    @Test
    public void test22545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22545");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        int int16 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree1.getAllStates();
        java.lang.String str18 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest19);
    }

    @Test
    public void test22546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22546");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, true);
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, false);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(graphPathList12);
        org.junit.Assert.assertNull(graphPath17);
    }

    @Test
    public void test22547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22547");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.lang.String str8 = multiShortestPathTree1.toString();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        int int12 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test22548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22548");
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
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = multiShortestPathTree1.visit(state18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNotNull(stateCollection17);
    }

    @Test
    public void test22549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22549");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, false);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(graphPath14);
    }

    @Test
    public void test22550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22550");
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
        java.lang.String str13 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = routingRequest18.getClass();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNull(routingRequest18);
    }

    @Test
    public void test22551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22551");
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
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree1.getStates(vertex18);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath26 = multiShortestPathTree1.getPath(vertex24, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList29 = multiShortestPathTree1.getStates(vertex28);
        java.lang.String str30 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList19);
        org.junit.Assert.assertNotNull(graphPathList22);
        org.junit.Assert.assertNull(routingRequest23);
        org.junit.Assert.assertNull(graphPath26);
        org.junit.Assert.assertNull(routingRequest27);
        org.junit.Assert.assertNull(stateList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MultiSPT(0 vertices)" + "'", str30, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22552");
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
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
        int int18 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.core.State state23 = multiShortestPathTree1.getState(vertex22);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(stateList20);
        org.junit.Assert.assertNull(state23);
    }

    @Test
    public void test22553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22553");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass14 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test22554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22554");
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
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree1.getPath(vertex18, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNull(graphPath20);
        org.junit.Assert.assertNotNull(stateCollection21);
    }

    @Test
    public void test22555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22555");
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
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertNull(routingRequest16);
    }

    @Test
    public void test22556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22556");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree1.getState(vertex15);
        int int17 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree1.getState(vertex18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.options;
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(state16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(state19);
        org.junit.Assert.assertNull(routingRequest20);
    }

    @Test
    public void test22557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22557");
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
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        java.lang.String str15 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree1.getState(vertex18);
        int int20 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test22558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22558");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        int int6 = multiShortestPathTree1.getVertexCount();
        int int7 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(graphPath10);
    }

    @Test
    public void test22559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22559");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(stateCollection8);
        org.junit.Assert.assertNull(stateList12);
    }

    @Test
    public void test22560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22560");
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
        java.lang.String str15 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNull(state18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNull(stateList21);
    }

    @Test
    public void test22561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22561");
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
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree1.getStates(vertex18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.options;
        java.lang.Class<?> wildcardClass21 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNotNull(graphPathList12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNull(stateList19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test22562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22562");
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
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, false);
        java.lang.String str20 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList24 = multiShortestPathTree1.getStates(vertex23);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(stateList16);
        org.junit.Assert.assertNotNull(graphPathList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection21);
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertNull(stateList24);
    }

    @Test
    public void test22563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22563");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        multiShortestPathTree1.dump();
        int int11 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        int int13 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(graphPath9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test22564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22564");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, true);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, true);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNull(graphPath18);
    }

    @Test
    public void test22565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22565");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
        int int18 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state19 = null;
        multiShortestPathTree1.postVisit(state19);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test22566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22566");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        multiShortestPathTree1.dump();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, true);
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.visit(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(graphPath15);
    }

    @Test
    public void test22567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22567");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, false);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, false);
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.visit(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertNotNull(graphPathList19);
    }

    @Test
    public void test22568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22568");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        int int18 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath24 = multiShortestPathTree1.getPath(vertex22, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet25 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(stateList20);
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertNull(graphPath24);
        org.junit.Assert.assertNotNull(vertexSet25);
    }

    @Test
    public void test22569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22569");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        int int14 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, false);
        java.lang.String str20 = multiShortestPathTree1.toString();
        java.lang.String str21 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(graphPathList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiSPT(0 vertices)" + "'", str21, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22570");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNull(routingRequest17);
    }

    @Test
    public void test22571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22571");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath22 = multiShortestPathTree1.getPath(vertex20, false);
        org.opentripplanner.routing.core.State state23 = null;
        multiShortestPathTree1.postVisit(state23);
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath27 = multiShortestPathTree1.getPath(vertex25, true);
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList29 = multiShortestPathTree1.getStates(vertex28);
        org.opentripplanner.routing.graph.Vertex vertex30 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList32 = multiShortestPathTree1.getPaths(vertex30, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest33 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet34 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNull(graphPath22);
        org.junit.Assert.assertNull(graphPath27);
        org.junit.Assert.assertNull(stateList29);
        org.junit.Assert.assertNotNull(graphPathList32);
        org.junit.Assert.assertNull(routingRequest33);
        org.junit.Assert.assertNotNull(vertexSet34);
    }

    @Test
    public void test22572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22572");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNull(stateList16);
    }

    @Test
    public void test22573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22573");
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
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree1.getState(vertex18);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath22 = multiShortestPathTree1.getPath(vertex20, true);
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList25 = multiShortestPathTree1.getPaths(vertex23, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection26 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(state19);
        org.junit.Assert.assertNull(graphPath22);
        org.junit.Assert.assertNotNull(graphPathList25);
        org.junit.Assert.assertNotNull(stateCollection26);
    }

    @Test
    public void test22574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22574");
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
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree1.getState(vertex15);
        java.lang.String str17 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(state16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22575");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        java.lang.String str10 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        java.lang.String str15 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree1.getStates(vertex17);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNull(stateList18);
        org.junit.Assert.assertNull(stateList20);
    }

    @Test
    public void test22576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22576");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(vertexSet13);
    }

    @Test
    public void test22577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22577");
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
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, true);
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.visit(state19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(graphPathList18);
    }

    @Test
    public void test22578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22578");
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
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        java.lang.Class<?> wildcardClass22 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNotNull(vertexSet15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNull(stateList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test22579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22579");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        int int8 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree1.getAllStates();
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
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNotNull(stateCollection17);
    }

    @Test
    public void test22580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22580");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        java.lang.String str5 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNotNull(stateCollection13);
    }

    @Test
    public void test22581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22581");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNotNull(stateCollection18);
        org.junit.Assert.assertNotNull(vertexSet19);
    }

    @Test
    public void test22582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22582");
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
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, true);
        java.lang.String str20 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree1.getPaths(vertex21, true);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList25 = multiShortestPathTree1.getStates(vertex24);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList23);
        org.junit.Assert.assertNull(stateList25);
    }

    @Test
    public void test22583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22583");
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
        int int12 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        int int14 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state16 = null;
        multiShortestPathTree1.postVisit(state16);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        java.lang.String str19 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet20 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet20);
        org.junit.Assert.assertNull(stateList22);
    }

    @Test
    public void test22584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22584");
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
        multiShortestPathTree1.postVisit(state18);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree1.getState(vertex20);
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection23 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(state21);
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertNotNull(stateCollection23);
    }

    @Test
    public void test22585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22585");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        int int9 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, true);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        int int16 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test22586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22586");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(vertexSet15);
    }

    @Test
    public void test22587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22587");
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
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        java.lang.String str17 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree1.getVertices();
        int int19 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test22588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22588");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        int int17 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test22589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22589");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        int int9 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, false);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(graphPathList16);
    }

    @Test
    public void test22590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22590");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNull(routingRequest8);
    }

    @Test
    public void test22591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22591");
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
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree1.getPaths(vertex21, false);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertNull(state18);
        org.junit.Assert.assertNull(stateList20);
        org.junit.Assert.assertNotNull(graphPathList23);
    }

    @Test
    public void test22592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22592");
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
        multiShortestPathTree1.postVisit(state15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet20 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.core.State state22 = multiShortestPathTree1.getState(vertex21);
        java.lang.String str23 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.options;
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNotNull(vertexSet20);
        org.junit.Assert.assertNull(state22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiSPT(0 vertices)" + "'", str23, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest24);
    }

    @Test
    public void test22593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22593");
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
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList22 = multiShortestPathTree1.getStates(vertex21);
        org.opentripplanner.routing.core.State state23 = null;
        multiShortestPathTree1.postVisit(state23);
        int int25 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet26 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNull(stateList22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(vertexSet26);
    }

    @Test
    public void test22594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22594");
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
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, false);
        java.lang.String str20 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList22 = multiShortestPathTree1.getStates(vertex21);
        multiShortestPathTree1.dump();
        int int24 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(graphPathList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test22595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22595");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, false);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(graphPath8);
        org.junit.Assert.assertNull(stateList10);
    }

    @Test
    public void test22596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22596");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection25 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        org.opentripplanner.routing.core.State state27 = multiShortestPathTree1.getState(vertex26);
        java.lang.String str28 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath31 = multiShortestPathTree1.getPath(vertex29, false);
        int int32 = multiShortestPathTree1.getVertexCount();
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
        org.junit.Assert.assertNotNull(stateCollection25);
        org.junit.Assert.assertNull(state27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "MultiSPT(0 vertices)" + "'", str28, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test22597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22597");
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
        int int14 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree1.getStates(vertex18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.options;
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNull(stateList19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertNull(routingRequest21);
    }

    @Test
    public void test22598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22598");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, true);
        java.lang.String str19 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.core.State state23 = multiShortestPathTree1.getState(vertex22);
        org.opentripplanner.routing.core.State state24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = multiShortestPathTree1.add(state24);
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
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertNull(state23);
    }

    @Test
    public void test22599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22599");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, false);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths(vertex19, false);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertNotNull(graphPathList21);
    }

    @Test
    public void test22600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22600");
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
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertNotNull(stateCollection18);
        org.junit.Assert.assertNotNull(stateCollection19);
    }

    @Test
    public void test22601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22601");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, false);
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        org.opentripplanner.routing.core.State state24 = multiShortestPathTree1.getState(vertex23);
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        org.opentripplanner.routing.core.State state27 = multiShortestPathTree1.getState(vertex26);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNotNull(graphPathList22);
        org.junit.Assert.assertNull(state24);
        org.junit.Assert.assertNull(routingRequest25);
        org.junit.Assert.assertNull(state27);
    }

    @Test
    public void test22602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22602");
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
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertNull(state18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNotNull(stateCollection20);
    }

    @Test
    public void test22603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22603");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.add(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test22604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22604");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        multiShortestPathTree1.dump();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test22605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22605");
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
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree1.getState(vertex15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
        java.lang.String str18 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNull(state16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection19);
    }

    @Test
    public void test22606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22606");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(state17);
    }

    @Test
    public void test22607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22607");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, true);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.options;
        int int20 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree1.getPaths(vertex21, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection24 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(stateCollection8);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertNull(graphPath18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(graphPathList23);
        org.junit.Assert.assertNotNull(stateCollection24);
    }

    @Test
    public void test22608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22608");
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
        int int14 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree1.getPath(vertex18, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertNull(graphPath20);
        org.junit.Assert.assertNotNull(vertexSet21);
    }

    @Test
    public void test22609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22609");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        java.lang.String str18 = multiShortestPathTree1.toString();
        java.lang.String str19 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22610");
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
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        java.lang.String str16 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNotNull(vertexSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet17);
    }

    @Test
    public void test22611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22611");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        int int14 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(stateCollection16);
    }

    @Test
    public void test22612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22612");
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
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, true);
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths();
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
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertNull(routingRequest21);
    }

    @Test
    public void test22613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22613");
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
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree1.getPaths(vertex21, true);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList26 = multiShortestPathTree1.getPaths(vertex24, false);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNotNull(graphPathList23);
        org.junit.Assert.assertNotNull(graphPathList26);
    }

    @Test
    public void test22614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22614");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        java.lang.String str18 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNotNull(vertexSet15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection19);
        org.junit.Assert.assertNotNull(stateCollection20);
    }

    @Test
    public void test22615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22615");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree1.getPath(vertex18, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNull(graphPath20);
        org.junit.Assert.assertNotNull(stateCollection21);
    }

    @Test
    public void test22616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22616");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.options;
        int int20 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList24 = multiShortestPathTree1.getStates(vertex23);
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath27 = multiShortestPathTree1.getPath(vertex25, true);
        org.opentripplanner.routing.core.State state28 = null;
        multiShortestPathTree1.postVisit(state28);
        org.opentripplanner.routing.graph.Vertex vertex30 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList31 = multiShortestPathTree1.getStates(vertex30);
        int int32 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex33 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList35 = multiShortestPathTree1.getPaths(vertex33, true);
        org.opentripplanner.routing.core.State state36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = multiShortestPathTree1.add(state36);
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
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(stateList24);
        org.junit.Assert.assertNull(graphPath27);
        org.junit.Assert.assertNull(stateList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(graphPathList35);
    }

    @Test
    public void test22617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22617");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths(vertex19, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection22 = multiShortestPathTree1.getAllStates();
        java.lang.String str23 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath26 = multiShortestPathTree1.getPath(vertex24, false);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNotNull(vertexSet18);
        org.junit.Assert.assertNotNull(graphPathList21);
        org.junit.Assert.assertNotNull(stateCollection22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiSPT(0 vertices)" + "'", str23, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath26);
    }

    @Test
    public void test22618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22618");
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
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, true);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        int int19 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertNull(stateList10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(routingRequest20);
    }

    @Test
    public void test22619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22619");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        java.lang.String str14 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, true);
        java.lang.String str19 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(graphPath9);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22620");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, true);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, false);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNull(stateList10);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertNotNull(graphPathList18);
    }

    @Test
    public void test22621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22621");
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
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        java.lang.String str14 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNull(state17);
    }

    @Test
    public void test22622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22622");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(stateList17);
    }

    @Test
    public void test22623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22623");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        java.lang.String str16 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, true);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNotNull(graphPathList22);
    }

    @Test
    public void test22624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22624");
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
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, true);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree1.getStates(vertex18);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNull(stateList19);
    }

    @Test
    public void test22625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22625");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        int int13 = multiShortestPathTree1.getVertexCount();
        int int14 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test22626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22626");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        int int18 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree1.getPaths(vertex21, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet25 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass26 = vertexSet25.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(stateList20);
        org.junit.Assert.assertNotNull(graphPathList23);
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertNotNull(vertexSet25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test22627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22627");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = multiShortestPathTree1.visit(state18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(stateList16);
    }

    @Test
    public void test22628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22628");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, true);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
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
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(stateCollection8);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertNull(state17);
    }

    @Test
    public void test22629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22629");
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
        int int22 = multiShortestPathTree1.getVertexCount();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test22630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22630");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, true);
        java.lang.Class<?> wildcardClass19 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(stateList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test22631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22631");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
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
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test22632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22632");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(stateCollection16);
    }

    @Test
    public void test22633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22633");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree1.getStates(vertex17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(stateList18);
        org.junit.Assert.assertNull(routingRequest19);
    }

    @Test
    public void test22634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22634");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        java.lang.String str12 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection13);
    }

    @Test
    public void test22635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22635");
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
    public void test22636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22636");
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
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList14);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertNull(routingRequest19);
    }

    @Test
    public void test22637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22637");
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
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection22 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.options;
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNotNull(stateCollection21);
        org.junit.Assert.assertNotNull(stateCollection22);
        org.junit.Assert.assertNull(routingRequest23);
        org.junit.Assert.assertNull(routingRequest24);
    }

    @Test
    public void test22638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22638");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        java.lang.String str18 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree1.getPaths(vertex21, false);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList26 = multiShortestPathTree1.getPaths(vertex24, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList20);
        org.junit.Assert.assertNotNull(graphPathList23);
        org.junit.Assert.assertNotNull(graphPathList26);
        org.junit.Assert.assertNull(routingRequest27);
    }

    @Test
    public void test22639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22639");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        java.lang.String str15 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNotNull(vertexSet18);
    }

    @Test
    public void test22640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22640");
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
        java.lang.String str17 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree1.getState(vertex18);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet20 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state21 = null;
        multiShortestPathTree1.postVisit(state21);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet23 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state19);
        org.junit.Assert.assertNotNull(vertexSet20);
        org.junit.Assert.assertNotNull(vertexSet23);
    }

    @Test
    public void test22641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22641");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexSet12);
    }

    @Test
    public void test22642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22642");
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
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
        int int18 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet23 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = routingRequest24.getClass();
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
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(stateList20);
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertNotNull(vertexSet23);
        org.junit.Assert.assertNull(routingRequest24);
    }

    @Test
    public void test22643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22643");
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
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, false);
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNotNull(graphPathList22);
    }

    @Test
    public void test22644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22644");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree1.getPath(vertex18, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state22 = null;
        multiShortestPathTree1.postVisit(state22);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(graphPath20);
    }

    @Test
    public void test22645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22645");
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
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(stateCollection10);
    }

    @Test
    public void test22646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22646");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath22 = multiShortestPathTree1.getPath(vertex20, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.core.State state25 = multiShortestPathTree1.getState(vertex24);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertNotNull(vertexSet18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNull(graphPath22);
        org.junit.Assert.assertNull(routingRequest23);
        org.junit.Assert.assertNull(state25);
    }

    @Test
    public void test22647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22647");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList24 = multiShortestPathTree1.getPaths(vertex22, true);
        org.opentripplanner.routing.core.State state25 = null;
        multiShortestPathTree1.postVisit(state25);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet27 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNotNull(graphPathList24);
        org.junit.Assert.assertNotNull(vertexSet27);
    }

    @Test
    public void test22648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22648");
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
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        java.lang.Class<?> wildcardClass17 = stateCollection16.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNotNull(vertexSet15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test22649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22649");
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
        java.lang.String str12 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, true);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree1.getStates(vertex17);
        org.opentripplanner.routing.core.State state19 = null;
        multiShortestPathTree1.postVisit(state19);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNull(stateList18);
    }

    @Test
    public void test22650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22650");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = stateList15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNull(stateList15);
    }

    @Test
    public void test22651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22651");
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
        multiShortestPathTree1.postVisit(state18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.options;
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNull(routingRequest20);
    }

    @Test
    public void test22652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22652");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.core.State state16 = null;
        multiShortestPathTree1.postVisit(state16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree1.getStates(vertex18);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree1.getState(vertex20);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(stateList19);
        org.junit.Assert.assertNull(state21);
    }

    @Test
    public void test22653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22653");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        java.lang.String str5 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        java.lang.String str15 = multiShortestPathTree1.toString();
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(stateCollection18);
    }

    @Test
    public void test22654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22654");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state22 = null;
        multiShortestPathTree1.postVisit(state22);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertNotNull(vertexSet21);
    }

    @Test
    public void test22655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22655");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.lang.String str9 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet11);
    }

    @Test
    public void test22656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22656");
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
        java.lang.String str16 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree1.postVisit(state20);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22657");
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
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, true);
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
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertNull(stateList10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNotNull(stateCollection16);
    }

    @Test
    public void test22658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22658");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree1.postVisit(state18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree1.getPaths(vertex21, false);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath26 = multiShortestPathTree1.getPath(vertex24, false);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertNotNull(graphPathList23);
        org.junit.Assert.assertNull(graphPath26);
    }

    @Test
    public void test22659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22659");
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
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = state15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state15);
    }

    @Test
    public void test22660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22660");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, true);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, true);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, false);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath22 = multiShortestPathTree1.getPath(vertex20, true);
        java.lang.String str23 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection24 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList25 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(stateCollection8);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNotNull(graphPathList19);
        org.junit.Assert.assertNull(graphPath22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiSPT(0 vertices)" + "'", str23, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection24);
    }

    @Test
    public void test22661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22661");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        int int11 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass13 = vertexSet12.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test22662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22662");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, false);
        java.lang.String str20 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNotNull(graphPathList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22663");
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
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths(vertex19, false);
        int int22 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = multiShortestPathTree1.visit(state23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertNotNull(vertexSet18);
        org.junit.Assert.assertNotNull(graphPathList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test22664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22664");
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
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths(vertex19, true);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList21);
    }

    @Test
    public void test22665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22665");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree1.getState(vertex18);
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNull(state19);
    }

    @Test
    public void test22666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22666");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, false);
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree1.postVisit(state20);
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath24 = multiShortestPathTree1.getPath(vertex22, false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNotNull(graphPathList19);
        org.junit.Assert.assertNull(graphPath24);
    }

    @Test
    public void test22667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22667");
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
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        int int15 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, false);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree1.getState(vertex19);
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(graphPath18);
        org.junit.Assert.assertNull(state20);
        org.junit.Assert.assertNull(routingRequest21);
    }

    @Test
    public void test22668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22668");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        int int13 = multiShortestPathTree1.getVertexCount();
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, false);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(graphPath18);
    }

    @Test
    public void test22669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22669");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet23 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = multiShortestPathTree1.visit(state24);
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
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(state18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNotNull(graphPathList22);
        org.junit.Assert.assertNotNull(vertexSet23);
    }

    @Test
    public void test22670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22670");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, true);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath23 = multiShortestPathTree1.getPath(vertex21, true);
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(stateCollection8);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertNull(graphPath18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertNull(graphPath23);
    }

    @Test
    public void test22671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22671");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        java.lang.String str18 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath21 = multiShortestPathTree1.getPath(vertex19, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = multiShortestPathTree1.options;
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath21);
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertNull(routingRequest23);
    }

    @Test
    public void test22672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22672");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, false);
        multiShortestPathTree1.dump();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertNotNull(vertexSet19);
    }

    @Test
    public void test22673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22673");
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
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList28 = multiShortestPathTree1.getStates(vertex27);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet29 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex30 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList31 = multiShortestPathTree1.getStates(vertex30);
        org.opentripplanner.routing.core.State state32 = null;
        multiShortestPathTree1.postVisit(state32);
        org.opentripplanner.routing.graph.Vertex vertex34 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList36 = multiShortestPathTree1.getPaths(vertex34, true);
        org.opentripplanner.routing.graph.Vertex vertex37 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath39 = multiShortestPathTree1.getPath(vertex37, true);
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
        org.junit.Assert.assertNull(stateList28);
        org.junit.Assert.assertNotNull(vertexSet29);
        org.junit.Assert.assertNull(stateList31);
        org.junit.Assert.assertNotNull(graphPathList36);
        org.junit.Assert.assertNull(graphPath39);
    }

    @Test
    public void test22674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22674");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        int int8 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test22675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22675");
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
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        int int18 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test22676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22676");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(vertexSet13);
    }

    @Test
    public void test22677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22677");
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
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, true);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths(vertex19, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet22 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath27 = multiShortestPathTree1.getPath(vertex25, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest28 = multiShortestPathTree1.options;
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertNotNull(graphPathList21);
        org.junit.Assert.assertNotNull(vertexSet22);
        org.junit.Assert.assertNull(routingRequest23);
        org.junit.Assert.assertNull(graphPath27);
        org.junit.Assert.assertNull(routingRequest28);
    }

    @Test
    public void test22678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22678");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList4 = multiShortestPathTree1.getStates(vertex3);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(graphPathList15);
    }

    @Test
    public void test22679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22679");
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
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        int int15 = multiShortestPathTree1.getVertexCount();
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(routingRequest18);
    }

    @Test
    public void test22680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22680");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(vertexSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNotNull(vertexSet14);
    }

    @Test
    public void test22681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22681");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet23 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet24 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertNotNull(stateCollection18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNull(stateList21);
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertNotNull(vertexSet23);
        org.junit.Assert.assertNotNull(vertexSet24);
    }

    @Test
    public void test22682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22682");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, true);
        org.opentripplanner.routing.core.State state21 = null;
        multiShortestPathTree1.postVisit(state21);
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath25 = multiShortestPathTree1.getPath(vertex23, false);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(stateList10);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNull(graphPath25);
    }

    @Test
    public void test22683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22683");
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
        multiShortestPathTree1.postVisit(state18);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree1.getState(vertex20);
        int int22 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList24 = multiShortestPathTree1.getStates(vertex23);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection25 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(state21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(stateList24);
        org.junit.Assert.assertNotNull(stateCollection25);
    }

    @Test
    public void test22684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22684");
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
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        int int14 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.options;
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNull(routingRequest19);
    }

    @Test
    public void test22685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22685");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state21 = null;
        multiShortestPathTree1.postVisit(state21);
        int int23 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath26 = multiShortestPathTree1.getPath(vertex24, false);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(graphPath26);
    }

    @Test
    public void test22686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22686");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        java.lang.String str16 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree1.getAllStates();
        java.lang.String str22 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexSet18);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertNotNull(stateCollection21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22687");
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
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, false);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList23 = multiShortestPathTree1.getStates(vertex22);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertNull(stateList20);
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertNull(stateList23);
    }

    @Test
    public void test22688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22688");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.options;
        int int22 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNull(stateList20);
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test22689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22689");
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
        multiShortestPathTree1.postVisit(state15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
        int int18 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths(vertex19, true);
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(graphPathList21);
    }

    @Test
    public void test22690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22690");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        java.lang.String str8 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.visit(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList12);
        org.junit.Assert.assertNotNull(stateCollection15);
    }

    @Test
    public void test22691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22691");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state19 = null;
        multiShortestPathTree1.postVisit(state19);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList23 = multiShortestPathTree1.getStates(vertex22);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNotNull(stateCollection18);
        org.junit.Assert.assertNotNull(vertexSet21);
        org.junit.Assert.assertNull(stateList23);
        org.junit.Assert.assertNull(routingRequest25);
    }

    @Test
    public void test22692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22692");
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
        multiShortestPathTree1.postVisit(state12);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNull(graphPath18);
        org.junit.Assert.assertNull(stateList21);
    }

    @Test
    public void test22693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22693");
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
        multiShortestPathTree1.postVisit(state12);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
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
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(vertexSet14);
    }

    @Test
    public void test22694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22694");
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
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree1.getState(vertex15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, true);
        org.opentripplanner.routing.core.State state23 = null;
        multiShortestPathTree1.postVisit(state23);
        org.opentripplanner.routing.core.State state25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = multiShortestPathTree1.visit(state25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList12);
        org.junit.Assert.assertNull(state16);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNotNull(graphPathList22);
    }

    @Test
    public void test22695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22695");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        int int15 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state16 = null;
        multiShortestPathTree1.postVisit(state16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree1.getState(vertex18);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet22 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(state19);
        org.junit.Assert.assertNull(stateList21);
        org.junit.Assert.assertNotNull(vertexSet22);
    }

    @Test
    public void test22696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22696");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        java.lang.String str8 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, true);
        java.lang.String str13 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        int int16 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test22697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22697");
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
        int int18 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.getOptions();
        java.lang.String str21 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(stateCollection19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiSPT(0 vertices)" + "'", str21, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22698");
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
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, false);
        java.lang.String str20 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList22 = multiShortestPathTree1.getStates(vertex21);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath27 = multiShortestPathTree1.getPath(vertex25, false);
        multiShortestPathTree1.dump();
        int int29 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(graphPathList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList22);
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertNull(graphPath27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test22699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22699");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        java.lang.String str15 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree1.getState(vertex20);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath18);
        org.junit.Assert.assertNotNull(stateCollection19);
        org.junit.Assert.assertNull(state21);
    }

    @Test
    public void test22700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22700");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        multiShortestPathTree1.dump();
        java.lang.String str12 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest13);
    }

    @Test
    public void test22701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22701");
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
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree1.getState(vertex15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.visit(state19);
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
        org.junit.Assert.assertNull(state16);
    }

    @Test
    public void test22702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22702");
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
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath26 = multiShortestPathTree1.getPath(vertex24, true);
        org.opentripplanner.routing.core.State state27 = null;
        multiShortestPathTree1.postVisit(state27);
        multiShortestPathTree1.dump();
        int int30 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList32 = multiShortestPathTree1.getStates(vertex31);
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
        org.junit.Assert.assertNull(graphPath26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(stateList32);
    }

    @Test
    public void test22703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22703");
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
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, true);
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
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertNull(stateList10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(state17);
    }

    @Test
    public void test22704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22704");
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
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.add(state19);
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
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNull(routingRequest18);
    }

    @Test
    public void test22705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22705");
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
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        org.opentripplanner.routing.core.State state21 = null;
        multiShortestPathTree1.postVisit(state21);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNotNull(graphPathList20);
    }

    @Test
    public void test22706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22706");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        java.lang.String str15 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.options;
        java.lang.String str21 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree1.options;
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNotNull(stateCollection19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiSPT(0 vertices)" + "'", str21, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest22);
    }

    @Test
    public void test22707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22707");
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
        java.lang.String str18 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.options;
        int int21 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection22 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet23 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath26 = multiShortestPathTree1.getPath(vertex24, true);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(stateCollection22);
        org.junit.Assert.assertNotNull(vertexSet23);
        org.junit.Assert.assertNull(graphPath26);
    }

    @Test
    public void test22708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22708");
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
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree1.getStates(vertex18);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, true);
        java.lang.Class<?> wildcardClass23 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNull(stateList19);
        org.junit.Assert.assertNotNull(graphPathList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test22709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22709");
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
        int int14 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree1.getState(vertex19);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNull(state20);
        org.junit.Assert.assertNotNull(stateCollection21);
    }

    @Test
    public void test22710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22710");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, true);
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(graphPath18);
    }

    @Test
    public void test22711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22711");
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
        multiShortestPathTree1.postVisit(state15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree1.postVisit(state18);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet20 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexSet20);
    }

    @Test
    public void test22712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22712");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(state18);
    }

    @Test
    public void test22713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22713");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(graphPath15);
    }

    @Test
    public void test22714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22714");
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
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.visit(state19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNull(routingRequest18);
    }

    @Test
    public void test22715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22715");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        java.lang.String str22 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList24 = multiShortestPathTree1.getStates(vertex23);
        java.lang.String str25 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet26 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass27 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MultiSPT(0 vertices)" + "'", str25, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test22716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22716");
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
        int int12 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        java.lang.String str16 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22717");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        java.lang.String str10 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNotNull(vertexSet13);
    }

    @Test
    public void test22718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22718");
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
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        java.lang.String str16 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree1.postVisit(state18);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNotNull(vertexSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest17);
    }

    @Test
    public void test22719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22719");
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
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        org.opentripplanner.routing.core.State state16 = null;
        multiShortestPathTree1.postVisit(state16);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths(vertex19, false);
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath24 = multiShortestPathTree1.getPath(vertex22, false);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNotNull(graphPathList21);
        org.junit.Assert.assertNull(graphPath24);
    }

    @Test
    public void test22720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22720");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList4 = multiShortestPathTree1.getStates(vertex3);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.add(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(vertexSet11);
    }

    @Test
    public void test22721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22721");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.lang.String str9 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet11);
    }

    @Test
    public void test22722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22722");
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
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNotNull(vertexSet17);
    }

    @Test
    public void test22723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22723");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = routingRequest9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test22724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22724");
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
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet21 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNotNull(stateCollection19);
        org.junit.Assert.assertNotNull(stateCollection20);
        org.junit.Assert.assertNotNull(vertexSet21);
    }

    @Test
    public void test22725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22725");
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
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNotNull(vertexSet16);
    }

    @Test
    public void test22726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22726");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.options;
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.core.State state22 = multiShortestPathTree1.getState(vertex21);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNull(state22);
    }

    @Test
    public void test22727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22727");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        int int13 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state16 = null;
        multiShortestPathTree1.postVisit(state16);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test22728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22728");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath5 = multiShortestPathTree1.getPath(vertex3, true);
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(stateCollection13);
    }

    @Test
    public void test22729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22729");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        int int12 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test22730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22730");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree1.getStates(vertex18);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNull(stateList19);
    }

    @Test
    public void test22731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22731");
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
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        org.opentripplanner.routing.core.State state16 = null;
        multiShortestPathTree1.postVisit(state16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree1.getPath(vertex18, true);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList22 = multiShortestPathTree1.getStates(vertex21);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection23 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList26 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNull(graphPath20);
        org.junit.Assert.assertNull(stateList22);
        org.junit.Assert.assertNotNull(stateCollection23);
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertNull(routingRequest25);
    }

    @Test
    public void test22732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22732");
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
        multiShortestPathTree1.dump();
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree1.getStates(vertex17);
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
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(stateList18);
    }

    @Test
    public void test22733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22733");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath23 = multiShortestPathTree1.getPath(vertex21, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state25 = null;
        multiShortestPathTree1.postVisit(state25);
        org.opentripplanner.routing.core.State state27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = multiShortestPathTree1.visit(state27);
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
        org.junit.Assert.assertNotNull(vertexSet18);
        org.junit.Assert.assertNull(stateList20);
        org.junit.Assert.assertNull(graphPath23);
        org.junit.Assert.assertNull(routingRequest24);
    }

    @Test
    public void test22734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22734");
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
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, true);
        java.lang.String str18 = multiShortestPathTree1.toString();
        int int19 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet20 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.options;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vertexSet20);
        org.junit.Assert.assertNull(routingRequest21);
    }

    @Test
    public void test22735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22735");
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
        java.lang.String str13 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        java.lang.String str18 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22736");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, false);
        int int18 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(stateList20);
        org.junit.Assert.assertNotNull(stateCollection21);
    }

    @Test
    public void test22737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22737");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        java.lang.String str15 = multiShortestPathTree1.toString();
        java.lang.String str16 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22738");
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
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(stateCollection18);
    }

    @Test
    public void test22739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22739");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        java.lang.String str9 = multiShortestPathTree1.toString();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22740");
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
        java.lang.String str10 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(state14);
    }

    @Test
    public void test22741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22741");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, true);
        java.lang.String str7 = multiShortestPathTree1.toString();
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList10 = multiShortestPathTree1.getStates(vertex9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNull(graphPath6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(stateList10);
        org.junit.Assert.assertNull(graphPath13);
    }

    @Test
    public void test22742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22742");
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
        java.lang.String str18 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.options;
        int int21 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection22 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        org.opentripplanner.routing.core.State state24 = multiShortestPathTree1.getState(vertex23);
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath27 = multiShortestPathTree1.getPath(vertex25, false);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(stateCollection22);
        org.junit.Assert.assertNull(state24);
        org.junit.Assert.assertNull(graphPath27);
    }

    @Test
    public void test22743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22743");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        java.lang.String str19 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, false);
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList24 = multiShortestPathTree1.getStates(vertex23);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList22);
        org.junit.Assert.assertNull(stateList24);
    }

    @Test
    public void test22744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22744");
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
        org.opentripplanner.routing.spt.GraphPath graphPath23 = multiShortestPathTree1.getPath(vertex21, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = multiShortestPathTree1.add(state26);
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
        org.junit.Assert.assertNull(state20);
        org.junit.Assert.assertNull(graphPath23);
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertNull(routingRequest25);
    }

    @Test
    public void test22745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22745");
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
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test22746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22746");
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
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, false);
        int int23 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList25 = multiShortestPathTree1.getPaths();
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
        org.junit.Assert.assertNull(graphPath18);
        org.junit.Assert.assertNotNull(graphPathList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(routingRequest24);
    }

    @Test
    public void test22747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22747");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.lang.String str9 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNotNull(graphPathList16);
    }

    @Test
    public void test22748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22748");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNotNull(stateCollection15);
    }

    @Test
    public void test22749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22749");
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
        java.lang.String str18 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath21 = multiShortestPathTree1.getPath(vertex19, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet22 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList24 = multiShortestPathTree1.getStates(vertex23);
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection26 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state27 = null;
        multiShortestPathTree1.postVisit(state27);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath21);
        org.junit.Assert.assertNotNull(vertexSet22);
        org.junit.Assert.assertNull(stateList24);
        org.junit.Assert.assertNull(routingRequest25);
        org.junit.Assert.assertNotNull(stateCollection26);
    }

    @Test
    public void test22750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22750");
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
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree1.getState(vertex19);
        int int21 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree1.options;
        multiShortestPathTree1.dump();
        int int24 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state26 = null;
        multiShortestPathTree1.postVisit(state26);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNotNull(stateCollection18);
        org.junit.Assert.assertNull(state20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test22751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22751");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.options;
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertNull(routingRequest18);
    }

    @Test
    public void test22752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22752");
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
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, false);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        int int17 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree1.getState(vertex18);
        int int20 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList24 = multiShortestPathTree1.getPaths(vertex22, true);
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList27 = multiShortestPathTree1.getPaths(vertex25, true);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList14);
        org.junit.Assert.assertNull(stateList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(state19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(graphPathList24);
        org.junit.Assert.assertNotNull(graphPathList27);
    }

    @Test
    public void test22753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22753");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNotNull(stateCollection16);
    }

    @Test
    public void test22754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22754");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath21 = multiShortestPathTree1.getPath(vertex19, false);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNull(graphPath21);
    }

    @Test
    public void test22755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22755");
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
        java.lang.String str13 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree1.getVertices();
        java.lang.Class<?> wildcardClass19 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNotNull(vertexSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test22756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22756");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        multiShortestPathTree1.dump();
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
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(state17);
    }

    @Test
    public void test22757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22757");
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
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state19 = null;
        multiShortestPathTree1.postVisit(state19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath23 = multiShortestPathTree1.getPath(vertex21, false);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath26 = multiShortestPathTree1.getPath(vertex24, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection27 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNull(graphPath23);
        org.junit.Assert.assertNull(graphPath26);
        org.junit.Assert.assertNotNull(stateCollection27);
    }

    @Test
    public void test22758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22758");
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
        multiShortestPathTree1.postVisit(state16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.core.State state22 = multiShortestPathTree1.getState(vertex21);
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        org.opentripplanner.routing.core.State state24 = multiShortestPathTree1.getState(vertex23);
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList27 = multiShortestPathTree1.getPaths(vertex25, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest28 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNull(state22);
        org.junit.Assert.assertNull(state24);
        org.junit.Assert.assertNotNull(graphPathList27);
        org.junit.Assert.assertNull(routingRequest28);
    }

    @Test
    public void test22759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22759");
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
        int int12 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test22760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22760");
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
        multiShortestPathTree1.postVisit(state17);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths(vertex19, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection22 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = multiShortestPathTree1.visit(state23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertNotNull(graphPathList21);
        org.junit.Assert.assertNotNull(stateCollection22);
    }

    @Test
    public void test22761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22761");
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
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, true);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree1.getState(vertex20);
        int int22 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList24 = multiShortestPathTree1.getStates(vertex23);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        org.opentripplanner.routing.core.State state27 = multiShortestPathTree1.getState(vertex26);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNull(stateList17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNull(state21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(stateList24);
        org.junit.Assert.assertNull(state27);
    }

    @Test
    public void test22762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22762");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state4 = null;
        multiShortestPathTree1.postVisit(state4);
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test22763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22763");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList14);
        org.junit.Assert.assertNotNull(vertexSet15);
    }

    @Test
    public void test22764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22764");
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
        int int12 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        int int14 = multiShortestPathTree1.getVertexCount();
        int int15 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state16 = null;
        multiShortestPathTree1.postVisit(state16);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.visit(state19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test22765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22765");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths(vertex19, false);
        org.opentripplanner.routing.core.State state22 = null;
        multiShortestPathTree1.postVisit(state22);
        java.lang.String str24 = multiShortestPathTree1.toString();
        java.lang.String str25 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(vertexSet18);
        org.junit.Assert.assertNotNull(graphPathList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MultiSPT(0 vertices)" + "'", str24, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MultiSPT(0 vertices)" + "'", str25, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22766");
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
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, true);
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
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(graphPath19);
    }

    @Test
    public void test22767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22767");
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
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test22768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22768");
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
        int int14 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vertexSet15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNull(routingRequest18);
    }

    @Test
    public void test22769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22769");
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
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList13);
    }

    @Test
    public void test22770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22770");
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
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree1.getPaths(vertex21, false);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList25 = multiShortestPathTree1.getStates(vertex24);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNotNull(graphPathList23);
        org.junit.Assert.assertNull(stateList25);
    }

    @Test
    public void test22771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22771");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, false);
        int int16 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test22772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22772");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, true);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        int int12 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths(vertex19, true);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath25 = multiShortestPathTree1.getPath(vertex23, false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(graphPathList7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNotNull(graphPathList21);
        org.junit.Assert.assertNull(graphPath25);
    }

    @Test
    public void test22773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22773");
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
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(graphPathList14);
        org.junit.Assert.assertNotNull(vertexSet15);
        org.junit.Assert.assertNull(routingRequest16);
    }

    @Test
    public void test22774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22774");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        java.lang.String str15 = multiShortestPathTree1.toString();
        java.lang.String str16 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList19);
        org.junit.Assert.assertNull(routingRequest20);
    }

    @Test
    public void test22775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22775");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = multiShortestPathTree1.getOptions();
        int int24 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath27 = multiShortestPathTree1.getPath(vertex25, true);
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        org.opentripplanner.routing.core.State state29 = multiShortestPathTree1.getState(vertex28);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNull(graphPath21);
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertNull(routingRequest23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(graphPath27);
        org.junit.Assert.assertNull(state29);
    }

    @Test
    public void test22776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22776");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        int int18 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath21 = multiShortestPathTree1.getPath(vertex19, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection22 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        org.opentripplanner.routing.core.State state24 = multiShortestPathTree1.getState(vertex23);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(graphPath21);
        org.junit.Assert.assertNotNull(stateCollection22);
        org.junit.Assert.assertNull(state24);
    }

    @Test
    public void test22777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22777");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        int int10 = multiShortestPathTree1.getVertexCount();
        java.lang.String str11 = multiShortestPathTree1.toString();
        java.lang.String str12 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        java.lang.Class<?> wildcardClass15 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test22778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22778");
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
        int int11 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree1.getVertices();
        int int19 = multiShortestPathTree1.getVertexCount();
        int int20 = multiShortestPathTree1.getVertexCount();
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
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test22779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22779");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection4 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList6 = multiShortestPathTree1.getStates(vertex5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection4);
        org.junit.Assert.assertNull(stateList6);
        org.junit.Assert.assertNull(graphPath9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(stateList13);
    }

    @Test
    public void test22780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22780");
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
        multiShortestPathTree1.dump();
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(graphPath19);
    }

    @Test
    public void test22781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22781");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNotNull(stateCollection7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNull(routingRequest16);
    }

    @Test
    public void test22782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22782");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        java.lang.String str15 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.visit(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22783");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test22784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22784");
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
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNull(stateList20);
    }

    @Test
    public void test22785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22785");
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
        java.lang.String str13 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        int int21 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(stateCollection18);
        org.junit.Assert.assertNull(stateList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test22786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22786");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertNotNull(stateCollection18);
        org.junit.Assert.assertNotNull(vertexSet19);
    }

    @Test
    public void test22787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22787");
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
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath23 = multiShortestPathTree1.getPath(vertex21, false);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(stateList16);
        org.junit.Assert.assertNotNull(graphPathList19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertNull(graphPath23);
    }

    @Test
    public void test22788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22788");
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
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree1.getState(vertex20);
        org.opentripplanner.routing.core.State state22 = null;
        multiShortestPathTree1.postVisit(state22);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.getOptions();
        java.lang.String str25 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet28 = multiShortestPathTree1.getVertices();
        java.lang.String str29 = multiShortestPathTree1.toString();
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
        org.junit.Assert.assertNull(state21);
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MultiSPT(0 vertices)" + "'", str25, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest26);
        org.junit.Assert.assertNull(routingRequest27);
        org.junit.Assert.assertNotNull(vertexSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "MultiSPT(0 vertices)" + "'", str29, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22789");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree1.getStates(vertex17);
        org.opentripplanner.routing.core.State state19 = null;
        multiShortestPathTree1.postVisit(state19);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList16);
        org.junit.Assert.assertNull(stateList18);
        org.junit.Assert.assertNotNull(stateCollection21);
    }

    @Test
    public void test22790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22790");
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
        org.opentripplanner.routing.core.State state16 = null;
        multiShortestPathTree1.postVisit(state16);
        java.lang.String str18 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state19 = null;
        multiShortestPathTree1.postVisit(state19);
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet22 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertNotNull(vertexSet22);
    }

    @Test
    public void test22791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22791");
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
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNull(graphPath19);
    }

    @Test
    public void test22792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22792");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        java.lang.String str16 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = multiShortestPathTree1.visit(state22);
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
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNotNull(stateCollection20);
        org.junit.Assert.assertNull(routingRequest21);
    }

    @Test
    public void test22793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22793");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        java.lang.String str22 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList24 = multiShortestPathTree1.getStates(vertex23);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet25 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList24);
        org.junit.Assert.assertNotNull(vertexSet25);
    }

    @Test
    public void test22794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22794");
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
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList24 = multiShortestPathTree1.getPaths(vertex22, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList26 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNotNull(vertexSet15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNull(stateList21);
        org.junit.Assert.assertNotNull(graphPathList24);
        org.junit.Assert.assertNull(routingRequest25);
    }

    @Test
    public void test22795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22795");
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
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        java.lang.Class<?> wildcardClass17 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test22796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22796");
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
        int int14 = multiShortestPathTree1.getVertexCount();
        int int15 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(state18);
    }

    @Test
    public void test22797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22797");
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
        int int19 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree1.getState(vertex20);
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection23 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet25 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(state21);
        org.junit.Assert.assertNotNull(stateCollection23);
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertNotNull(vertexSet25);
    }

    @Test
    public void test22798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22798");
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
        java.lang.String str13 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        java.lang.String str15 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22799");
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
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        java.lang.String str19 = multiShortestPathTree1.toString();
        java.lang.Class<?> wildcardClass20 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNull(stateList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test22800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22800");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, true);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        java.lang.String str17 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree1.postVisit(state18);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22801");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        int int7 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexSet12);
    }

    @Test
    public void test22802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22802");
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
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths(vertex19, false);
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList23 = multiShortestPathTree1.getStates(vertex22);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state26 = null;
        multiShortestPathTree1.postVisit(state26);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection28 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertNull(stateList16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNotNull(graphPathList21);
        org.junit.Assert.assertNull(stateList23);
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertNull(routingRequest25);
        org.junit.Assert.assertNotNull(stateCollection28);
    }

    @Test
    public void test22803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22803");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        int int9 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNull(state18);
    }

    @Test
    public void test22804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22804");
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
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, true);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNotNull(stateCollection19);
        org.junit.Assert.assertNotNull(graphPathList22);
    }

    @Test
    public void test22805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22805");
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
        java.lang.String str15 = multiShortestPathTree1.toString();
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet20 = multiShortestPathTree1.getVertices();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList24 = multiShortestPathTree1.getPaths(vertex22, false);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNotNull(vertexSet20);
        org.junit.Assert.assertNotNull(graphPathList24);
    }

    @Test
    public void test22806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22806");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, false);
        java.lang.String str17 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree1.getState(vertex18);
        multiShortestPathTree1.dump();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state19);
    }

    @Test
    public void test22807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22807");
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
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, false);
        org.opentripplanner.routing.core.State state19 = null;
        multiShortestPathTree1.postVisit(state19);
        java.lang.String str21 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNull(graphPath18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiSPT(0 vertices)" + "'", str21, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22808");
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
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
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
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertNotNull(vertexSet17);
    }

    @Test
    public void test22809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22809");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNotNull(vertexSet14);
    }

    @Test
    public void test22810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22810");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath7 = multiShortestPathTree1.getPath(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        org.opentripplanner.routing.core.State state19 = null;
        multiShortestPathTree1.postVisit(state19);
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest21);
    }

    @Test
    public void test22811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22811");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        java.lang.String str16 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath19);
    }

    @Test
    public void test22812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22812");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree1.getState(vertex15);
        int int17 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(state16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test22813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22813");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree1.getState(vertex15);
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree1.postVisit(state17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        java.lang.String str20 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(state16);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22814");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNotNull(vertexSet15);
    }

    @Test
    public void test22815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22815");
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
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, false);
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath25 = multiShortestPathTree1.getPath(vertex23, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection26 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList27 = multiShortestPathTree1.getPaths();
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
        org.junit.Assert.assertNull(graphPath18);
        org.junit.Assert.assertNotNull(graphPathList22);
        org.junit.Assert.assertNull(graphPath25);
        org.junit.Assert.assertNotNull(stateCollection26);
    }

    @Test
    public void test22816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22816");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        multiShortestPathTree1.dump();
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state15);
    }

    @Test
    public void test22817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22817");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, false);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(graphPath8);
        org.junit.Assert.assertNotNull(graphPathList11);
    }

    @Test
    public void test22818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22818");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        int int13 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, true);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(graphPath17);
    }

    @Test
    public void test22819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22819");
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
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        int int12 = multiShortestPathTree1.getVertexCount();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath22 = multiShortestPathTree1.getPath(vertex20, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection23 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.core.State state25 = multiShortestPathTree1.getState(vertex24);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertNull(graphPath22);
        org.junit.Assert.assertNotNull(stateCollection23);
        org.junit.Assert.assertNull(state25);
    }

    @Test
    public void test22820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22820");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        java.lang.String str8 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        multiShortestPathTree1.dump();
        java.lang.Class<?> wildcardClass12 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test22821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22821");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree1.postVisit(state15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet22 = multiShortestPathTree1.getVertices();
        int int23 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection24 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertNotNull(vertexSet22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(stateCollection24);
        org.junit.Assert.assertNull(routingRequest25);
    }

    @Test
    public void test22822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22822");
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
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree1.getState(vertex19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.core.State state22 = multiShortestPathTree1.getState(vertex21);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection23 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNotNull(stateCollection18);
        org.junit.Assert.assertNull(state20);
        org.junit.Assert.assertNull(state22);
        org.junit.Assert.assertNotNull(stateCollection23);
    }

    @Test
    public void test22823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22823");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNull(graphPath14);
    }

    @Test
    public void test22824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22824");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        multiShortestPathTree1.dump();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(stateList14);
    }

    @Test
    public void test22825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22825");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, true);
        multiShortestPathTree1.dump();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNull(graphPath12);
    }

    @Test
    public void test22826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22826");
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
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree1.getStates(vertex17);
        int int19 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNotNull(vertexSet15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(stateList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test22827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22827");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertNotNull(vertexSet15);
    }

    @Test
    public void test22828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22828");
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
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.options;
        int int21 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList24 = multiShortestPathTree1.getPaths(vertex22, false);
        org.opentripplanner.routing.core.State state25 = null;
        multiShortestPathTree1.postVisit(state25);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(graphPathList24);
    }

    @Test
    public void test22829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22829");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        multiShortestPathTree1.dump();
        int int7 = multiShortestPathTree1.getVertexCount();
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        int int12 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test22830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22830");
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
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath19 = multiShortestPathTree1.getPath(vertex17, false);
        java.lang.String str20 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath24 = multiShortestPathTree1.getPath(vertex22, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection25 = multiShortestPathTree1.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList26 = multiShortestPathTree1.getPaths();
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
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(graphPath19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertNull(graphPath24);
        org.junit.Assert.assertNotNull(stateCollection25);
    }

    @Test
    public void test22831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22831");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, false);
        java.lang.String str10 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        java.lang.String str17 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(graphPath9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22832");
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
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, true);
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
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNull(graphPath20);
    }

    @Test
    public void test22833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22833");
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
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        int int19 = multiShortestPathTree1.getVertexCount();
        int int20 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertNotNull(stateCollection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test22834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22834");
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
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = multiShortestPathTree1.options;
        int int24 = multiShortestPathTree1.getVertexCount();
        java.lang.String str25 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath28 = multiShortestPathTree1.getPath(vertex26, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex30 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList32 = multiShortestPathTree1.getPaths(vertex30, false);
        org.opentripplanner.routing.graph.Vertex vertex33 = null;
        org.opentripplanner.routing.core.State state34 = multiShortestPathTree1.getState(vertex33);
        java.lang.String str35 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex36 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath38 = multiShortestPathTree1.getPath(vertex36, true);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection19);
        org.junit.Assert.assertNotNull(graphPathList22);
        org.junit.Assert.assertNull(routingRequest23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MultiSPT(0 vertices)" + "'", str25, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath28);
        org.junit.Assert.assertNull(routingRequest29);
        org.junit.Assert.assertNotNull(graphPathList32);
        org.junit.Assert.assertNull(state34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "MultiSPT(0 vertices)" + "'", str35, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath38);
    }

    @Test
    public void test22835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22835");
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
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        int int15 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree1.getState(vertex20);
        java.lang.String str22 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet23 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNull(state21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet23);
    }

    @Test
    public void test22836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22836");
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
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = multiShortestPathTree1.visit(state16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
    }

    @Test
    public void test22837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22837");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        int int4 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        java.lang.String str10 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state11 = null;
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        java.lang.String str15 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection18 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNotNull(stateCollection18);
    }

    @Test
    public void test22838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22838");
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
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree1.getState(vertex19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList22 = multiShortestPathTree1.getStates(vertex21);
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNull(state20);
        org.junit.Assert.assertNull(stateList22);
    }

    @Test
    public void test22839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22839");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        java.lang.String str6 = multiShortestPathTree1.toString();
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree1.getPath(vertex12, true);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree1.getStates(vertex16);
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
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertNull(stateList17);
    }

    @Test
    public void test22840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22840");
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
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath21 = multiShortestPathTree1.getPath(vertex19, false);
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList23 = multiShortestPathTree1.getStates(vertex22);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList26 = multiShortestPathTree1.getPaths(vertex24, true);
        int int27 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state28 = null;
        multiShortestPathTree1.postVisit(state28);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertNull(graphPath21);
        org.junit.Assert.assertNull(stateList23);
        org.junit.Assert.assertNotNull(graphPathList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test22841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22841");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        java.lang.String str16 = multiShortestPathTree1.toString();
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNotNull(vertexSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
    }

    @Test
    public void test22842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22842");
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
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree1.getStates(vertex18);
        int int20 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.getOptions();
        int int22 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath25 = multiShortestPathTree1.getPath(vertex23, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection27 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNull(stateList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(graphPath25);
        org.junit.Assert.assertNull(routingRequest26);
        org.junit.Assert.assertNotNull(stateCollection27);
    }

    @Test
    public void test22843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22843");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.core.State state7 = multiShortestPathTree1.getState(vertex6);
        multiShortestPathTree1.dump();
        int int9 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test22844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22844");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        org.opentripplanner.routing.core.State state12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = multiShortestPathTree1.visit(state12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNotNull(graphPathList7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(graphPathList11);
    }

    @Test
    public void test22845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22845");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList4 = multiShortestPathTree1.getPaths(vertex2, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test22846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22846");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection4 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection7 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet3);
        org.junit.Assert.assertNotNull(stateCollection4);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(stateCollection7);
    }

    @Test
    public void test22847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22847");
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
        java.lang.String str14 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, false);
        multiShortestPathTree1.dump();
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree1.getState(vertex20);
        int int22 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        org.opentripplanner.routing.core.State state24 = multiShortestPathTree1.getState(vertex23);
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertNull(graphPath7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNull(state21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(state24);
    }

    @Test
    public void test22848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22848");
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
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        org.junit.Assert.assertNotNull(graphPathList4);
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertNull(stateList10);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(routingRequest14);
    }
}

