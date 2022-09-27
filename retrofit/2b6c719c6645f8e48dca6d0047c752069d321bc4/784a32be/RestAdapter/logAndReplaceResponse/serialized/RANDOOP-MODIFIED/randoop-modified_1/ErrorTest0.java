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
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response5 = serializedObjectSupporter4.deserializeObjectResponse7();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter4.deserializeObjectConverter2();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString11();
        java.lang.Long long8 = serializedObjectSupporter4.deserializeObjectLong7();
        retrofit.RequestInterceptor requestInterceptor9 = serializedObjectSupporter4.deserializeObjectRequestInterceptor1();
        retrofit.RestAdapter.Builder builder10 = builder0.setRequestInterceptor(requestInterceptor9);
        retrofit.converter.Converter converter11 = builder10.converter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder13 = builder10.setServer("");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.mime.TypedString typedString3 = serializedObjectSupporter1.deserializeObjectTypedInput1();
        retrofit.client.Response response4 = serializedObjectSupporter1.deserializeObjectResponse8();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter1.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("");
    }
}

