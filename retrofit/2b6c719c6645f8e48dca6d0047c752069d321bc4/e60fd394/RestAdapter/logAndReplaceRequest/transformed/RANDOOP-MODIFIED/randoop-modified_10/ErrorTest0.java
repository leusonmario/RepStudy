import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        retrofit.RestAdapter restAdapter0 = new retrofit.RestAdapter();
        java.util.concurrent.Executor executor1 = restAdapter0.callbackExecutor;
        retrofit.RestAdapter restAdapter2 = new retrofit.RestAdapter();
        java.util.concurrent.Executor executor3 = restAdapter2.callbackExecutor;
        java.util.concurrent.Executor executor4 = restAdapter2.callbackExecutor;
        retrofit.RestAdapter restAdapter5 = new retrofit.RestAdapter();
        retrofit.ErrorHandler errorHandler6 = restAdapter5.errorHandler;
        retrofit.Server server9 = new retrofit.Server("", "");
        restAdapter5.server = server9;
        restAdapter2.server = server9;
        restAdapter0.server = server9;
        retrofit.Profiler profiler13 = restAdapter0.profiler;
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.NONE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        restAdapter0.setLogLevel(logLevel14);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        retrofit.RestAdapter restAdapter0 = new retrofit.RestAdapter();
        java.util.concurrent.Executor executor1 = restAdapter0.callbackExecutor;
        java.util.concurrent.Executor executor2 = restAdapter0.callbackExecutor;
        retrofit.RestAdapter restAdapter3 = new retrofit.RestAdapter();
        retrofit.ErrorHandler errorHandler4 = restAdapter3.errorHandler;
        retrofit.Server server7 = new retrofit.Server("", "");
        restAdapter3.server = server7;
        restAdapter0.server = server7;
        retrofit.RestAdapter.LogLevel logLevel10 = restAdapter0.logLevel;
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.FULL;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        restAdapter0.setLogLevel(logLevel11);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        java.util.concurrent.Executor executor2 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder4 = builder0.setServer("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        retrofit.RestAdapter restAdapter0 = new retrofit.RestAdapter();
        retrofit.RestAdapter.RestHandler restHandler1 = restAdapter0.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel2 = restAdapter0.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler3 = restAdapter0.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.HEADERS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        restAdapter0.setLogLevel(logLevel4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.Server server4 = new retrofit.Server("", "");
        builder0.server = server4;
        retrofit.RestAdapter.LogLevel logLevel6 = builder0.logLevel;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        retrofit.RestAdapter restAdapter0 = new retrofit.RestAdapter();
        java.util.concurrent.Executor executor1 = restAdapter0.callbackExecutor;
        retrofit.RestAdapter.RestHandler restHandler2 = restAdapter0.new RestHandler();
        retrofit.Server server5 = new retrofit.Server("hi!", "hi!");
        restAdapter0.server = server5;
        retrofit.RequestInterceptor requestInterceptor7 = restAdapter0.requestInterceptor;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler9 = builder8.errorHandler;
        retrofit.ErrorHandler errorHandler10 = builder8.errorHandler;
        retrofit.Profiler profiler11 = builder8.profiler;
        retrofit.RestAdapter.Log log12 = builder8.log;
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.FULL;
        builder8.logLevel = logLevel13;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        restAdapter0.setLogLevel(logLevel13);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server3 = new retrofit.Server("hi!", "hi!");
        retrofit.RestAdapter.Builder builder4 = builder0.setServer(server3);
        retrofit.Server server5 = builder0.server;
        retrofit.RestAdapter.LogLevel logLevel6 = builder0.logLevel;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        retrofit.RestAdapter restAdapter0 = new retrofit.RestAdapter();
        java.util.concurrent.Executor executor1 = restAdapter0.callbackExecutor;
        java.util.concurrent.Executor executor2 = restAdapter0.callbackExecutor;
        retrofit.RestAdapter restAdapter3 = new retrofit.RestAdapter();
        retrofit.ErrorHandler errorHandler4 = restAdapter3.errorHandler;
        retrofit.Server server7 = new retrofit.Server("", "");
        restAdapter3.server = server7;
        restAdapter0.server = server7;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler11 = builder10.errorHandler;
        java.util.concurrent.Executor executor12 = builder10.callbackExecutor;
        java.util.concurrent.Executor executor13 = builder10.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = builder10.logLevel;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        restAdapter0.setLogLevel(logLevel14);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        retrofit.Profiler profiler3 = builder0.profiler;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel5;
        retrofit.Profiler profiler7 = builder0.profiler;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.Server server11 = new retrofit.Server("hi!", "hi!");
        retrofit.RestAdapter.Builder builder12 = builder8.setServer(server11);
        retrofit.RestAdapter restAdapter13 = new retrofit.RestAdapter();
        java.util.concurrent.Executor executor14 = restAdapter13.callbackExecutor;
        java.util.concurrent.Executor executor15 = restAdapter13.callbackExecutor;
        retrofit.RestAdapter restAdapter16 = new retrofit.RestAdapter();
        retrofit.ErrorHandler errorHandler17 = restAdapter16.errorHandler;
        retrofit.Server server20 = new retrofit.Server("", "");
        restAdapter16.server = server20;
        restAdapter13.server = server20;
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        restAdapter13.log = log23;
        retrofit.RestAdapter.Builder builder25 = builder12.setLog(log23);
        retrofit.RestAdapter.Builder builder27 = builder12.setServer("hi!");
        retrofit.RestAdapter.Log log28 = builder27.log;
        builder0.log = log28;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder31 = builder0.setServer("");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        retrofit.RestAdapter restAdapter0 = new retrofit.RestAdapter();
        java.util.concurrent.Executor executor1 = restAdapter0.callbackExecutor;
        retrofit.RestAdapter restAdapter2 = new retrofit.RestAdapter();
        java.util.concurrent.Executor executor3 = restAdapter2.callbackExecutor;
        java.util.concurrent.Executor executor4 = restAdapter2.callbackExecutor;
        retrofit.RestAdapter restAdapter5 = new retrofit.RestAdapter();
        retrofit.ErrorHandler errorHandler6 = restAdapter5.errorHandler;
        retrofit.Server server9 = new retrofit.Server("", "");
        restAdapter5.server = server9;
        restAdapter2.server = server9;
        restAdapter0.server = server9;
        retrofit.Profiler profiler13 = restAdapter0.profiler;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter0.new RestHandler();
        retrofit.client.Client.Provider provider15 = restAdapter0.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter0.logLevel;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.Server server20 = new retrofit.Server("hi!", "hi!");
        retrofit.RestAdapter.Builder builder21 = builder17.setServer(server20);
        retrofit.Server server22 = builder17.server;
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.Server server26 = new retrofit.Server("hi!", "hi!");
        retrofit.RestAdapter.Builder builder27 = builder23.setServer(server26);
        retrofit.RestAdapter restAdapter28 = new retrofit.RestAdapter();
        java.util.concurrent.Executor executor29 = restAdapter28.callbackExecutor;
        java.util.concurrent.Executor executor30 = restAdapter28.callbackExecutor;
        retrofit.RestAdapter restAdapter31 = new retrofit.RestAdapter();
        retrofit.ErrorHandler errorHandler32 = restAdapter31.errorHandler;
        retrofit.Server server35 = new retrofit.Server("", "");
        restAdapter31.server = server35;
        restAdapter28.server = server35;
        retrofit.RestAdapter.Log log38 = retrofit.RestAdapter.Log.NONE;
        restAdapter28.log = log38;
        retrofit.RestAdapter.Builder builder40 = builder27.setLog(log38);
        retrofit.RestAdapter.LogLevel logLevel41 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder42 = builder27.setLogLevel(logLevel41);
        builder17.logLevel = logLevel41;
        java.util.concurrent.Executor executor44 = builder17.httpExecutor;
        java.util.concurrent.Executor executor45 = builder17.callbackExecutor;
        java.util.concurrent.Executor executor46 = builder17.callbackExecutor;
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler48 = builder47.errorHandler;
        retrofit.ErrorHandler errorHandler49 = builder47.errorHandler;
        retrofit.Profiler profiler50 = builder47.profiler;
        retrofit.RestAdapter.Log log51 = builder47.log;
        retrofit.RequestInterceptor requestInterceptor52 = builder47.requestInterceptor;
        builder47.ensureSaneDefaults();
        builder47.ensureSaneDefaults();
        retrofit.RestAdapter.LogLevel logLevel55 = builder47.logLevel;
        builder17.logLevel = logLevel55;
        retrofit.RestAdapter.LogLevel logLevel57 = builder17.logLevel;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        restAdapter0.setLogLevel(logLevel57);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        java.util.concurrent.Executor executor2 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder4 = builder0.setServer("hi!");
        retrofit.Server server7 = new retrofit.Server("default", "hi!");
        java.lang.String str8 = server7.getUrl();
        retrofit.RestAdapter.Builder builder9 = builder4.setServer(server7);
        retrofit.RestAdapter.LogLevel logLevel10 = builder9.logLevel;
        retrofit.ErrorHandler errorHandler11 = builder9.errorHandler;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler13 = builder12.errorHandler;
        java.util.concurrent.Executor executor14 = builder12.callbackExecutor;
        retrofit.RestAdapter.Builder builder16 = builder12.setServer("hi!");
        retrofit.Server server19 = new retrofit.Server("default", "hi!");
        java.lang.String str20 = server19.getUrl();
        retrofit.RestAdapter.Builder builder21 = builder16.setServer(server19);
        builder9.server = server19;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder24 = builder9.setServer("");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.Server server4 = new retrofit.Server("", "");
        builder0.server = server4;
        java.util.concurrent.Executor executor6 = builder0.callbackExecutor;
        retrofit.RequestInterceptor requestInterceptor7 = builder0.requestInterceptor;
        retrofit.Server server8 = builder0.server;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder10 = builder0.setServer("");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("default");
        retrofit.RestAdapter restAdapter4 = builder0.build();
        retrofit.client.Client.Provider provider5 = builder0.clientProvider;
        builder0.ensureSaneDefaults();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        retrofit.RestAdapter restAdapter0 = new retrofit.RestAdapter();
        java.util.concurrent.Executor executor1 = restAdapter0.callbackExecutor;
        retrofit.RestAdapter.RestHandler restHandler2 = restAdapter0.new RestHandler();
        retrofit.Server server5 = new retrofit.Server("hi!", "hi!");
        restAdapter0.server = server5;
        retrofit.Server server7 = restAdapter0.server;
        retrofit.RestAdapter restAdapter8 = new retrofit.RestAdapter();
        java.util.concurrent.Executor executor9 = restAdapter8.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean11 = logLevel10.log();
        restAdapter8.logLevel = logLevel10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        restAdapter0.setLogLevel(logLevel10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.Server server4 = new retrofit.Server("", "");
        builder0.server = server4;
        retrofit.RestAdapter.Log log6 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log6;
        retrofit.RestAdapter.Builder builder9 = builder0.setServer("default");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder11 = builder0.setServer("");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        java.util.concurrent.Executor executor2 = builder0.callbackExecutor;
        java.util.concurrent.Executor executor3 = builder0.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.LogLevel logLevel5 = builder0.logLevel;
        retrofit.ErrorHandler errorHandler6 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.Server server10 = new retrofit.Server("hi!", "hi!");
        retrofit.RestAdapter.Builder builder11 = builder7.setServer(server10);
        retrofit.RestAdapter restAdapter12 = new retrofit.RestAdapter();
        java.util.concurrent.Executor executor13 = restAdapter12.callbackExecutor;
        java.util.concurrent.Executor executor14 = restAdapter12.callbackExecutor;
        retrofit.RestAdapter restAdapter15 = new retrofit.RestAdapter();
        retrofit.ErrorHandler errorHandler16 = restAdapter15.errorHandler;
        retrofit.Server server19 = new retrofit.Server("", "");
        restAdapter15.server = server19;
        restAdapter12.server = server19;
        retrofit.RestAdapter.Log log22 = retrofit.RestAdapter.Log.NONE;
        restAdapter12.log = log22;
        retrofit.RestAdapter.Builder builder24 = builder11.setLog(log22);
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder26 = builder11.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder27 = builder0.setLogLevel(logLevel25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder29 = builder0.setServer("");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.ErrorHandler errorHandler1 = builder0.errorHandler;
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        retrofit.Profiler profiler3 = builder0.profiler;
        retrofit.RestAdapter restAdapter4 = new retrofit.RestAdapter();
        java.util.concurrent.Executor executor5 = restAdapter4.callbackExecutor;
        retrofit.RestAdapter.RestHandler restHandler6 = restAdapter4.new RestHandler();
        retrofit.Server server9 = new retrofit.Server("hi!", "hi!");
        restAdapter4.server = server9;
        retrofit.RestAdapter.Builder builder11 = builder0.setServer(server9);
        retrofit.RestAdapter restAdapter12 = builder11.build();
        java.util.concurrent.Executor executor13 = builder11.callbackExecutor;
        retrofit.RestAdapter.Log log14 = builder11.log;
        retrofit.RestAdapter restAdapter15 = builder11.build();
        retrofit.RestAdapter.Builder builder17 = builder11.setServer("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder19 = builder11.setServer("");
    }
}

