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
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider4 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.Long long6 = serializedObjectSupporter5.deserializeObjectLong3();
        java.lang.Class class7 = serializedObjectSupporter5.deserializeObjectClass1();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter5.deserializeObjectConverter2();
        java.lang.Long long10 = serializedObjectSupporter5.deserializeObjectLong3();
        retrofit.Server server11 = serializedObjectSupporter5.deserializeObjectServer1();
        builder0.server = server11;
        retrofit.client.Client.Provider provider13 = builder0.clientProvider;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder15 = builder0.setServer("");
    }
}

