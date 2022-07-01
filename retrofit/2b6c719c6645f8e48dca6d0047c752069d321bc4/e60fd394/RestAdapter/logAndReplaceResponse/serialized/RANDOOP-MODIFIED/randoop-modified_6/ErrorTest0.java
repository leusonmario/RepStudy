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
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor3 = builder2.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        java.lang.Long long5 = serializedObjectSupporter4.deserializeObjectLong4();
        retrofit.RequestInterceptor requestInterceptor6 = serializedObjectSupporter4.deserializeObjectRequestInterceptor1();
        retrofit.RequestInterceptor requestInterceptor7 = serializedObjectSupporter4.deserializeObjectRequestInterceptor1();
        builder2.requestInterceptor = requestInterceptor7;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder10 = builder2.setServer("");
    }
}

