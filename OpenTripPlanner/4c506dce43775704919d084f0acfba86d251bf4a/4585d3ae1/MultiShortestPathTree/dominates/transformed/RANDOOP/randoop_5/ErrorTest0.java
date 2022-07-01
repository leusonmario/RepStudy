import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = multiShortestPathTree0.getVertexCount();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = multiShortestPathTree0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = multiShortestPathTree0.toString();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = multiShortestPathTree0.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.getOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = multiShortestPathTree0.getVertexCount();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = multiShortestPathTree0.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree0.stateSets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = multiShortestPathTree0.toString();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = multiShortestPathTree0.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree0.stateSets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList3 = multiShortestPathTree0.getPaths();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet1 = multiShortestPathTree0.getVertices();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = multiShortestPathTree0.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree0.stateSets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection3 = multiShortestPathTree0.getAllStates();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = multiShortestPathTree0.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet5 = multiShortestPathTree0.getVertices();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = multiShortestPathTree0.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree0.stateSets;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = multiShortestPathTree0.getOptions();
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = multiShortestPathTree0.toString();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = multiShortestPathTree0.options;
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = multiShortestPathTree0.stateSets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet3 = multiShortestPathTree0.getVertices();
    }
}

