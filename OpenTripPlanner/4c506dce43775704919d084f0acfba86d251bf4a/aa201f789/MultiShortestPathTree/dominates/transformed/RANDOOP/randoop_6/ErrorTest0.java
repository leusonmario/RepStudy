import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection1 = multiShortestPathTree0.getAllStates();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        multiShortestPathTree0.dump();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList1 = multiShortestPathTree0.getPaths();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree0 = new org.opentripplanner.routing.spt.MultiShortestPathTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet1 = multiShortestPathTree0.getVertices();
    }
}

