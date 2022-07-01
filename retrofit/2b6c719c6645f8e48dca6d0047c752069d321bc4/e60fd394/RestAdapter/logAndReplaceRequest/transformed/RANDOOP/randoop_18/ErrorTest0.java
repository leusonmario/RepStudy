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
        retrofit.ErrorHandler errorHandler1 = restAdapter0.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler2 = restAdapter0.new RestHandler();
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor4 = builder3.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder6 = builder3.setLogLevel(logLevel5);
        boolean boolean7 = logLevel5.log();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        restAdapter0.setLogLevel(logLevel5);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.Profiler profiler2 = builder0.profiler;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("");
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
        java.util.concurrent.Executor executor10 = builder0.callbackExecutor;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder12 = builder0.setServer("");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.Profiler profiler2 = builder0.profiler;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        retrofit.RestAdapter.Log log5 = builder0.log;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel3 = builder0.logLevel;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("");
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        retrofit.converter.Converter converter2 = builder0.converter;
        retrofit.Profiler profiler3 = builder0.profiler;
        retrofit.converter.Converter converter4 = builder0.converter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("");
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.Profiler profiler2 = builder0.profiler;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor4 = builder0.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor5 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor6 = builder0.httpExecutor;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("");
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        retrofit.client.Client.Provider provider2 = builder0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel3 = builder0.logLevel;
        retrofit.converter.Converter converter4 = builder0.converter;
        retrofit.Server server5 = builder0.server;
        builder0.ensureSaneDefaults();
        java.util.concurrent.Executor executor7 = builder0.callbackExecutor;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder9 = builder0.setServer("");
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = builder0.server;
        retrofit.RestAdapter.LogLevel logLevel2 = builder0.logLevel;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder4 = builder0.setServer("");
    }
}

