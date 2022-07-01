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
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder3.getheaders();
        retrofit.converter.Converter converter5 = requestBuilder3.getconverter();
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder(converter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.client.Request request7 = requestBuilder6.build();
    }
}

