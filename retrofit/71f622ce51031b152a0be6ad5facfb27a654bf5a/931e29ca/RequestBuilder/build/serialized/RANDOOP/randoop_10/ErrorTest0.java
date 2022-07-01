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
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.Converter converter4 = requestBuilder3.converter;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = requestBuilder5.buildRelativeUrl();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = requestBuilder2.converter;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = requestBuilder4.buildRelativeUrl();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.Converter converter7 = requestBuilder6.converter;
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder(converter7);
        java.lang.String str9 = requestBuilder8.getapiUrl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.mime.TypedOutput typedOutput10 = requestBuilder8.buildBody();
    }
}

