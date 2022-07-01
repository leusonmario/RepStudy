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
        retrofit.Profiler profiler1 = restAdapter0.profiler;
        retrofit.RestAdapter.LogLevel logLevel2 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean3 = logLevel2.log();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        restAdapter0.setLogLevel(logLevel2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        retrofit.RestAdapter restAdapter0 = new retrofit.RestAdapter();
        retrofit.Server server1 = restAdapter0.server;
        retrofit.RequestInterceptor requestInterceptor2 = restAdapter0.requestInterceptor;
        retrofit.RestAdapter restAdapter3 = new retrofit.RestAdapter();
        retrofit.RestAdapter.LogLevel logLevel4 = restAdapter3.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler5 = restAdapter3.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel6 = restAdapter3.getLogLevel();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        builder7.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder10 = builder7.setServer("hi!");
        retrofit.RestAdapter restAdapter11 = new retrofit.RestAdapter();
        retrofit.RestAdapter.LogLevel logLevel12 = restAdapter11.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter11.new RestHandler();
        retrofit.RestAdapter.Log log14 = restAdapter11.log;
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter11.logLevel = logLevel15;
        retrofit.RestAdapter.Builder builder17 = builder10.setLogLevel(logLevel15);
        java.util.concurrent.Executor executor18 = builder10.callbackExecutor;
        restAdapter3.callbackExecutor = executor18;
        restAdapter0.httpExecutor = executor18;
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.NONE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        restAdapter0.setLogLevel(logLevel21);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.RestAdapter restAdapter4 = new retrofit.RestAdapter();
        retrofit.RestAdapter.LogLevel logLevel5 = restAdapter4.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler6 = restAdapter4.new RestHandler();
        retrofit.RestAdapter.Log log7 = restAdapter4.log;
        retrofit.RestAdapter.LogLevel logLevel8 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter4.logLevel = logLevel8;
        retrofit.RestAdapter.Builder builder10 = builder3.setLogLevel(logLevel8);
        retrofit.Server server11 = builder3.server;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        builder12.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder15 = builder12.setServer("hi!");
        retrofit.RestAdapter restAdapter16 = new retrofit.RestAdapter();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter16.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter16.new RestHandler();
        retrofit.RestAdapter.Log log19 = restAdapter16.log;
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter16.logLevel = logLevel20;
        retrofit.RestAdapter.Builder builder22 = builder15.setLogLevel(logLevel20);
        retrofit.client.Client.Provider provider23 = builder22.clientProvider;
        builder3.clientProvider = provider23;
        builder3.ensureSaneDefaults();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder27 = builder3.setServer("");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder5 = builder0.setLogLevel(logLevel4);
        retrofit.RestAdapter restAdapter6 = new retrofit.RestAdapter();
        retrofit.RestAdapter.LogLevel logLevel7 = restAdapter6.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler8 = restAdapter6.new RestHandler();
        retrofit.RestAdapter.Log log9 = restAdapter6.log;
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter6.logLevel = logLevel10;
        retrofit.RestAdapter.Builder builder12 = builder5.setLogLevel(logLevel10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder14 = builder12.setServer("");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        retrofit.RestAdapter restAdapter0 = new retrofit.RestAdapter();
        retrofit.Profiler profiler1 = restAdapter0.profiler;
        retrofit.Profiler profiler2 = restAdapter0.profiler;
        retrofit.RequestInterceptor requestInterceptor3 = restAdapter0.requestInterceptor;
        java.util.concurrent.Executor executor4 = restAdapter0.callbackExecutor;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean6 = logLevel5.log();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        restAdapter0.setLogLevel(logLevel5);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        retrofit.RestAdapter restAdapter0 = new retrofit.RestAdapter();
        retrofit.Profiler profiler1 = restAdapter0.profiler;
        retrofit.Profiler profiler2 = restAdapter0.profiler;
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        builder3.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder6 = builder3.setServer("hi!");
        retrofit.RestAdapter restAdapter7 = new retrofit.RestAdapter();
        retrofit.RestAdapter.LogLevel logLevel8 = restAdapter7.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler9 = restAdapter7.new RestHandler();
        retrofit.RestAdapter.Log log10 = restAdapter7.log;
        retrofit.RestAdapter.LogLevel logLevel11 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter7.logLevel = logLevel11;
        retrofit.RestAdapter.Builder builder13 = builder6.setLogLevel(logLevel11);
        retrofit.RestAdapter.Builder builder15 = builder13.setServer("hi!");
        retrofit.RestAdapter restAdapter16 = new retrofit.RestAdapter();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter16.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter16.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter16.getLogLevel();
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        builder20.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder23 = builder20.setServer("hi!");
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter();
        retrofit.RestAdapter.LogLevel logLevel25 = restAdapter24.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler26 = restAdapter24.new RestHandler();
        retrofit.RestAdapter.Log log27 = restAdapter24.log;
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter24.logLevel = logLevel28;
        retrofit.RestAdapter.Builder builder30 = builder23.setLogLevel(logLevel28);
        java.util.concurrent.Executor executor31 = builder23.callbackExecutor;
        restAdapter16.callbackExecutor = executor31;
        retrofit.RestAdapter restAdapter33 = new retrofit.RestAdapter();
        retrofit.RestAdapter.LogLevel logLevel34 = restAdapter33.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler35 = restAdapter33.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel36 = restAdapter33.getLogLevel();
        retrofit.RestAdapter.Builder builder37 = new retrofit.RestAdapter.Builder();
        builder37.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder40 = builder37.setServer("hi!");
        retrofit.RestAdapter restAdapter41 = new retrofit.RestAdapter();
        retrofit.RestAdapter.LogLevel logLevel42 = restAdapter41.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler43 = restAdapter41.new RestHandler();
        retrofit.RestAdapter.Log log44 = restAdapter41.log;
        retrofit.RestAdapter.LogLevel logLevel45 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter41.logLevel = logLevel45;
        retrofit.RestAdapter.Builder builder47 = builder40.setLogLevel(logLevel45);
        java.util.concurrent.Executor executor48 = builder40.callbackExecutor;
        restAdapter33.callbackExecutor = executor48;
        retrofit.RestAdapter.Builder builder50 = builder15.setExecutors(executor31, executor48);
        java.util.concurrent.Executor executor51 = builder50.callbackExecutor;
        retrofit.RestAdapter restAdapter52 = new retrofit.RestAdapter();
        retrofit.RestAdapter.LogLevel logLevel53 = restAdapter52.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler54 = restAdapter52.new RestHandler();
        retrofit.RestAdapter.Log log55 = restAdapter52.log;
        retrofit.RestAdapter.LogLevel logLevel56 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter52.logLevel = logLevel56;
        builder50.logLevel = logLevel56;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        restAdapter0.setLogLevel(logLevel56);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.RestAdapter restAdapter4 = new retrofit.RestAdapter();
        retrofit.RestAdapter.LogLevel logLevel5 = restAdapter4.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler6 = restAdapter4.new RestHandler();
        retrofit.RestAdapter.Log log7 = restAdapter4.log;
        retrofit.RestAdapter.LogLevel logLevel8 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter4.logLevel = logLevel8;
        retrofit.RestAdapter.Builder builder10 = builder3.setLogLevel(logLevel8);
        retrofit.RestAdapter.Builder builder12 = builder10.setServer("hi!");
        retrofit.RestAdapter restAdapter13 = new retrofit.RestAdapter();
        retrofit.Server server14 = restAdapter13.server;
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter13.requestInterceptor;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.HEADERS;
        restAdapter13.logLevel = logLevel16;
        retrofit.RestAdapter.Builder builder18 = builder12.setLogLevel(logLevel16);
        java.util.concurrent.Executor executor19 = builder18.httpExecutor;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder21 = builder18.setServer("");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        retrofit.RestAdapter restAdapter0 = new retrofit.RestAdapter();
        retrofit.Profiler profiler1 = restAdapter0.profiler;
        retrofit.RestAdapter.RestHandler restHandler2 = restAdapter0.new RestHandler();
        retrofit.Server server3 = restAdapter0.server;
        java.util.concurrent.Executor executor4 = restAdapter0.callbackExecutor;
        retrofit.RestAdapter.RestHandler restHandler5 = restAdapter0.new RestHandler();
        retrofit.RestAdapter restAdapter6 = new retrofit.RestAdapter();
        retrofit.Profiler profiler7 = restAdapter6.profiler;
        retrofit.RestAdapter.RestHandler restHandler8 = restAdapter6.new RestHandler();
        retrofit.converter.Converter converter9 = restAdapter6.converter;
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.FULL;
        restAdapter6.logLevel = logLevel10;
        retrofit.ErrorHandler errorHandler12 = restAdapter6.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter6.getLogLevel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        restAdapter0.setLogLevel(logLevel13);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder5 = builder0.setLogLevel(logLevel4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder7 = builder5.setServer("");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder5 = builder0.setLogLevel(logLevel4);
        retrofit.RestAdapter restAdapter6 = new retrofit.RestAdapter();
        retrofit.RestAdapter.LogLevel logLevel7 = restAdapter6.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler8 = restAdapter6.new RestHandler();
        retrofit.RestAdapter.Log log9 = restAdapter6.log;
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter6.logLevel = logLevel10;
        retrofit.RestAdapter.Builder builder12 = builder5.setLogLevel(logLevel10);
        retrofit.converter.Converter converter13 = builder5.converter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder15 = builder5.setServer("");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.Server server4 = builder3.server;
        retrofit.RestAdapter.Builder builder6 = builder3.setServer("Retrofit-Idle");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder8 = builder6.setServer("");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.RestAdapter restAdapter4 = new retrofit.RestAdapter();
        retrofit.RestAdapter.LogLevel logLevel5 = restAdapter4.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler6 = restAdapter4.new RestHandler();
        retrofit.RestAdapter.Log log7 = restAdapter4.log;
        retrofit.RestAdapter.LogLevel logLevel8 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter4.logLevel = logLevel8;
        retrofit.RestAdapter.Builder builder10 = builder3.setLogLevel(logLevel8);
        retrofit.RestAdapter.Builder builder12 = builder10.setServer("hi!");
        retrofit.RestAdapter.Log log13 = builder12.log;
        retrofit.converter.Converter converter14 = builder12.converter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder16 = builder12.setServer("");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.RestAdapter restAdapter4 = new retrofit.RestAdapter();
        retrofit.RestAdapter.LogLevel logLevel5 = restAdapter4.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler6 = restAdapter4.new RestHandler();
        retrofit.RestAdapter.Log log7 = restAdapter4.log;
        retrofit.RestAdapter.LogLevel logLevel8 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter4.logLevel = logLevel8;
        retrofit.RestAdapter.Builder builder10 = builder3.setLogLevel(logLevel8);
        retrofit.RestAdapter.Builder builder12 = builder10.setServer("hi!");
        retrofit.Profiler profiler13 = builder10.profiler;
        retrofit.ErrorHandler errorHandler14 = builder10.errorHandler;
        retrofit.Server server15 = builder10.server;
        retrofit.RestAdapter.Log log16 = builder10.log;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder18 = builder10.setServer("");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder3 = builder0.setServer("hi!");
        retrofit.RestAdapter restAdapter4 = new retrofit.RestAdapter();
        retrofit.RestAdapter.LogLevel logLevel5 = restAdapter4.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler6 = restAdapter4.new RestHandler();
        retrofit.RestAdapter.Log log7 = restAdapter4.log;
        retrofit.RestAdapter.LogLevel logLevel8 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter4.logLevel = logLevel8;
        retrofit.RestAdapter.Builder builder10 = builder3.setLogLevel(logLevel8);
        retrofit.Server server11 = builder3.server;
        retrofit.Profiler profiler12 = builder3.profiler;
        builder3.ensureSaneDefaults();
        builder3.ensureSaneDefaults();
        builder3.ensureSaneDefaults();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder17 = builder3.setServer("");
    }
}

