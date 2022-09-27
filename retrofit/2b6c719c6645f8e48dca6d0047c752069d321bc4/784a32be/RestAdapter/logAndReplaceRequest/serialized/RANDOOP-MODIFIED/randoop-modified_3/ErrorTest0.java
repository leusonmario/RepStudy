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
        retrofit.client.Request request2 = serializedObjectSupporter1.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter1.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter1.deserializeObjectConverter8();
        retrofit.RestAdapter.Builder builder5 = builder0.setConverter((retrofit.converter.Converter) gsonConverter4);
        builder0.ensureSaneDefaults();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("");
    }
}

