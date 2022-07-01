import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest34 {

    public static boolean debug = false;

    @Test
    public void test17001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17001");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        int int21 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        java.lang.String str25 = multiShortestPathTree24.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = multiShortestPathTree24.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = multiShortestPathTree24.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap28 = multiShortestPathTree24.stateSets;
        int int29 = multiShortestPathTree24.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap30 = multiShortestPathTree24.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList32 = multiShortestPathTree24.getStates(vertex31);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap33 = multiShortestPathTree24.stateSets;
        multiShortestPathTree1.stateSets = vertexMap33;
        org.opentripplanner.routing.graph.Vertex vertex35 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList37 = multiShortestPathTree1.getPaths(vertex35, true);
        java.lang.Class<?> wildcardClass38 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNotNull(vertexSet15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MultiSPT(0 vertices)" + "'", str25, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest26);
        org.junit.Assert.assertNull(routingRequest27);
        org.junit.Assert.assertNotNull(vertexMap28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(vertexMap30);
        org.junit.Assert.assertNull(stateList32);
        org.junit.Assert.assertNotNull(vertexMap33);
        org.junit.Assert.assertNotNull(graphPathList37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test17002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17002");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.lang.String str6 = multiShortestPathTree5.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap7;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.lang.String str18 = multiShortestPathTree17.toString();
        int int19 = multiShortestPathTree17.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree17.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree17.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList24 = multiShortestPathTree17.getPaths(vertex22, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree26 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest25);
        java.lang.String str27 = multiShortestPathTree26.toString();
        int int28 = multiShortestPathTree26.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree26.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection30 = multiShortestPathTree26.getAllStates();
        int int31 = multiShortestPathTree26.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex32 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList34 = multiShortestPathTree26.getPaths(vertex32, true);
        org.opentripplanner.routing.graph.Vertex vertex35 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList36 = multiShortestPathTree26.getStates(vertex35);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree26.stateSets;
        multiShortestPathTree17.stateSets = vertexMap37;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap39 = multiShortestPathTree17.stateSets;
        multiShortestPathTree1.stateSets = vertexMap39;
        org.opentripplanner.routing.core.RoutingRequest routingRequest41 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree42 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest41);
        java.lang.String str43 = multiShortestPathTree42.toString();
        int int44 = multiShortestPathTree42.getVertexCount();
        java.lang.String str45 = multiShortestPathTree42.toString();
        org.opentripplanner.routing.core.State state46 = null;
        multiShortestPathTree42.postVisit(state46);
        org.opentripplanner.routing.core.RoutingRequest routingRequest48 = multiShortestPathTree42.options;
        org.opentripplanner.routing.graph.Vertex vertex49 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath51 = multiShortestPathTree42.getPath(vertex49, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest52 = multiShortestPathTree42.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest53 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree54 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest53);
        org.opentripplanner.routing.core.RoutingRequest routingRequest55 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree56 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest55);
        java.lang.String str57 = multiShortestPathTree56.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap58 = multiShortestPathTree56.stateSets;
        multiShortestPathTree54.stateSets = vertexMap58;
        org.opentripplanner.routing.core.RoutingRequest routingRequest60 = multiShortestPathTree54.getOptions();
        org.opentripplanner.routing.core.State state61 = null;
        multiShortestPathTree54.postVisit(state61);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap63 = multiShortestPathTree54.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest64 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree65 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest64);
        org.opentripplanner.routing.core.RoutingRequest routingRequest66 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree67 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest66);
        java.lang.String str68 = multiShortestPathTree67.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap69 = multiShortestPathTree67.stateSets;
        multiShortestPathTree65.stateSets = vertexMap69;
        multiShortestPathTree54.stateSets = vertexMap69;
        multiShortestPathTree42.stateSets = vertexMap69;
        multiShortestPathTree1.stateSets = vertexMap69;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection74 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state75 = null;
        multiShortestPathTree1.postVisit(state75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertNotNull(vertexMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vertexMap20);
        org.junit.Assert.assertNotNull(stateCollection21);
        org.junit.Assert.assertNotNull(graphPathList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "MultiSPT(0 vertices)" + "'", str27, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(vertexMap29);
        org.junit.Assert.assertNotNull(stateCollection30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(graphPathList34);
        org.junit.Assert.assertNull(stateList36);
        org.junit.Assert.assertNotNull(vertexMap37);
        org.junit.Assert.assertNotNull(vertexMap39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "MultiSPT(0 vertices)" + "'", str43, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "MultiSPT(0 vertices)" + "'", str45, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest48);
        org.junit.Assert.assertNull(graphPath51);
        org.junit.Assert.assertNull(routingRequest52);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "MultiSPT(0 vertices)" + "'", str57, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap58);
        org.junit.Assert.assertNull(routingRequest60);
        org.junit.Assert.assertNotNull(vertexMap63);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "MultiSPT(0 vertices)" + "'", str68, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap69);
        org.junit.Assert.assertNotNull(stateCollection74);
    }

    @Test
    public void test17003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17003");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.lang.String str7 = multiShortestPathTree6.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, false);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList24 = multiShortestPathTree1.getStates(vertex23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNotNull(vertexMap16);
        org.junit.Assert.assertNotNull(graphPathList19);
        org.junit.Assert.assertNull(stateList21);
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNull(stateList24);
    }

    @Test
    public void test17004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17004");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        java.lang.String str14 = multiShortestPathTree13.toString();
        int int15 = multiShortestPathTree13.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree13.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree13.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree13.getPaths(vertex18, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = null;
        multiShortestPathTree13.stateSets = vertexMap21;
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree26 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest25);
        java.lang.String str27 = multiShortestPathTree26.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap28 = multiShortestPathTree26.stateSets;
        multiShortestPathTree24.stateSets = vertexMap28;
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = multiShortestPathTree24.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList33 = multiShortestPathTree24.getPaths(vertex31, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree24.stateSets;
        multiShortestPathTree13.stateSets = vertexMap34;
        multiShortestPathTree1.stateSets = vertexMap34;
        org.opentripplanner.routing.core.State state37 = null;
        multiShortestPathTree1.postVisit(state37);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList39 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vertexMap16);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "MultiSPT(0 vertices)" + "'", str27, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap28);
        org.junit.Assert.assertNull(routingRequest30);
        org.junit.Assert.assertNotNull(graphPathList33);
        org.junit.Assert.assertNotNull(vertexMap34);
    }

    @Test
    public void test17005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17005");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree0.getStates(vertex10);
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree0.postVisit(state12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree0.getOptions();
        int int15 = multiShortestPathTree0.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree0.getState(vertex16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(state17);
    }

    @Test
    public void test17006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17006");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.lang.String str7 = multiShortestPathTree6.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree22 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest21);
        java.lang.String str23 = multiShortestPathTree22.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree22.stateSets;
        multiShortestPathTree20.stateSets = vertexMap24;
        org.opentripplanner.routing.core.State state26 = null;
        multiShortestPathTree20.postVisit(state26);
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList30 = multiShortestPathTree20.getPaths(vertex28, true);
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        org.opentripplanner.routing.core.State state32 = multiShortestPathTree20.getState(vertex31);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap33 = multiShortestPathTree20.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet34 = multiShortestPathTree20.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex35 = null;
        org.opentripplanner.routing.core.State state36 = multiShortestPathTree20.getState(vertex35);
        org.opentripplanner.routing.graph.Vertex vertex37 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList39 = multiShortestPathTree20.getPaths(vertex37, false);
        org.opentripplanner.routing.graph.Vertex vertex40 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath42 = multiShortestPathTree20.getPath(vertex40, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest43 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree44 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest43);
        java.lang.String str45 = multiShortestPathTree44.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap46 = multiShortestPathTree44.stateSets;
        java.lang.String str47 = multiShortestPathTree44.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest48 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree49 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest48);
        java.lang.String str50 = multiShortestPathTree49.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap51 = multiShortestPathTree49.stateSets;
        multiShortestPathTree44.stateSets = vertexMap51;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection53 = multiShortestPathTree44.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection54 = multiShortestPathTree44.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex55 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList56 = multiShortestPathTree44.getStates(vertex55);
        org.opentripplanner.routing.core.RoutingRequest routingRequest57 = multiShortestPathTree44.options;
        org.opentripplanner.routing.graph.Vertex vertex58 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList59 = multiShortestPathTree44.getStates(vertex58);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap60 = multiShortestPathTree44.stateSets;
        multiShortestPathTree20.stateSets = vertexMap60;
        multiShortestPathTree1.stateSets = vertexMap60;
        org.opentripplanner.routing.core.RoutingRequest routingRequest63 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state64 = null;
        multiShortestPathTree1.postVisit(state64);
        java.lang.String str66 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state67 = null;
        multiShortestPathTree1.postVisit(state67);
        org.opentripplanner.routing.graph.Vertex vertex69 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList71 = multiShortestPathTree1.getPaths(vertex69, false);
        org.opentripplanner.routing.core.State state72 = null;
        multiShortestPathTree1.postVisit(state72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiSPT(0 vertices)" + "'", str23, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap24);
        org.junit.Assert.assertNotNull(graphPathList30);
        org.junit.Assert.assertNull(state32);
        org.junit.Assert.assertNotNull(vertexMap33);
        org.junit.Assert.assertNotNull(vertexSet34);
        org.junit.Assert.assertNull(state36);
        org.junit.Assert.assertNotNull(graphPathList39);
        org.junit.Assert.assertNull(graphPath42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "MultiSPT(0 vertices)" + "'", str45, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "MultiSPT(0 vertices)" + "'", str47, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "MultiSPT(0 vertices)" + "'", str50, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap51);
        org.junit.Assert.assertNotNull(stateCollection53);
        org.junit.Assert.assertNotNull(stateCollection54);
        org.junit.Assert.assertNull(stateList56);
        org.junit.Assert.assertNull(routingRequest57);
        org.junit.Assert.assertNull(stateList59);
        org.junit.Assert.assertNotNull(vertexMap60);
        org.junit.Assert.assertNull(routingRequest63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "MultiSPT(0 vertices)" + "'", str66, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList71);
    }

    @Test
    public void test17007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17007");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(routingRequest11);
    }

    @Test
    public void test17008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17008");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection4 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        java.lang.String str14 = multiShortestPathTree13.toString();
        int int15 = multiShortestPathTree13.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.lang.String str18 = multiShortestPathTree17.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree17.stateSets;
        multiShortestPathTree13.stateSets = vertexMap19;
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree22 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest21);
        java.lang.String str23 = multiShortestPathTree22.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree22.stateSets;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree25 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree27 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest26);
        org.opentripplanner.routing.core.RoutingRequest routingRequest28 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree29 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest28);
        java.lang.String str30 = multiShortestPathTree29.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap31 = multiShortestPathTree29.stateSets;
        multiShortestPathTree27.stateSets = vertexMap31;
        multiShortestPathTree25.stateSets = vertexMap31;
        multiShortestPathTree22.stateSets = vertexMap31;
        multiShortestPathTree13.stateSets = vertexMap31;
        org.opentripplanner.routing.core.RoutingRequest routingRequest36 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree37 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest36);
        java.lang.String str38 = multiShortestPathTree37.toString();
        int int39 = multiShortestPathTree37.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap40 = multiShortestPathTree37.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection41 = multiShortestPathTree37.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex42 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList44 = multiShortestPathTree37.getPaths(vertex42, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap45 = null;
        multiShortestPathTree37.stateSets = vertexMap45;
        org.opentripplanner.routing.core.RoutingRequest routingRequest47 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree48 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest47);
        org.opentripplanner.routing.core.RoutingRequest routingRequest49 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree50 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest49);
        java.lang.String str51 = multiShortestPathTree50.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap52 = multiShortestPathTree50.stateSets;
        multiShortestPathTree48.stateSets = vertexMap52;
        org.opentripplanner.routing.core.RoutingRequest routingRequest54 = multiShortestPathTree48.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex55 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList57 = multiShortestPathTree48.getPaths(vertex55, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap58 = multiShortestPathTree48.stateSets;
        multiShortestPathTree37.stateSets = vertexMap58;
        multiShortestPathTree13.stateSets = vertexMap58;
        multiShortestPathTree1.stateSets = vertexMap58;
        org.opentripplanner.routing.graph.Vertex vertex62 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList63 = multiShortestPathTree1.getStates(vertex62);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap64 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex65 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList66 = multiShortestPathTree1.getStates(vertex65);
        org.opentripplanner.routing.graph.Vertex vertex67 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList68 = multiShortestPathTree1.getStates(vertex67);
        org.opentripplanner.routing.graph.Vertex vertex69 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList71 = multiShortestPathTree1.getPaths(vertex69, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNotNull(stateCollection4);
        org.junit.Assert.assertNotNull(graphPathList7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiSPT(0 vertices)" + "'", str23, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MultiSPT(0 vertices)" + "'", str30, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "MultiSPT(0 vertices)" + "'", str38, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(vertexMap40);
        org.junit.Assert.assertNotNull(stateCollection41);
        org.junit.Assert.assertNotNull(graphPathList44);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "MultiSPT(0 vertices)" + "'", str51, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap52);
        org.junit.Assert.assertNull(routingRequest54);
        org.junit.Assert.assertNotNull(graphPathList57);
        org.junit.Assert.assertNotNull(vertexMap58);
        org.junit.Assert.assertNull(stateList63);
        org.junit.Assert.assertNotNull(vertexMap64);
        org.junit.Assert.assertNull(stateList66);
        org.junit.Assert.assertNull(stateList68);
        org.junit.Assert.assertNotNull(graphPathList71);
    }

    @Test
    public void test17009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17009");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath21 = multiShortestPathTree18.getPath(vertex19, true);
        int int22 = multiShortestPathTree18.getVertexCount();
        org.opentripplanner.routing.core.State state23 = null;
        multiShortestPathTree18.postVisit(state23);
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath27 = multiShortestPathTree18.getPath(vertex25, true);
        int int28 = multiShortestPathTree18.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet29 = multiShortestPathTree18.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = multiShortestPathTree18.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList33 = multiShortestPathTree18.getPaths(vertex31, true);
        org.opentripplanner.routing.core.State state34 = null;
        multiShortestPathTree18.postVisit(state34);
        org.opentripplanner.routing.graph.Vertex vertex36 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList38 = multiShortestPathTree18.getPaths(vertex36, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest39 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree40 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest39);
        java.lang.String str41 = multiShortestPathTree40.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest42 = multiShortestPathTree40.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest43 = multiShortestPathTree40.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap44 = multiShortestPathTree40.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex45 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList46 = multiShortestPathTree40.getStates(vertex45);
        org.opentripplanner.routing.graph.Vertex vertex47 = null;
        org.opentripplanner.routing.core.State state48 = multiShortestPathTree40.getState(vertex47);
        org.opentripplanner.routing.graph.Vertex vertex49 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList50 = multiShortestPathTree40.getStates(vertex49);
        org.opentripplanner.routing.core.RoutingRequest routingRequest51 = multiShortestPathTree40.options;
        org.opentripplanner.routing.graph.Vertex vertex52 = null;
        org.opentripplanner.routing.core.State state53 = multiShortestPathTree40.getState(vertex52);
        org.opentripplanner.routing.core.RoutingRequest routingRequest54 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree55 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest54);
        java.lang.String str56 = multiShortestPathTree55.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap57 = multiShortestPathTree55.stateSets;
        java.lang.String str58 = multiShortestPathTree55.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest59 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree60 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest59);
        java.lang.String str61 = multiShortestPathTree60.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap62 = multiShortestPathTree60.stateSets;
        multiShortestPathTree55.stateSets = vertexMap62;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection64 = multiShortestPathTree55.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex65 = null;
        org.opentripplanner.routing.core.State state66 = multiShortestPathTree55.getState(vertex65);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet67 = multiShortestPathTree55.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex68 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath70 = multiShortestPathTree55.getPath(vertex68, false);
        org.opentripplanner.routing.graph.Vertex vertex71 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath73 = multiShortestPathTree55.getPath(vertex71, true);
        org.opentripplanner.routing.graph.Vertex vertex74 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList75 = multiShortestPathTree55.getStates(vertex74);
        org.opentripplanner.routing.core.State state76 = null;
        multiShortestPathTree55.postVisit(state76);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap78 = multiShortestPathTree55.stateSets;
        multiShortestPathTree40.stateSets = vertexMap78;
        multiShortestPathTree18.stateSets = vertexMap78;
        org.opentripplanner.routing.core.State state81 = null;
        multiShortestPathTree18.postVisit(state81);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap83 = multiShortestPathTree18.stateSets;
        multiShortestPathTree1.stateSets = vertexMap83;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vertexMap4);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertNotNull(graphPathList14);
        org.junit.Assert.assertNotNull(vertexSet15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(graphPath21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(graphPath27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(vertexSet29);
        org.junit.Assert.assertNull(routingRequest30);
        org.junit.Assert.assertNotNull(graphPathList33);
        org.junit.Assert.assertNotNull(graphPathList38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "MultiSPT(0 vertices)" + "'", str41, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest42);
        org.junit.Assert.assertNull(routingRequest43);
        org.junit.Assert.assertNotNull(vertexMap44);
        org.junit.Assert.assertNull(stateList46);
        org.junit.Assert.assertNull(state48);
        org.junit.Assert.assertNull(stateList50);
        org.junit.Assert.assertNull(routingRequest51);
        org.junit.Assert.assertNull(state53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "MultiSPT(0 vertices)" + "'", str56, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "MultiSPT(0 vertices)" + "'", str58, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "MultiSPT(0 vertices)" + "'", str61, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap62);
        org.junit.Assert.assertNotNull(stateCollection64);
        org.junit.Assert.assertNull(state66);
        org.junit.Assert.assertNotNull(vertexSet67);
        org.junit.Assert.assertNull(graphPath70);
        org.junit.Assert.assertNull(graphPath73);
        org.junit.Assert.assertNull(stateList75);
        org.junit.Assert.assertNotNull(vertexMap78);
        org.junit.Assert.assertNotNull(vertexMap83);
    }

    @Test
    public void test17010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17010");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.lang.String str7 = multiShortestPathTree6.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree1.getStates(vertex17);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.core.State state23 = multiShortestPathTree1.getState(vertex22);
        int int24 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet25 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection26 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree27 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest28 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree29 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest28);
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        java.lang.String str32 = multiShortestPathTree31.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap33 = multiShortestPathTree31.stateSets;
        multiShortestPathTree29.stateSets = vertexMap33;
        multiShortestPathTree27.stateSets = vertexMap33;
        org.opentripplanner.routing.graph.Vertex vertex36 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList38 = multiShortestPathTree27.getPaths(vertex36, false);
        org.opentripplanner.routing.graph.Vertex vertex39 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList41 = multiShortestPathTree27.getPaths(vertex39, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest42 = multiShortestPathTree27.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest43 = multiShortestPathTree27.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap44 = multiShortestPathTree27.stateSets;
        multiShortestPathTree1.stateSets = vertexMap44;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(stateList18);
        org.junit.Assert.assertNotNull(vertexMap19);
        org.junit.Assert.assertNull(stateList21);
        org.junit.Assert.assertNull(state23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(vertexSet25);
        org.junit.Assert.assertNotNull(stateCollection26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MultiSPT(0 vertices)" + "'", str32, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap33);
        org.junit.Assert.assertNotNull(graphPathList38);
        org.junit.Assert.assertNotNull(graphPathList41);
        org.junit.Assert.assertNull(routingRequest42);
        org.junit.Assert.assertNull(routingRequest43);
        org.junit.Assert.assertNotNull(vertexMap44);
    }

    @Test
    public void test17011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17011");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        java.lang.String str10 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree22 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest21);
        java.lang.String str23 = multiShortestPathTree22.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree22.stateSets;
        multiShortestPathTree20.stateSets = vertexMap24;
        multiShortestPathTree18.stateSets = vertexMap24;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection27 = multiShortestPathTree18.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection28 = multiShortestPathTree18.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList30 = multiShortestPathTree18.getStates(vertex29);
        org.opentripplanner.routing.core.RoutingRequest routingRequest31 = multiShortestPathTree18.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest32 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree33 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest32);
        org.opentripplanner.routing.core.RoutingRequest routingRequest34 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree35 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest34);
        java.lang.String str36 = multiShortestPathTree35.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree35.stateSets;
        multiShortestPathTree33.stateSets = vertexMap37;
        org.opentripplanner.routing.core.RoutingRequest routingRequest39 = multiShortestPathTree33.options;
        int int40 = multiShortestPathTree33.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex41 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList43 = multiShortestPathTree33.getPaths(vertex41, true);
        int int44 = multiShortestPathTree33.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap45 = multiShortestPathTree33.stateSets;
        int int46 = multiShortestPathTree33.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection47 = multiShortestPathTree33.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest48 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree49 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest48);
        java.lang.String str50 = multiShortestPathTree49.toString();
        int int51 = multiShortestPathTree49.getVertexCount();
        java.lang.String str52 = multiShortestPathTree49.toString();
        org.opentripplanner.routing.core.State state53 = null;
        multiShortestPathTree49.postVisit(state53);
        org.opentripplanner.routing.graph.Vertex vertex55 = null;
        org.opentripplanner.routing.core.State state56 = multiShortestPathTree49.getState(vertex55);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet57 = multiShortestPathTree49.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest58 = multiShortestPathTree49.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap59 = multiShortestPathTree49.stateSets;
        multiShortestPathTree33.stateSets = vertexMap59;
        multiShortestPathTree18.stateSets = vertexMap59;
        multiShortestPathTree1.stateSets = vertexMap59;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNotNull(vertexMap17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiSPT(0 vertices)" + "'", str23, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap24);
        org.junit.Assert.assertNotNull(stateCollection27);
        org.junit.Assert.assertNotNull(stateCollection28);
        org.junit.Assert.assertNull(stateList30);
        org.junit.Assert.assertNull(routingRequest31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "MultiSPT(0 vertices)" + "'", str36, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap37);
        org.junit.Assert.assertNull(routingRequest39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(graphPathList43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(vertexMap45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(stateCollection47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "MultiSPT(0 vertices)" + "'", str50, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "MultiSPT(0 vertices)" + "'", str52, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state56);
        org.junit.Assert.assertNotNull(vertexSet57);
        org.junit.Assert.assertNull(routingRequest58);
        org.junit.Assert.assertNotNull(vertexMap59);
    }

    @Test
    public void test17012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17012");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        int int12 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree1.getPaths(vertex14, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths(vertex19, false);
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList23 = multiShortestPathTree1.getStates(vertex22);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.core.State state25 = multiShortestPathTree1.getState(vertex24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vertexMap13);
        org.junit.Assert.assertNotNull(graphPathList16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertNotNull(graphPathList21);
        org.junit.Assert.assertNull(stateList23);
        org.junit.Assert.assertNull(state25);
    }

    @Test
    public void test17013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17013");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.lang.String str10 = multiShortestPathTree9.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap11;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree1.getState(vertex15);
        java.lang.String str17 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree1.postVisit(state18);
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList21 = multiShortestPathTree1.getStates(vertex20);
        org.opentripplanner.routing.core.State state22 = null;
        multiShortestPathTree1.postVisit(state22);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection24 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        org.opentripplanner.routing.core.State state26 = multiShortestPathTree1.getState(vertex25);
        int int27 = multiShortestPathTree1.getVertexCount();
        int int28 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(state16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList21);
        org.junit.Assert.assertNotNull(stateCollection24);
        org.junit.Assert.assertNull(state26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test17014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17014");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree1.getState(vertex15);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree1.stateSets;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(state16);
        org.junit.Assert.assertNotNull(vertexMap17);
    }

    @Test
    public void test17015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17015");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.lang.String str7 = multiShortestPathTree6.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.lang.String str18 = multiShortestPathTree17.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree17.stateSets;
        java.lang.String str20 = multiShortestPathTree17.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree22 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest21);
        java.lang.String str23 = multiShortestPathTree22.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree22.stateSets;
        multiShortestPathTree17.stateSets = vertexMap24;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection26 = multiShortestPathTree17.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        org.opentripplanner.routing.core.State state28 = multiShortestPathTree17.getState(vertex27);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree17.stateSets;
        multiShortestPathTree1.stateSets = vertexMap29;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap31 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet32 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiSPT(0 vertices)" + "'", str23, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap24);
        org.junit.Assert.assertNotNull(stateCollection26);
        org.junit.Assert.assertNull(state28);
        org.junit.Assert.assertNotNull(vertexMap29);
        org.junit.Assert.assertNotNull(vertexMap31);
        org.junit.Assert.assertNotNull(vertexSet32);
    }

    @Test
    public void test17016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17016");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection4 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        int int10 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        int int13 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNotNull(stateCollection4);
        org.junit.Assert.assertNotNull(vertexMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test17017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17017");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree0.getVertices();
        int int10 = multiShortestPathTree0.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree0.getPaths(vertex11, false);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        java.lang.String str19 = multiShortestPathTree18.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree18.stateSets;
        multiShortestPathTree16.stateSets = vertexMap20;
        multiShortestPathTree14.stateSets = vertexMap20;
        multiShortestPathTree0.stateSets = vertexMap20;
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.core.State state25 = multiShortestPathTree0.getState(vertex24);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        org.opentripplanner.routing.core.State state28 = multiShortestPathTree0.getState(vertex27);
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree30 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest29);
        java.lang.String str31 = multiShortestPathTree30.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap32 = multiShortestPathTree30.stateSets;
        java.lang.String str33 = multiShortestPathTree30.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest34 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree35 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest34);
        java.lang.String str36 = multiShortestPathTree35.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree35.stateSets;
        multiShortestPathTree30.stateSets = vertexMap37;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection39 = multiShortestPathTree30.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest40 = multiShortestPathTree30.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet41 = multiShortestPathTree30.getVertices();
        int int42 = multiShortestPathTree30.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap43 = multiShortestPathTree30.stateSets;
        multiShortestPathTree0.stateSets = vertexMap43;
        org.opentripplanner.routing.graph.Vertex vertex45 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList47 = multiShortestPathTree0.getPaths(vertex45, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest48 = multiShortestPathTree0.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest49 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree50 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest49);
        java.lang.String str51 = multiShortestPathTree50.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest52 = multiShortestPathTree50.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection53 = multiShortestPathTree50.getAllStates();
        org.opentripplanner.routing.core.State state54 = null;
        multiShortestPathTree50.postVisit(state54);
        org.opentripplanner.routing.core.State state56 = null;
        multiShortestPathTree50.postVisit(state56);
        org.opentripplanner.routing.core.RoutingRequest routingRequest58 = multiShortestPathTree50.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest59 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree60 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest59);
        java.lang.String str61 = multiShortestPathTree60.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest62 = multiShortestPathTree60.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection63 = multiShortestPathTree60.getAllStates();
        org.opentripplanner.routing.core.State state64 = null;
        multiShortestPathTree60.postVisit(state64);
        org.opentripplanner.routing.core.State state66 = null;
        multiShortestPathTree60.postVisit(state66);
        org.opentripplanner.routing.graph.Vertex vertex68 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList69 = multiShortestPathTree60.getStates(vertex68);
        org.opentripplanner.routing.graph.Vertex vertex70 = null;
        org.opentripplanner.routing.core.State state71 = multiShortestPathTree60.getState(vertex70);
        int int72 = multiShortestPathTree60.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap73 = multiShortestPathTree60.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest74 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree75 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest74);
        java.lang.String str76 = multiShortestPathTree75.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest77 = multiShortestPathTree75.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest78 = multiShortestPathTree75.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap79 = multiShortestPathTree75.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex80 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList81 = multiShortestPathTree75.getStates(vertex80);
        org.opentripplanner.routing.graph.Vertex vertex82 = null;
        org.opentripplanner.routing.core.State state83 = multiShortestPathTree75.getState(vertex82);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap84 = multiShortestPathTree75.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap85 = multiShortestPathTree75.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest86 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree87 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest86);
        java.lang.String str88 = multiShortestPathTree87.toString();
        int int89 = multiShortestPathTree87.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap90 = multiShortestPathTree87.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap91 = multiShortestPathTree87.stateSets;
        multiShortestPathTree75.stateSets = vertexMap91;
        multiShortestPathTree60.stateSets = vertexMap91;
        multiShortestPathTree50.stateSets = vertexMap91;
        multiShortestPathTree0.stateSets = vertexMap91;
        org.opentripplanner.routing.core.RoutingRequest routingRequest96 = multiShortestPathTree0.options;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap20);
        org.junit.Assert.assertNull(state25);
        org.junit.Assert.assertNotNull(vertexMap26);
        org.junit.Assert.assertNull(state28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "MultiSPT(0 vertices)" + "'", str31, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MultiSPT(0 vertices)" + "'", str33, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "MultiSPT(0 vertices)" + "'", str36, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap37);
        org.junit.Assert.assertNotNull(stateCollection39);
        org.junit.Assert.assertNull(routingRequest40);
        org.junit.Assert.assertNotNull(vertexSet41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(vertexMap43);
        org.junit.Assert.assertNotNull(graphPathList47);
        org.junit.Assert.assertNull(routingRequest48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "MultiSPT(0 vertices)" + "'", str51, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest52);
        org.junit.Assert.assertNotNull(stateCollection53);
        org.junit.Assert.assertNull(routingRequest58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "MultiSPT(0 vertices)" + "'", str61, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest62);
        org.junit.Assert.assertNotNull(stateCollection63);
        org.junit.Assert.assertNull(stateList69);
        org.junit.Assert.assertNull(state71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(vertexMap73);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "MultiSPT(0 vertices)" + "'", str76, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest77);
        org.junit.Assert.assertNull(routingRequest78);
        org.junit.Assert.assertNotNull(vertexMap79);
        org.junit.Assert.assertNull(stateList81);
        org.junit.Assert.assertNull(state83);
        org.junit.Assert.assertNotNull(vertexMap84);
        org.junit.Assert.assertNotNull(vertexMap85);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "MultiSPT(0 vertices)" + "'", str88, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(vertexMap90);
        org.junit.Assert.assertNotNull(vertexMap91);
        org.junit.Assert.assertNull(routingRequest96);
    }

    @Test
    public void test17018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17018");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.lang.String str10 = multiShortestPathTree9.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap11;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        int int15 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        int int18 = multiShortestPathTree1.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        int int20 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(stateCollection19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(routingRequest21);
    }

    @Test
    public void test17019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17019");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNotNull(vertexMap4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap9);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test17020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17020");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        java.lang.String str12 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree1.getStates(vertex17);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath21 = multiShortestPathTree1.getPath(vertex19, true);
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.core.State state23 = multiShortestPathTree1.getState(vertex22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNull(stateList18);
        org.junit.Assert.assertNull(graphPath21);
        org.junit.Assert.assertNull(state23);
    }

    @Test
    public void test17021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17021");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree0.getStates(vertex10);
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree0.postVisit(state12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree0.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree0.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree0.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath20 = multiShortestPathTree0.getPath(vertex18, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree0.getAllStates();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNotNull(vertexMap17);
        org.junit.Assert.assertNull(graphPath20);
        org.junit.Assert.assertNotNull(stateCollection21);
    }

    @Test
    public void test17022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17022");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree0.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        java.lang.String str13 = multiShortestPathTree12.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree12.stateSets;
        java.lang.String str15 = multiShortestPathTree12.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree12.stateSets;
        multiShortestPathTree0.stateSets = vertexMap16;
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree0.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree0.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree0.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList22 = multiShortestPathTree0.getStates(vertex21);
        org.opentripplanner.routing.core.State state23 = null;
        multiShortestPathTree0.postVisit(state23);
        org.opentripplanner.routing.core.State state25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = multiShortestPathTree0.visit(state25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap16);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNotNull(stateCollection20);
        org.junit.Assert.assertNull(stateList22);
    }

    @Test
    public void test17023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17023");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        java.lang.String str15 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(routingRequest8);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNotNull(vertexSet18);
    }

    @Test
    public void test17024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17024");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.lang.String str7 = multiShortestPathTree6.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree15 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest14);
        java.lang.String str16 = multiShortestPathTree15.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree15.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree15.stateSets;
        multiShortestPathTree1.stateSets = vertexMap18;
        java.lang.String str20 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree1.stateSets;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertNotNull(vertexMap22);
    }

    @Test
    public void test17025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17025");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        java.lang.String str8 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.lang.String str15 = multiShortestPathTree14.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree14.stateSets;
        multiShortestPathTree12.stateSets = vertexMap16;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet18 = multiShortestPathTree12.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree12.getStates(vertex19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath23 = multiShortestPathTree12.getPath(vertex21, true);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList26 = multiShortestPathTree12.getPaths(vertex24, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest27);
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree30 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest29);
        java.lang.String str31 = multiShortestPathTree30.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap32 = multiShortestPathTree30.stateSets;
        multiShortestPathTree28.stateSets = vertexMap32;
        org.opentripplanner.routing.graph.Vertex vertex34 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList36 = multiShortestPathTree28.getPaths(vertex34, false);
        org.opentripplanner.routing.graph.Vertex vertex37 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList39 = multiShortestPathTree28.getPaths(vertex37, true);
        org.opentripplanner.routing.graph.Vertex vertex40 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath42 = multiShortestPathTree28.getPath(vertex40, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap43 = multiShortestPathTree28.stateSets;
        multiShortestPathTree12.stateSets = vertexMap43;
        multiShortestPathTree1.stateSets = vertexMap43;
        int int46 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex47 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList49 = multiShortestPathTree1.getPaths(vertex47, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap16);
        org.junit.Assert.assertNotNull(vertexSet18);
        org.junit.Assert.assertNull(stateList20);
        org.junit.Assert.assertNull(graphPath23);
        org.junit.Assert.assertNotNull(graphPathList26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "MultiSPT(0 vertices)" + "'", str31, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap32);
        org.junit.Assert.assertNotNull(graphPathList36);
        org.junit.Assert.assertNotNull(graphPathList39);
        org.junit.Assert.assertNull(graphPath42);
        org.junit.Assert.assertNotNull(vertexMap43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(graphPathList49);
    }

    @Test
    public void test17026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17026");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.lang.String str7 = multiShortestPathTree6.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList18 = multiShortestPathTree1.getStates(vertex17);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree1.getState(vertex19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.core.State state22 = multiShortestPathTree1.getState(vertex21);
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList24 = multiShortestPathTree1.getStates(vertex23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNull(stateList18);
        org.junit.Assert.assertNull(state20);
        org.junit.Assert.assertNull(state22);
        org.junit.Assert.assertNull(stateList24);
    }

    @Test
    public void test17027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17027");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.core.State state5 = multiShortestPathTree1.getState(vertex4);
        java.lang.String str6 = multiShortestPathTree1.toString();
        int int7 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
        int int14 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree1.stateSets;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vertexMap15);
    }

    @Test
    public void test17028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17028");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.lang.String str7 = multiShortestPathTree6.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree1.getState(vertex14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree1.getPaths(vertex21, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet24 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = multiShortestPathTree1.getOptions();
        int int26 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertNotNull(stateCollection19);
        org.junit.Assert.assertNotNull(vertexMap20);
        org.junit.Assert.assertNotNull(graphPathList23);
        org.junit.Assert.assertNotNull(vertexSet24);
        org.junit.Assert.assertNull(routingRequest25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test17029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17029");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree0.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree0.getPath(vertex12, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        java.lang.String str17 = multiShortestPathTree16.toString();
        int int18 = multiShortestPathTree16.getVertexCount();
        java.lang.String str19 = multiShortestPathTree16.toString();
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree16.postVisit(state20);
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree16.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        java.lang.String str25 = multiShortestPathTree24.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree24.stateSets;
        multiShortestPathTree16.stateSets = vertexMap26;
        multiShortestPathTree0.stateSets = vertexMap26;
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList30 = multiShortestPathTree0.getStates(vertex29);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet31 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest32 = multiShortestPathTree0.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest33 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree34 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest33);
        java.lang.String str35 = multiShortestPathTree34.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest36 = multiShortestPathTree34.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest37 = multiShortestPathTree34.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap38 = multiShortestPathTree34.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex39 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList40 = multiShortestPathTree34.getStates(vertex39);
        org.opentripplanner.routing.graph.Vertex vertex41 = null;
        org.opentripplanner.routing.core.State state42 = multiShortestPathTree34.getState(vertex41);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap43 = multiShortestPathTree34.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap44 = multiShortestPathTree34.stateSets;
        java.lang.String str45 = multiShortestPathTree34.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet46 = multiShortestPathTree34.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex47 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath49 = multiShortestPathTree34.getPath(vertex47, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest50 = multiShortestPathTree34.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest51 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree52 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest51);
        java.lang.String str53 = multiShortestPathTree52.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest54 = multiShortestPathTree52.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest55 = multiShortestPathTree52.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet56 = multiShortestPathTree52.getVertices();
        int int57 = multiShortestPathTree52.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection58 = multiShortestPathTree52.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex59 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList60 = multiShortestPathTree52.getStates(vertex59);
        org.opentripplanner.routing.core.RoutingRequest routingRequest61 = multiShortestPathTree52.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex62 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList63 = multiShortestPathTree52.getStates(vertex62);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet64 = multiShortestPathTree52.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex65 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath67 = multiShortestPathTree52.getPath(vertex65, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap68 = multiShortestPathTree52.stateSets;
        multiShortestPathTree34.stateSets = vertexMap68;
        multiShortestPathTree0.stateSets = vertexMap68;
        org.opentripplanner.routing.core.RoutingRequest routingRequest71 = multiShortestPathTree0.getOptions();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexMap9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MultiSPT(0 vertices)" + "'", str25, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap26);
        org.junit.Assert.assertNull(stateList30);
        org.junit.Assert.assertNotNull(vertexSet31);
        org.junit.Assert.assertNull(routingRequest32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "MultiSPT(0 vertices)" + "'", str35, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest36);
        org.junit.Assert.assertNull(routingRequest37);
        org.junit.Assert.assertNotNull(vertexMap38);
        org.junit.Assert.assertNull(stateList40);
        org.junit.Assert.assertNull(state42);
        org.junit.Assert.assertNotNull(vertexMap43);
        org.junit.Assert.assertNotNull(vertexMap44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "MultiSPT(0 vertices)" + "'", str45, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet46);
        org.junit.Assert.assertNull(graphPath49);
        org.junit.Assert.assertNull(routingRequest50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "MultiSPT(0 vertices)" + "'", str53, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest54);
        org.junit.Assert.assertNull(routingRequest55);
        org.junit.Assert.assertNotNull(vertexSet56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(stateCollection58);
        org.junit.Assert.assertNull(stateList60);
        org.junit.Assert.assertNull(routingRequest61);
        org.junit.Assert.assertNull(stateList63);
        org.junit.Assert.assertNotNull(vertexSet64);
        org.junit.Assert.assertNull(graphPath67);
        org.junit.Assert.assertNotNull(vertexMap68);
        org.junit.Assert.assertNull(routingRequest71);
    }

    @Test
    public void test17030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17030");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree15 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest14);
        java.lang.String str16 = multiShortestPathTree15.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree15.stateSets;
        multiShortestPathTree13.stateSets = vertexMap17;
        org.opentripplanner.routing.core.State state19 = null;
        multiShortestPathTree13.postVisit(state19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList23 = multiShortestPathTree13.getPaths(vertex21, true);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.core.State state25 = multiShortestPathTree13.getState(vertex24);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree13.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree13.stateSets;
        multiShortestPathTree1.stateSets = vertexMap27;
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath31 = multiShortestPathTree1.getPath(vertex29, false);
        org.opentripplanner.routing.core.State state32 = null;
        multiShortestPathTree1.postVisit(state32);
        org.opentripplanner.routing.graph.Vertex vertex34 = null;
        org.opentripplanner.routing.core.State state35 = multiShortestPathTree1.getState(vertex34);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection36 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet37 = multiShortestPathTree1.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap38 = multiShortestPathTree1.stateSets;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap17);
        org.junit.Assert.assertNotNull(graphPathList23);
        org.junit.Assert.assertNull(state25);
        org.junit.Assert.assertNotNull(vertexMap26);
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertNull(graphPath31);
        org.junit.Assert.assertNull(state35);
        org.junit.Assert.assertNotNull(stateCollection36);
        org.junit.Assert.assertNotNull(vertexSet37);
        org.junit.Assert.assertNotNull(vertexMap38);
    }

    @Test
    public void test17031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17031");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.lang.String str6 = multiShortestPathTree5.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap7;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList13 = multiShortestPathTree1.getStates(vertex12);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet14 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree1.getState(vertex15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree1.postVisit(state18);
        java.lang.String str20 = multiShortestPathTree1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertNotNull(vertexMap9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(stateList13);
        org.junit.Assert.assertNotNull(vertexSet14);
        org.junit.Assert.assertNull(state16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
    }

    @Test
    public void test17032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17032");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.core.State state5 = multiShortestPathTree1.getState(vertex4);
        java.lang.String str6 = multiShortestPathTree1.toString();
        int int7 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.lang.String str15 = multiShortestPathTree14.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree14.stateSets;
        multiShortestPathTree12.stateSets = vertexMap16;
        org.opentripplanner.routing.core.State state18 = null;
        multiShortestPathTree12.postVisit(state18);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree12.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath23 = multiShortestPathTree12.getPath(vertex21, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree25 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest24);
        java.lang.String str26 = multiShortestPathTree25.toString();
        int int27 = multiShortestPathTree25.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap28 = multiShortestPathTree25.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection29 = multiShortestPathTree25.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = multiShortestPathTree25.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap31 = multiShortestPathTree25.stateSets;
        multiShortestPathTree12.stateSets = vertexMap31;
        multiShortestPathTree1.stateSets = vertexMap31;
        org.opentripplanner.routing.core.RoutingRequest routingRequest34 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet35 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex36 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList37 = multiShortestPathTree1.getStates(vertex36);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection38 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap16);
        org.junit.Assert.assertNotNull(vertexMap20);
        org.junit.Assert.assertNull(graphPath23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MultiSPT(0 vertices)" + "'", str26, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(vertexMap28);
        org.junit.Assert.assertNotNull(stateCollection29);
        org.junit.Assert.assertNull(routingRequest30);
        org.junit.Assert.assertNotNull(vertexMap31);
        org.junit.Assert.assertNull(routingRequest34);
        org.junit.Assert.assertNotNull(vertexSet35);
        org.junit.Assert.assertNull(stateList37);
        org.junit.Assert.assertNotNull(stateCollection38);
    }

    @Test
    public void test17033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17033");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        java.lang.String str17 = multiShortestPathTree16.toString();
        int int18 = multiShortestPathTree16.getVertexCount();
        java.lang.String str19 = multiShortestPathTree16.toString();
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree16.postVisit(state20);
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree16.options;
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath25 = multiShortestPathTree16.getPath(vertex23, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree16.stateSets;
        multiShortestPathTree1.stateSets = vertexMap26;
        org.opentripplanner.routing.core.RoutingRequest routingRequest28 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap29 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        org.opentripplanner.routing.core.RoutingRequest routingRequest32 = multiShortestPathTree31.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex33 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList34 = multiShortestPathTree31.getStates(vertex33);
        org.opentripplanner.routing.core.RoutingRequest routingRequest35 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree36 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest35);
        java.lang.String str37 = multiShortestPathTree36.toString();
        int int38 = multiShortestPathTree36.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap39 = multiShortestPathTree36.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest40 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree41 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest40);
        org.opentripplanner.routing.core.RoutingRequest routingRequest42 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree43 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest42);
        java.lang.String str44 = multiShortestPathTree43.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap45 = multiShortestPathTree43.stateSets;
        multiShortestPathTree41.stateSets = vertexMap45;
        org.opentripplanner.routing.core.RoutingRequest routingRequest47 = multiShortestPathTree41.getOptions();
        org.opentripplanner.routing.core.State state48 = null;
        multiShortestPathTree41.postVisit(state48);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap50 = multiShortestPathTree41.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest51 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree52 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest51);
        org.opentripplanner.routing.core.RoutingRequest routingRequest53 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree54 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest53);
        java.lang.String str55 = multiShortestPathTree54.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap56 = multiShortestPathTree54.stateSets;
        multiShortestPathTree52.stateSets = vertexMap56;
        multiShortestPathTree41.stateSets = vertexMap56;
        multiShortestPathTree36.stateSets = vertexMap56;
        multiShortestPathTree31.stateSets = vertexMap56;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree61 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest62 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree63 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest62);
        org.opentripplanner.routing.core.RoutingRequest routingRequest64 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree65 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest64);
        java.lang.String str66 = multiShortestPathTree65.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap67 = multiShortestPathTree65.stateSets;
        multiShortestPathTree63.stateSets = vertexMap67;
        multiShortestPathTree61.stateSets = vertexMap67;
        org.opentripplanner.routing.core.RoutingRequest routingRequest70 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree71 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest70);
        java.lang.String str72 = multiShortestPathTree71.toString();
        int int73 = multiShortestPathTree71.getVertexCount();
        java.lang.String str74 = multiShortestPathTree71.toString();
        org.opentripplanner.routing.core.State state75 = null;
        multiShortestPathTree71.postVisit(state75);
        org.opentripplanner.routing.core.RoutingRequest routingRequest77 = multiShortestPathTree71.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest78 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree79 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest78);
        java.lang.String str80 = multiShortestPathTree79.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap81 = multiShortestPathTree79.stateSets;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree82 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest83 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree84 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest83);
        org.opentripplanner.routing.core.RoutingRequest routingRequest85 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree86 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest85);
        java.lang.String str87 = multiShortestPathTree86.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap88 = multiShortestPathTree86.stateSets;
        multiShortestPathTree84.stateSets = vertexMap88;
        multiShortestPathTree82.stateSets = vertexMap88;
        multiShortestPathTree79.stateSets = vertexMap88;
        multiShortestPathTree71.stateSets = vertexMap88;
        multiShortestPathTree61.stateSets = vertexMap88;
        multiShortestPathTree31.stateSets = vertexMap88;
        multiShortestPathTree1.stateSets = vertexMap88;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap96 = multiShortestPathTree1.stateSets;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertNotNull(graphPathList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertNull(graphPath25);
        org.junit.Assert.assertNotNull(vertexMap26);
        org.junit.Assert.assertNull(routingRequest28);
        org.junit.Assert.assertNotNull(vertexMap29);
        org.junit.Assert.assertNull(routingRequest32);
        org.junit.Assert.assertNull(stateList34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "MultiSPT(0 vertices)" + "'", str37, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(vertexMap39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "MultiSPT(0 vertices)" + "'", str44, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap45);
        org.junit.Assert.assertNull(routingRequest47);
        org.junit.Assert.assertNotNull(vertexMap50);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "MultiSPT(0 vertices)" + "'", str55, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap56);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "MultiSPT(0 vertices)" + "'", str66, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap67);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "MultiSPT(0 vertices)" + "'", str72, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "MultiSPT(0 vertices)" + "'", str74, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest77);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "MultiSPT(0 vertices)" + "'", str80, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap81);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "MultiSPT(0 vertices)" + "'", str87, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap88);
        org.junit.Assert.assertNotNull(vertexMap96);
    }

    @Test
    public void test17034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17034");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree1.getPath(vertex10, false);
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, true);
        int int18 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.core.State state22 = multiShortestPathTree1.getState(vertex21);
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath25 = multiShortestPathTree1.getPath(vertex23, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList28 = multiShortestPathTree1.getStates(vertex27);
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList31 = multiShortestPathTree1.getPaths(vertex29, true);
        org.opentripplanner.routing.core.State state32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = multiShortestPathTree1.visit(state32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(stateCollection8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(stateList20);
        org.junit.Assert.assertNull(state22);
        org.junit.Assert.assertNull(graphPath25);
        org.junit.Assert.assertNotNull(vertexMap26);
        org.junit.Assert.assertNull(stateList28);
        org.junit.Assert.assertNotNull(graphPathList31);
    }

    @Test
    public void test17035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17035");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, false);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree1.getState(vertex9);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree15 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest14);
        java.lang.String str16 = multiShortestPathTree15.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree15.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree15.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree15.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree15.getState(vertex20);
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList24 = multiShortestPathTree15.getPaths(vertex22, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet25 = multiShortestPathTree15.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList27 = multiShortestPathTree15.getStates(vertex26);
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        org.opentripplanner.routing.core.State state29 = multiShortestPathTree15.getState(vertex28);
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = multiShortestPathTree15.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest31 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree32 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest31);
        java.lang.String str33 = multiShortestPathTree32.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest34 = multiShortestPathTree32.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest35 = multiShortestPathTree32.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap36 = multiShortestPathTree32.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex37 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList38 = multiShortestPathTree32.getStates(vertex37);
        org.opentripplanner.routing.graph.Vertex vertex39 = null;
        org.opentripplanner.routing.core.State state40 = multiShortestPathTree32.getState(vertex39);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap41 = multiShortestPathTree32.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest42 = multiShortestPathTree32.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest43 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree44 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest43);
        org.opentripplanner.routing.core.RoutingRequest routingRequest45 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree46 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest45);
        java.lang.String str47 = multiShortestPathTree46.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap48 = multiShortestPathTree46.stateSets;
        multiShortestPathTree44.stateSets = vertexMap48;
        org.opentripplanner.routing.core.State state50 = null;
        multiShortestPathTree44.postVisit(state50);
        org.opentripplanner.routing.graph.Vertex vertex52 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList54 = multiShortestPathTree44.getPaths(vertex52, true);
        org.opentripplanner.routing.graph.Vertex vertex55 = null;
        org.opentripplanner.routing.core.State state56 = multiShortestPathTree44.getState(vertex55);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap57 = multiShortestPathTree44.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap58 = multiShortestPathTree44.stateSets;
        multiShortestPathTree32.stateSets = vertexMap58;
        org.opentripplanner.routing.graph.Vertex vertex60 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath62 = multiShortestPathTree32.getPath(vertex60, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap63 = multiShortestPathTree32.stateSets;
        int int64 = multiShortestPathTree32.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap65 = multiShortestPathTree32.stateSets;
        multiShortestPathTree15.stateSets = vertexMap65;
        multiShortestPathTree1.stateSets = vertexMap65;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vertexMap4);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(graphPath8);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNull(state21);
        org.junit.Assert.assertNotNull(graphPathList24);
        org.junit.Assert.assertNotNull(vertexSet25);
        org.junit.Assert.assertNull(stateList27);
        org.junit.Assert.assertNull(state29);
        org.junit.Assert.assertNull(routingRequest30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MultiSPT(0 vertices)" + "'", str33, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest34);
        org.junit.Assert.assertNull(routingRequest35);
        org.junit.Assert.assertNotNull(vertexMap36);
        org.junit.Assert.assertNull(stateList38);
        org.junit.Assert.assertNull(state40);
        org.junit.Assert.assertNotNull(vertexMap41);
        org.junit.Assert.assertNull(routingRequest42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "MultiSPT(0 vertices)" + "'", str47, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap48);
        org.junit.Assert.assertNotNull(graphPathList54);
        org.junit.Assert.assertNull(state56);
        org.junit.Assert.assertNotNull(vertexMap57);
        org.junit.Assert.assertNotNull(vertexMap58);
        org.junit.Assert.assertNull(graphPath62);
        org.junit.Assert.assertNotNull(vertexMap63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(vertexMap65);
    }

    @Test
    public void test17036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17036");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree1.postVisit(state12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree1.stateSets;
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNotNull(vertexMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(graphPathList19);
    }

    @Test
    public void test17037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17037");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection4 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList7 = multiShortestPathTree1.getPaths(vertex5, false);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet12 = multiShortestPathTree1.getVertices();
        int int13 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNotNull(stateCollection4);
        org.junit.Assert.assertNotNull(graphPathList7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNotNull(vertexSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test17038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17038");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.lang.String str15 = multiShortestPathTree14.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree14.stateSets;
        multiShortestPathTree12.stateSets = vertexMap16;
        multiShortestPathTree1.stateSets = vertexMap16;
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList20 = multiShortestPathTree1.getStates(vertex19);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.core.State state23 = multiShortestPathTree1.getState(vertex22);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree1.getOptions();
        int int25 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree27 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest26);
        java.lang.String str28 = multiShortestPathTree27.toString();
        int int29 = multiShortestPathTree27.getVertexCount();
        java.lang.String str30 = multiShortestPathTree27.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection31 = multiShortestPathTree27.getAllStates();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree32 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest33 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree34 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest33);
        org.opentripplanner.routing.core.RoutingRequest routingRequest35 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree36 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest35);
        java.lang.String str37 = multiShortestPathTree36.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap38 = multiShortestPathTree36.stateSets;
        multiShortestPathTree34.stateSets = vertexMap38;
        multiShortestPathTree32.stateSets = vertexMap38;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet41 = multiShortestPathTree32.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex42 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList43 = multiShortestPathTree32.getStates(vertex42);
        org.opentripplanner.routing.graph.Vertex vertex44 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList45 = multiShortestPathTree32.getStates(vertex44);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap46 = multiShortestPathTree32.stateSets;
        multiShortestPathTree27.stateSets = vertexMap46;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet48 = multiShortestPathTree27.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest49 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree50 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest49);
        java.lang.String str51 = multiShortestPathTree50.toString();
        int int52 = multiShortestPathTree50.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap53 = multiShortestPathTree50.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection54 = multiShortestPathTree50.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap55 = multiShortestPathTree50.stateSets;
        multiShortestPathTree27.stateSets = vertexMap55;
        multiShortestPathTree1.stateSets = vertexMap55;
        org.opentripplanner.routing.core.RoutingRequest routingRequest58 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest59 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex60 = null;
        org.opentripplanner.routing.core.State state61 = multiShortestPathTree1.getState(vertex60);
        java.lang.String str62 = multiShortestPathTree1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap16);
        org.junit.Assert.assertNull(stateList20);
        org.junit.Assert.assertNotNull(vertexMap21);
        org.junit.Assert.assertNull(state23);
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "MultiSPT(0 vertices)" + "'", str28, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MultiSPT(0 vertices)" + "'", str30, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "MultiSPT(0 vertices)" + "'", str37, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap38);
        org.junit.Assert.assertNotNull(vertexSet41);
        org.junit.Assert.assertNull(stateList43);
        org.junit.Assert.assertNull(stateList45);
        org.junit.Assert.assertNotNull(vertexMap46);
        org.junit.Assert.assertNotNull(vertexSet48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "MultiSPT(0 vertices)" + "'", str51, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(vertexMap53);
        org.junit.Assert.assertNotNull(stateCollection54);
        org.junit.Assert.assertNotNull(vertexMap55);
        org.junit.Assert.assertNull(routingRequest58);
        org.junit.Assert.assertNull(routingRequest59);
        org.junit.Assert.assertNull(state61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "MultiSPT(0 vertices)" + "'", str62, "MultiSPT(0 vertices)");
    }

    @Test
    public void test17039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17039");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree0.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree0.options;
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree0.postVisit(state13);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree0.getVertices();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList16 = multiShortestPathTree0.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(vertexSet15);
    }

    @Test
    public void test17040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17040");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        java.lang.String str13 = multiShortestPathTree12.toString();
        int int14 = multiShortestPathTree12.getVertexCount();
        java.lang.String str15 = multiShortestPathTree12.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree12.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        java.lang.String str19 = multiShortestPathTree18.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree18.stateSets;
        multiShortestPathTree12.stateSets = vertexMap20;
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath24 = multiShortestPathTree12.getPath(vertex22, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree26 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest25);
        java.lang.String str27 = multiShortestPathTree26.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap28 = multiShortestPathTree26.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        org.opentripplanner.routing.core.State state30 = multiShortestPathTree26.getState(vertex29);
        java.lang.String str31 = multiShortestPathTree26.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest32 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree33 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest32);
        java.lang.String str34 = multiShortestPathTree33.toString();
        int int35 = multiShortestPathTree33.getVertexCount();
        java.lang.String str36 = multiShortestPathTree33.toString();
        org.opentripplanner.routing.core.State state37 = null;
        multiShortestPathTree33.postVisit(state37);
        org.opentripplanner.routing.graph.Vertex vertex39 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath41 = multiShortestPathTree33.getPath(vertex39, true);
        org.opentripplanner.routing.graph.Vertex vertex42 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath44 = multiShortestPathTree33.getPath(vertex42, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap45 = multiShortestPathTree33.stateSets;
        multiShortestPathTree26.stateSets = vertexMap45;
        multiShortestPathTree12.stateSets = vertexMap45;
        multiShortestPathTree1.stateSets = vertexMap45;
        org.opentripplanner.routing.graph.Vertex vertex49 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath51 = multiShortestPathTree1.getPath(vertex49, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest52 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree53 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest52);
        java.lang.String str54 = multiShortestPathTree53.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap55 = multiShortestPathTree53.stateSets;
        java.lang.String str56 = multiShortestPathTree53.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest57 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree58 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest57);
        java.lang.String str59 = multiShortestPathTree58.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap60 = multiShortestPathTree58.stateSets;
        multiShortestPathTree53.stateSets = vertexMap60;
        org.opentripplanner.routing.graph.Vertex vertex62 = null;
        org.opentripplanner.routing.core.State state63 = multiShortestPathTree53.getState(vertex62);
        org.opentripplanner.routing.core.RoutingRequest routingRequest64 = multiShortestPathTree53.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest65 = multiShortestPathTree53.options;
        org.opentripplanner.routing.core.State state66 = null;
        multiShortestPathTree53.postVisit(state66);
        org.opentripplanner.routing.graph.Vertex vertex68 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList70 = multiShortestPathTree53.getPaths(vertex68, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest71 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree72 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest71);
        java.lang.String str73 = multiShortestPathTree72.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest74 = multiShortestPathTree72.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection75 = multiShortestPathTree72.getAllStates();
        org.opentripplanner.routing.core.State state76 = null;
        multiShortestPathTree72.postVisit(state76);
        org.opentripplanner.routing.core.State state78 = null;
        multiShortestPathTree72.postVisit(state78);
        org.opentripplanner.routing.core.RoutingRequest routingRequest80 = multiShortestPathTree72.options;
        org.opentripplanner.routing.graph.Vertex vertex81 = null;
        org.opentripplanner.routing.core.State state82 = multiShortestPathTree72.getState(vertex81);
        org.opentripplanner.routing.core.RoutingRequest routingRequest83 = multiShortestPathTree72.options;
        org.opentripplanner.routing.core.State state84 = null;
        multiShortestPathTree72.postVisit(state84);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap86 = multiShortestPathTree72.stateSets;
        multiShortestPathTree53.stateSets = vertexMap86;
        multiShortestPathTree1.stateSets = vertexMap86;
        java.lang.Class<?> wildcardClass89 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap20);
        org.junit.Assert.assertNull(graphPath24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "MultiSPT(0 vertices)" + "'", str27, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap28);
        org.junit.Assert.assertNull(state30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "MultiSPT(0 vertices)" + "'", str31, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "MultiSPT(0 vertices)" + "'", str34, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "MultiSPT(0 vertices)" + "'", str36, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath41);
        org.junit.Assert.assertNull(graphPath44);
        org.junit.Assert.assertNotNull(vertexMap45);
        org.junit.Assert.assertNull(graphPath51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "MultiSPT(0 vertices)" + "'", str54, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "MultiSPT(0 vertices)" + "'", str56, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "MultiSPT(0 vertices)" + "'", str59, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap60);
        org.junit.Assert.assertNull(state63);
        org.junit.Assert.assertNull(routingRequest64);
        org.junit.Assert.assertNull(routingRequest65);
        org.junit.Assert.assertNotNull(graphPathList70);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "MultiSPT(0 vertices)" + "'", str73, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest74);
        org.junit.Assert.assertNotNull(stateCollection75);
        org.junit.Assert.assertNull(routingRequest80);
        org.junit.Assert.assertNull(state82);
        org.junit.Assert.assertNull(routingRequest83);
        org.junit.Assert.assertNotNull(vertexMap86);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test17041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17041");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.lang.String str7 = multiShortestPathTree6.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection12 = multiShortestPathTree1.getAllStates();
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree1.getPaths(vertex20, false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(stateCollection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNotNull(graphPathList22);
    }

    @Test
    public void test17042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17042");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.lang.String str15 = multiShortestPathTree14.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree14.stateSets;
        multiShortestPathTree12.stateSets = vertexMap16;
        multiShortestPathTree10.stateSets = vertexMap16;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree10.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree10.options;
        java.lang.String str21 = multiShortestPathTree10.toString();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.core.State state23 = multiShortestPathTree10.getState(vertex22);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList25 = multiShortestPathTree10.getStates(vertex24);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree10.stateSets;
        multiShortestPathTree1.stateSets = vertexMap26;
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList30 = multiShortestPathTree1.getPaths(vertex28, false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNotNull(vertexMap4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap16);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiSPT(0 vertices)" + "'", str21, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state23);
        org.junit.Assert.assertNull(stateList25);
        org.junit.Assert.assertNotNull(vertexMap26);
        org.junit.Assert.assertNotNull(graphPathList30);
    }

    @Test
    public void test17043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17043");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, false);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, true);
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.core.State state14 = multiShortestPathTree1.getState(vertex13);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        java.lang.String str16 = multiShortestPathTree1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(graphPathList6);
        org.junit.Assert.assertNull(graphPath9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
    }

    @Test
    public void test17044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17044");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree0.getVertices();
        int int10 = multiShortestPathTree0.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree0.getPaths(vertex11, false);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        java.lang.String str19 = multiShortestPathTree18.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree18.stateSets;
        multiShortestPathTree16.stateSets = vertexMap20;
        multiShortestPathTree14.stateSets = vertexMap20;
        multiShortestPathTree0.stateSets = vertexMap20;
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.core.State state25 = multiShortestPathTree0.getState(vertex24);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree0.stateSets;
        int int27 = multiShortestPathTree0.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList30 = multiShortestPathTree0.getPaths(vertex28, false);
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        org.opentripplanner.routing.core.State state32 = multiShortestPathTree0.getState(vertex31);
        org.opentripplanner.routing.core.RoutingRequest routingRequest33 = multiShortestPathTree0.getOptions();
        org.opentripplanner.routing.core.State state34 = null;
        multiShortestPathTree0.postVisit(state34);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection36 = multiShortestPathTree0.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection37 = multiShortestPathTree0.getAllStates();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList38 = multiShortestPathTree0.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap20);
        org.junit.Assert.assertNull(state25);
        org.junit.Assert.assertNotNull(vertexMap26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(graphPathList30);
        org.junit.Assert.assertNull(state32);
        org.junit.Assert.assertNull(routingRequest33);
        org.junit.Assert.assertNotNull(stateCollection36);
        org.junit.Assert.assertNotNull(stateCollection37);
    }

    @Test
    public void test17045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17045");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree1.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = routingRequest14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(routingRequest14);
    }

    @Test
    public void test17046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17046");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest4);
        java.lang.String str6 = multiShortestPathTree5.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree5.stateSets;
        multiShortestPathTree1.stateSets = vertexMap7;
        java.lang.String str9 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree1.getPath(vertex13, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(graphPath15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNotNull(stateCollection19);
    }

    @Test
    public void test17047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17047");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        java.lang.String str11 = multiShortestPathTree1.toString();
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
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath14);
    }

    @Test
    public void test17048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17048");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.lang.String str4 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection8 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        int int10 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(stateCollection8);
        org.junit.Assert.assertNotNull(vertexMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNotNull(stateCollection14);
    }

    @Test
    public void test17049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17049");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree0.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree0.getPath(vertex12, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        java.lang.String str17 = multiShortestPathTree16.toString();
        int int18 = multiShortestPathTree16.getVertexCount();
        java.lang.String str19 = multiShortestPathTree16.toString();
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree16.postVisit(state20);
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree16.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        java.lang.String str25 = multiShortestPathTree24.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree24.stateSets;
        multiShortestPathTree16.stateSets = vertexMap26;
        multiShortestPathTree0.stateSets = vertexMap26;
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList30 = multiShortestPathTree0.getStates(vertex29);
        org.opentripplanner.routing.core.State state31 = null;
        multiShortestPathTree0.postVisit(state31);
        org.opentripplanner.routing.graph.Vertex vertex33 = null;
        org.opentripplanner.routing.core.State state34 = multiShortestPathTree0.getState(vertex33);
        org.opentripplanner.routing.graph.Vertex vertex35 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList37 = multiShortestPathTree0.getPaths(vertex35, false);
        org.opentripplanner.routing.graph.Vertex vertex38 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList39 = multiShortestPathTree0.getStates(vertex38);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap40 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex41 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList43 = multiShortestPathTree0.getPaths(vertex41, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap44 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest45 = multiShortestPathTree0.options;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexMap9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MultiSPT(0 vertices)" + "'", str25, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap26);
        org.junit.Assert.assertNull(stateList30);
        org.junit.Assert.assertNull(state34);
        org.junit.Assert.assertNotNull(graphPathList37);
        org.junit.Assert.assertNull(stateList39);
        org.junit.Assert.assertNotNull(vertexMap40);
        org.junit.Assert.assertNotNull(graphPathList43);
        org.junit.Assert.assertNotNull(vertexMap44);
        org.junit.Assert.assertNull(routingRequest45);
    }

    @Test
    public void test17050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17050");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        int int13 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree16.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree16.getStates(vertex18);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.lang.String str22 = multiShortestPathTree21.toString();
        int int23 = multiShortestPathTree21.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree21.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree26 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest25);
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest27);
        java.lang.String str29 = multiShortestPathTree28.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap30 = multiShortestPathTree28.stateSets;
        multiShortestPathTree26.stateSets = vertexMap30;
        org.opentripplanner.routing.core.RoutingRequest routingRequest32 = multiShortestPathTree26.getOptions();
        org.opentripplanner.routing.core.State state33 = null;
        multiShortestPathTree26.postVisit(state33);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap35 = multiShortestPathTree26.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest36 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree37 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest36);
        org.opentripplanner.routing.core.RoutingRequest routingRequest38 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree39 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest38);
        java.lang.String str40 = multiShortestPathTree39.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap41 = multiShortestPathTree39.stateSets;
        multiShortestPathTree37.stateSets = vertexMap41;
        multiShortestPathTree26.stateSets = vertexMap41;
        multiShortestPathTree21.stateSets = vertexMap41;
        multiShortestPathTree16.stateSets = vertexMap41;
        multiShortestPathTree1.stateSets = vertexMap41;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap47 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex48 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath50 = multiShortestPathTree1.getPath(vertex48, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNull(stateList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vertexMap24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "MultiSPT(0 vertices)" + "'", str29, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap30);
        org.junit.Assert.assertNull(routingRequest32);
        org.junit.Assert.assertNotNull(vertexMap35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "MultiSPT(0 vertices)" + "'", str40, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap41);
        org.junit.Assert.assertNotNull(vertexMap47);
        org.junit.Assert.assertNull(graphPath50);
    }

    @Test
    public void test17051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17051");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap12 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNotNull(vertexMap12);
        org.junit.Assert.assertNull(routingRequest13);
    }

    @Test
    public void test17052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17052");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap12 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNotNull(vertexMap12);
        org.junit.Assert.assertNotNull(vertexMap13);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNotNull(stateCollection15);
    }

    @Test
    public void test17053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17053");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.lang.String str7 = multiShortestPathTree6.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, false);
        org.opentripplanner.routing.core.State state19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = multiShortestPathTree1.add(state19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertNull(graphPath18);
    }

    @Test
    public void test17054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17054");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList15 = multiShortestPathTree1.getPaths(vertex13, false);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath18 = multiShortestPathTree1.getPath(vertex16, true);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree1.getState(vertex19);
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.core.State state23 = multiShortestPathTree1.getState(vertex22);
        org.opentripplanner.routing.core.State state24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = multiShortestPathTree1.visit(state24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(graphPathList15);
        org.junit.Assert.assertNull(graphPath18);
        org.junit.Assert.assertNull(state20);
        org.junit.Assert.assertNull(routingRequest21);
        org.junit.Assert.assertNull(state23);
    }

    @Test
    public void test17055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17055");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree0.getStates(vertex10);
        org.opentripplanner.routing.core.State state12 = null;
        multiShortestPathTree0.postVisit(state12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree0.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree0.options;
        int int16 = multiShortestPathTree0.getVertexCount();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree0.getAllStates();
        int int18 = multiShortestPathTree0.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree0.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        java.lang.String str22 = multiShortestPathTree21.toString();
        int int23 = multiShortestPathTree21.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree25 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest24);
        java.lang.String str26 = multiShortestPathTree25.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree25.stateSets;
        multiShortestPathTree21.stateSets = vertexMap27;
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList31 = multiShortestPathTree21.getPaths(vertex29, false);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree32 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest33 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree34 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest33);
        org.opentripplanner.routing.core.RoutingRequest routingRequest35 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree36 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest35);
        java.lang.String str37 = multiShortestPathTree36.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap38 = multiShortestPathTree36.stateSets;
        multiShortestPathTree34.stateSets = vertexMap38;
        multiShortestPathTree32.stateSets = vertexMap38;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet41 = multiShortestPathTree32.getVertices();
        int int42 = multiShortestPathTree32.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex43 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList45 = multiShortestPathTree32.getPaths(vertex43, false);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree46 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest47 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree48 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest47);
        org.opentripplanner.routing.core.RoutingRequest routingRequest49 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree50 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest49);
        java.lang.String str51 = multiShortestPathTree50.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap52 = multiShortestPathTree50.stateSets;
        multiShortestPathTree48.stateSets = vertexMap52;
        multiShortestPathTree46.stateSets = vertexMap52;
        multiShortestPathTree32.stateSets = vertexMap52;
        multiShortestPathTree21.stateSets = vertexMap52;
        multiShortestPathTree0.stateSets = vertexMap52;
        org.opentripplanner.routing.core.RoutingRequest routingRequest58 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree59 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest58);
        java.lang.String str60 = multiShortestPathTree59.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap61 = multiShortestPathTree59.stateSets;
        java.lang.String str62 = multiShortestPathTree59.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest63 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree64 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest63);
        java.lang.String str65 = multiShortestPathTree64.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap66 = multiShortestPathTree64.stateSets;
        multiShortestPathTree59.stateSets = vertexMap66;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection68 = multiShortestPathTree59.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex69 = null;
        org.opentripplanner.routing.core.State state70 = multiShortestPathTree59.getState(vertex69);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap71 = multiShortestPathTree59.stateSets;
        multiShortestPathTree0.stateSets = vertexMap71;
        org.opentripplanner.routing.graph.Vertex vertex73 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList74 = multiShortestPathTree0.getStates(vertex73);
        java.lang.String str75 = multiShortestPathTree0.toString();
        org.opentripplanner.routing.graph.Vertex vertex76 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList77 = multiShortestPathTree0.getStates(vertex76);
        org.opentripplanner.routing.core.RoutingRequest routingRequest78 = multiShortestPathTree0.getOptions();
        org.opentripplanner.routing.core.State state79 = null;
        multiShortestPathTree0.postVisit(state79);
        org.opentripplanner.routing.graph.Vertex vertex81 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList83 = multiShortestPathTree0.getPaths(vertex81, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MultiSPT(0 vertices)" + "'", str26, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertNotNull(graphPathList31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "MultiSPT(0 vertices)" + "'", str37, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap38);
        org.junit.Assert.assertNotNull(vertexSet41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(graphPathList45);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "MultiSPT(0 vertices)" + "'", str51, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap52);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "MultiSPT(0 vertices)" + "'", str60, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "MultiSPT(0 vertices)" + "'", str62, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "MultiSPT(0 vertices)" + "'", str65, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap66);
        org.junit.Assert.assertNotNull(stateCollection68);
        org.junit.Assert.assertNull(state70);
        org.junit.Assert.assertNotNull(vertexMap71);
        org.junit.Assert.assertNull(stateList74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "MultiSPT(0 vertices)" + "'", str75, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList77);
        org.junit.Assert.assertNull(routingRequest78);
        org.junit.Assert.assertNotNull(graphPathList83);
    }

    @Test
    public void test17056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17056");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree0.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        java.lang.String str13 = multiShortestPathTree12.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree12.stateSets;
        java.lang.String str15 = multiShortestPathTree12.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree12.stateSets;
        multiShortestPathTree0.stateSets = vertexMap16;
        int int18 = multiShortestPathTree0.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree0.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree0.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree0.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet22 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        org.opentripplanner.routing.core.State state24 = multiShortestPathTree0.getState(vertex23);
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList26 = multiShortestPathTree0.getStates(vertex25);
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = multiShortestPathTree0.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap28 = multiShortestPathTree0.stateSets;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vertexMap19);
        org.junit.Assert.assertNotNull(vertexMap20);
        org.junit.Assert.assertNotNull(stateCollection21);
        org.junit.Assert.assertNotNull(vertexSet22);
        org.junit.Assert.assertNull(state24);
        org.junit.Assert.assertNull(stateList26);
        org.junit.Assert.assertNull(routingRequest27);
        org.junit.Assert.assertNotNull(vertexMap28);
    }

    @Test
    public void test17057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17057");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state16 = null;
        multiShortestPathTree1.postVisit(state16);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        java.lang.String str19 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.add(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vertexMap4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(graphPathList14);
        org.junit.Assert.assertNotNull(vertexMap15);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
    }

    @Test
    public void test17058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17058");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.core.State state5 = multiShortestPathTree1.getState(vertex4);
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree1.stateSets;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertNotNull(vertexMap8);
    }

    @Test
    public void test17059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17059");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest8 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest8);
        java.lang.String str10 = multiShortestPathTree9.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree9.stateSets;
        multiShortestPathTree1.stateSets = vertexMap11;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet17 = multiShortestPathTree1.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath21 = multiShortestPathTree1.getPath(vertex19, false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNotNull(vertexSet17);
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertNull(graphPath21);
    }

    @Test
    public void test17060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17060");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList9 = multiShortestPathTree1.getStates(vertex8);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap11 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        java.lang.String str14 = multiShortestPathTree13.toString();
        int int15 = multiShortestPathTree13.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree13.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree13.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree13.getPaths(vertex18, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = null;
        multiShortestPathTree13.stateSets = vertexMap21;
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree26 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest25);
        java.lang.String str27 = multiShortestPathTree26.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap28 = multiShortestPathTree26.stateSets;
        multiShortestPathTree24.stateSets = vertexMap28;
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = multiShortestPathTree24.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList33 = multiShortestPathTree24.getPaths(vertex31, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree24.stateSets;
        multiShortestPathTree13.stateSets = vertexMap34;
        multiShortestPathTree1.stateSets = vertexMap34;
        org.opentripplanner.routing.core.State state37 = null;
        multiShortestPathTree1.postVisit(state37);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection39 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest40 = multiShortestPathTree1.getOptions();
        java.lang.String str41 = multiShortestPathTree1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(stateList9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNotNull(vertexMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vertexMap16);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "MultiSPT(0 vertices)" + "'", str27, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap28);
        org.junit.Assert.assertNull(routingRequest30);
        org.junit.Assert.assertNotNull(graphPathList33);
        org.junit.Assert.assertNotNull(vertexMap34);
        org.junit.Assert.assertNotNull(stateCollection39);
        org.junit.Assert.assertNull(routingRequest40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "MultiSPT(0 vertices)" + "'", str41, "MultiSPT(0 vertices)");
    }

    @Test
    public void test17061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17061");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree0.options;
        java.lang.String str11 = multiShortestPathTree0.toString();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree0.getState(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree0.postVisit(state14);
        java.lang.String str16 = multiShortestPathTree0.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        java.lang.String str21 = multiShortestPathTree20.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree20.stateSets;
        multiShortestPathTree18.stateSets = vertexMap22;
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree18.getOptions();
        org.opentripplanner.routing.core.State state25 = null;
        multiShortestPathTree18.postVisit(state25);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree18.stateSets;
        java.lang.String str28 = multiShortestPathTree18.toString();
        org.opentripplanner.routing.core.State state29 = null;
        multiShortestPathTree18.postVisit(state29);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap31 = multiShortestPathTree18.stateSets;
        multiShortestPathTree0.stateSets = vertexMap31;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap33 = multiShortestPathTree0.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList34 = multiShortestPathTree0.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiSPT(0 vertices)" + "'", str21, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "MultiSPT(0 vertices)" + "'", str28, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap31);
        org.junit.Assert.assertNotNull(vertexMap33);
    }

    @Test
    public void test17062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17062");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.State state8 = null;
        multiShortestPathTree1.postVisit(state8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath17 = multiShortestPathTree1.getPath(vertex15, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection19 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = multiShortestPathTree1.add(state20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNull(graphPath17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNotNull(stateCollection19);
    }

    @Test
    public void test17063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17063");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        java.lang.String str12 = multiShortestPathTree11.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree11.stateSets;
        java.lang.String str14 = multiShortestPathTree11.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        java.lang.String str17 = multiShortestPathTree16.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree16.stateSets;
        multiShortestPathTree11.stateSets = vertexMap18;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree11.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree11.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList23 = multiShortestPathTree11.getStates(vertex22);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree11.options;
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList26 = multiShortestPathTree11.getStates(vertex25);
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest27);
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree30 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest29);
        java.lang.String str31 = multiShortestPathTree30.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap32 = multiShortestPathTree30.stateSets;
        multiShortestPathTree28.stateSets = vertexMap32;
        org.opentripplanner.routing.core.RoutingRequest routingRequest34 = multiShortestPathTree28.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex35 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList37 = multiShortestPathTree28.getPaths(vertex35, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap38 = multiShortestPathTree28.stateSets;
        multiShortestPathTree11.stateSets = vertexMap38;
        multiShortestPathTree1.stateSets = vertexMap38;
        org.opentripplanner.routing.graph.Vertex vertex41 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList42 = multiShortestPathTree1.getStates(vertex41);
        int int43 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet44 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state45 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = multiShortestPathTree1.visit(state45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertNotNull(stateCollection20);
        org.junit.Assert.assertNotNull(stateCollection21);
        org.junit.Assert.assertNull(stateList23);
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertNull(stateList26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "MultiSPT(0 vertices)" + "'", str31, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap32);
        org.junit.Assert.assertNull(routingRequest34);
        org.junit.Assert.assertNotNull(graphPathList37);
        org.junit.Assert.assertNotNull(vertexMap38);
        org.junit.Assert.assertNull(stateList42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(vertexSet44);
    }

    @Test
    public void test17064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17064");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection4 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex5 = null;
        org.opentripplanner.routing.core.State state6 = multiShortestPathTree1.getState(vertex5);
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        java.lang.String str12 = multiShortestPathTree11.toString();
        int int13 = multiShortestPathTree11.getVertexCount();
        java.lang.String str14 = multiShortestPathTree11.toString();
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree11.postVisit(state15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree11.options;
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree11.getPaths(vertex18, true);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath23 = multiShortestPathTree11.getPath(vertex21, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet24 = multiShortestPathTree11.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap25;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree30 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest29);
        org.opentripplanner.routing.core.RoutingRequest routingRequest31 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree32 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest31);
        java.lang.String str33 = multiShortestPathTree32.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree32.stateSets;
        multiShortestPathTree30.stateSets = vertexMap34;
        multiShortestPathTree28.stateSets = vertexMap34;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree28.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex38 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList39 = multiShortestPathTree28.getStates(vertex38);
        org.opentripplanner.routing.graph.Vertex vertex40 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath42 = multiShortestPathTree28.getPath(vertex40, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest43 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree44 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest43);
        java.lang.String str45 = multiShortestPathTree44.toString();
        int int46 = multiShortestPathTree44.getVertexCount();
        java.lang.String str47 = multiShortestPathTree44.toString();
        org.opentripplanner.routing.core.State state48 = null;
        multiShortestPathTree44.postVisit(state48);
        org.opentripplanner.routing.core.RoutingRequest routingRequest50 = multiShortestPathTree44.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest51 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree52 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest51);
        java.lang.String str53 = multiShortestPathTree52.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap54 = multiShortestPathTree52.stateSets;
        multiShortestPathTree44.stateSets = vertexMap54;
        multiShortestPathTree28.stateSets = vertexMap54;
        org.opentripplanner.routing.graph.Vertex vertex57 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList58 = multiShortestPathTree28.getStates(vertex57);
        org.opentripplanner.routing.core.State state59 = null;
        multiShortestPathTree28.postVisit(state59);
        org.opentripplanner.routing.core.RoutingRequest routingRequest61 = multiShortestPathTree28.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap62 = multiShortestPathTree28.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex63 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList65 = multiShortestPathTree28.getPaths(vertex63, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap66 = multiShortestPathTree28.stateSets;
        multiShortestPathTree1.stateSets = vertexMap66;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection68 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state69 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = multiShortestPathTree1.visit(state69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNotNull(stateCollection4);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiSPT(0 vertices)" + "'", str12, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNull(graphPath23);
        org.junit.Assert.assertNotNull(vertexSet24);
        org.junit.Assert.assertNotNull(vertexMap25);
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MultiSPT(0 vertices)" + "'", str33, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap34);
        org.junit.Assert.assertNotNull(vertexMap37);
        org.junit.Assert.assertNull(stateList39);
        org.junit.Assert.assertNull(graphPath42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "MultiSPT(0 vertices)" + "'", str45, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "MultiSPT(0 vertices)" + "'", str47, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "MultiSPT(0 vertices)" + "'", str53, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap54);
        org.junit.Assert.assertNull(stateList58);
        org.junit.Assert.assertNull(routingRequest61);
        org.junit.Assert.assertNotNull(vertexMap62);
        org.junit.Assert.assertNotNull(graphPathList65);
        org.junit.Assert.assertNotNull(vertexMap66);
        org.junit.Assert.assertNotNull(stateCollection68);
    }

    @Test
    public void test17065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17065");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath23 = multiShortestPathTree1.getPath(vertex21, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree25 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest24);
        java.lang.String str26 = multiShortestPathTree25.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree25.stateSets;
        java.lang.String str28 = multiShortestPathTree25.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree30 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest29);
        java.lang.String str31 = multiShortestPathTree30.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap32 = multiShortestPathTree30.stateSets;
        multiShortestPathTree25.stateSets = vertexMap32;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection34 = multiShortestPathTree25.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection35 = multiShortestPathTree25.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex36 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList37 = multiShortestPathTree25.getStates(vertex36);
        org.opentripplanner.routing.core.RoutingRequest routingRequest38 = multiShortestPathTree25.options;
        org.opentripplanner.routing.graph.Vertex vertex39 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList40 = multiShortestPathTree25.getStates(vertex39);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap41 = multiShortestPathTree25.stateSets;
        multiShortestPathTree1.stateSets = vertexMap41;
        org.opentripplanner.routing.graph.Vertex vertex43 = null;
        org.opentripplanner.routing.core.State state44 = multiShortestPathTree1.getState(vertex43);
        org.opentripplanner.routing.core.RoutingRequest routingRequest45 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNotNull(vertexSet15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNull(graphPath23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MultiSPT(0 vertices)" + "'", str26, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "MultiSPT(0 vertices)" + "'", str28, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "MultiSPT(0 vertices)" + "'", str31, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap32);
        org.junit.Assert.assertNotNull(stateCollection34);
        org.junit.Assert.assertNotNull(stateCollection35);
        org.junit.Assert.assertNull(stateList37);
        org.junit.Assert.assertNull(routingRequest38);
        org.junit.Assert.assertNull(stateList40);
        org.junit.Assert.assertNotNull(vertexMap41);
        org.junit.Assert.assertNull(state44);
        org.junit.Assert.assertNull(routingRequest45);
    }

    @Test
    public void test17066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17066");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree0.getVertices();
        int int10 = multiShortestPathTree0.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree0.getPaths(vertex11, false);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        java.lang.String str19 = multiShortestPathTree18.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree18.stateSets;
        multiShortestPathTree16.stateSets = vertexMap20;
        multiShortestPathTree14.stateSets = vertexMap20;
        multiShortestPathTree0.stateSets = vertexMap20;
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.core.State state25 = multiShortestPathTree0.getState(vertex24);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree0.stateSets;
        java.lang.String str27 = multiShortestPathTree0.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest28 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree29 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest28);
        java.lang.String str30 = multiShortestPathTree29.toString();
        int int31 = multiShortestPathTree29.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest32 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree33 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest32);
        org.opentripplanner.routing.core.RoutingRequest routingRequest34 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree35 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest34);
        java.lang.String str36 = multiShortestPathTree35.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree35.stateSets;
        multiShortestPathTree33.stateSets = vertexMap37;
        org.opentripplanner.routing.core.State state39 = null;
        multiShortestPathTree33.postVisit(state39);
        org.opentripplanner.routing.graph.Vertex vertex41 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList43 = multiShortestPathTree33.getPaths(vertex41, true);
        org.opentripplanner.routing.graph.Vertex vertex44 = null;
        org.opentripplanner.routing.core.State state45 = multiShortestPathTree33.getState(vertex44);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap46 = multiShortestPathTree33.stateSets;
        multiShortestPathTree29.stateSets = vertexMap46;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap48 = multiShortestPathTree29.stateSets;
        multiShortestPathTree0.stateSets = vertexMap48;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection50 = multiShortestPathTree0.getAllStates();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap20);
        org.junit.Assert.assertNull(state25);
        org.junit.Assert.assertNotNull(vertexMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "MultiSPT(0 vertices)" + "'", str27, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MultiSPT(0 vertices)" + "'", str30, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "MultiSPT(0 vertices)" + "'", str36, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap37);
        org.junit.Assert.assertNotNull(graphPathList43);
        org.junit.Assert.assertNull(state45);
        org.junit.Assert.assertNotNull(vertexMap46);
        org.junit.Assert.assertNotNull(vertexMap48);
        org.junit.Assert.assertNotNull(stateCollection50);
    }

    @Test
    public void test17067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17067");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.lang.String str7 = multiShortestPathTree6.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath16 = multiShortestPathTree1.getPath(vertex14, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree1.getAllStates();
        int int18 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths(vertex19, true);
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList23 = multiShortestPathTree1.getStates(vertex22);
        int int24 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNull(graphPath16);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(graphPathList21);
        org.junit.Assert.assertNull(stateList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test17068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17068");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree8.getPath(vertex9, true);
        int int12 = multiShortestPathTree8.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree8.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree8.getState(vertex14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.lang.String str18 = multiShortestPathTree17.toString();
        int int19 = multiShortestPathTree17.getVertexCount();
        java.lang.String str20 = multiShortestPathTree17.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree17.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        java.lang.String str24 = multiShortestPathTree23.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree23.stateSets;
        multiShortestPathTree17.stateSets = vertexMap25;
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = multiShortestPathTree17.options;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree30 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest29);
        org.opentripplanner.routing.core.RoutingRequest routingRequest31 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree32 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest31);
        java.lang.String str33 = multiShortestPathTree32.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree32.stateSets;
        multiShortestPathTree30.stateSets = vertexMap34;
        multiShortestPathTree28.stateSets = vertexMap34;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection37 = multiShortestPathTree28.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet38 = multiShortestPathTree28.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest39 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree40 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest39);
        java.lang.String str41 = multiShortestPathTree40.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap42 = multiShortestPathTree40.stateSets;
        java.lang.String str43 = multiShortestPathTree40.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap44 = multiShortestPathTree40.stateSets;
        multiShortestPathTree28.stateSets = vertexMap44;
        multiShortestPathTree17.stateSets = vertexMap44;
        multiShortestPathTree8.stateSets = vertexMap44;
        multiShortestPathTree1.stateSets = vertexMap44;
        java.lang.String str49 = multiShortestPathTree1.toString();
        int int50 = multiShortestPathTree1.getVertexCount();
        int int51 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex52 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList54 = multiShortestPathTree1.getPaths(vertex52, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest55 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet56 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MultiSPT(0 vertices)" + "'", str24, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap25);
        org.junit.Assert.assertNull(routingRequest27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MultiSPT(0 vertices)" + "'", str33, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap34);
        org.junit.Assert.assertNotNull(stateCollection37);
        org.junit.Assert.assertNotNull(vertexSet38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "MultiSPT(0 vertices)" + "'", str41, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "MultiSPT(0 vertices)" + "'", str43, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "MultiSPT(0 vertices)" + "'", str49, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(graphPathList54);
        org.junit.Assert.assertNull(routingRequest55);
        org.junit.Assert.assertNotNull(vertexSet56);
    }

    @Test
    public void test17069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17069");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.lang.String str4 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        java.lang.String str8 = multiShortestPathTree7.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree7.stateSets;
        multiShortestPathTree1.stateSets = vertexMap9;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree15 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest14);
        java.lang.String str16 = multiShortestPathTree15.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree15.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree15.getState(vertex18);
        java.lang.String str20 = multiShortestPathTree15.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree22 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest21);
        java.lang.String str23 = multiShortestPathTree22.toString();
        int int24 = multiShortestPathTree22.getVertexCount();
        java.lang.String str25 = multiShortestPathTree22.toString();
        org.opentripplanner.routing.core.State state26 = null;
        multiShortestPathTree22.postVisit(state26);
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath30 = multiShortestPathTree22.getPath(vertex28, true);
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath33 = multiShortestPathTree22.getPath(vertex31, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree22.stateSets;
        multiShortestPathTree15.stateSets = vertexMap34;
        multiShortestPathTree1.stateSets = vertexMap34;
        org.opentripplanner.routing.graph.Vertex vertex37 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList38 = multiShortestPathTree1.getStates(vertex37);
        org.opentripplanner.routing.core.RoutingRequest routingRequest39 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet40 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest41 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree42 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest41);
        java.lang.String str43 = multiShortestPathTree42.toString();
        int int44 = multiShortestPathTree42.getVertexCount();
        java.lang.String str45 = multiShortestPathTree42.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection46 = multiShortestPathTree42.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection47 = multiShortestPathTree42.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex48 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath50 = multiShortestPathTree42.getPath(vertex48, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap51 = multiShortestPathTree42.stateSets;
        multiShortestPathTree1.stateSets = vertexMap51;
        org.opentripplanner.routing.core.RoutingRequest routingRequest53 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree54 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest53);
        java.lang.String str55 = multiShortestPathTree54.toString();
        int int56 = multiShortestPathTree54.getVertexCount();
        java.lang.String str57 = multiShortestPathTree54.toString();
        org.opentripplanner.routing.core.State state58 = null;
        multiShortestPathTree54.postVisit(state58);
        org.opentripplanner.routing.core.RoutingRequest routingRequest60 = multiShortestPathTree54.options;
        org.opentripplanner.routing.graph.Vertex vertex61 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath63 = multiShortestPathTree54.getPath(vertex61, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest64 = multiShortestPathTree54.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest65 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree66 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest65);
        java.lang.String str67 = multiShortestPathTree66.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap68 = multiShortestPathTree66.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex69 = null;
        org.opentripplanner.routing.core.State state70 = multiShortestPathTree66.getState(vertex69);
        java.lang.String str71 = multiShortestPathTree66.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap72 = multiShortestPathTree66.stateSets;
        multiShortestPathTree54.stateSets = vertexMap72;
        multiShortestPathTree1.stateSets = vertexMap72;
        org.opentripplanner.routing.core.RoutingRequest routingRequest75 = multiShortestPathTree1.options;
        int int76 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex77 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath79 = multiShortestPathTree1.getPath(vertex77, false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap9);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap17);
        org.junit.Assert.assertNull(state19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiSPT(0 vertices)" + "'", str23, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MultiSPT(0 vertices)" + "'", str25, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath30);
        org.junit.Assert.assertNull(graphPath33);
        org.junit.Assert.assertNotNull(vertexMap34);
        org.junit.Assert.assertNull(stateList38);
        org.junit.Assert.assertNull(routingRequest39);
        org.junit.Assert.assertNotNull(vertexSet40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "MultiSPT(0 vertices)" + "'", str43, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "MultiSPT(0 vertices)" + "'", str45, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection46);
        org.junit.Assert.assertNotNull(stateCollection47);
        org.junit.Assert.assertNull(graphPath50);
        org.junit.Assert.assertNotNull(vertexMap51);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "MultiSPT(0 vertices)" + "'", str55, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "MultiSPT(0 vertices)" + "'", str57, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest60);
        org.junit.Assert.assertNull(graphPath63);
        org.junit.Assert.assertNull(routingRequest64);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "MultiSPT(0 vertices)" + "'", str67, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap68);
        org.junit.Assert.assertNull(state70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "MultiSPT(0 vertices)" + "'", str71, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap72);
        org.junit.Assert.assertNull(routingRequest75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNull(graphPath79);
    }

    @Test
    public void test17070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17070");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap7 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree15 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest14);
        java.lang.String str16 = multiShortestPathTree15.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree15.stateSets;
        multiShortestPathTree13.stateSets = vertexMap17;
        multiShortestPathTree11.stateSets = vertexMap17;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet20 = multiShortestPathTree11.getVertices();
        int int21 = multiShortestPathTree11.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList24 = multiShortestPathTree11.getPaths(vertex22, false);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree25 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree27 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest26);
        org.opentripplanner.routing.core.RoutingRequest routingRequest28 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree29 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest28);
        java.lang.String str30 = multiShortestPathTree29.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap31 = multiShortestPathTree29.stateSets;
        multiShortestPathTree27.stateSets = vertexMap31;
        multiShortestPathTree25.stateSets = vertexMap31;
        multiShortestPathTree11.stateSets = vertexMap31;
        org.opentripplanner.routing.graph.Vertex vertex35 = null;
        org.opentripplanner.routing.core.State state36 = multiShortestPathTree11.getState(vertex35);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree11.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex38 = null;
        org.opentripplanner.routing.core.State state39 = multiShortestPathTree11.getState(vertex38);
        org.opentripplanner.routing.core.RoutingRequest routingRequest40 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree41 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest40);
        java.lang.String str42 = multiShortestPathTree41.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap43 = multiShortestPathTree41.stateSets;
        java.lang.String str44 = multiShortestPathTree41.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest45 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree46 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest45);
        java.lang.String str47 = multiShortestPathTree46.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap48 = multiShortestPathTree46.stateSets;
        multiShortestPathTree41.stateSets = vertexMap48;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection50 = multiShortestPathTree41.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest51 = multiShortestPathTree41.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet52 = multiShortestPathTree41.getVertices();
        int int53 = multiShortestPathTree41.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap54 = multiShortestPathTree41.stateSets;
        multiShortestPathTree11.stateSets = vertexMap54;
        org.opentripplanner.routing.core.RoutingRequest routingRequest56 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree57 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest56);
        java.lang.String str58 = multiShortestPathTree57.toString();
        int int59 = multiShortestPathTree57.getVertexCount();
        java.lang.String str60 = multiShortestPathTree57.toString();
        org.opentripplanner.routing.core.State state61 = null;
        multiShortestPathTree57.postVisit(state61);
        org.opentripplanner.routing.core.RoutingRequest routingRequest63 = multiShortestPathTree57.options;
        org.opentripplanner.routing.graph.Vertex vertex64 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList66 = multiShortestPathTree57.getPaths(vertex64, true);
        org.opentripplanner.routing.graph.Vertex vertex67 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath69 = multiShortestPathTree57.getPath(vertex67, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet70 = multiShortestPathTree57.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap71 = multiShortestPathTree57.stateSets;
        multiShortestPathTree11.stateSets = vertexMap71;
        multiShortestPathTree1.stateSets = vertexMap71;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap74 = multiShortestPathTree1.stateSets;
        java.lang.String str75 = multiShortestPathTree1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vertexMap4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertNotNull(vertexMap7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap17);
        org.junit.Assert.assertNotNull(vertexSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(graphPathList24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MultiSPT(0 vertices)" + "'", str30, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap31);
        org.junit.Assert.assertNull(state36);
        org.junit.Assert.assertNotNull(vertexMap37);
        org.junit.Assert.assertNull(state39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "MultiSPT(0 vertices)" + "'", str42, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "MultiSPT(0 vertices)" + "'", str44, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "MultiSPT(0 vertices)" + "'", str47, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap48);
        org.junit.Assert.assertNotNull(stateCollection50);
        org.junit.Assert.assertNull(routingRequest51);
        org.junit.Assert.assertNotNull(vertexSet52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(vertexMap54);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "MultiSPT(0 vertices)" + "'", str58, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "MultiSPT(0 vertices)" + "'", str60, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest63);
        org.junit.Assert.assertNotNull(graphPathList66);
        org.junit.Assert.assertNull(graphPath69);
        org.junit.Assert.assertNotNull(vertexSet70);
        org.junit.Assert.assertNotNull(vertexMap71);
        org.junit.Assert.assertNotNull(vertexMap74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "MultiSPT(0 vertices)" + "'", str75, "MultiSPT(0 vertices)");
    }

    @Test
    public void test17071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17071");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree1.getVertices();
        int int12 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.lang.String str15 = multiShortestPathTree14.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree14.stateSets;
        java.lang.String str17 = multiShortestPathTree14.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree19 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest18);
        java.lang.String str20 = multiShortestPathTree19.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree19.stateSets;
        multiShortestPathTree14.stateSets = vertexMap21;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection23 = multiShortestPathTree14.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection24 = multiShortestPathTree14.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest25 = multiShortestPathTree14.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = multiShortestPathTree14.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = multiShortestPathTree14.options;
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList30 = multiShortestPathTree14.getPaths(vertex28, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap31 = multiShortestPathTree14.stateSets;
        multiShortestPathTree1.stateSets = vertexMap31;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap21);
        org.junit.Assert.assertNotNull(stateCollection23);
        org.junit.Assert.assertNotNull(stateCollection24);
        org.junit.Assert.assertNull(routingRequest25);
        org.junit.Assert.assertNull(routingRequest26);
        org.junit.Assert.assertNull(routingRequest27);
        org.junit.Assert.assertNotNull(graphPathList30);
        org.junit.Assert.assertNotNull(vertexMap31);
    }

    @Test
    public void test17072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17072");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        java.lang.String str14 = multiShortestPathTree13.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree13.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree13.getState(vertex16);
        java.lang.String str18 = multiShortestPathTree13.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree13.stateSets;
        multiShortestPathTree1.stateSets = vertexMap19;
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree22 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest21);
        java.lang.String str23 = multiShortestPathTree22.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree22.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree22.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree22.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection27 = multiShortestPathTree22.getAllStates();
        org.opentripplanner.routing.core.State state28 = null;
        multiShortestPathTree22.postVisit(state28);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree30 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest31 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree32 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest31);
        org.opentripplanner.routing.core.RoutingRequest routingRequest33 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree34 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest33);
        java.lang.String str35 = multiShortestPathTree34.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap36 = multiShortestPathTree34.stateSets;
        multiShortestPathTree32.stateSets = vertexMap36;
        multiShortestPathTree30.stateSets = vertexMap36;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet39 = multiShortestPathTree30.getVertices();
        int int40 = multiShortestPathTree30.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex41 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList43 = multiShortestPathTree30.getPaths(vertex41, false);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree44 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest45 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree46 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest45);
        org.opentripplanner.routing.core.RoutingRequest routingRequest47 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree48 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest47);
        java.lang.String str49 = multiShortestPathTree48.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap50 = multiShortestPathTree48.stateSets;
        multiShortestPathTree46.stateSets = vertexMap50;
        multiShortestPathTree44.stateSets = vertexMap50;
        multiShortestPathTree30.stateSets = vertexMap50;
        org.opentripplanner.routing.graph.Vertex vertex54 = null;
        org.opentripplanner.routing.core.State state55 = multiShortestPathTree30.getState(vertex54);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap56 = multiShortestPathTree30.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap57 = multiShortestPathTree30.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap58 = multiShortestPathTree30.stateSets;
        multiShortestPathTree22.stateSets = vertexMap58;
        multiShortestPathTree1.stateSets = vertexMap58;
        java.lang.String str61 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap62 = multiShortestPathTree1.stateSets;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiSPT(0 vertices)" + "'", str23, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertNotNull(vertexMap25);
        org.junit.Assert.assertNotNull(vertexMap26);
        org.junit.Assert.assertNotNull(stateCollection27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "MultiSPT(0 vertices)" + "'", str35, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap36);
        org.junit.Assert.assertNotNull(vertexSet39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(graphPathList43);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "MultiSPT(0 vertices)" + "'", str49, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap50);
        org.junit.Assert.assertNull(state55);
        org.junit.Assert.assertNotNull(vertexMap56);
        org.junit.Assert.assertNotNull(vertexMap57);
        org.junit.Assert.assertNotNull(vertexMap58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "MultiSPT(0 vertices)" + "'", str61, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap62);
    }

    @Test
    public void test17073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17073");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.core.State state5 = multiShortestPathTree1.getState(vertex4);
        java.lang.String str6 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet7 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
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
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(stateList12);
    }

    @Test
    public void test17074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17074");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet8 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree15 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest14);
        java.lang.String str16 = multiShortestPathTree15.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap17 = multiShortestPathTree15.stateSets;
        multiShortestPathTree13.stateSets = vertexMap17;
        multiShortestPathTree11.stateSets = vertexMap17;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet20 = multiShortestPathTree11.getVertices();
        int int21 = multiShortestPathTree11.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList24 = multiShortestPathTree11.getPaths(vertex22, false);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree25 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree27 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest26);
        org.opentripplanner.routing.core.RoutingRequest routingRequest28 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree29 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest28);
        java.lang.String str30 = multiShortestPathTree29.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap31 = multiShortestPathTree29.stateSets;
        multiShortestPathTree27.stateSets = vertexMap31;
        multiShortestPathTree25.stateSets = vertexMap31;
        multiShortestPathTree11.stateSets = vertexMap31;
        org.opentripplanner.routing.graph.Vertex vertex35 = null;
        org.opentripplanner.routing.core.State state36 = multiShortestPathTree11.getState(vertex35);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree11.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap38 = multiShortestPathTree11.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet39 = multiShortestPathTree11.getVertices();
        java.lang.String str40 = multiShortestPathTree11.toString();
        int int41 = multiShortestPathTree11.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex42 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList43 = multiShortestPathTree11.getStates(vertex42);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet44 = multiShortestPathTree11.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap45 = multiShortestPathTree11.stateSets;
        multiShortestPathTree1.stateSets = vertexMap45;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNotNull(vertexSet8);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap17);
        org.junit.Assert.assertNotNull(vertexSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(graphPathList24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MultiSPT(0 vertices)" + "'", str30, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap31);
        org.junit.Assert.assertNull(state36);
        org.junit.Assert.assertNotNull(vertexMap37);
        org.junit.Assert.assertNotNull(vertexMap38);
        org.junit.Assert.assertNotNull(vertexSet39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "MultiSPT(0 vertices)" + "'", str40, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(stateList43);
        org.junit.Assert.assertNotNull(vertexSet44);
        org.junit.Assert.assertNotNull(vertexMap45);
    }

    @Test
    public void test17075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17075");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertNotNull(graphPathList17);
    }

    @Test
    public void test17076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17076");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree0.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet11 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree0.options;
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree0.postVisit(state13);
        org.opentripplanner.routing.core.State state15 = null;
        multiShortestPathTree0.postVisit(state15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertNotNull(vertexSet11);
        org.junit.Assert.assertNull(routingRequest12);
    }

    @Test
    public void test17077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17077");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.lang.String str7 = multiShortestPathTree6.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        java.lang.String str14 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        java.lang.String str16 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree1.getOptions();
        int int21 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList19);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test17078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17078");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree8.getPath(vertex9, true);
        int int12 = multiShortestPathTree8.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree8.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree8.getState(vertex14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.lang.String str18 = multiShortestPathTree17.toString();
        int int19 = multiShortestPathTree17.getVertexCount();
        java.lang.String str20 = multiShortestPathTree17.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree17.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        java.lang.String str24 = multiShortestPathTree23.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree23.stateSets;
        multiShortestPathTree17.stateSets = vertexMap25;
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = multiShortestPathTree17.options;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree30 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest29);
        org.opentripplanner.routing.core.RoutingRequest routingRequest31 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree32 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest31);
        java.lang.String str33 = multiShortestPathTree32.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree32.stateSets;
        multiShortestPathTree30.stateSets = vertexMap34;
        multiShortestPathTree28.stateSets = vertexMap34;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection37 = multiShortestPathTree28.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet38 = multiShortestPathTree28.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest39 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree40 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest39);
        java.lang.String str41 = multiShortestPathTree40.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap42 = multiShortestPathTree40.stateSets;
        java.lang.String str43 = multiShortestPathTree40.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap44 = multiShortestPathTree40.stateSets;
        multiShortestPathTree28.stateSets = vertexMap44;
        multiShortestPathTree17.stateSets = vertexMap44;
        multiShortestPathTree8.stateSets = vertexMap44;
        multiShortestPathTree1.stateSets = vertexMap44;
        java.lang.String str49 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection50 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest51 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection52 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap53 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex54 = null;
        org.opentripplanner.routing.core.State state55 = multiShortestPathTree1.getState(vertex54);
        org.opentripplanner.routing.graph.Vertex vertex56 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath58 = multiShortestPathTree1.getPath(vertex56, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MultiSPT(0 vertices)" + "'", str24, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap25);
        org.junit.Assert.assertNull(routingRequest27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MultiSPT(0 vertices)" + "'", str33, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap34);
        org.junit.Assert.assertNotNull(stateCollection37);
        org.junit.Assert.assertNotNull(vertexSet38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "MultiSPT(0 vertices)" + "'", str41, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "MultiSPT(0 vertices)" + "'", str43, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "MultiSPT(0 vertices)" + "'", str49, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection50);
        org.junit.Assert.assertNull(routingRequest51);
        org.junit.Assert.assertNotNull(stateCollection52);
        org.junit.Assert.assertNotNull(vertexMap53);
        org.junit.Assert.assertNull(state55);
        org.junit.Assert.assertNull(graphPath58);
    }

    @Test
    public void test17079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17079");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection4 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state10 = null;
        multiShortestPathTree1.postVisit(state10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree1.getState(vertex15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNotNull(stateCollection4);
        org.junit.Assert.assertNotNull(vertexMap9);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertNull(state16);
    }

    @Test
    public void test17080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17080");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        java.lang.String str9 = multiShortestPathTree8.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree8.stateSets;
        java.lang.String str11 = multiShortestPathTree8.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        java.lang.String str14 = multiShortestPathTree13.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree13.stateSets;
        multiShortestPathTree8.stateSets = vertexMap15;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree8.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        org.opentripplanner.routing.core.State state19 = multiShortestPathTree8.getState(vertex18);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet20 = multiShortestPathTree8.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.core.State state22 = multiShortestPathTree8.getState(vertex21);
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = multiShortestPathTree8.options;
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.core.State state25 = multiShortestPathTree8.getState(vertex24);
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree27 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest26);
        java.lang.String str28 = multiShortestPathTree27.toString();
        int int29 = multiShortestPathTree27.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap30 = multiShortestPathTree27.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet31 = multiShortestPathTree27.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex32 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList34 = multiShortestPathTree27.getPaths(vertex32, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest35 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree36 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest35);
        java.lang.String str37 = multiShortestPathTree36.toString();
        int int38 = multiShortestPathTree36.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap39 = multiShortestPathTree36.stateSets;
        multiShortestPathTree27.stateSets = vertexMap39;
        multiShortestPathTree8.stateSets = vertexMap39;
        org.opentripplanner.routing.graph.Vertex vertex42 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList43 = multiShortestPathTree8.getStates(vertex42);
        org.opentripplanner.routing.core.RoutingRequest routingRequest44 = multiShortestPathTree8.getOptions();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection45 = multiShortestPathTree8.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap46 = multiShortestPathTree8.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest47 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree48 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest47);
        java.lang.String str49 = multiShortestPathTree48.toString();
        int int50 = multiShortestPathTree48.getVertexCount();
        java.lang.String str51 = multiShortestPathTree48.toString();
        org.opentripplanner.routing.core.State state52 = null;
        multiShortestPathTree48.postVisit(state52);
        org.opentripplanner.routing.core.RoutingRequest routingRequest54 = multiShortestPathTree48.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest55 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree56 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest55);
        java.lang.String str57 = multiShortestPathTree56.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap58 = multiShortestPathTree56.stateSets;
        multiShortestPathTree48.stateSets = vertexMap58;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet60 = multiShortestPathTree48.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex61 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath63 = multiShortestPathTree48.getPath(vertex61, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest64 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree65 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest64);
        java.lang.String str66 = multiShortestPathTree65.toString();
        int int67 = multiShortestPathTree65.getVertexCount();
        java.lang.String str68 = multiShortestPathTree65.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection69 = multiShortestPathTree65.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest70 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree71 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest70);
        java.lang.String str72 = multiShortestPathTree71.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap73 = multiShortestPathTree71.stateSets;
        multiShortestPathTree65.stateSets = vertexMap73;
        int int75 = multiShortestPathTree65.getVertexCount();
        java.lang.String str76 = multiShortestPathTree65.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet77 = multiShortestPathTree65.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap78 = multiShortestPathTree65.stateSets;
        multiShortestPathTree48.stateSets = vertexMap78;
        multiShortestPathTree8.stateSets = vertexMap78;
        org.opentripplanner.routing.core.RoutingRequest routingRequest81 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree82 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest81);
        java.lang.String str83 = multiShortestPathTree82.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest84 = multiShortestPathTree82.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet85 = multiShortestPathTree82.getVertices();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet86 = multiShortestPathTree82.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex87 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList88 = multiShortestPathTree82.getStates(vertex87);
        org.opentripplanner.routing.core.State state89 = null;
        multiShortestPathTree82.postVisit(state89);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap91 = multiShortestPathTree82.stateSets;
        int int92 = multiShortestPathTree82.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap93 = multiShortestPathTree82.stateSets;
        multiShortestPathTree8.stateSets = vertexMap93;
        multiShortestPathTree1.stateSets = vertexMap93;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiSPT(0 vertices)" + "'", str9, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap15);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertNull(state19);
        org.junit.Assert.assertNotNull(vertexSet20);
        org.junit.Assert.assertNull(state22);
        org.junit.Assert.assertNull(routingRequest23);
        org.junit.Assert.assertNull(state25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "MultiSPT(0 vertices)" + "'", str28, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(vertexMap30);
        org.junit.Assert.assertNotNull(vertexSet31);
        org.junit.Assert.assertNotNull(graphPathList34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "MultiSPT(0 vertices)" + "'", str37, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(vertexMap39);
        org.junit.Assert.assertNull(stateList43);
        org.junit.Assert.assertNull(routingRequest44);
        org.junit.Assert.assertNotNull(stateCollection45);
        org.junit.Assert.assertNotNull(vertexMap46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "MultiSPT(0 vertices)" + "'", str49, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "MultiSPT(0 vertices)" + "'", str51, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "MultiSPT(0 vertices)" + "'", str57, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap58);
        org.junit.Assert.assertNotNull(vertexSet60);
        org.junit.Assert.assertNull(graphPath63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "MultiSPT(0 vertices)" + "'", str66, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "MultiSPT(0 vertices)" + "'", str68, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection69);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "MultiSPT(0 vertices)" + "'", str72, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "MultiSPT(0 vertices)" + "'", str76, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet77);
        org.junit.Assert.assertNotNull(vertexMap78);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "MultiSPT(0 vertices)" + "'", str83, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest84);
        org.junit.Assert.assertNotNull(vertexSet85);
        org.junit.Assert.assertNotNull(vertexSet86);
        org.junit.Assert.assertNull(stateList88);
        org.junit.Assert.assertNotNull(vertexMap91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(vertexMap93);
    }

    @Test
    public void test17081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17081");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex3 = null;
        org.opentripplanner.routing.core.State state4 = multiShortestPathTree1.getState(vertex3);
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = multiShortestPathTree1.getOptions();
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection13 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, false);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(routingRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(graphPathList12);
        org.junit.Assert.assertNotNull(stateCollection13);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNull(stateList19);
    }

    @Test
    public void test17082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17082");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree0.getVertices();
        int int10 = multiShortestPathTree0.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree0.getPaths(vertex11, false);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        java.lang.String str19 = multiShortestPathTree18.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree18.stateSets;
        multiShortestPathTree16.stateSets = vertexMap20;
        multiShortestPathTree14.stateSets = vertexMap20;
        multiShortestPathTree0.stateSets = vertexMap20;
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree0.getOptions();
        int int25 = multiShortestPathTree0.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = multiShortestPathTree0.getOptions();
        org.opentripplanner.routing.core.State state27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = multiShortestPathTree0.visit(state27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap20);
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(routingRequest26);
    }

    @Test
    public void test17083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17083");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        java.lang.String str11 = multiShortestPathTree10.toString();
        int int12 = multiShortestPathTree10.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree10.stateSets;
        multiShortestPathTree1.stateSets = vertexMap13;
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = multiShortestPathTree1.getOptions();
        java.lang.String str16 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        org.opentripplanner.routing.core.State state21 = multiShortestPathTree1.getState(vertex20);
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet23 = multiShortestPathTree1.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = multiShortestPathTree1.add(state25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vertexMap4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vertexMap13);
        org.junit.Assert.assertNull(routingRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MultiSPT(0 vertices)" + "'", str16, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state18);
        org.junit.Assert.assertNull(routingRequest19);
        org.junit.Assert.assertNull(state21);
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertNotNull(vertexSet23);
        org.junit.Assert.assertNotNull(vertexMap24);
    }

    @Test
    public void test17084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17084");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree1.getPaths(vertex4, true);
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath9 = multiShortestPathTree1.getPath(vertex7, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection11 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree1.stateSets;
        java.lang.Class<?> wildcardClass14 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNotNull(graphPathList6);
        org.junit.Assert.assertNull(graphPath9);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNotNull(stateCollection11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNotNull(vertexMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test17085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17085");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.getOptions();
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        java.lang.String str10 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree1.getPaths(vertex11, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        java.lang.String str19 = multiShortestPathTree18.toString();
        int int20 = multiShortestPathTree18.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree18.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree25 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest24);
        java.lang.String str26 = multiShortestPathTree25.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree25.stateSets;
        multiShortestPathTree23.stateSets = vertexMap27;
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = multiShortestPathTree23.getOptions();
        org.opentripplanner.routing.core.State state30 = null;
        multiShortestPathTree23.postVisit(state30);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap32 = multiShortestPathTree23.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest33 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree34 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest33);
        org.opentripplanner.routing.core.RoutingRequest routingRequest35 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree36 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest35);
        java.lang.String str37 = multiShortestPathTree36.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap38 = multiShortestPathTree36.stateSets;
        multiShortestPathTree34.stateSets = vertexMap38;
        multiShortestPathTree23.stateSets = vertexMap38;
        multiShortestPathTree18.stateSets = vertexMap38;
        multiShortestPathTree1.stateSets = vertexMap38;
        org.opentripplanner.routing.core.State state43 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = multiShortestPathTree1.visit(state43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vertexMap21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MultiSPT(0 vertices)" + "'", str26, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertNull(routingRequest29);
        org.junit.Assert.assertNotNull(vertexMap32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "MultiSPT(0 vertices)" + "'", str37, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap38);
    }

    @Test
    public void test17086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17086");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, true);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree1.stateSets;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList20 = multiShortestPathTree1.getPaths(vertex18, false);
        org.opentripplanner.routing.graph.Vertex vertex21 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath23 = multiShortestPathTree1.getPath(vertex21, false);
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList25 = multiShortestPathTree1.getStates(vertex24);
        org.opentripplanner.routing.graph.Vertex vertex26 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList27 = multiShortestPathTree1.getStates(vertex26);
        org.opentripplanner.routing.core.State state28 = null;
        multiShortestPathTree1.postVisit(state28);
        org.opentripplanner.routing.graph.Vertex vertex30 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList32 = multiShortestPathTree1.getPaths(vertex30, false);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap33 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex34 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath36 = multiShortestPathTree1.getPath(vertex34, false);
        org.opentripplanner.routing.graph.Vertex vertex37 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList39 = multiShortestPathTree1.getPaths(vertex37, true);
        org.opentripplanner.routing.core.State state40 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = multiShortestPathTree1.visit(state40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNotNull(vertexSet15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNotNull(graphPathList20);
        org.junit.Assert.assertNull(graphPath23);
        org.junit.Assert.assertNull(stateList25);
        org.junit.Assert.assertNull(stateList27);
        org.junit.Assert.assertNotNull(graphPathList32);
        org.junit.Assert.assertNotNull(vertexMap33);
        org.junit.Assert.assertNull(graphPath36);
        org.junit.Assert.assertNotNull(graphPathList39);
    }

    @Test
    public void test17087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17087");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.lang.String str4 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList8 = multiShortestPathTree1.getStates(vertex7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList11 = multiShortestPathTree1.getPaths(vertex9, false);
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = multiShortestPathTree1.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree1.stateSets;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(vertexSet6);
        org.junit.Assert.assertNull(stateList8);
        org.junit.Assert.assertNotNull(graphPathList11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(routingRequest13);
        org.junit.Assert.assertNotNull(vertexMap14);
    }

    @Test
    public void test17088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17088");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        org.opentripplanner.routing.core.State state5 = multiShortestPathTree1.getState(vertex4);
        java.lang.String str6 = multiShortestPathTree1.toString();
        int int7 = multiShortestPathTree1.getVertexCount();
        int int8 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiSPT(0 vertices)" + "'", str6, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(routingRequest9);
    }

    @Test
    public void test17089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17089");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree0.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        java.lang.String str13 = multiShortestPathTree12.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree12.stateSets;
        java.lang.String str15 = multiShortestPathTree12.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree12.stateSets;
        multiShortestPathTree0.stateSets = vertexMap16;
        java.lang.String str18 = multiShortestPathTree0.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex20 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList22 = multiShortestPathTree0.getPaths(vertex20, true);
        java.lang.String str23 = multiShortestPathTree0.toString();
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.core.State state25 = multiShortestPathTree0.getState(vertex24);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNotNull(graphPathList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiSPT(0 vertices)" + "'", str23, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(state25);
    }

    @Test
    public void test17090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17090");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, true);
        int int5 = multiShortestPathTree1.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet6 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        java.lang.String str11 = multiShortestPathTree10.toString();
        int int12 = multiShortestPathTree10.getVertexCount();
        java.lang.String str13 = multiShortestPathTree10.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection14 = multiShortestPathTree10.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        java.lang.String str17 = multiShortestPathTree16.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap18 = multiShortestPathTree16.stateSets;
        multiShortestPathTree10.stateSets = vertexMap18;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = multiShortestPathTree10.options;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree25 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest24);
        java.lang.String str26 = multiShortestPathTree25.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree25.stateSets;
        multiShortestPathTree23.stateSets = vertexMap27;
        multiShortestPathTree21.stateSets = vertexMap27;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection30 = multiShortestPathTree21.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet31 = multiShortestPathTree21.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest32 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree33 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest32);
        java.lang.String str34 = multiShortestPathTree33.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap35 = multiShortestPathTree33.stateSets;
        java.lang.String str36 = multiShortestPathTree33.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap37 = multiShortestPathTree33.stateSets;
        multiShortestPathTree21.stateSets = vertexMap37;
        multiShortestPathTree10.stateSets = vertexMap37;
        multiShortestPathTree1.stateSets = vertexMap37;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap41 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex42 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList43 = multiShortestPathTree1.getStates(vertex42);
        org.opentripplanner.routing.core.RoutingRequest routingRequest44 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree45 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest44);
        java.lang.String str46 = multiShortestPathTree45.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap47 = multiShortestPathTree45.stateSets;
        java.lang.String str48 = multiShortestPathTree45.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest49 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree50 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest49);
        java.lang.String str51 = multiShortestPathTree50.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap52 = multiShortestPathTree50.stateSets;
        multiShortestPathTree45.stateSets = vertexMap52;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection54 = multiShortestPathTree45.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex55 = null;
        org.opentripplanner.routing.core.State state56 = multiShortestPathTree45.getState(vertex55);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap57 = multiShortestPathTree45.stateSets;
        multiShortestPathTree1.stateSets = vertexMap57;
        org.opentripplanner.routing.graph.Vertex vertex59 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList61 = multiShortestPathTree1.getPaths(vertex59, true);
        java.lang.String str62 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex63 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath65 = multiShortestPathTree1.getPath(vertex63, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet66 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vertexSet6);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap18);
        org.junit.Assert.assertNull(routingRequest20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MultiSPT(0 vertices)" + "'", str26, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertNotNull(stateCollection30);
        org.junit.Assert.assertNotNull(vertexSet31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "MultiSPT(0 vertices)" + "'", str34, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "MultiSPT(0 vertices)" + "'", str36, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap37);
        org.junit.Assert.assertNotNull(vertexMap41);
        org.junit.Assert.assertNull(stateList43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "MultiSPT(0 vertices)" + "'", str46, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "MultiSPT(0 vertices)" + "'", str48, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "MultiSPT(0 vertices)" + "'", str51, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap52);
        org.junit.Assert.assertNotNull(stateCollection54);
        org.junit.Assert.assertNull(state56);
        org.junit.Assert.assertNotNull(vertexMap57);
        org.junit.Assert.assertNotNull(graphPathList61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "MultiSPT(0 vertices)" + "'", str62, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath65);
        org.junit.Assert.assertNotNull(vertexSet66);
    }

    @Test
    public void test17091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17091");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        int int6 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList9 = multiShortestPathTree1.getPaths(vertex7, true);
        java.lang.String str10 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        int int13 = multiShortestPathTree1.getVertexCount();
        int int14 = multiShortestPathTree1.getVertexCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vertexMap4);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(graphPathList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test17092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17092");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        int int6 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree1.stateSets;
        java.lang.String str10 = multiShortestPathTree1.toString();
        java.lang.Class<?> wildcardClass11 = multiShortestPathTree1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vertexMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiSPT(0 vertices)" + "'", str10, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test17093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17093");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath4 = multiShortestPathTree1.getPath(vertex2, true);
        int int5 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state6 = null;
        multiShortestPathTree1.postVisit(state6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList10 = multiShortestPathTree1.getPaths(vertex8, false);
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, false);
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
        org.junit.Assert.assertNull(graphPath4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(graphPathList10);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertNull(graphPath16);
    }

    @Test
    public void test17094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17094");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree0.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree0.getPath(vertex12, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        java.lang.String str17 = multiShortestPathTree16.toString();
        int int18 = multiShortestPathTree16.getVertexCount();
        java.lang.String str19 = multiShortestPathTree16.toString();
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree16.postVisit(state20);
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree16.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        java.lang.String str25 = multiShortestPathTree24.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree24.stateSets;
        multiShortestPathTree16.stateSets = vertexMap26;
        multiShortestPathTree0.stateSets = vertexMap26;
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList30 = multiShortestPathTree0.getStates(vertex29);
        org.opentripplanner.routing.core.State state31 = null;
        multiShortestPathTree0.postVisit(state31);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection33 = multiShortestPathTree0.getAllStates();
        int int34 = multiShortestPathTree0.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex35 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath37 = multiShortestPathTree0.getPath(vertex35, true);
        java.lang.Class<?> wildcardClass38 = multiShortestPathTree0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexMap9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MultiSPT(0 vertices)" + "'", str25, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap26);
        org.junit.Assert.assertNull(stateList30);
        org.junit.Assert.assertNotNull(stateCollection33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(graphPath37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test17095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17095");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath12 = multiShortestPathTree0.getPath(vertex10, false);
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree0.postVisit(state13);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree0.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree0.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection17 = multiShortestPathTree0.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree0.getOptions();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexMap9);
        org.junit.Assert.assertNull(graphPath12);
        org.junit.Assert.assertNotNull(vertexMap15);
        org.junit.Assert.assertNotNull(vertexMap16);
        org.junit.Assert.assertNotNull(stateCollection17);
        org.junit.Assert.assertNull(routingRequest18);
    }

    @Test
    public void test17096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17096");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.lang.String str7 = multiShortestPathTree6.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        org.opentripplanner.routing.core.State state11 = multiShortestPathTree1.getState(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.core.State state13 = multiShortestPathTree1.getState(vertex12);
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection16 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = multiShortestPathTree1.options;
        int int18 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        org.opentripplanner.routing.core.RoutingRequest routingRequest21 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree22 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest21);
        java.lang.String str23 = multiShortestPathTree22.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap24 = multiShortestPathTree22.stateSets;
        multiShortestPathTree20.stateSets = vertexMap24;
        org.opentripplanner.routing.core.RoutingRequest routingRequest26 = multiShortestPathTree20.getOptions();
        int int27 = multiShortestPathTree20.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest28 = multiShortestPathTree20.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree30 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest29);
        java.lang.String str31 = multiShortestPathTree30.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest32 = multiShortestPathTree30.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest33 = multiShortestPathTree30.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree30.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex35 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList36 = multiShortestPathTree30.getStates(vertex35);
        org.opentripplanner.routing.graph.Vertex vertex37 = null;
        org.opentripplanner.routing.core.State state38 = multiShortestPathTree30.getState(vertex37);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap39 = multiShortestPathTree30.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap40 = multiShortestPathTree30.stateSets;
        multiShortestPathTree20.stateSets = vertexMap40;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection42 = multiShortestPathTree20.getAllStates();
        java.lang.String str43 = multiShortestPathTree20.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap44 = multiShortestPathTree20.stateSets;
        multiShortestPathTree1.stateSets = vertexMap44;
        org.opentripplanner.routing.graph.Vertex vertex46 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList48 = multiShortestPathTree1.getPaths(vertex46, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(stateCollection16);
        org.junit.Assert.assertNull(routingRequest17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiSPT(0 vertices)" + "'", str23, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap24);
        org.junit.Assert.assertNull(routingRequest26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(routingRequest28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "MultiSPT(0 vertices)" + "'", str31, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest32);
        org.junit.Assert.assertNull(routingRequest33);
        org.junit.Assert.assertNotNull(vertexMap34);
        org.junit.Assert.assertNull(stateList36);
        org.junit.Assert.assertNull(state38);
        org.junit.Assert.assertNotNull(vertexMap39);
        org.junit.Assert.assertNotNull(vertexMap40);
        org.junit.Assert.assertNotNull(stateCollection42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "MultiSPT(0 vertices)" + "'", str43, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap44);
        org.junit.Assert.assertNotNull(graphPathList48);
    }

    @Test
    public void test17097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17097");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap3 = multiShortestPathTree1.stateSets;
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        java.lang.String str7 = multiShortestPathTree6.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap8 = multiShortestPathTree6.stateSets;
        multiShortestPathTree1.stateSets = vertexMap8;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection10 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.core.State state12 = multiShortestPathTree1.getState(vertex11);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        java.lang.String str14 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection15 = multiShortestPathTree1.getAllStates();
        int int16 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        java.lang.String str19 = multiShortestPathTree18.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree18.stateSets;
        java.lang.String str21 = multiShortestPathTree18.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        java.lang.String str24 = multiShortestPathTree23.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree23.stateSets;
        multiShortestPathTree18.stateSets = vertexMap25;
        org.opentripplanner.routing.graph.Vertex vertex27 = null;
        org.opentripplanner.routing.core.State state28 = multiShortestPathTree18.getState(vertex27);
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = multiShortestPathTree18.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = multiShortestPathTree18.options;
        org.opentripplanner.routing.graph.Vertex vertex31 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList33 = multiShortestPathTree18.getPaths(vertex31, false);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree34 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest35 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree36 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest35);
        org.opentripplanner.routing.core.RoutingRequest routingRequest37 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree38 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest37);
        java.lang.String str39 = multiShortestPathTree38.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap40 = multiShortestPathTree38.stateSets;
        multiShortestPathTree36.stateSets = vertexMap40;
        multiShortestPathTree34.stateSets = vertexMap40;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap43 = multiShortestPathTree34.stateSets;
        multiShortestPathTree18.stateSets = vertexMap43;
        multiShortestPathTree1.stateSets = vertexMap43;
        org.opentripplanner.routing.core.RoutingRequest routingRequest46 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex47 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList49 = multiShortestPathTree1.getPaths(vertex47, true);
        java.lang.String str50 = multiShortestPathTree1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList51 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap8);
        org.junit.Assert.assertNotNull(stateCollection10);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiSPT(0 vertices)" + "'", str14, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiSPT(0 vertices)" + "'", str21, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MultiSPT(0 vertices)" + "'", str24, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap25);
        org.junit.Assert.assertNull(state28);
        org.junit.Assert.assertNull(routingRequest29);
        org.junit.Assert.assertNull(routingRequest30);
        org.junit.Assert.assertNotNull(graphPathList33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "MultiSPT(0 vertices)" + "'", str39, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap40);
        org.junit.Assert.assertNotNull(vertexMap43);
        org.junit.Assert.assertNull(routingRequest46);
        org.junit.Assert.assertNotNull(graphPathList49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "MultiSPT(0 vertices)" + "'", str50, "MultiSPT(0 vertices)");
    }

    @Test
    public void test17098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17098");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree1.getVertices();
        int int6 = multiShortestPathTree1.getVertexCount();
        org.opentripplanner.routing.core.State state7 = null;
        multiShortestPathTree1.postVisit(state7);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList12 = multiShortestPathTree1.getPaths(vertex10, false);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree1.getStates(vertex14);
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        org.opentripplanner.routing.core.State state17 = multiShortestPathTree1.getState(vertex16);
        org.opentripplanner.routing.graph.Vertex vertex18 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList19 = multiShortestPathTree1.getStates(vertex18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(vertexSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(routingRequest9);
        org.junit.Assert.assertNotNull(graphPathList12);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(stateList15);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNull(stateList19);
    }

    @Test
    public void test17099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17099");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.lang.String str4 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        java.lang.String str8 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        java.lang.String str11 = multiShortestPathTree10.toString();
        int int12 = multiShortestPathTree10.getVertexCount();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree15 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.lang.String str18 = multiShortestPathTree17.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree17.stateSets;
        multiShortestPathTree15.stateSets = vertexMap19;
        multiShortestPathTree13.stateSets = vertexMap19;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet22 = multiShortestPathTree13.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex23 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList24 = multiShortestPathTree13.getStates(vertex23);
        org.opentripplanner.routing.graph.Vertex vertex25 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList26 = multiShortestPathTree13.getStates(vertex25);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree13.stateSets;
        multiShortestPathTree10.stateSets = vertexMap27;
        multiShortestPathTree1.stateSets = vertexMap27;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap30 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state31 = null;
        multiShortestPathTree1.postVisit(state31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList33 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiSPT(0 vertices)" + "'", str8, "MultiSPT(0 vertices)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap19);
        org.junit.Assert.assertNotNull(vertexSet22);
        org.junit.Assert.assertNull(stateList24);
        org.junit.Assert.assertNull(stateList26);
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertNotNull(vertexMap30);
    }

    @Test
    public void test17100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17100");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath13 = multiShortestPathTree1.getPath(vertex11, true);
        int int14 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap15 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex16 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree1.getPaths(vertex16, false);
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        org.opentripplanner.routing.core.State state20 = multiShortestPathTree1.getState(vertex19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNull(graphPath13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vertexMap15);
        org.junit.Assert.assertNotNull(graphPathList18);
        org.junit.Assert.assertNull(state20);
    }

    @Test
    public void test17101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17101");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.State state13 = null;
        multiShortestPathTree1.postVisit(state13);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList16 = multiShortestPathTree1.getStates(vertex15);
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        org.opentripplanner.routing.core.State state18 = multiShortestPathTree1.getState(vertex17);
        java.lang.String str19 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree1.getAllStates();
        java.lang.String str21 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath24 = multiShortestPathTree1.getPath(vertex22, false);
        java.lang.String str25 = multiShortestPathTree1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest7);
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertNull(routingRequest11);
        org.junit.Assert.assertNull(routingRequest12);
        org.junit.Assert.assertNull(stateList16);
        org.junit.Assert.assertNull(state18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiSPT(0 vertices)" + "'", str21, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MultiSPT(0 vertices)" + "'", str25, "MultiSPT(0 vertices)");
    }

    @Test
    public void test17102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17102");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet4 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath8 = multiShortestPathTree1.getPath(vertex6, true);
        org.opentripplanner.routing.core.State state9 = null;
        multiShortestPathTree1.postVisit(state9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNotNull(vertexSet4);
        org.junit.Assert.assertNull(routingRequest5);
        org.junit.Assert.assertNull(graphPath8);
    }

    @Test
    public void test17103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17103");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.lang.String str4 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.State state5 = null;
        multiShortestPathTree1.postVisit(state5);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree8.getPath(vertex9, true);
        int int12 = multiShortestPathTree8.getVertexCount();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet13 = multiShortestPathTree8.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex14 = null;
        org.opentripplanner.routing.core.State state15 = multiShortestPathTree8.getState(vertex14);
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree17 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest16);
        java.lang.String str18 = multiShortestPathTree17.toString();
        int int19 = multiShortestPathTree17.getVertexCount();
        java.lang.String str20 = multiShortestPathTree17.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection21 = multiShortestPathTree17.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        java.lang.String str24 = multiShortestPathTree23.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree23.stateSets;
        multiShortestPathTree17.stateSets = vertexMap25;
        org.opentripplanner.routing.core.RoutingRequest routingRequest27 = multiShortestPathTree17.options;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest29 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree30 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest29);
        org.opentripplanner.routing.core.RoutingRequest routingRequest31 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree32 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest31);
        java.lang.String str33 = multiShortestPathTree32.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap34 = multiShortestPathTree32.stateSets;
        multiShortestPathTree30.stateSets = vertexMap34;
        multiShortestPathTree28.stateSets = vertexMap34;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection37 = multiShortestPathTree28.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet38 = multiShortestPathTree28.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest39 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree40 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest39);
        java.lang.String str41 = multiShortestPathTree40.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap42 = multiShortestPathTree40.stateSets;
        java.lang.String str43 = multiShortestPathTree40.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap44 = multiShortestPathTree40.stateSets;
        multiShortestPathTree28.stateSets = vertexMap44;
        multiShortestPathTree17.stateSets = vertexMap44;
        multiShortestPathTree8.stateSets = vertexMap44;
        multiShortestPathTree1.stateSets = vertexMap44;
        java.lang.String str49 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection50 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest51 = multiShortestPathTree1.options;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection52 = multiShortestPathTree1.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap53 = multiShortestPathTree1.stateSets;
        java.lang.String str54 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex55 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath57 = multiShortestPathTree1.getPath(vertex55, false);
        org.opentripplanner.routing.core.State state58 = null;
        multiShortestPathTree1.postVisit(state58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vertexSet13);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiSPT(0 vertices)" + "'", str18, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MultiSPT(0 vertices)" + "'", str24, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap25);
        org.junit.Assert.assertNull(routingRequest27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MultiSPT(0 vertices)" + "'", str33, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap34);
        org.junit.Assert.assertNotNull(stateCollection37);
        org.junit.Assert.assertNotNull(vertexSet38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "MultiSPT(0 vertices)" + "'", str41, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "MultiSPT(0 vertices)" + "'", str43, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "MultiSPT(0 vertices)" + "'", str49, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection50);
        org.junit.Assert.assertNull(routingRequest51);
        org.junit.Assert.assertNotNull(stateCollection52);
        org.junit.Assert.assertNotNull(vertexMap53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "MultiSPT(0 vertices)" + "'", str54, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath57);
    }

    @Test
    public void test17104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17104");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = multiShortestPathTree0.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        java.lang.String str13 = multiShortestPathTree12.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest14 = multiShortestPathTree12.options;
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        org.opentripplanner.routing.core.State state16 = multiShortestPathTree12.getState(vertex15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        org.opentripplanner.routing.core.RoutingRequest routingRequest19 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree20 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest19);
        java.lang.String str21 = multiShortestPathTree20.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap22 = multiShortestPathTree20.stateSets;
        multiShortestPathTree18.stateSets = vertexMap22;
        org.opentripplanner.routing.core.RoutingRequest routingRequest24 = multiShortestPathTree18.getOptions();
        org.opentripplanner.routing.core.State state25 = null;
        multiShortestPathTree18.postVisit(state25);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap27 = multiShortestPathTree18.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest28 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree29 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest28);
        org.opentripplanner.routing.core.RoutingRequest routingRequest30 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree31 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest30);
        java.lang.String str32 = multiShortestPathTree31.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap33 = multiShortestPathTree31.stateSets;
        multiShortestPathTree29.stateSets = vertexMap33;
        multiShortestPathTree18.stateSets = vertexMap33;
        multiShortestPathTree12.stateSets = vertexMap33;
        multiShortestPathTree0.stateSets = vertexMap33;
        org.opentripplanner.routing.core.State state38 = null;
        multiShortestPathTree0.postVisit(state38);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap40 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest41 = multiShortestPathTree0.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest42 = multiShortestPathTree0.getOptions();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertNull(routingRequest10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest14);
        org.junit.Assert.assertNull(state16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiSPT(0 vertices)" + "'", str21, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap22);
        org.junit.Assert.assertNull(routingRequest24);
        org.junit.Assert.assertNotNull(vertexMap27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MultiSPT(0 vertices)" + "'", str32, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap33);
        org.junit.Assert.assertNotNull(vertexMap40);
        org.junit.Assert.assertNull(routingRequest41);
        org.junit.Assert.assertNull(routingRequest42);
    }

    @Test
    public void test17105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17105");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.lang.String str4 = multiShortestPathTree3.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree3.stateSets;
        multiShortestPathTree1.stateSets = vertexMap5;
        java.lang.String str7 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, true);
        int int11 = multiShortestPathTree1.getVertexCount();
        int int12 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.core.State state14 = null;
        multiShortestPathTree1.postVisit(state14);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet16 = multiShortestPathTree1.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiSPT(0 vertices)" + "'", str7, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(graphPath10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vertexMap13);
        org.junit.Assert.assertNotNull(vertexSet16);
        org.junit.Assert.assertNotNull(graphPathList19);
    }

    @Test
    public void test17106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17106");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        java.lang.String str11 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        java.lang.String str17 = multiShortestPathTree16.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree16.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree16.stateSets;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree16.stateSets;
        multiShortestPathTree1.stateSets = vertexMap20;
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList24 = multiShortestPathTree1.getPaths(vertex22, true);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiSPT(0 vertices)" + "'", str11, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(graphPathList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNotNull(vertexMap19);
        org.junit.Assert.assertNotNull(vertexMap20);
        org.junit.Assert.assertNotNull(graphPathList24);
    }

    @Test
    public void test17107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17107");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection9 = multiShortestPathTree0.getAllStates();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet10 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        java.lang.String str13 = multiShortestPathTree12.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree12.stateSets;
        java.lang.String str15 = multiShortestPathTree12.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree12.stateSets;
        multiShortestPathTree0.stateSets = vertexMap16;
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree0.options;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet19 = multiShortestPathTree0.getVertices();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection20 = multiShortestPathTree0.getAllStates();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap21 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex22 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList24 = multiShortestPathTree0.getPaths(vertex22, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(stateCollection9);
        org.junit.Assert.assertNotNull(vertexSet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap16);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNotNull(vertexSet19);
        org.junit.Assert.assertNotNull(stateCollection20);
        org.junit.Assert.assertNotNull(vertexMap21);
        org.junit.Assert.assertNotNull(graphPathList24);
    }

    @Test
    public void test17108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17108");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.lang.String str4 = multiShortestPathTree1.toString();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection6 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex7 = null;
        org.opentripplanner.routing.core.State state8 = multiShortestPathTree1.getState(vertex7);
        org.opentripplanner.routing.graph.Vertex vertex9 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree1.getPath(vertex9, false);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList14 = multiShortestPathTree1.getPaths(vertex12, true);
        org.opentripplanner.routing.graph.Vertex vertex15 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList17 = multiShortestPathTree1.getPaths(vertex15, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest18 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex19 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList21 = multiShortestPathTree1.getPaths(vertex19, false);
        java.lang.String str22 = multiShortestPathTree1.toString();
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet23 = multiShortestPathTree1.getVertices();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiSPT(0 vertices)" + "'", str4, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(stateCollection6);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(graphPath11);
        org.junit.Assert.assertNotNull(graphPathList14);
        org.junit.Assert.assertNotNull(graphPathList17);
        org.junit.Assert.assertNull(routingRequest18);
        org.junit.Assert.assertNotNull(graphPathList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiSPT(0 vertices)" + "'", str22, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexSet23);
    }

    @Test
    public void test17109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17109");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet9 = multiShortestPathTree0.getVertices();
        int int10 = multiShortestPathTree0.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList13 = multiShortestPathTree0.getPaths(vertex11, false);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        org.opentripplanner.routing.core.RoutingRequest routingRequest17 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree18 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest17);
        java.lang.String str19 = multiShortestPathTree18.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap20 = multiShortestPathTree18.stateSets;
        multiShortestPathTree16.stateSets = vertexMap20;
        multiShortestPathTree14.stateSets = vertexMap20;
        multiShortestPathTree0.stateSets = vertexMap20;
        org.opentripplanner.routing.graph.Vertex vertex24 = null;
        org.opentripplanner.routing.core.State state25 = multiShortestPathTree0.getState(vertex24);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree0.stateSets;
        int int27 = multiShortestPathTree0.getVertexCount();
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList30 = multiShortestPathTree0.getPaths(vertex28, true);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection31 = multiShortestPathTree0.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex32 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath34 = multiShortestPathTree0.getPath(vertex32, true);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet35 = multiShortestPathTree0.getVertices();
        org.opentripplanner.routing.graph.Vertex vertex36 = null;
        org.opentripplanner.routing.core.State state37 = multiShortestPathTree0.getState(vertex36);
        org.opentripplanner.routing.graph.Vertex vertex38 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList40 = multiShortestPathTree0.getPaths(vertex38, true);
        org.opentripplanner.routing.core.State state41 = null;
        multiShortestPathTree0.postVisit(state41);
        org.opentripplanner.routing.graph.Vertex vertex43 = null;
        org.opentripplanner.routing.core.State state44 = multiShortestPathTree0.getState(vertex43);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(graphPathList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap20);
        org.junit.Assert.assertNull(state25);
        org.junit.Assert.assertNotNull(vertexMap26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(graphPathList30);
        org.junit.Assert.assertNotNull(stateCollection31);
        org.junit.Assert.assertNull(graphPath34);
        org.junit.Assert.assertNotNull(vertexSet35);
        org.junit.Assert.assertNull(state37);
        org.junit.Assert.assertNotNull(graphPathList40);
        org.junit.Assert.assertNull(state44);
    }

    @Test
    public void test17110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17110");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree1.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap5 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList7 = multiShortestPathTree1.getStates(vertex6);
        org.opentripplanner.routing.graph.Vertex vertex8 = null;
        org.opentripplanner.routing.core.State state9 = multiShortestPathTree1.getState(vertex8);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap10 = multiShortestPathTree1.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex11 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList12 = multiShortestPathTree1.getStates(vertex11);
        org.opentripplanner.routing.graph.Vertex vertex13 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList14 = multiShortestPathTree1.getStates(vertex13);
        java.lang.String str15 = multiShortestPathTree1.toString();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree1.options;
        org.opentripplanner.routing.graph.Vertex vertex17 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList19 = multiShortestPathTree1.getPaths(vertex17, false);
        java.lang.String str20 = multiShortestPathTree1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest3);
        org.junit.Assert.assertNull(routingRequest4);
        org.junit.Assert.assertNotNull(vertexMap5);
        org.junit.Assert.assertNull(stateList7);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(vertexMap10);
        org.junit.Assert.assertNull(stateList12);
        org.junit.Assert.assertNull(stateList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiSPT(0 vertices)" + "'", str15, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNotNull(graphPathList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MultiSPT(0 vertices)" + "'", str20, "MultiSPT(0 vertices)");
    }

    @Test
    public void test17111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17111");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.lang.String str2 = multiShortestPathTree1.toString();
        int int3 = multiShortestPathTree1.getVertexCount();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap4 = multiShortestPathTree1.stateSets;
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection5 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.graph.Vertex vertex6 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList8 = multiShortestPathTree1.getPaths(vertex6, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest11);
        java.lang.String str13 = multiShortestPathTree12.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap14 = multiShortestPathTree12.stateSets;
        multiShortestPathTree10.stateSets = vertexMap14;
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = multiShortestPathTree10.getOptions();
        org.opentripplanner.routing.core.State state17 = null;
        multiShortestPathTree10.postVisit(state17);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap19 = multiShortestPathTree10.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest22);
        java.lang.String str24 = multiShortestPathTree23.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap25 = multiShortestPathTree23.stateSets;
        multiShortestPathTree21.stateSets = vertexMap25;
        multiShortestPathTree10.stateSets = vertexMap25;
        org.opentripplanner.routing.graph.Vertex vertex28 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList29 = multiShortestPathTree10.getStates(vertex28);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap30 = multiShortestPathTree10.stateSets;
        multiShortestPathTree1.stateSets = vertexMap30;
        org.opentripplanner.routing.graph.Vertex vertex32 = null;
        org.opentripplanner.routing.core.State state33 = multiShortestPathTree1.getState(vertex32);
        org.opentripplanner.routing.graph.Vertex vertex34 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath36 = multiShortestPathTree1.getPath(vertex34, true);
        org.opentripplanner.routing.graph.Vertex vertex37 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList38 = multiShortestPathTree1.getStates(vertex37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MultiSPT(0 vertices)" + "'", str2, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vertexMap4);
        org.junit.Assert.assertNotNull(stateCollection5);
        org.junit.Assert.assertNotNull(graphPathList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiSPT(0 vertices)" + "'", str13, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap14);
        org.junit.Assert.assertNull(routingRequest16);
        org.junit.Assert.assertNotNull(vertexMap19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MultiSPT(0 vertices)" + "'", str24, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap25);
        org.junit.Assert.assertNull(stateList29);
        org.junit.Assert.assertNotNull(vertexMap30);
        org.junit.Assert.assertNull(state33);
        org.junit.Assert.assertNull(graphPath36);
        org.junit.Assert.assertNull(stateList38);
    }

    @Test
    public void test17112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17112");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree2 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest1);
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest3);
        java.lang.String str5 = multiShortestPathTree4.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap6 = multiShortestPathTree4.stateSets;
        multiShortestPathTree2.stateSets = vertexMap6;
        multiShortestPathTree0.stateSets = vertexMap6;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap9 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex10 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList11 = multiShortestPathTree0.getStates(vertex10);
        org.opentripplanner.routing.graph.Vertex vertex12 = null;
        org.opentripplanner.routing.spt.GraphPath graphPath14 = multiShortestPathTree0.getPath(vertex12, true);
        org.opentripplanner.routing.core.RoutingRequest routingRequest15 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree16 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest15);
        java.lang.String str17 = multiShortestPathTree16.toString();
        int int18 = multiShortestPathTree16.getVertexCount();
        java.lang.String str19 = multiShortestPathTree16.toString();
        org.opentripplanner.routing.core.State state20 = null;
        multiShortestPathTree16.postVisit(state20);
        org.opentripplanner.routing.core.RoutingRequest routingRequest22 = multiShortestPathTree16.options;
        org.opentripplanner.routing.core.RoutingRequest routingRequest23 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest23);
        java.lang.String str25 = multiShortestPathTree24.toString();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap26 = multiShortestPathTree24.stateSets;
        multiShortestPathTree16.stateSets = vertexMap26;
        multiShortestPathTree0.stateSets = vertexMap26;
        org.opentripplanner.routing.graph.Vertex vertex29 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList30 = multiShortestPathTree0.getStates(vertex29);
        org.opentripplanner.routing.core.State state31 = null;
        multiShortestPathTree0.postVisit(state31);
        org.opentripplanner.routing.graph.Vertex vertex33 = null;
        org.opentripplanner.routing.core.State state34 = multiShortestPathTree0.getState(vertex33);
        org.opentripplanner.routing.graph.Vertex vertex35 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList37 = multiShortestPathTree0.getPaths(vertex35, false);
        org.opentripplanner.routing.graph.Vertex vertex38 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList39 = multiShortestPathTree0.getStates(vertex38);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap40 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.graph.Vertex vertex41 = null;
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList43 = multiShortestPathTree0.getPaths(vertex41, true);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap44 = multiShortestPathTree0.stateSets;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList45 = multiShortestPathTree0.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiSPT(0 vertices)" + "'", str5, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap6);
        org.junit.Assert.assertNotNull(vertexMap9);
        org.junit.Assert.assertNull(stateList11);
        org.junit.Assert.assertNull(graphPath14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiSPT(0 vertices)" + "'", str17, "MultiSPT(0 vertices)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MultiSPT(0 vertices)" + "'", str19, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNull(routingRequest22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MultiSPT(0 vertices)" + "'", str25, "MultiSPT(0 vertices)");
        org.junit.Assert.assertNotNull(vertexMap26);
        org.junit.Assert.assertNull(stateList30);
        org.junit.Assert.assertNull(state34);
        org.junit.Assert.assertNotNull(graphPathList37);
        org.junit.Assert.assertNull(stateList39);
        org.junit.Assert.assertNotNull(vertexMap40);
        org.junit.Assert.assertNotNull(graphPathList43);
        org.junit.Assert.assertNotNull(vertexMap44);
    }
}

