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
        retrofit.RestAdapter restAdapter0 = new retrofit.RestAdapter();
        retrofit.RestAdapter.Log log1 = restAdapter0.log;
        java.util.concurrent.Executor executor2 = restAdapter0.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        restAdapter0.setLogLevel(logLevel3);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.converter.Converter converter1 = builder0.converter;
        retrofit.RestAdapter.LogLevel logLevel2 = builder0.logLevel;
        builder0.ensureSaneDefaults();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        retrofit.RestAdapter restAdapter0 = new retrofit.RestAdapter();
        retrofit.RestAdapter.Log log1 = restAdapter0.log;
        java.util.concurrent.Executor executor2 = restAdapter0.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.BASIC;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        restAdapter0.setLogLevel(logLevel3);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.RestAdapter.Log log2 = builder0.log;
        retrofit.Server server3 = builder0.server;
        retrofit.converter.Converter converter4 = builder0.converter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.RestAdapter.Log log2 = builder0.log;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder4 = builder0.setServer("");
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor2 = builder0.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor3 = builder0.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor4 = builder0.requestInterceptor;
        retrofit.client.Client.Provider provider5 = builder0.clientProvider;
        retrofit.ErrorHandler errorHandler6 = builder0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel7 = builder0.logLevel;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder9 = builder0.setServer("");
    }
}

