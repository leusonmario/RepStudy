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
        retrofit.Profiler profiler2 = builder0.profiler;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor4 = builder0.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel5 = builder0.logLevel;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.callbackExecutor;
        retrofit.Profiler profiler2 = builder0.profiler;
        retrofit.RestAdapter.Builder builder4 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.LogLevel logLevel5 = builder0.logLevel;
        retrofit.RestAdapter.Log log6 = builder0.log;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.converter.Converter converter2 = builder0.converter;
        retrofit.RestAdapter.Log log3 = builder0.log;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder5 = builder0.setServer("");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        retrofit.RestAdapter restAdapter0 = new retrofit.RestAdapter();
        retrofit.RestAdapter.RestHandler restHandler1 = restAdapter0.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel2 = restAdapter0.logLevel;
        retrofit.ErrorHandler errorHandler3 = restAdapter0.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel4 = restAdapter0.logLevel;
        retrofit.Server server5 = restAdapter0.server;
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.FULL;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        restAdapter0.setLogLevel(logLevel6);
    }
}

