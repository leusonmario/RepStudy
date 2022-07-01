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
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.client.Request request5 = requestBuilder4.build();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder11 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.client.Request request12 = requestBuilder11.build();
    }
}

