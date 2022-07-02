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
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1295();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1569();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState656();
        org.opentripplanner.routing.core.State state5 = state4.reversedClone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = state5.getBackDirection();
    }
}

