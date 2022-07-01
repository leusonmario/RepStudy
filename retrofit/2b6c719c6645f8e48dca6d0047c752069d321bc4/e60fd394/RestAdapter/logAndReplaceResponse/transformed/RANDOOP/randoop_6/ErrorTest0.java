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
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.ErrorHandler errorHandler3 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        builder4.ensureSaneDefaults();
        retrofit.client.Client.Provider provider6 = builder4.clientProvider;
        retrofit.ErrorHandler errorHandler7 = builder4.errorHandler;
        retrofit.RestAdapter.Builder builder8 = builder0.setErrorHandler(errorHandler7);
        retrofit.converter.Converter converter9 = builder0.converter;
        retrofit.converter.Converter converter10 = builder0.converter;
        retrofit.client.Client.Provider provider11 = builder0.clientProvider;
        retrofit.RestAdapter.Builder builder13 = builder0.setServer("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder15 = builder0.setServer("");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.ErrorHandler errorHandler3 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        builder4.ensureSaneDefaults();
        retrofit.client.Client.Provider provider6 = builder4.clientProvider;
        retrofit.ErrorHandler errorHandler7 = builder4.errorHandler;
        retrofit.RestAdapter.Builder builder8 = builder0.setErrorHandler(errorHandler7);
        retrofit.converter.Converter converter9 = builder0.converter;
        retrofit.converter.Converter converter10 = builder0.converter;
        retrofit.client.Client.Provider provider11 = builder0.clientProvider;
        retrofit.RestAdapter.Builder builder13 = builder0.setServer("hi!");
        retrofit.RestAdapter restAdapter14 = builder0.build();
        retrofit.RequestInterceptor requestInterceptor15 = builder0.requestInterceptor;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder17 = builder0.setServer("");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.ErrorHandler errorHandler3 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        builder4.ensureSaneDefaults();
        retrofit.client.Client.Provider provider6 = builder4.clientProvider;
        retrofit.ErrorHandler errorHandler7 = builder4.errorHandler;
        retrofit.RestAdapter.Builder builder8 = builder0.setErrorHandler(errorHandler7);
        retrofit.converter.Converter converter9 = builder0.converter;
        retrofit.converter.Converter converter10 = builder0.converter;
        retrofit.client.Client.Provider provider11 = builder0.clientProvider;
        retrofit.RestAdapter.Builder builder13 = builder0.setServer("hi!");
        retrofit.RequestInterceptor requestInterceptor14 = builder0.requestInterceptor;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        builder15.ensureSaneDefaults();
        retrofit.client.Client.Provider provider17 = builder15.clientProvider;
        retrofit.ErrorHandler errorHandler18 = builder15.errorHandler;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        builder19.ensureSaneDefaults();
        retrofit.client.Client.Provider provider21 = builder19.clientProvider;
        retrofit.ErrorHandler errorHandler22 = builder19.errorHandler;
        retrofit.RestAdapter.Builder builder23 = builder15.setErrorHandler(errorHandler22);
        retrofit.converter.Converter converter24 = builder15.converter;
        retrofit.converter.Converter converter25 = builder15.converter;
        retrofit.client.Client.Provider provider26 = builder15.clientProvider;
        retrofit.RestAdapter.Builder builder27 = builder0.setClient(provider26);
        retrofit.client.Client.Provider provider28 = builder0.clientProvider;
        retrofit.RestAdapter restAdapter29 = builder0.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder31 = builder0.setServer("");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        retrofit.RestAdapter.Log log3 = builder0.log;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("");
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder3 = builder0.setLogLevel(logLevel2);
        builder0.ensureSaneDefaults();
        retrofit.RequestInterceptor requestInterceptor5 = builder0.requestInterceptor;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("");
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.ErrorHandler errorHandler3 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        builder4.ensureSaneDefaults();
        retrofit.client.Client.Provider provider6 = builder4.clientProvider;
        retrofit.ErrorHandler errorHandler7 = builder4.errorHandler;
        retrofit.RestAdapter.Builder builder8 = builder0.setErrorHandler(errorHandler7);
        retrofit.converter.Converter converter9 = builder0.converter;
        retrofit.RestAdapter.Log log10 = builder0.log;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder12 = builder0.setServer("");
    }
}

