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
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder4 = builder0.setServer("");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder4 = builder0.setConverter((retrofit.converter.Converter) gsonConverter3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder11 = builder7.setConverter((retrofit.converter.Converter) gsonConverter10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString9();
        builder7.serializedObjectSupporter = serializedObjectSupporter12;
        builder7.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder7.clientProvider;
        builder6.clientProvider = provider16;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString9();
        java.lang.Long long20 = serializedObjectSupporter18.deserializeObjectLong3();
        java.lang.Long long21 = serializedObjectSupporter18.deserializeObjectLong1();
        retrofit.client.Response response22 = serializedObjectSupporter18.deserializeObjectResponse4();
        builder6.serializedObjectSupporter = serializedObjectSupporter18;
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder25 = builder6.setLogLevel(logLevel24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder27 = builder25.setServer("");
    }
}

