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
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer(server2);
        builder3.ensureSaneDefaults();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder6 = builder3.setServer("");
    }
}

