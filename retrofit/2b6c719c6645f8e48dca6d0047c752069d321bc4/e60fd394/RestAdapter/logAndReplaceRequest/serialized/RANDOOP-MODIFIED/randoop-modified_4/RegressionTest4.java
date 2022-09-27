import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = builder0.server;
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider3 = null;
        builder2.setclientProvider(provider3);
        retrofit.Server server6 = new retrofit.Server("Retrofit-");
        java.lang.String str7 = server6.name;
        retrofit.client.Client.Provider provider8 = null;
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        retrofit.RequestInterceptor requestInterceptor11 = null;
        retrofit.converter.Converter converter12 = null;
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Log log15 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.Server server17 = builder16.server;
        java.util.concurrent.Executor executor18 = null;
        builder16.httpExecutor = executor18;
        java.util.concurrent.Executor executor20 = builder16.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.FULL;
        builder16.logLevel = logLevel21;
        retrofit.RestAdapter restAdapter23 = new retrofit.RestAdapter(server6, provider8, executor9, executor10, requestInterceptor11, converter12, profiler13, errorHandler14, log15, logLevel21);
        retrofit.RestAdapter.Builder builder24 = builder2.setLog(log15);
        log15.log("default");
        log15.log("GET");
        builder0.log = log15;
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider31 = null;
        builder30.setclientProvider(provider31);
        java.util.concurrent.Executor executor33 = null;
        builder30.callbackExecutor = executor33;
        retrofit.RestAdapter.Builder builder35 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor36 = builder35.getcallbackExecutor();
        retrofit.Server server37 = builder35.server;
        retrofit.RestAdapter.Builder builder38 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider39 = null;
        builder38.setclientProvider(provider39);
        retrofit.Server server42 = new retrofit.Server("Retrofit-");
        java.lang.String str43 = server42.name;
        retrofit.client.Client.Provider provider44 = null;
        java.util.concurrent.Executor executor45 = null;
        java.util.concurrent.Executor executor46 = null;
        retrofit.RequestInterceptor requestInterceptor47 = null;
        retrofit.converter.Converter converter48 = null;
        retrofit.Profiler profiler49 = null;
        retrofit.ErrorHandler errorHandler50 = null;
        retrofit.RestAdapter.Log log51 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder52 = new retrofit.RestAdapter.Builder();
        retrofit.Server server53 = builder52.server;
        java.util.concurrent.Executor executor54 = null;
        builder52.httpExecutor = executor54;
        java.util.concurrent.Executor executor56 = builder52.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel57 = retrofit.RestAdapter.LogLevel.FULL;
        builder52.logLevel = logLevel57;
        retrofit.RestAdapter restAdapter59 = new retrofit.RestAdapter(server42, provider44, executor45, executor46, requestInterceptor47, converter48, profiler49, errorHandler50, log51, logLevel57);
        retrofit.RestAdapter.Builder builder60 = builder38.setLog(log51);
        retrofit.RestAdapter.Builder builder61 = builder35.setLog(log51);
        java.util.concurrent.Executor executor62 = builder61.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder63 = new retrofit.RestAdapter.Builder();
        retrofit.Server server64 = builder63.server;
        java.util.concurrent.Executor executor65 = null;
        builder63.httpExecutor = executor65;
        java.util.concurrent.Executor executor67 = null;
        builder63.callbackExecutor = executor67;
        java.util.concurrent.Executor executor69 = null;
        builder63.callbackExecutor = executor69;
        builder63.ensureSaneDefaults();
        retrofit.client.Client.Provider provider72 = builder63.clientProvider;
        retrofit.RestAdapter.Builder builder73 = builder61.setClient(provider72);
        builder30.setclientProvider(provider72);
        retrofit.Server server75 = null;
        retrofit.client.Client.Provider provider76 = null;
        java.util.concurrent.Executor executor77 = null;
        java.util.concurrent.Executor executor78 = null;
        retrofit.RequestInterceptor requestInterceptor79 = null;
        retrofit.converter.Converter converter80 = null;
        retrofit.Profiler profiler81 = null;
        retrofit.ErrorHandler errorHandler82 = null;
        retrofit.RestAdapter.Log log83 = null;
        retrofit.RestAdapter.LogLevel logLevel84 = null;
        retrofit.RestAdapter restAdapter85 = new retrofit.RestAdapter(server75, provider76, executor77, executor78, requestInterceptor79, converter80, profiler81, errorHandler82, log83, logLevel84);
        retrofit.SerializedObjectSupporter serializedObjectSupporter86 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request87 = serializedObjectSupporter86.deserializeObjectRequest6();
        restAdapter85.serializedObjectSupporter = serializedObjectSupporter86;
        retrofit.converter.GsonConverter gsonConverter89 = serializedObjectSupporter86.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter90 = serializedObjectSupporter86.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter91 = serializedObjectSupporter86.deserializeObjectConverter1();
        retrofit.ErrorHandler errorHandler92 = serializedObjectSupporter86.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder93 = builder30.setErrorHandler(errorHandler92);
        retrofit.RestAdapter.Builder builder94 = builder0.setErrorHandler(errorHandler92);
        org.junit.Assert.assertNull(server1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "default" + "'", str7, "default");
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor36);
        org.junit.Assert.assertNull(server37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "default" + "'", str43, "default");
        org.junit.Assert.assertNotNull(log51);
        org.junit.Assert.assertNull(server53);
        org.junit.Assert.assertNull(executor56);
        org.junit.Assert.assertTrue("'" + logLevel57 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel57.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNull(executor62);
        org.junit.Assert.assertNull(server64);
        org.junit.Assert.assertNotNull(provider72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(request87);
        org.junit.Assert.assertNotNull(gsonConverter89);
        org.junit.Assert.assertNotNull(gsonConverter90);
        org.junit.Assert.assertNotNull(gsonConverter91);
        org.junit.Assert.assertNotNull(errorHandler92);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertNotNull(builder94);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.getcallbackExecutor();
        retrofit.Server server2 = builder0.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.converter.Converter converter4 = builder0.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString2();
        retrofit.client.Request request7 = serializedObjectSupporter5.deserializeObjectRequest7();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString5();
        retrofit.Server server9 = serializedObjectSupporter5.deserializeObjectServer1();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.ErrorHandler errorHandler11 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = builder12.getcallbackExecutor();
        retrofit.Server server14 = builder12.server;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider16 = null;
        builder15.setclientProvider(provider16);
        retrofit.Server server19 = new retrofit.Server("Retrofit-");
        java.lang.String str20 = server19.name;
        retrofit.client.Client.Provider provider21 = null;
        java.util.concurrent.Executor executor22 = null;
        java.util.concurrent.Executor executor23 = null;
        retrofit.RequestInterceptor requestInterceptor24 = null;
        retrofit.converter.Converter converter25 = null;
        retrofit.Profiler profiler26 = null;
        retrofit.ErrorHandler errorHandler27 = null;
        retrofit.RestAdapter.Log log28 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        retrofit.Server server30 = builder29.server;
        java.util.concurrent.Executor executor31 = null;
        builder29.httpExecutor = executor31;
        java.util.concurrent.Executor executor33 = builder29.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.FULL;
        builder29.logLevel = logLevel34;
        retrofit.RestAdapter restAdapter36 = new retrofit.RestAdapter(server19, provider21, executor22, executor23, requestInterceptor24, converter25, profiler26, errorHandler27, log28, logLevel34);
        retrofit.RestAdapter.Builder builder37 = builder15.setLog(log28);
        retrofit.RestAdapter.Builder builder38 = builder12.setLog(log28);
        retrofit.RestAdapter.Log log39 = builder38.log;
        builder0.log = log39;
        retrofit.Server server41 = null;
        retrofit.client.Client.Provider provider42 = null;
        java.util.concurrent.Executor executor43 = null;
        java.util.concurrent.Executor executor44 = null;
        retrofit.RequestInterceptor requestInterceptor45 = null;
        retrofit.converter.Converter converter46 = null;
        retrofit.Profiler profiler47 = null;
        retrofit.ErrorHandler errorHandler48 = null;
        retrofit.RestAdapter.Log log49 = null;
        retrofit.RestAdapter.LogLevel logLevel50 = null;
        retrofit.RestAdapter restAdapter51 = new retrofit.RestAdapter(server41, provider42, executor43, executor44, requestInterceptor45, converter46, profiler47, errorHandler48, log49, logLevel50);
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request53 = serializedObjectSupporter52.deserializeObjectRequest6();
        restAdapter51.serializedObjectSupporter = serializedObjectSupporter52;
        retrofit.converter.GsonConverter gsonConverter55 = serializedObjectSupporter52.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter56 = serializedObjectSupporter52.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter57 = serializedObjectSupporter52.deserializeObjectConverter1();
        retrofit.ErrorHandler errorHandler58 = serializedObjectSupporter52.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder59 = builder0.setErrorHandler(errorHandler58);
        retrofit.RestAdapter.Builder builder61 = builder0.setServer("hi!");
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(server2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-Idle" + "'", str6, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "POST" + "'", str8, "POST");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "default" + "'", str20, "default");
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNull(server30);
        org.junit.Assert.assertNull(executor33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(log39);
        org.junit.Assert.assertNotNull(request53);
        org.junit.Assert.assertNotNull(gsonConverter55);
        org.junit.Assert.assertNotNull(gsonConverter56);
        org.junit.Assert.assertNotNull(gsonConverter57);
        org.junit.Assert.assertNotNull(errorHandler58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Server server18 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter10.new RestHandler();
        retrofit.client.Response response22 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Response response24 = restAdapter10.logAndReplaceResponse("", response22, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(logLevel19);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.client.Client.Provider provider11 = restAdapter10.getclientProvider();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel14 = null;
        restAdapter10.logLevel = logLevel14;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel16;
        retrofit.client.Client.Provider provider18 = restAdapter10.clientProvider;
        retrofit.client.Client.Provider provider19 = restAdapter10.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor20 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        java.lang.String str22 = serializedObjectSupporter21.deserializeObjectString2();
        retrofit.client.Request request23 = serializedObjectSupporter21.deserializeObjectRequest7();
        retrofit.client.Request request24 = serializedObjectSupporter21.deserializeObjectRequest4();
        java.lang.String str25 = serializedObjectSupporter21.deserializeObjectString5();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter21;
        retrofit.ErrorHandler errorHandler27 = serializedObjectSupporter21.deserializeObjectErrorHandler1();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(requestInterceptor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Retrofit-Idle" + "'", str22, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "POST" + "'", str25, "POST");
        org.junit.Assert.assertNotNull(errorHandler27);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.client.Request request2 = serializedObjectSupporter0.deserializeObjectRequest7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest2();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Request request7 = serializedObjectSupporter0.deserializeObjectRequest5();
        retrofit.client.Request request8 = serializedObjectSupporter0.deserializeObjectRequest2();
        retrofit.client.Request request9 = serializedObjectSupporter0.deserializeObjectRequest2();
        retrofit.client.Request request10 = serializedObjectSupporter0.deserializeObjectRequest8();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-Idle" + "'", str1, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "POST" + "'", str3, "POST");
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-Idle" + "'", str11, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter12);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter1.deserializeObjectConverter3();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.getcallbackExecutor();
        retrofit.Server server10 = builder8.server;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider12 = null;
        builder11.setclientProvider(provider12);
        retrofit.Server server15 = new retrofit.Server("Retrofit-");
        java.lang.String str16 = server15.name;
        retrofit.client.Client.Provider provider17 = null;
        java.util.concurrent.Executor executor18 = null;
        java.util.concurrent.Executor executor19 = null;
        retrofit.RequestInterceptor requestInterceptor20 = null;
        retrofit.converter.Converter converter21 = null;
        retrofit.Profiler profiler22 = null;
        retrofit.ErrorHandler errorHandler23 = null;
        retrofit.RestAdapter.Log log24 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.Server server26 = builder25.server;
        java.util.concurrent.Executor executor27 = null;
        builder25.httpExecutor = executor27;
        java.util.concurrent.Executor executor29 = builder25.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.FULL;
        builder25.logLevel = logLevel30;
        retrofit.RestAdapter restAdapter32 = new retrofit.RestAdapter(server15, provider17, executor18, executor19, requestInterceptor20, converter21, profiler22, errorHandler23, log24, logLevel30);
        retrofit.RestAdapter.Builder builder33 = builder11.setLog(log24);
        retrofit.RestAdapter.Builder builder34 = builder8.setLog(log24);
        retrofit.Server server35 = null;
        retrofit.client.Client.Provider provider36 = null;
        java.util.concurrent.Executor executor37 = null;
        java.util.concurrent.Executor executor38 = null;
        retrofit.RequestInterceptor requestInterceptor39 = null;
        retrofit.converter.Converter converter40 = null;
        retrofit.Profiler profiler41 = null;
        retrofit.ErrorHandler errorHandler42 = null;
        retrofit.RestAdapter.Log log43 = null;
        retrofit.RestAdapter.LogLevel logLevel44 = null;
        retrofit.RestAdapter restAdapter45 = new retrofit.RestAdapter(server35, provider36, executor37, executor38, requestInterceptor39, converter40, profiler41, errorHandler42, log43, logLevel44);
        retrofit.SerializedObjectSupporter serializedObjectSupporter46 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request47 = serializedObjectSupporter46.deserializeObjectRequest6();
        restAdapter45.serializedObjectSupporter = serializedObjectSupporter46;
        retrofit.converter.GsonConverter gsonConverter49 = serializedObjectSupporter46.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter46.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter46.deserializeObjectConverter1();
        retrofit.client.Request request52 = serializedObjectSupporter46.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor53 = serializedObjectSupporter46.deserializeObjectRequestInterceptor1();
        builder34.requestInterceptor = requestInterceptor53;
        retrofit.RestAdapter.Builder builder55 = builder7.setRequestInterceptor(requestInterceptor53);
        retrofit.RestAdapter.LogLevel logLevel56 = builder55.logLevel;
        retrofit.SerializedObjectSupporter serializedObjectSupporter57 = builder55.serializedObjectSupporter;
        retrofit.client.Request request58 = serializedObjectSupporter57.deserializeObjectRequest7();
        java.lang.String str59 = request58.url;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-Idle" + "'", str2, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(server10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "default" + "'", str16, "default");
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNull(server26);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertNotNull(gsonConverter49);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNotNull(request52);
        org.junit.Assert.assertNotNull(requestInterceptor53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertTrue("'" + logLevel56 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel56.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(serializedObjectSupporter57);
        org.junit.Assert.assertNotNull(request58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "http://example.com/" + "'", str59, "http://example.com/");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = builder0.server;
        java.util.concurrent.Executor executor2 = null;
        builder0.httpExecutor = executor2;
        java.util.concurrent.Executor executor4 = builder0.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel5;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request8 = serializedObjectSupporter7.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter4();
        builder0.serializedObjectSupporter = serializedObjectSupporter7;
        retrofit.RestAdapter.Builder builder13 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        builder0.log = log14;
        retrofit.RestAdapter.LogLevel logLevel16 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter3();
        builder17.serializedObjectSupporter = serializedObjectSupporter18;
        retrofit.RestAdapter.Log log22 = builder17.log;
        retrofit.RestAdapter.Builder builder24 = builder17.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor26 = builder25.getcallbackExecutor();
        retrofit.Server server27 = builder25.server;
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider29 = null;
        builder28.setclientProvider(provider29);
        retrofit.Server server32 = new retrofit.Server("Retrofit-");
        java.lang.String str33 = server32.name;
        retrofit.client.Client.Provider provider34 = null;
        java.util.concurrent.Executor executor35 = null;
        java.util.concurrent.Executor executor36 = null;
        retrofit.RequestInterceptor requestInterceptor37 = null;
        retrofit.converter.Converter converter38 = null;
        retrofit.Profiler profiler39 = null;
        retrofit.ErrorHandler errorHandler40 = null;
        retrofit.RestAdapter.Log log41 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        retrofit.Server server43 = builder42.server;
        java.util.concurrent.Executor executor44 = null;
        builder42.httpExecutor = executor44;
        java.util.concurrent.Executor executor46 = builder42.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.FULL;
        builder42.logLevel = logLevel47;
        retrofit.RestAdapter restAdapter49 = new retrofit.RestAdapter(server32, provider34, executor35, executor36, requestInterceptor37, converter38, profiler39, errorHandler40, log41, logLevel47);
        retrofit.RestAdapter.Builder builder50 = builder28.setLog(log41);
        retrofit.RestAdapter.Builder builder51 = builder25.setLog(log41);
        retrofit.Server server52 = null;
        retrofit.client.Client.Provider provider53 = null;
        java.util.concurrent.Executor executor54 = null;
        java.util.concurrent.Executor executor55 = null;
        retrofit.RequestInterceptor requestInterceptor56 = null;
        retrofit.converter.Converter converter57 = null;
        retrofit.Profiler profiler58 = null;
        retrofit.ErrorHandler errorHandler59 = null;
        retrofit.RestAdapter.Log log60 = null;
        retrofit.RestAdapter.LogLevel logLevel61 = null;
        retrofit.RestAdapter restAdapter62 = new retrofit.RestAdapter(server52, provider53, executor54, executor55, requestInterceptor56, converter57, profiler58, errorHandler59, log60, logLevel61);
        retrofit.SerializedObjectSupporter serializedObjectSupporter63 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request64 = serializedObjectSupporter63.deserializeObjectRequest6();
        restAdapter62.serializedObjectSupporter = serializedObjectSupporter63;
        retrofit.converter.GsonConverter gsonConverter66 = serializedObjectSupporter63.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter67 = serializedObjectSupporter63.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter68 = serializedObjectSupporter63.deserializeObjectConverter1();
        retrofit.client.Request request69 = serializedObjectSupporter63.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor70 = serializedObjectSupporter63.deserializeObjectRequestInterceptor1();
        builder51.requestInterceptor = requestInterceptor70;
        retrofit.RestAdapter.Builder builder72 = builder24.setRequestInterceptor(requestInterceptor70);
        java.util.concurrent.Executor executor73 = builder24.httpExecutor;
        retrofit.RestAdapter.Builder builder74 = new retrofit.RestAdapter.Builder();
        retrofit.Server server75 = builder74.server;
        java.util.concurrent.Executor executor76 = null;
        builder74.httpExecutor = executor76;
        java.util.concurrent.Executor executor78 = null;
        builder74.callbackExecutor = executor78;
        java.util.concurrent.Executor executor80 = null;
        builder74.callbackExecutor = executor80;
        builder74.ensureSaneDefaults();
        retrofit.client.Client.Provider provider83 = builder74.clientProvider;
        retrofit.Profiler profiler84 = builder74.profiler;
        retrofit.RequestInterceptor requestInterceptor85 = builder74.requestInterceptor;
        builder24.requestInterceptor = requestInterceptor85;
        retrofit.Server server88 = new retrofit.Server("http://example.com/");
        java.lang.String str89 = server88.apiUrl;
        java.lang.String str90 = server88.getName();
        java.lang.String str91 = server88.getUrl();
        builder24.server = server88;
        builder0.server = server88;
        retrofit.SerializedObjectSupporter serializedObjectSupporter94 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request95 = serializedObjectSupporter94.deserializeObjectRequest2();
        retrofit.converter.GsonConverter gsonConverter96 = serializedObjectSupporter94.deserializeObjectConverter4();
        retrofit.client.Request request97 = serializedObjectSupporter94.deserializeObjectRequest2();
        retrofit.RequestInterceptor requestInterceptor98 = serializedObjectSupporter94.deserializeObjectRequestInterceptor1();
        retrofit.RestAdapter.Builder builder99 = builder0.setRequestInterceptor(requestInterceptor98);
        org.junit.Assert.assertNull(server1);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNull(log22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNull(server27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "default" + "'", str33, "default");
        org.junit.Assert.assertNotNull(log41);
        org.junit.Assert.assertNull(server43);
        org.junit.Assert.assertNull(executor46);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(request64);
        org.junit.Assert.assertNotNull(gsonConverter66);
        org.junit.Assert.assertNotNull(gsonConverter67);
        org.junit.Assert.assertNotNull(gsonConverter68);
        org.junit.Assert.assertNotNull(request69);
        org.junit.Assert.assertNotNull(requestInterceptor70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNull(executor73);
        org.junit.Assert.assertNull(server75);
        org.junit.Assert.assertNotNull(provider83);
        org.junit.Assert.assertNull(profiler84);
        org.junit.Assert.assertNotNull(requestInterceptor85);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "http://example.com/" + "'", str89, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "default" + "'", str90, "default");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "http://example.com/" + "'", str91, "http://example.com/");
        org.junit.Assert.assertNotNull(request95);
        org.junit.Assert.assertNotNull(gsonConverter96);
        org.junit.Assert.assertNotNull(request97);
        org.junit.Assert.assertNotNull(requestInterceptor98);
        org.junit.Assert.assertNotNull(builder99);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter11.deserializeObjectConverter7();
        java.lang.String str16 = serializedObjectSupporter11.deserializeObjectString2();
        retrofit.client.Request request17 = serializedObjectSupporter11.deserializeObjectRequest3();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter11.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter11.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.getcallbackExecutor();
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        retrofit.client.Client.Provider provider3 = null;
        builder0.setclientProvider(provider3);
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor6 = builder5.getcallbackExecutor();
        retrofit.Server server7 = builder5.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = builder5.serializedObjectSupporter;
        retrofit.converter.Converter converter9 = builder5.converter;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor11 = builder10.getcallbackExecutor();
        retrofit.Server server12 = builder10.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = builder10.serializedObjectSupporter;
        retrofit.converter.Converter converter14 = builder10.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString2();
        retrofit.client.Request request17 = serializedObjectSupporter15.deserializeObjectRequest7();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString5();
        retrofit.Server server19 = serializedObjectSupporter15.deserializeObjectServer1();
        builder10.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.ErrorHandler errorHandler21 = builder10.errorHandler;
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter23.deserializeObjectConverter3();
        builder22.serializedObjectSupporter = serializedObjectSupporter23;
        retrofit.RestAdapter.Log log27 = builder22.log;
        retrofit.RestAdapter.Builder builder29 = builder22.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor31 = builder30.getcallbackExecutor();
        retrofit.Server server32 = builder30.server;
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider34 = null;
        builder33.setclientProvider(provider34);
        retrofit.Server server37 = new retrofit.Server("Retrofit-");
        java.lang.String str38 = server37.name;
        retrofit.client.Client.Provider provider39 = null;
        java.util.concurrent.Executor executor40 = null;
        java.util.concurrent.Executor executor41 = null;
        retrofit.RequestInterceptor requestInterceptor42 = null;
        retrofit.converter.Converter converter43 = null;
        retrofit.Profiler profiler44 = null;
        retrofit.ErrorHandler errorHandler45 = null;
        retrofit.RestAdapter.Log log46 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        retrofit.Server server48 = builder47.server;
        java.util.concurrent.Executor executor49 = null;
        builder47.httpExecutor = executor49;
        java.util.concurrent.Executor executor51 = builder47.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel52 = retrofit.RestAdapter.LogLevel.FULL;
        builder47.logLevel = logLevel52;
        retrofit.RestAdapter restAdapter54 = new retrofit.RestAdapter(server37, provider39, executor40, executor41, requestInterceptor42, converter43, profiler44, errorHandler45, log46, logLevel52);
        retrofit.RestAdapter.Builder builder55 = builder33.setLog(log46);
        retrofit.RestAdapter.Builder builder56 = builder30.setLog(log46);
        retrofit.Server server57 = null;
        retrofit.client.Client.Provider provider58 = null;
        java.util.concurrent.Executor executor59 = null;
        java.util.concurrent.Executor executor60 = null;
        retrofit.RequestInterceptor requestInterceptor61 = null;
        retrofit.converter.Converter converter62 = null;
        retrofit.Profiler profiler63 = null;
        retrofit.ErrorHandler errorHandler64 = null;
        retrofit.RestAdapter.Log log65 = null;
        retrofit.RestAdapter.LogLevel logLevel66 = null;
        retrofit.RestAdapter restAdapter67 = new retrofit.RestAdapter(server57, provider58, executor59, executor60, requestInterceptor61, converter62, profiler63, errorHandler64, log65, logLevel66);
        retrofit.SerializedObjectSupporter serializedObjectSupporter68 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request69 = serializedObjectSupporter68.deserializeObjectRequest6();
        restAdapter67.serializedObjectSupporter = serializedObjectSupporter68;
        retrofit.converter.GsonConverter gsonConverter71 = serializedObjectSupporter68.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter72 = serializedObjectSupporter68.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter73 = serializedObjectSupporter68.deserializeObjectConverter1();
        retrofit.client.Request request74 = serializedObjectSupporter68.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor75 = serializedObjectSupporter68.deserializeObjectRequestInterceptor1();
        builder56.requestInterceptor = requestInterceptor75;
        retrofit.RestAdapter.Builder builder77 = builder29.setRequestInterceptor(requestInterceptor75);
        builder10.requestInterceptor = requestInterceptor75;
        retrofit.RestAdapter.Builder builder79 = builder5.setRequestInterceptor(requestInterceptor75);
        builder0.requestInterceptor = requestInterceptor75;
        retrofit.RestAdapter.Builder builder82 = builder0.setServer("Retrofit-");
        retrofit.RequestInterceptor requestInterceptor83 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(server7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNull(converter9);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "POST" + "'", str18, "POST");
        org.junit.Assert.assertNotNull(server19);
        org.junit.Assert.assertNull(errorHandler21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Retrofit-Idle" + "'", str24, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNull(log27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNull(server32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "default" + "'", str38, "default");
        org.junit.Assert.assertNotNull(log46);
        org.junit.Assert.assertNull(server48);
        org.junit.Assert.assertNull(executor51);
        org.junit.Assert.assertTrue("'" + logLevel52 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel52.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(request69);
        org.junit.Assert.assertNotNull(gsonConverter71);
        org.junit.Assert.assertNotNull(gsonConverter72);
        org.junit.Assert.assertNotNull(gsonConverter73);
        org.junit.Assert.assertNotNull(request74);
        org.junit.Assert.assertNotNull(requestInterceptor75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(requestInterceptor83);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = builder0.server;
        retrofit.converter.Converter converter2 = null;
        builder0.converter = converter2;
        retrofit.ErrorHandler errorHandler4 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter6.deserializeObjectConverter3();
        builder5.serializedObjectSupporter = serializedObjectSupporter6;
        java.util.concurrent.Executor executor10 = null;
        builder5.callbackExecutor = executor10;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder5.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor14 = builder13.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor15 = null;
        builder13.requestInterceptor = requestInterceptor15;
        java.util.concurrent.Executor executor17 = null;
        builder13.setcallbackExecutor(executor17);
        retrofit.Server server20 = new retrofit.Server("POST");
        retrofit.client.Client.Provider provider21 = null;
        java.util.concurrent.Executor executor22 = null;
        java.util.concurrent.Executor executor23 = null;
        retrofit.RequestInterceptor requestInterceptor24 = null;
        retrofit.Server server25 = null;
        retrofit.client.Client.Provider provider26 = null;
        java.util.concurrent.Executor executor27 = null;
        java.util.concurrent.Executor executor28 = null;
        retrofit.RequestInterceptor requestInterceptor29 = null;
        retrofit.converter.Converter converter30 = null;
        retrofit.Profiler profiler31 = null;
        retrofit.ErrorHandler errorHandler32 = null;
        retrofit.RestAdapter.Log log33 = null;
        retrofit.RestAdapter.LogLevel logLevel34 = null;
        retrofit.RestAdapter restAdapter35 = new retrofit.RestAdapter(server25, provider26, executor27, executor28, requestInterceptor29, converter30, profiler31, errorHandler32, log33, logLevel34);
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request37 = serializedObjectSupporter36.deserializeObjectRequest6();
        restAdapter35.serializedObjectSupporter = serializedObjectSupporter36;
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter36.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter40 = serializedObjectSupporter36.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter36.deserializeObjectConverter1();
        retrofit.Profiler profiler42 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request44 = serializedObjectSupporter43.deserializeObjectRequest6();
        java.lang.String str45 = serializedObjectSupporter43.deserializeObjectString4();
        java.lang.String str46 = serializedObjectSupporter43.deserializeObjectString5();
        retrofit.ErrorHandler errorHandler47 = serializedObjectSupporter43.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder48 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor49 = builder48.getcallbackExecutor();
        retrofit.Server server50 = builder48.server;
        retrofit.RestAdapter.Builder builder51 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider52 = null;
        builder51.setclientProvider(provider52);
        retrofit.Server server55 = new retrofit.Server("Retrofit-");
        java.lang.String str56 = server55.name;
        retrofit.client.Client.Provider provider57 = null;
        java.util.concurrent.Executor executor58 = null;
        java.util.concurrent.Executor executor59 = null;
        retrofit.RequestInterceptor requestInterceptor60 = null;
        retrofit.converter.Converter converter61 = null;
        retrofit.Profiler profiler62 = null;
        retrofit.ErrorHandler errorHandler63 = null;
        retrofit.RestAdapter.Log log64 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder65 = new retrofit.RestAdapter.Builder();
        retrofit.Server server66 = builder65.server;
        java.util.concurrent.Executor executor67 = null;
        builder65.httpExecutor = executor67;
        java.util.concurrent.Executor executor69 = builder65.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel70 = retrofit.RestAdapter.LogLevel.FULL;
        builder65.logLevel = logLevel70;
        retrofit.RestAdapter restAdapter72 = new retrofit.RestAdapter(server55, provider57, executor58, executor59, requestInterceptor60, converter61, profiler62, errorHandler63, log64, logLevel70);
        retrofit.RestAdapter.Builder builder73 = builder51.setLog(log64);
        retrofit.RestAdapter.Builder builder74 = builder48.setLog(log64);
        retrofit.RestAdapter.Builder builder75 = new retrofit.RestAdapter.Builder();
        retrofit.Server server76 = builder75.server;
        retrofit.converter.Converter converter77 = null;
        builder75.converter = converter77;
        retrofit.RestAdapter.Log log79 = builder75.log;
        retrofit.RestAdapter.LogLevel logLevel80 = builder75.logLevel;
        retrofit.RestAdapter restAdapter81 = new retrofit.RestAdapter(server20, provider21, executor22, executor23, requestInterceptor24, (retrofit.converter.Converter) gsonConverter41, profiler42, errorHandler47, log64, logLevel80);
        builder13.errorHandler = errorHandler47;
        java.util.concurrent.Executor executor83 = null;
        builder13.callbackExecutor = executor83;
        retrofit.RestAdapter.Builder builder85 = new retrofit.RestAdapter.Builder();
        retrofit.Server server86 = builder85.server;
        java.util.concurrent.Executor executor87 = null;
        builder85.httpExecutor = executor87;
        java.util.concurrent.Executor executor89 = null;
        builder85.callbackExecutor = executor89;
        java.util.concurrent.Executor executor91 = null;
        builder85.callbackExecutor = executor91;
        builder85.ensureSaneDefaults();
        retrofit.client.Client.Provider provider94 = builder85.clientProvider;
        builder13.clientProvider = provider94;
        builder5.setclientProvider(provider94);
        builder0.clientProvider = provider94;
        retrofit.RequestInterceptor requestInterceptor98 = builder0.requestInterceptor;
        org.junit.Assert.assertNull(server1);
        org.junit.Assert.assertNull(errorHandler4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-Idle" + "'", str7, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(serializedObjectSupporter12);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNotNull(request37);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(gsonConverter40);
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "http://example.com/" + "'", str45, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "POST" + "'", str46, "POST");
        org.junit.Assert.assertNotNull(errorHandler47);
        org.junit.Assert.assertNull(executor49);
        org.junit.Assert.assertNull(server50);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "default" + "'", str56, "default");
        org.junit.Assert.assertNotNull(log64);
        org.junit.Assert.assertNull(server66);
        org.junit.Assert.assertNull(executor69);
        org.junit.Assert.assertTrue("'" + logLevel70 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel70.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNull(server76);
        org.junit.Assert.assertNull(log79);
        org.junit.Assert.assertTrue("'" + logLevel80 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel80.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(server86);
        org.junit.Assert.assertNotNull(provider94);
        org.junit.Assert.assertNull(requestInterceptor98);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter11.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter11.deserializeObjectConverter1();
        retrofit.client.Request request17 = serializedObjectSupporter11.deserializeObjectRequest5();
        java.lang.String str18 = serializedObjectSupporter11.deserializeObjectString5();
        java.lang.String str19 = serializedObjectSupporter11.deserializeObjectString2();
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "POST" + "'", str18, "POST");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel14 = null;
        restAdapter10.logLevel = logLevel14;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel16;
        retrofit.client.Client.Provider provider18 = restAdapter10.clientProvider;
        retrofit.client.Client.Provider provider19 = restAdapter10.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor20 = restAdapter10.requestInterceptor;
        java.lang.String str21 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request23 = serializedObjectSupporter22.deserializeObjectRequest6();
        java.lang.String str24 = serializedObjectSupporter22.deserializeObjectString4();
        java.lang.String str25 = serializedObjectSupporter22.deserializeObjectString5();
        retrofit.ErrorHandler errorHandler26 = serializedObjectSupporter22.deserializeObjectErrorHandler1();
        retrofit.client.Request request27 = serializedObjectSupporter22.deserializeObjectRequest6();
        java.lang.String str28 = request27.getMethod();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request29 = restAdapter10.logAndReplaceRequest(request27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(requestInterceptor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-Idle" + "'", str21, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com/" + "'", str24, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "POST" + "'", str25, "POST");
        org.junit.Assert.assertNotNull(errorHandler26);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "GET" + "'", str28, "GET");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        retrofit.Server server1 = new retrofit.Server("Retrofit-");
        java.lang.String str2 = server1.name;
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.Server server12 = builder11.server;
        java.util.concurrent.Executor executor13 = null;
        builder11.httpExecutor = executor13;
        java.util.concurrent.Executor executor15 = builder11.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.FULL;
        builder11.logLevel = logLevel16;
        retrofit.RestAdapter restAdapter18 = new retrofit.RestAdapter(server1, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel16);
        java.util.concurrent.Executor executor19 = restAdapter18.getcallbackExecutor();
        int int20 = restAdapter18.getLOG_CHUNK_SIZE();
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = request25.getBody();
        java.lang.String str27 = request25.url;
        retrofit.mime.TypedOutput typedOutput28 = request25.getBody();
        java.lang.String str29 = request25.getUrl();
        retrofit.client.Request request30 = restAdapter18.logAndReplaceRequest(request25);
        retrofit.RequestInterceptor requestInterceptor31 = restAdapter18.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler32 = restAdapter18.new RestHandler();
        retrofit.Server server33 = restAdapter18.server;
        retrofit.converter.Converter converter34 = restAdapter18.converter;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4000 + "'", int20 == 4000);
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNull(requestInterceptor31);
        org.junit.Assert.assertNotNull(server33);
        org.junit.Assert.assertNull(converter34);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter11.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter11.deserializeObjectConverter6();
        retrofit.client.Request request18 = serializedObjectSupporter11.deserializeObjectRequest7();
        retrofit.client.Request request19 = serializedObjectSupporter11.deserializeObjectRequest7();
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(request19);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter7();
        java.lang.String str15 = serializedObjectSupporter11.deserializeObjectString1();
        retrofit.client.Request request16 = serializedObjectSupporter11.deserializeObjectRequest6();
        retrofit.Server server17 = serializedObjectSupporter11.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter11.deserializeObjectConverter2();
        retrofit.client.Request request19 = serializedObjectSupporter11.deserializeObjectRequest8();
        java.lang.String str20 = serializedObjectSupporter11.deserializeObjectString3();
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GET" + "'", str20, "GET");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        retrofit.Server server1 = new retrofit.Server("Retrofit-");
        java.lang.String str2 = server1.name;
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.Server server12 = builder11.server;
        java.util.concurrent.Executor executor13 = null;
        builder11.httpExecutor = executor13;
        java.util.concurrent.Executor executor15 = builder11.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.FULL;
        builder11.logLevel = logLevel16;
        retrofit.RestAdapter restAdapter18 = new retrofit.RestAdapter(server1, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel16);
        retrofit.client.Client.Provider provider19 = restAdapter18.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter18.logLevel;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.Server server22 = builder21.server;
        retrofit.Profiler profiler23 = builder21.profiler;
        retrofit.client.Client.Provider provider24 = null;
        builder21.setclientProvider(provider24);
        retrofit.RequestInterceptor requestInterceptor26 = builder21.requestInterceptor;
        retrofit.Server server27 = null;
        retrofit.client.Client.Provider provider28 = null;
        java.util.concurrent.Executor executor29 = null;
        java.util.concurrent.Executor executor30 = null;
        retrofit.RequestInterceptor requestInterceptor31 = null;
        retrofit.converter.Converter converter32 = null;
        retrofit.Profiler profiler33 = null;
        retrofit.ErrorHandler errorHandler34 = null;
        retrofit.RestAdapter.Log log35 = null;
        retrofit.RestAdapter.LogLevel logLevel36 = null;
        retrofit.RestAdapter restAdapter37 = new retrofit.RestAdapter(server27, provider28, executor29, executor30, requestInterceptor31, converter32, profiler33, errorHandler34, log35, logLevel36);
        retrofit.RestAdapter.RestHandler restHandler38 = restAdapter37.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler39 = restAdapter37.new RestHandler();
        java.util.concurrent.Executor executor40 = restAdapter37.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler41 = restAdapter37.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler42 = restAdapter37.new RestHandler();
        retrofit.Server server43 = restAdapter37.getserver();
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.Server server45 = builder44.server;
        retrofit.converter.Converter converter46 = null;
        builder44.converter = converter46;
        retrofit.RestAdapter.Log log48 = builder44.log;
        retrofit.RestAdapter.LogLevel logLevel49 = builder44.logLevel;
        boolean boolean50 = logLevel49.log();
        restAdapter37.logLevel = logLevel49;
        builder21.logLevel = logLevel49;
        restAdapter18.setLogLevel(logLevel49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(server22);
        org.junit.Assert.assertNull(profiler23);
        org.junit.Assert.assertNull(requestInterceptor26);
        org.junit.Assert.assertNull(executor40);
        org.junit.Assert.assertNull(server43);
        org.junit.Assert.assertNull(server45);
        org.junit.Assert.assertNull(log48);
        org.junit.Assert.assertTrue("'" + logLevel49 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel49.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.client.Request request2 = serializedObjectSupporter0.deserializeObjectRequest7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest2();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request7 = serializedObjectSupporter0.deserializeObjectRequest2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-Idle" + "'", str1, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "POST" + "'", str3, "POST");
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request7);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        retrofit.Server server2 = new retrofit.Server("Retrofit-Idle", "Retrofit-");
        java.lang.String str3 = server2.getapiUrl();
        retrofit.client.Client.Provider provider4 = null;
        java.util.concurrent.Executor executor5 = null;
        java.util.concurrent.Executor executor6 = null;
        retrofit.RequestInterceptor requestInterceptor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter8.deserializeObjectConverter7();
        retrofit.Profiler profiler12 = null;
        retrofit.ErrorHandler errorHandler13 = null;
        retrofit.RestAdapter.Log log14 = null;
        retrofit.Server server15 = null;
        retrofit.client.Client.Provider provider16 = null;
        java.util.concurrent.Executor executor17 = null;
        java.util.concurrent.Executor executor18 = null;
        retrofit.RequestInterceptor requestInterceptor19 = null;
        retrofit.converter.Converter converter20 = null;
        retrofit.Profiler profiler21 = null;
        retrofit.ErrorHandler errorHandler22 = null;
        retrofit.RestAdapter.Log log23 = null;
        retrofit.RestAdapter.LogLevel logLevel24 = null;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server15, provider16, executor17, executor18, requestInterceptor19, converter20, profiler21, errorHandler22, log23, logLevel24);
        retrofit.RestAdapter.RestHandler restHandler26 = restAdapter25.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter25.new RestHandler();
        java.util.concurrent.Executor executor28 = restAdapter25.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter25.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter25.logLevel = logLevel30;
        retrofit.RestAdapter restAdapter32 = new retrofit.RestAdapter(server2, provider4, executor5, executor6, requestInterceptor7, (retrofit.converter.Converter) gsonConverter11, profiler12, errorHandler13, log14, logLevel30);
        retrofit.RestAdapter.LogLevel logLevel33 = restAdapter32.logLevel;
        retrofit.RestAdapter.LogLevel logLevel34 = restAdapter32.getLogLevel();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNull(executor28);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-" + "'", str5, "Retrofit-");
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.getcallbackExecutor();
        retrofit.Server server2 = builder0.server;
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider4 = null;
        builder3.setclientProvider(provider4);
        retrofit.Server server7 = new retrofit.Server("Retrofit-");
        java.lang.String str8 = server7.name;
        retrofit.client.Client.Provider provider9 = null;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        retrofit.RequestInterceptor requestInterceptor12 = null;
        retrofit.converter.Converter converter13 = null;
        retrofit.Profiler profiler14 = null;
        retrofit.ErrorHandler errorHandler15 = null;
        retrofit.RestAdapter.Log log16 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.Server server18 = builder17.server;
        java.util.concurrent.Executor executor19 = null;
        builder17.httpExecutor = executor19;
        java.util.concurrent.Executor executor21 = builder17.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        builder17.logLevel = logLevel22;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server7, provider9, executor10, executor11, requestInterceptor12, converter13, profiler14, errorHandler15, log16, logLevel22);
        retrofit.RestAdapter.Builder builder25 = builder3.setLog(log16);
        retrofit.RestAdapter.Builder builder26 = builder0.setLog(log16);
        retrofit.Server server28 = new retrofit.Server("Retrofit-");
        java.lang.String str29 = server28.name;
        builder0.server = server28;
        java.util.concurrent.Executor executor31 = null;
        builder0.callbackExecutor = executor31;
        retrofit.Server server33 = builder0.server;
        retrofit.RestAdapter.LogLevel logLevel34 = null;
        builder0.logLevel = logLevel34;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(server2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "default" + "'", str8, "default");
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "default" + "'", str29, "default");
        org.junit.Assert.assertNotNull(server33);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler15 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.Log log16 = restAdapter10.log;
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertNull(log16);
        org.junit.Assert.assertNull(requestInterceptor17);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request16 = serializedObjectSupporter15.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString4();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter15.deserializeObjectConverter2();
        retrofit.client.Request request22 = serializedObjectSupporter15.deserializeObjectRequest2();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(request22);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.client.Request request2 = serializedObjectSupporter0.deserializeObjectRequest7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest2();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Request request7 = serializedObjectSupporter0.deserializeObjectRequest5();
        retrofit.client.Request request8 = serializedObjectSupporter0.deserializeObjectRequest2();
        retrofit.client.Request request9 = serializedObjectSupporter0.deserializeObjectRequest2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.Server server11 = serializedObjectSupporter0.deserializeObjectServer1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-Idle" + "'", str1, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "POST" + "'", str3, "POST");
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(server11);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest8();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter4 = serializedObjectSupporter0.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Retrofit-Idle" + "'", str1, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-Idle" + "'", str2, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request3);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter1.deserializeObjectConverter3();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.client.Request request5 = serializedObjectSupporter1.deserializeObjectRequest4();
        retrofit.Server server6 = serializedObjectSupporter1.deserializeObjectServer1();
        retrofit.client.Request request7 = serializedObjectSupporter1.deserializeObjectRequest7();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-Idle" + "'", str2, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(server6);
        org.junit.Assert.assertNotNull(request7);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter1.deserializeObjectConverter3();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor5 = null;
        builder0.callbackExecutor = executor5;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder0.serializedObjectSupporter;
        retrofit.mime.TypedString typedString8 = serializedObjectSupporter7.deserializeObjectTypedOutput2();
        retrofit.client.Request request9 = serializedObjectSupporter7.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter2();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString5();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-Idle" + "'", str2, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(typedString8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "POST" + "'", str11, "POST");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = builder0.server;
        retrofit.converter.Converter converter2 = null;
        builder0.converter = converter2;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        java.lang.String str5 = serializedObjectSupporter4.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter4.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter4.deserializeObjectConverter7();
        builder0.converter = gsonConverter7;
        retrofit.converter.Converter converter9 = builder0.converter;
        retrofit.Server server10 = builder0.server;
        retrofit.Server server11 = null;
        retrofit.client.Client.Provider provider12 = null;
        java.util.concurrent.Executor executor13 = null;
        java.util.concurrent.Executor executor14 = null;
        retrofit.RequestInterceptor requestInterceptor15 = null;
        retrofit.converter.Converter converter16 = null;
        retrofit.Profiler profiler17 = null;
        retrofit.ErrorHandler errorHandler18 = null;
        retrofit.RestAdapter.Log log19 = null;
        retrofit.RestAdapter.LogLevel logLevel20 = null;
        retrofit.RestAdapter restAdapter21 = new retrofit.RestAdapter(server11, provider12, executor13, executor14, requestInterceptor15, converter16, profiler17, errorHandler18, log19, logLevel20);
        retrofit.RestAdapter.RestHandler restHandler22 = restAdapter21.new RestHandler();
        retrofit.Server server23 = restAdapter21.server;
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter21.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor25 = restAdapter21.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request27 = serializedObjectSupporter26.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter26.deserializeObjectConverter1();
        java.lang.String str29 = serializedObjectSupporter26.deserializeObjectString4();
        java.lang.String str30 = serializedObjectSupporter26.deserializeObjectString4();
        restAdapter21.serializedObjectSupporter = serializedObjectSupporter26;
        retrofit.client.Request request32 = serializedObjectSupporter26.deserializeObjectRequest1();
        retrofit.client.Request request33 = serializedObjectSupporter26.deserializeObjectRequest3();
        retrofit.client.Request request34 = serializedObjectSupporter26.deserializeObjectRequest7();
        retrofit.client.Request request35 = serializedObjectSupporter26.deserializeObjectRequest5();
        retrofit.client.Request request36 = serializedObjectSupporter26.deserializeObjectRequest1();
        retrofit.ErrorHandler errorHandler37 = serializedObjectSupporter26.deserializeObjectErrorHandler1();
        builder0.errorHandler = errorHandler37;
        org.junit.Assert.assertNull(server1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Retrofit-Idle" + "'", str5, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(converter9);
        org.junit.Assert.assertNull(server10);
        org.junit.Assert.assertNull(server23);
        org.junit.Assert.assertNull(logLevel24);
        org.junit.Assert.assertNull(requestInterceptor25);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://example.com/" + "'", str30, "http://example.com/");
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(request36);
        org.junit.Assert.assertNotNull(errorHandler37);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = builder0.server;
        java.util.concurrent.Executor executor2 = null;
        builder0.httpExecutor = executor2;
        java.util.concurrent.Executor executor4 = builder0.httpExecutor;
        retrofit.ErrorHandler errorHandler5 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.Server server7 = builder6.server;
        retrofit.Profiler profiler8 = builder6.profiler;
        retrofit.ErrorHandler errorHandler9 = null;
        builder6.errorHandler = errorHandler9;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor12 = builder11.getcallbackExecutor();
        retrofit.Server server13 = builder11.server;
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider15 = null;
        builder14.setclientProvider(provider15);
        retrofit.Server server18 = new retrofit.Server("Retrofit-");
        java.lang.String str19 = server18.name;
        retrofit.client.Client.Provider provider20 = null;
        java.util.concurrent.Executor executor21 = null;
        java.util.concurrent.Executor executor22 = null;
        retrofit.RequestInterceptor requestInterceptor23 = null;
        retrofit.converter.Converter converter24 = null;
        retrofit.Profiler profiler25 = null;
        retrofit.ErrorHandler errorHandler26 = null;
        retrofit.RestAdapter.Log log27 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        retrofit.Server server29 = builder28.server;
        java.util.concurrent.Executor executor30 = null;
        builder28.httpExecutor = executor30;
        java.util.concurrent.Executor executor32 = builder28.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.FULL;
        builder28.logLevel = logLevel33;
        retrofit.RestAdapter restAdapter35 = new retrofit.RestAdapter(server18, provider20, executor21, executor22, requestInterceptor23, converter24, profiler25, errorHandler26, log27, logLevel33);
        retrofit.RestAdapter.Builder builder36 = builder14.setLog(log27);
        retrofit.RestAdapter.Builder builder37 = builder11.setLog(log27);
        retrofit.RestAdapter.Log log38 = builder37.log;
        log38.log("http://example.com");
        builder6.log = log38;
        builder0.log = log38;
        org.junit.Assert.assertNull(server1);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNull(errorHandler5);
        org.junit.Assert.assertNull(server7);
        org.junit.Assert.assertNull(profiler8);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "default" + "'", str19, "default");
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNull(server29);
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(log38);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        retrofit.Server server1 = new retrofit.Server("Retrofit-");
        java.lang.String str2 = server1.name;
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.Server server12 = builder11.server;
        java.util.concurrent.Executor executor13 = null;
        builder11.httpExecutor = executor13;
        java.util.concurrent.Executor executor15 = builder11.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.FULL;
        builder11.logLevel = logLevel16;
        retrofit.RestAdapter restAdapter18 = new retrofit.RestAdapter(server1, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel16);
        java.util.concurrent.Executor executor19 = restAdapter18.getcallbackExecutor();
        int int20 = restAdapter18.getLOG_CHUNK_SIZE();
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = request25.getBody();
        java.lang.String str27 = request25.url;
        retrofit.mime.TypedOutput typedOutput28 = request25.getBody();
        java.lang.String str29 = request25.getUrl();
        retrofit.client.Request request30 = restAdapter18.logAndReplaceRequest(request25);
        retrofit.RequestInterceptor requestInterceptor31 = restAdapter18.getrequestInterceptor();
        java.lang.Throwable throwable32 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter18.logException(throwable32, "http://example.com/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4000 + "'", int20 == 4000);
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNull(requestInterceptor31);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter11.deserializeObjectConverter7();
        java.lang.String str16 = serializedObjectSupporter11.deserializeObjectString3();
        java.lang.String str17 = serializedObjectSupporter11.deserializeObjectString1();
        retrofit.client.Request request18 = serializedObjectSupporter11.deserializeObjectRequest3();
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNotNull(request18);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter11.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter11.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(gsonConverter17);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest6();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest6();
        java.lang.String str7 = request6.method;
        java.lang.String str8 = request6.url;
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-Idle" + "'", str4, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GET" + "'", str7, "GET");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.getcallbackExecutor();
        retrofit.Server server2 = builder0.server;
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider4 = null;
        builder3.setclientProvider(provider4);
        retrofit.Server server7 = new retrofit.Server("Retrofit-");
        java.lang.String str8 = server7.name;
        retrofit.client.Client.Provider provider9 = null;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        retrofit.RequestInterceptor requestInterceptor12 = null;
        retrofit.converter.Converter converter13 = null;
        retrofit.Profiler profiler14 = null;
        retrofit.ErrorHandler errorHandler15 = null;
        retrofit.RestAdapter.Log log16 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.Server server18 = builder17.server;
        java.util.concurrent.Executor executor19 = null;
        builder17.httpExecutor = executor19;
        java.util.concurrent.Executor executor21 = builder17.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        builder17.logLevel = logLevel22;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server7, provider9, executor10, executor11, requestInterceptor12, converter13, profiler14, errorHandler15, log16, logLevel22);
        retrofit.RestAdapter.Builder builder25 = builder3.setLog(log16);
        retrofit.RestAdapter.Builder builder26 = builder0.setLog(log16);
        java.util.concurrent.Executor executor27 = builder26.getcallbackExecutor();
        builder26.ensureSaneDefaults();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(server2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "default" + "'", str8, "default");
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(executor27);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Server server16 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.Server server19 = new retrofit.Server("Retrofit-");
        java.lang.String str20 = server19.name;
        retrofit.client.Client.Provider provider21 = null;
        java.util.concurrent.Executor executor22 = null;
        java.util.concurrent.Executor executor23 = null;
        retrofit.RequestInterceptor requestInterceptor24 = null;
        retrofit.converter.Converter converter25 = null;
        retrofit.Profiler profiler26 = null;
        retrofit.ErrorHandler errorHandler27 = null;
        retrofit.RestAdapter.Log log28 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        retrofit.Server server30 = builder29.server;
        java.util.concurrent.Executor executor31 = null;
        builder29.httpExecutor = executor31;
        java.util.concurrent.Executor executor33 = builder29.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.FULL;
        builder29.logLevel = logLevel34;
        retrofit.RestAdapter restAdapter36 = new retrofit.RestAdapter(server19, provider21, executor22, executor23, requestInterceptor24, converter25, profiler26, errorHandler27, log28, logLevel34);
        java.util.concurrent.Executor executor37 = restAdapter36.getcallbackExecutor();
        retrofit.converter.Converter converter38 = restAdapter36.converter;
        retrofit.RestAdapter.LogLevel logLevel39 = restAdapter36.logLevel;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "default" + "'", str20, "default");
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNull(server30);
        org.junit.Assert.assertNull(executor33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertNull(converter38);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter1.deserializeObjectConverter3();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.getcallbackExecutor();
        retrofit.Server server10 = builder8.server;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider12 = null;
        builder11.setclientProvider(provider12);
        retrofit.Server server15 = new retrofit.Server("Retrofit-");
        java.lang.String str16 = server15.name;
        retrofit.client.Client.Provider provider17 = null;
        java.util.concurrent.Executor executor18 = null;
        java.util.concurrent.Executor executor19 = null;
        retrofit.RequestInterceptor requestInterceptor20 = null;
        retrofit.converter.Converter converter21 = null;
        retrofit.Profiler profiler22 = null;
        retrofit.ErrorHandler errorHandler23 = null;
        retrofit.RestAdapter.Log log24 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.Server server26 = builder25.server;
        java.util.concurrent.Executor executor27 = null;
        builder25.httpExecutor = executor27;
        java.util.concurrent.Executor executor29 = builder25.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.FULL;
        builder25.logLevel = logLevel30;
        retrofit.RestAdapter restAdapter32 = new retrofit.RestAdapter(server15, provider17, executor18, executor19, requestInterceptor20, converter21, profiler22, errorHandler23, log24, logLevel30);
        retrofit.RestAdapter.Builder builder33 = builder11.setLog(log24);
        retrofit.RestAdapter.Builder builder34 = builder8.setLog(log24);
        retrofit.Server server35 = null;
        retrofit.client.Client.Provider provider36 = null;
        java.util.concurrent.Executor executor37 = null;
        java.util.concurrent.Executor executor38 = null;
        retrofit.RequestInterceptor requestInterceptor39 = null;
        retrofit.converter.Converter converter40 = null;
        retrofit.Profiler profiler41 = null;
        retrofit.ErrorHandler errorHandler42 = null;
        retrofit.RestAdapter.Log log43 = null;
        retrofit.RestAdapter.LogLevel logLevel44 = null;
        retrofit.RestAdapter restAdapter45 = new retrofit.RestAdapter(server35, provider36, executor37, executor38, requestInterceptor39, converter40, profiler41, errorHandler42, log43, logLevel44);
        retrofit.SerializedObjectSupporter serializedObjectSupporter46 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request47 = serializedObjectSupporter46.deserializeObjectRequest6();
        restAdapter45.serializedObjectSupporter = serializedObjectSupporter46;
        retrofit.converter.GsonConverter gsonConverter49 = serializedObjectSupporter46.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter46.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter46.deserializeObjectConverter1();
        retrofit.client.Request request52 = serializedObjectSupporter46.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor53 = serializedObjectSupporter46.deserializeObjectRequestInterceptor1();
        builder34.requestInterceptor = requestInterceptor53;
        retrofit.RestAdapter.Builder builder55 = builder7.setRequestInterceptor(requestInterceptor53);
        retrofit.RestAdapter.LogLevel logLevel56 = builder55.logLevel;
        retrofit.Server server57 = null;
        retrofit.client.Client.Provider provider58 = null;
        java.util.concurrent.Executor executor59 = null;
        java.util.concurrent.Executor executor60 = null;
        retrofit.RequestInterceptor requestInterceptor61 = null;
        retrofit.converter.Converter converter62 = null;
        retrofit.Profiler profiler63 = null;
        retrofit.ErrorHandler errorHandler64 = null;
        retrofit.RestAdapter.Log log65 = null;
        retrofit.RestAdapter.LogLevel logLevel66 = null;
        retrofit.RestAdapter restAdapter67 = new retrofit.RestAdapter(server57, provider58, executor59, executor60, requestInterceptor61, converter62, profiler63, errorHandler64, log65, logLevel66);
        retrofit.SerializedObjectSupporter serializedObjectSupporter68 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request69 = serializedObjectSupporter68.deserializeObjectRequest6();
        restAdapter67.serializedObjectSupporter = serializedObjectSupporter68;
        retrofit.converter.GsonConverter gsonConverter71 = serializedObjectSupporter68.deserializeObjectConverter7();
        retrofit.Server server72 = serializedObjectSupporter68.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter73 = serializedObjectSupporter68.deserializeObjectConverter5();
        retrofit.Server server74 = serializedObjectSupporter68.deserializeObjectServer1();
        builder55.server = server74;
        retrofit.RestAdapter restAdapter76 = builder55.build();
        retrofit.RestAdapter.RestHandler restHandler77 = restAdapter76.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler78 = restAdapter76.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel79 = restAdapter76.logLevel;
        retrofit.RequestInterceptor requestInterceptor80 = restAdapter76.getrequestInterceptor();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-Idle" + "'", str2, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(server10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "default" + "'", str16, "default");
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNull(server26);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertNotNull(gsonConverter49);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNotNull(request52);
        org.junit.Assert.assertNotNull(requestInterceptor53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertTrue("'" + logLevel56 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel56.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(request69);
        org.junit.Assert.assertNotNull(gsonConverter71);
        org.junit.Assert.assertNotNull(server72);
        org.junit.Assert.assertNotNull(gsonConverter73);
        org.junit.Assert.assertNotNull(server74);
        org.junit.Assert.assertNotNull(restAdapter76);
        org.junit.Assert.assertTrue("'" + logLevel79 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel79.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(requestInterceptor80);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter17 = restAdapter10.getconverter();
        retrofit.converter.Converter converter18 = restAdapter10.converter;
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(converter18);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request16 = serializedObjectSupporter15.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString4();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.client.Request request21 = serializedObjectSupporter15.deserializeObjectRequest1();
        retrofit.client.Request request22 = serializedObjectSupporter15.deserializeObjectRequest3();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter15.deserializeObjectConverter5();
        retrofit.client.Request request24 = serializedObjectSupporter15.deserializeObjectRequest3();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(request24);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter1.deserializeObjectConverter3();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        retrofit.Server server7 = null;
        retrofit.client.Client.Provider provider8 = null;
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        retrofit.RequestInterceptor requestInterceptor11 = null;
        retrofit.converter.Converter converter12 = null;
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Log log15 = null;
        retrofit.RestAdapter.LogLevel logLevel16 = null;
        retrofit.RestAdapter restAdapter17 = new retrofit.RestAdapter(server7, provider8, executor9, executor10, requestInterceptor11, converter12, profiler13, errorHandler14, log15, logLevel16);
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request19 = serializedObjectSupporter18.deserializeObjectRequest6();
        restAdapter17.serializedObjectSupporter = serializedObjectSupporter18;
        java.lang.String str21 = serializedObjectSupporter18.deserializeObjectString4();
        retrofit.Server server22 = serializedObjectSupporter18.deserializeObjectServer1();
        retrofit.client.Request request23 = serializedObjectSupporter18.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter18.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter18.deserializeObjectConverter3();
        builder0.converter = gsonConverter25;
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor28 = builder27.getcallbackExecutor();
        retrofit.Server server29 = builder27.server;
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider31 = null;
        builder30.setclientProvider(provider31);
        retrofit.Server server34 = new retrofit.Server("Retrofit-");
        java.lang.String str35 = server34.name;
        retrofit.client.Client.Provider provider36 = null;
        java.util.concurrent.Executor executor37 = null;
        java.util.concurrent.Executor executor38 = null;
        retrofit.RequestInterceptor requestInterceptor39 = null;
        retrofit.converter.Converter converter40 = null;
        retrofit.Profiler profiler41 = null;
        retrofit.ErrorHandler errorHandler42 = null;
        retrofit.RestAdapter.Log log43 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.Server server45 = builder44.server;
        java.util.concurrent.Executor executor46 = null;
        builder44.httpExecutor = executor46;
        java.util.concurrent.Executor executor48 = builder44.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel49 = retrofit.RestAdapter.LogLevel.FULL;
        builder44.logLevel = logLevel49;
        retrofit.RestAdapter restAdapter51 = new retrofit.RestAdapter(server34, provider36, executor37, executor38, requestInterceptor39, converter40, profiler41, errorHandler42, log43, logLevel49);
        retrofit.RestAdapter.Builder builder52 = builder30.setLog(log43);
        retrofit.RestAdapter.Builder builder53 = builder27.setLog(log43);
        builder53.ensureSaneDefaults();
        java.util.concurrent.Executor executor55 = builder53.callbackExecutor;
        builder0.httpExecutor = executor55;
        java.util.concurrent.Executor executor57 = builder0.getcallbackExecutor();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-Idle" + "'", str2, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNull(executor28);
        org.junit.Assert.assertNull(server29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "default" + "'", str35, "default");
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertNull(server45);
        org.junit.Assert.assertNull(executor48);
        org.junit.Assert.assertTrue("'" + logLevel49 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel49.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(executor55);
        org.junit.Assert.assertNull(executor57);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor2 = null;
        builder0.requestInterceptor = requestInterceptor2;
        java.util.concurrent.Executor executor4 = null;
        builder0.setcallbackExecutor(executor4);
        retrofit.ErrorHandler errorHandler6 = builder0.errorHandler;
        java.util.concurrent.Executor executor7 = null;
        builder0.callbackExecutor = executor7;
        retrofit.Profiler profiler9 = builder0.profiler;
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(errorHandler6);
        org.junit.Assert.assertNull(profiler9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter11.deserializeObjectConverter7();
        retrofit.client.Request request16 = serializedObjectSupporter11.deserializeObjectRequest8();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter11.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(gsonConverter17);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest4();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Request request9 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = builder0.server;
        java.util.concurrent.Executor executor2 = null;
        builder0.httpExecutor = executor2;
        java.util.concurrent.Executor executor4 = builder0.httpExecutor;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.Server server8 = builder7.server;
        retrofit.converter.Converter converter9 = null;
        builder7.converter = converter9;
        retrofit.RestAdapter.Log log11 = builder7.log;
        retrofit.RestAdapter.LogLevel logLevel12 = builder7.logLevel;
        boolean boolean13 = logLevel12.log();
        retrofit.RestAdapter.Builder builder14 = builder0.setLogLevel(logLevel12);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.Server server16 = builder15.server;
        retrofit.converter.Converter converter17 = null;
        builder15.converter = converter17;
        retrofit.RestAdapter.Log log19 = builder15.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request21 = serializedObjectSupporter20.deserializeObjectRequest6();
        java.lang.String str22 = serializedObjectSupporter20.deserializeObjectString4();
        java.lang.String str23 = serializedObjectSupporter20.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler24 = serializedObjectSupporter20.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder25 = builder15.setErrorHandler(errorHandler24);
        retrofit.RestAdapter.Builder builder26 = builder14.setErrorHandler(errorHandler24);
        retrofit.Server server27 = builder14.server;
        retrofit.Server server29 = new retrofit.Server("Retrofit-");
        java.lang.String str30 = server29.name;
        retrofit.client.Client.Provider provider31 = null;
        java.util.concurrent.Executor executor32 = null;
        java.util.concurrent.Executor executor33 = null;
        retrofit.RequestInterceptor requestInterceptor34 = null;
        retrofit.converter.Converter converter35 = null;
        retrofit.Profiler profiler36 = null;
        retrofit.ErrorHandler errorHandler37 = null;
        retrofit.RestAdapter.Log log38 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        retrofit.Server server40 = builder39.server;
        java.util.concurrent.Executor executor41 = null;
        builder39.httpExecutor = executor41;
        java.util.concurrent.Executor executor43 = builder39.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel44 = retrofit.RestAdapter.LogLevel.FULL;
        builder39.logLevel = logLevel44;
        retrofit.RestAdapter restAdapter46 = new retrofit.RestAdapter(server29, provider31, executor32, executor33, requestInterceptor34, converter35, profiler36, errorHandler37, log38, logLevel44);
        java.util.concurrent.Executor executor47 = restAdapter46.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = restAdapter46.serializedObjectSupporter;
        retrofit.RequestInterceptor requestInterceptor49 = restAdapter46.requestInterceptor;
        java.util.concurrent.Executor executor50 = restAdapter46.httpExecutor;
        retrofit.RestAdapter.Log log51 = restAdapter46.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request53 = serializedObjectSupporter52.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter54 = serializedObjectSupporter52.deserializeObjectConverter1();
        retrofit.client.Request request55 = serializedObjectSupporter52.deserializeObjectRequest5();
        retrofit.mime.TypedOutput typedOutput56 = request55.getBody();
        retrofit.client.Request request57 = restAdapter46.logAndReplaceRequest(request55);
        retrofit.Server server59 = new retrofit.Server("Retrofit-");
        java.lang.String str60 = server59.name;
        retrofit.client.Client.Provider provider61 = null;
        java.util.concurrent.Executor executor62 = null;
        java.util.concurrent.Executor executor63 = null;
        retrofit.RequestInterceptor requestInterceptor64 = null;
        retrofit.converter.Converter converter65 = null;
        retrofit.Profiler profiler66 = null;
        retrofit.ErrorHandler errorHandler67 = null;
        retrofit.RestAdapter.Log log68 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder69 = new retrofit.RestAdapter.Builder();
        retrofit.Server server70 = builder69.server;
        java.util.concurrent.Executor executor71 = null;
        builder69.httpExecutor = executor71;
        java.util.concurrent.Executor executor73 = builder69.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel74 = retrofit.RestAdapter.LogLevel.FULL;
        builder69.logLevel = logLevel74;
        retrofit.RestAdapter restAdapter76 = new retrofit.RestAdapter(server59, provider61, executor62, executor63, requestInterceptor64, converter65, profiler66, errorHandler67, log68, logLevel74);
        retrofit.RestAdapter.LogLevel logLevel77 = restAdapter76.getLogLevel();
        restAdapter46.logLevel = logLevel77;
        retrofit.RestAdapter.Builder builder79 = builder14.setLogLevel(logLevel77);
        retrofit.SerializedObjectSupporter serializedObjectSupporter80 = builder79.serializedObjectSupporter;
        org.junit.Assert.assertNull(server1);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNull(server8);
        org.junit.Assert.assertNull(log11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(log19);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com/" + "'", str22, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(server27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "default" + "'", str30, "default");
        org.junit.Assert.assertNotNull(log38);
        org.junit.Assert.assertNull(server40);
        org.junit.Assert.assertNull(executor43);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor47);
        org.junit.Assert.assertNull(serializedObjectSupporter48);
        org.junit.Assert.assertNull(requestInterceptor49);
        org.junit.Assert.assertNull(executor50);
        org.junit.Assert.assertNotNull(log51);
        org.junit.Assert.assertNotNull(request53);
        org.junit.Assert.assertNotNull(gsonConverter54);
        org.junit.Assert.assertNotNull(request55);
        org.junit.Assert.assertNull(typedOutput56);
        org.junit.Assert.assertNotNull(request57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "default" + "'", str60, "default");
        org.junit.Assert.assertNotNull(log68);
        org.junit.Assert.assertNull(server70);
        org.junit.Assert.assertNull(executor73);
        org.junit.Assert.assertTrue("'" + logLevel74 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel74.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel77 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel77.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNull(serializedObjectSupporter80);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter1.deserializeObjectConverter3();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor5 = null;
        builder0.callbackExecutor = executor5;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder0.serializedObjectSupporter;
        retrofit.mime.TypedString typedString8 = serializedObjectSupporter7.deserializeObjectTypedOutput2();
        retrofit.client.Request request9 = serializedObjectSupporter7.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter7.deserializeObjectConverter7();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-Idle" + "'", str2, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(typedString8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(gsonConverter11);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.getcallbackExecutor();
        retrofit.Server server2 = builder0.server;
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider4 = null;
        builder3.setclientProvider(provider4);
        retrofit.Server server7 = new retrofit.Server("Retrofit-");
        java.lang.String str8 = server7.name;
        retrofit.client.Client.Provider provider9 = null;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        retrofit.RequestInterceptor requestInterceptor12 = null;
        retrofit.converter.Converter converter13 = null;
        retrofit.Profiler profiler14 = null;
        retrofit.ErrorHandler errorHandler15 = null;
        retrofit.RestAdapter.Log log16 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.Server server18 = builder17.server;
        java.util.concurrent.Executor executor19 = null;
        builder17.httpExecutor = executor19;
        java.util.concurrent.Executor executor21 = builder17.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.FULL;
        builder17.logLevel = logLevel22;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server7, provider9, executor10, executor11, requestInterceptor12, converter13, profiler14, errorHandler15, log16, logLevel22);
        retrofit.RestAdapter.Builder builder25 = builder3.setLog(log16);
        retrofit.RestAdapter.Builder builder26 = builder0.setLog(log16);
        retrofit.Profiler profiler27 = null;
        builder26.profiler = profiler27;
        java.util.concurrent.Executor executor29 = builder26.gethttpExecutor();
        retrofit.Server server31 = new retrofit.Server("Retrofit-");
        java.lang.String str32 = server31.name;
        retrofit.client.Client.Provider provider33 = null;
        java.util.concurrent.Executor executor34 = null;
        java.util.concurrent.Executor executor35 = null;
        retrofit.RequestInterceptor requestInterceptor36 = null;
        retrofit.converter.Converter converter37 = null;
        retrofit.Profiler profiler38 = null;
        retrofit.ErrorHandler errorHandler39 = null;
        retrofit.RestAdapter.Log log40 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.Server server42 = builder41.server;
        java.util.concurrent.Executor executor43 = null;
        builder41.httpExecutor = executor43;
        java.util.concurrent.Executor executor45 = builder41.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel46 = retrofit.RestAdapter.LogLevel.FULL;
        builder41.logLevel = logLevel46;
        retrofit.RestAdapter restAdapter48 = new retrofit.RestAdapter(server31, provider33, executor34, executor35, requestInterceptor36, converter37, profiler38, errorHandler39, log40, logLevel46);
        builder26.log = log40;
        retrofit.Server server50 = null;
        retrofit.client.Client.Provider provider51 = null;
        java.util.concurrent.Executor executor52 = null;
        java.util.concurrent.Executor executor53 = null;
        retrofit.RequestInterceptor requestInterceptor54 = null;
        retrofit.converter.Converter converter55 = null;
        retrofit.Profiler profiler56 = null;
        retrofit.ErrorHandler errorHandler57 = null;
        retrofit.RestAdapter.Log log58 = null;
        retrofit.RestAdapter.LogLevel logLevel59 = null;
        retrofit.RestAdapter restAdapter60 = new retrofit.RestAdapter(server50, provider51, executor52, executor53, requestInterceptor54, converter55, profiler56, errorHandler57, log58, logLevel59);
        retrofit.SerializedObjectSupporter serializedObjectSupporter61 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request62 = serializedObjectSupporter61.deserializeObjectRequest6();
        restAdapter60.serializedObjectSupporter = serializedObjectSupporter61;
        retrofit.converter.GsonConverter gsonConverter64 = serializedObjectSupporter61.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter65 = serializedObjectSupporter61.deserializeObjectConverter7();
        java.lang.String str66 = serializedObjectSupporter61.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter67 = serializedObjectSupporter61.deserializeObjectConverter1();
        retrofit.RestAdapter.Builder builder68 = builder26.setConverter((retrofit.converter.Converter) gsonConverter67);
        retrofit.converter.Converter converter69 = builder26.converter;
        retrofit.client.Client.Provider provider70 = builder26.clientProvider;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(server2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "default" + "'", str8, "default");
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(server18);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "default" + "'", str32, "default");
        org.junit.Assert.assertNotNull(log40);
        org.junit.Assert.assertNull(server42);
        org.junit.Assert.assertNull(executor45);
        org.junit.Assert.assertTrue("'" + logLevel46 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel46.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(request62);
        org.junit.Assert.assertNotNull(gsonConverter64);
        org.junit.Assert.assertNotNull(gsonConverter65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Retrofit-Idle" + "'", str66, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(converter69);
        org.junit.Assert.assertNull(provider70);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter1.deserializeObjectConverter3();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor5 = null;
        builder0.callbackExecutor = executor5;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor8 = null;
        builder0.callbackExecutor = executor8;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor11 = builder10.getcallbackExecutor();
        retrofit.Server server12 = builder10.server;
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider14 = null;
        builder13.setclientProvider(provider14);
        retrofit.Server server17 = new retrofit.Server("Retrofit-");
        java.lang.String str18 = server17.name;
        retrofit.client.Client.Provider provider19 = null;
        java.util.concurrent.Executor executor20 = null;
        java.util.concurrent.Executor executor21 = null;
        retrofit.RequestInterceptor requestInterceptor22 = null;
        retrofit.converter.Converter converter23 = null;
        retrofit.Profiler profiler24 = null;
        retrofit.ErrorHandler errorHandler25 = null;
        retrofit.RestAdapter.Log log26 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        retrofit.Server server28 = builder27.server;
        java.util.concurrent.Executor executor29 = null;
        builder27.httpExecutor = executor29;
        java.util.concurrent.Executor executor31 = builder27.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel32 = retrofit.RestAdapter.LogLevel.FULL;
        builder27.logLevel = logLevel32;
        retrofit.RestAdapter restAdapter34 = new retrofit.RestAdapter(server17, provider19, executor20, executor21, requestInterceptor22, converter23, profiler24, errorHandler25, log26, logLevel32);
        retrofit.RestAdapter.Builder builder35 = builder13.setLog(log26);
        retrofit.RestAdapter.Builder builder36 = builder10.setLog(log26);
        retrofit.Server server37 = null;
        retrofit.client.Client.Provider provider38 = null;
        java.util.concurrent.Executor executor39 = null;
        java.util.concurrent.Executor executor40 = null;
        retrofit.RequestInterceptor requestInterceptor41 = null;
        retrofit.converter.Converter converter42 = null;
        retrofit.Profiler profiler43 = null;
        retrofit.ErrorHandler errorHandler44 = null;
        retrofit.RestAdapter.Log log45 = null;
        retrofit.RestAdapter.LogLevel logLevel46 = null;
        retrofit.RestAdapter restAdapter47 = new retrofit.RestAdapter(server37, provider38, executor39, executor40, requestInterceptor41, converter42, profiler43, errorHandler44, log45, logLevel46);
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request49 = serializedObjectSupporter48.deserializeObjectRequest6();
        restAdapter47.serializedObjectSupporter = serializedObjectSupporter48;
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter48.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter48.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter53 = serializedObjectSupporter48.deserializeObjectConverter1();
        retrofit.client.Request request54 = serializedObjectSupporter48.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor55 = serializedObjectSupporter48.deserializeObjectRequestInterceptor1();
        builder36.requestInterceptor = requestInterceptor55;
        retrofit.RestAdapter.Builder builder57 = builder0.setRequestInterceptor(requestInterceptor55);
        retrofit.Server server58 = null;
        retrofit.client.Client.Provider provider59 = null;
        java.util.concurrent.Executor executor60 = null;
        java.util.concurrent.Executor executor61 = null;
        retrofit.RequestInterceptor requestInterceptor62 = null;
        retrofit.converter.Converter converter63 = null;
        retrofit.Profiler profiler64 = null;
        retrofit.ErrorHandler errorHandler65 = null;
        retrofit.RestAdapter.Log log66 = null;
        retrofit.RestAdapter.LogLevel logLevel67 = null;
        retrofit.RestAdapter restAdapter68 = new retrofit.RestAdapter(server58, provider59, executor60, executor61, requestInterceptor62, converter63, profiler64, errorHandler65, log66, logLevel67);
        retrofit.SerializedObjectSupporter serializedObjectSupporter69 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request70 = serializedObjectSupporter69.deserializeObjectRequest6();
        restAdapter68.serializedObjectSupporter = serializedObjectSupporter69;
        retrofit.converter.GsonConverter gsonConverter72 = serializedObjectSupporter69.deserializeObjectConverter6();
        builder57.converter = gsonConverter72;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-Idle" + "'", str2, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(serializedObjectSupporter7);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "default" + "'", str18, "default");
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNull(server28);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(request49);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertNotNull(gsonConverter53);
        org.junit.Assert.assertNotNull(request54);
        org.junit.Assert.assertNotNull(requestInterceptor55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(request70);
        org.junit.Assert.assertNotNull(gsonConverter72);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Request request4 = serializedObjectSupporter0.deserializeObjectRequest5();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest8();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(request6);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.Server server14 = null;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = null;
        retrofit.RestAdapter.LogLevel logLevel23 = null;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server14, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel23);
        retrofit.RestAdapter.RestHandler restHandler25 = restAdapter24.new RestHandler();
        retrofit.Server server26 = restAdapter24.server;
        retrofit.RestAdapter.LogLevel logLevel27 = restAdapter24.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor28 = restAdapter24.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request30 = serializedObjectSupporter29.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter29.deserializeObjectConverter1();
        java.lang.String str32 = serializedObjectSupporter29.deserializeObjectString4();
        java.lang.String str33 = serializedObjectSupporter29.deserializeObjectString4();
        restAdapter24.serializedObjectSupporter = serializedObjectSupporter29;
        retrofit.ErrorHandler errorHandler35 = restAdapter24.geterrorHandler();
        java.util.concurrent.Executor executor36 = restAdapter24.httpExecutor;
        retrofit.RestAdapter.Builder builder37 = new retrofit.RestAdapter.Builder();
        retrofit.Server server38 = builder37.server;
        retrofit.converter.Converter converter39 = null;
        builder37.converter = converter39;
        retrofit.RestAdapter.Log log41 = builder37.log;
        retrofit.RestAdapter.LogLevel logLevel42 = builder37.logLevel;
        restAdapter24.logLevel = logLevel42;
        retrofit.RequestInterceptor requestInterceptor44 = restAdapter24.requestInterceptor;
        retrofit.RestAdapter.RestHandler restHandler45 = restAdapter24.new RestHandler();
        retrofit.Profiler profiler46 = restAdapter24.profiler;
        retrofit.RestAdapter.Log log47 = restAdapter24.log;
        java.lang.reflect.Method method48 = null;
        java.lang.Object[] objArray49 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = restHandler13.invoke((java.lang.Object) log47, method48, objArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server26);
        org.junit.Assert.assertNull(logLevel27);
        org.junit.Assert.assertNull(requestInterceptor28);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "http://example.com/" + "'", str32, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler35);
        org.junit.Assert.assertNull(executor36);
        org.junit.Assert.assertNull(server38);
        org.junit.Assert.assertNull(log41);
        org.junit.Assert.assertTrue("'" + logLevel42 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel42.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(requestInterceptor44);
        org.junit.Assert.assertNull(profiler46);
        org.junit.Assert.assertNull(log47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = builder0.server;
        java.util.concurrent.Executor executor2 = null;
        builder0.httpExecutor = executor2;
        java.util.concurrent.Executor executor4 = builder0.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel5 = retrofit.RestAdapter.LogLevel.FULL;
        builder0.logLevel = logLevel5;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter3();
        builder7.serializedObjectSupporter = serializedObjectSupporter8;
        java.util.concurrent.Executor executor12 = null;
        builder7.callbackExecutor = executor12;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = builder7.serializedObjectSupporter;
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString1();
        retrofit.mime.TypedString typedString16 = serializedObjectSupporter14.deserializeObjectTypedOutput2();
        retrofit.Server server17 = serializedObjectSupporter14.deserializeObjectServer1();
        retrofit.RequestInterceptor requestInterceptor18 = serializedObjectSupporter14.deserializeObjectRequestInterceptor1();
        builder0.requestInterceptor = requestInterceptor18;
        org.junit.Assert.assertNull(server1);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(serializedObjectSupporter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNotNull(typedString16);
        org.junit.Assert.assertNotNull(server17);
        org.junit.Assert.assertNotNull(requestInterceptor18);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        retrofit.Server server1 = new retrofit.Server("Retrofit-");
        java.lang.String str2 = server1.name;
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.Server server12 = builder11.server;
        java.util.concurrent.Executor executor13 = null;
        builder11.httpExecutor = executor13;
        java.util.concurrent.Executor executor15 = builder11.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.FULL;
        builder11.logLevel = logLevel16;
        retrofit.RestAdapter restAdapter18 = new retrofit.RestAdapter(server1, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel16);
        java.util.concurrent.Executor executor19 = restAdapter18.getcallbackExecutor();
        int int20 = restAdapter18.getLOG_CHUNK_SIZE();
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = request25.getBody();
        java.lang.String str27 = request25.url;
        retrofit.mime.TypedOutput typedOutput28 = request25.getBody();
        java.lang.String str29 = request25.getUrl();
        retrofit.client.Request request30 = restAdapter18.logAndReplaceRequest(request25);
        retrofit.RequestInterceptor requestInterceptor31 = restAdapter18.getrequestInterceptor();
        java.lang.String str32 = restAdapter18.getTHREAD_PREFIX();
        retrofit.Server server33 = restAdapter18.getserver();
        java.lang.String str34 = server33.getUrl();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4000 + "'", int20 == 4000);
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNull(requestInterceptor31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Retrofit-" + "'", str32, "Retrofit-");
        org.junit.Assert.assertNotNull(server33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Retrofit-" + "'", str34, "Retrofit-");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.getcallbackExecutor();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        java.lang.String str14 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        int int16 = restAdapter10.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-Idle" + "'", str14, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4000 + "'", int16 == 4000);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.Server server14 = restAdapter10.server;
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        retrofit.Server server1 = new retrofit.Server("Retrofit-");
        java.lang.String str2 = server1.name;
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.Server server12 = builder11.server;
        java.util.concurrent.Executor executor13 = null;
        builder11.httpExecutor = executor13;
        java.util.concurrent.Executor executor15 = builder11.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.FULL;
        builder11.logLevel = logLevel16;
        retrofit.RestAdapter restAdapter18 = new retrofit.RestAdapter(server1, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel16);
        java.util.concurrent.Executor executor19 = restAdapter18.getcallbackExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = restAdapter18.serializedObjectSupporter;
        retrofit.RequestInterceptor requestInterceptor21 = restAdapter18.requestInterceptor;
        java.util.concurrent.Executor executor22 = restAdapter18.httpExecutor;
        retrofit.ErrorHandler errorHandler23 = restAdapter18.geterrorHandler();
        int int24 = restAdapter18.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(serializedObjectSupporter20);
        org.junit.Assert.assertNull(requestInterceptor21);
        org.junit.Assert.assertNull(executor22);
        org.junit.Assert.assertNull(errorHandler23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4000 + "'", int24 == 4000);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        int int14 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4000 + "'", int14 == 4000);
        org.junit.Assert.assertNull(requestInterceptor16);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.getcallbackExecutor();
        retrofit.Server server2 = builder0.server;
        retrofit.RestAdapter.Log log3 = builder0.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request5 = serializedObjectSupporter4.deserializeObjectRequest6();
        java.lang.String str6 = serializedObjectSupporter4.deserializeObjectString4();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString5();
        retrofit.ErrorHandler errorHandler8 = serializedObjectSupporter4.deserializeObjectErrorHandler1();
        builder0.errorHandler = errorHandler8;
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor11 = builder10.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor12 = null;
        builder10.requestInterceptor = requestInterceptor12;
        java.util.concurrent.Executor executor14 = null;
        builder10.setcallbackExecutor(executor14);
        retrofit.Server server17 = new retrofit.Server("POST");
        retrofit.client.Client.Provider provider18 = null;
        java.util.concurrent.Executor executor19 = null;
        java.util.concurrent.Executor executor20 = null;
        retrofit.RequestInterceptor requestInterceptor21 = null;
        retrofit.Server server22 = null;
        retrofit.client.Client.Provider provider23 = null;
        java.util.concurrent.Executor executor24 = null;
        java.util.concurrent.Executor executor25 = null;
        retrofit.RequestInterceptor requestInterceptor26 = null;
        retrofit.converter.Converter converter27 = null;
        retrofit.Profiler profiler28 = null;
        retrofit.ErrorHandler errorHandler29 = null;
        retrofit.RestAdapter.Log log30 = null;
        retrofit.RestAdapter.LogLevel logLevel31 = null;
        retrofit.RestAdapter restAdapter32 = new retrofit.RestAdapter(server22, provider23, executor24, executor25, requestInterceptor26, converter27, profiler28, errorHandler29, log30, logLevel31);
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request34 = serializedObjectSupporter33.deserializeObjectRequest6();
        restAdapter32.serializedObjectSupporter = serializedObjectSupporter33;
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter33.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter33.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter33.deserializeObjectConverter1();
        retrofit.Profiler profiler39 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request41 = serializedObjectSupporter40.deserializeObjectRequest6();
        java.lang.String str42 = serializedObjectSupporter40.deserializeObjectString4();
        java.lang.String str43 = serializedObjectSupporter40.deserializeObjectString5();
        retrofit.ErrorHandler errorHandler44 = serializedObjectSupporter40.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder45 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor46 = builder45.getcallbackExecutor();
        retrofit.Server server47 = builder45.server;
        retrofit.RestAdapter.Builder builder48 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider49 = null;
        builder48.setclientProvider(provider49);
        retrofit.Server server52 = new retrofit.Server("Retrofit-");
        java.lang.String str53 = server52.name;
        retrofit.client.Client.Provider provider54 = null;
        java.util.concurrent.Executor executor55 = null;
        java.util.concurrent.Executor executor56 = null;
        retrofit.RequestInterceptor requestInterceptor57 = null;
        retrofit.converter.Converter converter58 = null;
        retrofit.Profiler profiler59 = null;
        retrofit.ErrorHandler errorHandler60 = null;
        retrofit.RestAdapter.Log log61 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder62 = new retrofit.RestAdapter.Builder();
        retrofit.Server server63 = builder62.server;
        java.util.concurrent.Executor executor64 = null;
        builder62.httpExecutor = executor64;
        java.util.concurrent.Executor executor66 = builder62.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel67 = retrofit.RestAdapter.LogLevel.FULL;
        builder62.logLevel = logLevel67;
        retrofit.RestAdapter restAdapter69 = new retrofit.RestAdapter(server52, provider54, executor55, executor56, requestInterceptor57, converter58, profiler59, errorHandler60, log61, logLevel67);
        retrofit.RestAdapter.Builder builder70 = builder48.setLog(log61);
        retrofit.RestAdapter.Builder builder71 = builder45.setLog(log61);
        retrofit.RestAdapter.Builder builder72 = new retrofit.RestAdapter.Builder();
        retrofit.Server server73 = builder72.server;
        retrofit.converter.Converter converter74 = null;
        builder72.converter = converter74;
        retrofit.RestAdapter.Log log76 = builder72.log;
        retrofit.RestAdapter.LogLevel logLevel77 = builder72.logLevel;
        retrofit.RestAdapter restAdapter78 = new retrofit.RestAdapter(server17, provider18, executor19, executor20, requestInterceptor21, (retrofit.converter.Converter) gsonConverter38, profiler39, errorHandler44, log61, logLevel77);
        builder10.errorHandler = errorHandler44;
        java.util.concurrent.Executor executor80 = null;
        builder10.callbackExecutor = executor80;
        retrofit.RestAdapter.Builder builder82 = new retrofit.RestAdapter.Builder();
        retrofit.Server server83 = builder82.server;
        java.util.concurrent.Executor executor84 = null;
        builder82.httpExecutor = executor84;
        java.util.concurrent.Executor executor86 = null;
        builder82.callbackExecutor = executor86;
        java.util.concurrent.Executor executor88 = null;
        builder82.callbackExecutor = executor88;
        builder82.ensureSaneDefaults();
        retrofit.client.Client.Provider provider91 = builder82.clientProvider;
        builder10.clientProvider = provider91;
        retrofit.RestAdapter.LogLevel logLevel93 = builder10.logLevel;
        boolean boolean94 = logLevel93.log();
        retrofit.RestAdapter.Builder builder95 = builder0.setLogLevel(logLevel93);
        retrofit.client.Client.Provider provider96 = builder95.clientProvider;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(server2);
        org.junit.Assert.assertNull(log3);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "POST" + "'", str7, "POST");
        org.junit.Assert.assertNotNull(errorHandler8);
        org.junit.Assert.assertNull(executor11);
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "http://example.com/" + "'", str42, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "POST" + "'", str43, "POST");
        org.junit.Assert.assertNotNull(errorHandler44);
        org.junit.Assert.assertNull(executor46);
        org.junit.Assert.assertNull(server47);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "default" + "'", str53, "default");
        org.junit.Assert.assertNotNull(log61);
        org.junit.Assert.assertNull(server63);
        org.junit.Assert.assertNull(executor66);
        org.junit.Assert.assertTrue("'" + logLevel67 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel67.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNull(server73);
        org.junit.Assert.assertNull(log76);
        org.junit.Assert.assertTrue("'" + logLevel77 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel77.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(server83);
        org.junit.Assert.assertNotNull(provider91);
        org.junit.Assert.assertTrue("'" + logLevel93 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel93.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNull(provider96);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel14 = null;
        restAdapter10.logLevel = logLevel14;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel16;
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor19 = restAdapter10.callbackExecutor;
        int int20 = restAdapter10.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4000 + "'", int20 == 4000);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.getcallbackExecutor();
        retrofit.Server server2 = builder0.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.converter.Converter converter4 = builder0.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString2();
        retrofit.client.Request request7 = serializedObjectSupporter5.deserializeObjectRequest7();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString5();
        retrofit.Server server9 = serializedObjectSupporter5.deserializeObjectServer1();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.ErrorHandler errorHandler11 = builder0.errorHandler;
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor13 = builder12.getcallbackExecutor();
        retrofit.Server server14 = builder12.server;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider16 = null;
        builder15.setclientProvider(provider16);
        retrofit.Server server19 = new retrofit.Server("Retrofit-");
        java.lang.String str20 = server19.name;
        retrofit.client.Client.Provider provider21 = null;
        java.util.concurrent.Executor executor22 = null;
        java.util.concurrent.Executor executor23 = null;
        retrofit.RequestInterceptor requestInterceptor24 = null;
        retrofit.converter.Converter converter25 = null;
        retrofit.Profiler profiler26 = null;
        retrofit.ErrorHandler errorHandler27 = null;
        retrofit.RestAdapter.Log log28 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        retrofit.Server server30 = builder29.server;
        java.util.concurrent.Executor executor31 = null;
        builder29.httpExecutor = executor31;
        java.util.concurrent.Executor executor33 = builder29.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.FULL;
        builder29.logLevel = logLevel34;
        retrofit.RestAdapter restAdapter36 = new retrofit.RestAdapter(server19, provider21, executor22, executor23, requestInterceptor24, converter25, profiler26, errorHandler27, log28, logLevel34);
        retrofit.RestAdapter.Builder builder37 = builder15.setLog(log28);
        retrofit.RestAdapter.Builder builder38 = builder12.setLog(log28);
        retrofit.RestAdapter.Log log39 = builder38.log;
        builder0.log = log39;
        retrofit.Server server41 = null;
        retrofit.client.Client.Provider provider42 = null;
        java.util.concurrent.Executor executor43 = null;
        java.util.concurrent.Executor executor44 = null;
        retrofit.RequestInterceptor requestInterceptor45 = null;
        retrofit.converter.Converter converter46 = null;
        retrofit.Profiler profiler47 = null;
        retrofit.ErrorHandler errorHandler48 = null;
        retrofit.RestAdapter.Log log49 = null;
        retrofit.RestAdapter.LogLevel logLevel50 = null;
        retrofit.RestAdapter restAdapter51 = new retrofit.RestAdapter(server41, provider42, executor43, executor44, requestInterceptor45, converter46, profiler47, errorHandler48, log49, logLevel50);
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request53 = serializedObjectSupporter52.deserializeObjectRequest6();
        restAdapter51.serializedObjectSupporter = serializedObjectSupporter52;
        retrofit.converter.GsonConverter gsonConverter55 = serializedObjectSupporter52.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter56 = serializedObjectSupporter52.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter57 = serializedObjectSupporter52.deserializeObjectConverter1();
        retrofit.ErrorHandler errorHandler58 = serializedObjectSupporter52.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder59 = builder0.setErrorHandler(errorHandler58);
        retrofit.SerializedObjectSupporter serializedObjectSupporter60 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request61 = serializedObjectSupporter60.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter62 = serializedObjectSupporter60.deserializeObjectConverter1();
        java.lang.String str63 = serializedObjectSupporter60.deserializeObjectString4();
        java.lang.String str64 = serializedObjectSupporter60.deserializeObjectString1();
        retrofit.client.Request request65 = serializedObjectSupporter60.deserializeObjectRequest2();
        retrofit.RequestInterceptor requestInterceptor66 = serializedObjectSupporter60.deserializeObjectRequestInterceptor1();
        retrofit.RestAdapter.Builder builder67 = builder59.setRequestInterceptor(requestInterceptor66);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(server2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-Idle" + "'", str6, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "POST" + "'", str8, "POST");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "default" + "'", str20, "default");
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNull(server30);
        org.junit.Assert.assertNull(executor33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(log39);
        org.junit.Assert.assertNotNull(request53);
        org.junit.Assert.assertNotNull(gsonConverter55);
        org.junit.Assert.assertNotNull(gsonConverter56);
        org.junit.Assert.assertNotNull(gsonConverter57);
        org.junit.Assert.assertNotNull(errorHandler58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(request61);
        org.junit.Assert.assertNotNull(gsonConverter62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "http://example.com/" + "'", str63, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Retrofit-" + "'", str64, "Retrofit-");
        org.junit.Assert.assertNotNull(request65);
        org.junit.Assert.assertNotNull(requestInterceptor66);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        java.util.concurrent.Executor executor13 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restAdapter10.serializedObjectSupporter;
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.logLevel;
        retrofit.RestAdapter.Log log20 = restAdapter10.log;
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(log15);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(log20);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request16 = serializedObjectSupporter15.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString4();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter15;
        java.util.concurrent.Executor executor21 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler22 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler23 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler24 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor25 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNull(executor25);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter1.deserializeObjectConverter3();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        java.util.concurrent.Executor executor5 = null;
        builder0.httpExecutor = executor5;
        retrofit.Server server7 = null;
        retrofit.client.Client.Provider provider8 = null;
        java.util.concurrent.Executor executor9 = null;
        java.util.concurrent.Executor executor10 = null;
        retrofit.RequestInterceptor requestInterceptor11 = null;
        retrofit.converter.Converter converter12 = null;
        retrofit.Profiler profiler13 = null;
        retrofit.ErrorHandler errorHandler14 = null;
        retrofit.RestAdapter.Log log15 = null;
        retrofit.RestAdapter.LogLevel logLevel16 = null;
        retrofit.RestAdapter restAdapter17 = new retrofit.RestAdapter(server7, provider8, executor9, executor10, requestInterceptor11, converter12, profiler13, errorHandler14, log15, logLevel16);
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request19 = serializedObjectSupporter18.deserializeObjectRequest6();
        restAdapter17.serializedObjectSupporter = serializedObjectSupporter18;
        java.lang.String str21 = serializedObjectSupporter18.deserializeObjectString4();
        retrofit.Server server22 = serializedObjectSupporter18.deserializeObjectServer1();
        retrofit.client.Request request23 = serializedObjectSupporter18.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter18.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter18.deserializeObjectConverter3();
        builder0.converter = gsonConverter25;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = builder0.serializedObjectSupporter;
        retrofit.client.Request request28 = serializedObjectSupporter27.deserializeObjectRequest1();
        java.lang.String str29 = serializedObjectSupporter27.deserializeObjectString1();
        retrofit.client.Request request30 = serializedObjectSupporter27.deserializeObjectRequest4();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-Idle" + "'", str2, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://example.com/" + "'", str21, "http://example.com/");
        org.junit.Assert.assertNotNull(server22);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(serializedObjectSupporter27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Retrofit-" + "'", str29, "Retrofit-");
        org.junit.Assert.assertNotNull(request30);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = builder0.server;
        retrofit.Profiler profiler2 = builder0.profiler;
        retrofit.client.Client.Provider provider3 = null;
        builder0.setclientProvider(provider3);
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider6 = null;
        builder0.clientProvider = provider6;
        retrofit.Server server8 = null;
        retrofit.client.Client.Provider provider9 = null;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        retrofit.RequestInterceptor requestInterceptor12 = null;
        retrofit.converter.Converter converter13 = null;
        retrofit.Profiler profiler14 = null;
        retrofit.ErrorHandler errorHandler15 = null;
        retrofit.RestAdapter.Log log16 = null;
        retrofit.RestAdapter.LogLevel logLevel17 = null;
        retrofit.RestAdapter restAdapter18 = new retrofit.RestAdapter(server8, provider9, executor10, executor11, requestInterceptor12, converter13, profiler14, errorHandler15, log16, logLevel17);
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request20 = serializedObjectSupporter19.deserializeObjectRequest6();
        restAdapter18.serializedObjectSupporter = serializedObjectSupporter19;
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter19.deserializeObjectConverter7();
        builder0.converter = gsonConverter22;
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        java.lang.String str26 = serializedObjectSupporter25.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter3();
        builder24.serializedObjectSupporter = serializedObjectSupporter25;
        retrofit.RestAdapter.Log log29 = builder24.log;
        retrofit.RestAdapter.Builder builder31 = builder24.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor33 = builder32.getcallbackExecutor();
        retrofit.Server server34 = builder32.server;
        retrofit.RestAdapter.Builder builder35 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider36 = null;
        builder35.setclientProvider(provider36);
        retrofit.Server server39 = new retrofit.Server("Retrofit-");
        java.lang.String str40 = server39.name;
        retrofit.client.Client.Provider provider41 = null;
        java.util.concurrent.Executor executor42 = null;
        java.util.concurrent.Executor executor43 = null;
        retrofit.RequestInterceptor requestInterceptor44 = null;
        retrofit.converter.Converter converter45 = null;
        retrofit.Profiler profiler46 = null;
        retrofit.ErrorHandler errorHandler47 = null;
        retrofit.RestAdapter.Log log48 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        retrofit.Server server50 = builder49.server;
        java.util.concurrent.Executor executor51 = null;
        builder49.httpExecutor = executor51;
        java.util.concurrent.Executor executor53 = builder49.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel54 = retrofit.RestAdapter.LogLevel.FULL;
        builder49.logLevel = logLevel54;
        retrofit.RestAdapter restAdapter56 = new retrofit.RestAdapter(server39, provider41, executor42, executor43, requestInterceptor44, converter45, profiler46, errorHandler47, log48, logLevel54);
        retrofit.RestAdapter.Builder builder57 = builder35.setLog(log48);
        retrofit.RestAdapter.Builder builder58 = builder32.setLog(log48);
        retrofit.Server server59 = null;
        retrofit.client.Client.Provider provider60 = null;
        java.util.concurrent.Executor executor61 = null;
        java.util.concurrent.Executor executor62 = null;
        retrofit.RequestInterceptor requestInterceptor63 = null;
        retrofit.converter.Converter converter64 = null;
        retrofit.Profiler profiler65 = null;
        retrofit.ErrorHandler errorHandler66 = null;
        retrofit.RestAdapter.Log log67 = null;
        retrofit.RestAdapter.LogLevel logLevel68 = null;
        retrofit.RestAdapter restAdapter69 = new retrofit.RestAdapter(server59, provider60, executor61, executor62, requestInterceptor63, converter64, profiler65, errorHandler66, log67, logLevel68);
        retrofit.SerializedObjectSupporter serializedObjectSupporter70 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request71 = serializedObjectSupporter70.deserializeObjectRequest6();
        restAdapter69.serializedObjectSupporter = serializedObjectSupporter70;
        retrofit.converter.GsonConverter gsonConverter73 = serializedObjectSupporter70.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter74 = serializedObjectSupporter70.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter75 = serializedObjectSupporter70.deserializeObjectConverter1();
        retrofit.client.Request request76 = serializedObjectSupporter70.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor77 = serializedObjectSupporter70.deserializeObjectRequestInterceptor1();
        builder58.requestInterceptor = requestInterceptor77;
        retrofit.RestAdapter.Builder builder79 = builder31.setRequestInterceptor(requestInterceptor77);
        java.util.concurrent.Executor executor80 = builder31.httpExecutor;
        java.util.concurrent.Executor executor81 = builder31.getcallbackExecutor();
        retrofit.Profiler profiler82 = null;
        builder31.profiler = profiler82;
        retrofit.Server server86 = new retrofit.Server("Retrofit-Idle", "Retrofit-");
        java.lang.String str87 = server86.getapiUrl();
        builder31.server = server86;
        builder0.server = server86;
        retrofit.RestAdapter.Log log90 = builder0.log;
        org.junit.Assert.assertNull(server1);
        org.junit.Assert.assertNull(profiler2);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Retrofit-Idle" + "'", str26, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNull(log29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(executor33);
        org.junit.Assert.assertNull(server34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "default" + "'", str40, "default");
        org.junit.Assert.assertNotNull(log48);
        org.junit.Assert.assertNull(server50);
        org.junit.Assert.assertNull(executor53);
        org.junit.Assert.assertTrue("'" + logLevel54 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel54.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(request71);
        org.junit.Assert.assertNotNull(gsonConverter73);
        org.junit.Assert.assertNotNull(gsonConverter74);
        org.junit.Assert.assertNotNull(gsonConverter75);
        org.junit.Assert.assertNotNull(request76);
        org.junit.Assert.assertNotNull(requestInterceptor77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNull(executor80);
        org.junit.Assert.assertNull(executor81);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Retrofit-Idle" + "'", str87, "Retrofit-Idle");
        org.junit.Assert.assertNull(log90);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.url;
        retrofit.mime.TypedOutput typedOutput11 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString2();
        retrofit.mime.TypedString typedString20 = serializedObjectSupporter18.deserializeObjectTypedOutput2();
        retrofit.client.Request request21 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList16, (retrofit.mime.TypedOutput) typedString20);
        retrofit.client.Request request22 = new retrofit.client.Request("Retrofit-", "", headerList12, (retrofit.mime.TypedOutput) typedString20);
        retrofit.Server server24 = new retrofit.Server("Retrofit-");
        java.lang.String str25 = server24.name;
        retrofit.client.Client.Provider provider26 = null;
        java.util.concurrent.Executor executor27 = null;
        java.util.concurrent.Executor executor28 = null;
        retrofit.RequestInterceptor requestInterceptor29 = null;
        retrofit.converter.Converter converter30 = null;
        retrofit.Profiler profiler31 = null;
        retrofit.ErrorHandler errorHandler32 = null;
        retrofit.RestAdapter.Log log33 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        retrofit.Server server35 = builder34.server;
        java.util.concurrent.Executor executor36 = null;
        builder34.httpExecutor = executor36;
        java.util.concurrent.Executor executor38 = builder34.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel39 = retrofit.RestAdapter.LogLevel.FULL;
        builder34.logLevel = logLevel39;
        retrofit.RestAdapter restAdapter41 = new retrofit.RestAdapter(server24, provider26, executor27, executor28, requestInterceptor29, converter30, profiler31, errorHandler32, log33, logLevel39);
        retrofit.Server server42 = null;
        retrofit.client.Client.Provider provider43 = null;
        java.util.concurrent.Executor executor44 = null;
        java.util.concurrent.Executor executor45 = null;
        retrofit.RequestInterceptor requestInterceptor46 = null;
        retrofit.converter.Converter converter47 = null;
        retrofit.Profiler profiler48 = null;
        retrofit.ErrorHandler errorHandler49 = null;
        retrofit.RestAdapter.Log log50 = null;
        retrofit.RestAdapter.LogLevel logLevel51 = null;
        retrofit.RestAdapter restAdapter52 = new retrofit.RestAdapter(server42, provider43, executor44, executor45, requestInterceptor46, converter47, profiler48, errorHandler49, log50, logLevel51);
        retrofit.RestAdapter.RestHandler restHandler53 = restAdapter52.new RestHandler();
        retrofit.Server server54 = restAdapter52.server;
        retrofit.RestAdapter.LogLevel logLevel55 = restAdapter52.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor56 = restAdapter52.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter57 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request58 = serializedObjectSupporter57.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter59 = serializedObjectSupporter57.deserializeObjectConverter1();
        java.lang.String str60 = serializedObjectSupporter57.deserializeObjectString4();
        java.lang.String str61 = serializedObjectSupporter57.deserializeObjectString4();
        restAdapter52.serializedObjectSupporter = serializedObjectSupporter57;
        retrofit.client.Request request63 = serializedObjectSupporter57.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter64 = serializedObjectSupporter57.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter65 = serializedObjectSupporter57.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter66 = serializedObjectSupporter57.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter67 = serializedObjectSupporter57.deserializeObjectConverter1();
        restAdapter41.serializedObjectSupporter = serializedObjectSupporter57;
        retrofit.mime.TypedString typedString69 = serializedObjectSupporter57.deserializeObjectTypedOutput2();
        retrofit.client.Request request70 = new retrofit.client.Request("http://example.com/", "", headerList12, (retrofit.mime.TypedOutput) typedString69);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(typedString20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "default" + "'", str25, "default");
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(server35);
        org.junit.Assert.assertNull(executor38);
        org.junit.Assert.assertTrue("'" + logLevel39 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel39.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(server54);
        org.junit.Assert.assertNull(logLevel55);
        org.junit.Assert.assertNull(requestInterceptor56);
        org.junit.Assert.assertNotNull(request58);
        org.junit.Assert.assertNotNull(gsonConverter59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "http://example.com/" + "'", str60, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "http://example.com/" + "'", str61, "http://example.com/");
        org.junit.Assert.assertNotNull(request63);
        org.junit.Assert.assertNotNull(gsonConverter64);
        org.junit.Assert.assertNotNull(gsonConverter65);
        org.junit.Assert.assertNotNull(gsonConverter66);
        org.junit.Assert.assertNotNull(gsonConverter67);
        org.junit.Assert.assertNotNull(typedString69);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest1();
        java.util.List<retrofit.client.Header> headerList4 = request3.headers;
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(headerList4);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        retrofit.Server server1 = new retrofit.Server("Retrofit-");
        java.lang.String str2 = server1.name;
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.Server server12 = builder11.server;
        java.util.concurrent.Executor executor13 = null;
        builder11.httpExecutor = executor13;
        java.util.concurrent.Executor executor15 = builder11.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.FULL;
        builder11.logLevel = logLevel16;
        retrofit.RestAdapter restAdapter18 = new retrofit.RestAdapter(server1, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel16);
        java.util.concurrent.Executor executor19 = restAdapter18.getcallbackExecutor();
        java.util.concurrent.Executor executor20 = restAdapter18.getcallbackExecutor();
        java.util.concurrent.Executor executor21 = restAdapter18.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request23 = serializedObjectSupporter22.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter22.deserializeObjectConverter1();
        java.lang.String str25 = serializedObjectSupporter22.deserializeObjectString4();
        java.lang.String str26 = serializedObjectSupporter22.deserializeObjectString1();
        retrofit.client.Request request27 = serializedObjectSupporter22.deserializeObjectRequest5();
        retrofit.client.Request request28 = restAdapter18.logAndReplaceRequest(request27);
        retrofit.client.Client.Provider provider29 = restAdapter18.clientProvider;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "http://example.com/" + "'", str25, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Retrofit-" + "'", str26, "Retrofit-");
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNull(provider29);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter3();
        builder16.serializedObjectSupporter = serializedObjectSupporter17;
        java.util.concurrent.Executor executor21 = null;
        builder16.callbackExecutor = executor21;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = builder16.serializedObjectSupporter;
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString1();
        retrofit.mime.TypedString typedString25 = serializedObjectSupporter23.deserializeObjectTypedOutput2();
        retrofit.client.Request request26 = serializedObjectSupporter23.deserializeObjectRequest5();
        retrofit.client.Request request27 = serializedObjectSupporter23.deserializeObjectRequest6();
        retrofit.Server server28 = serializedObjectSupporter23.deserializeObjectServer1();
        retrofit.client.Request request29 = serializedObjectSupporter23.deserializeObjectRequest6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter23;
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(serializedObjectSupporter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Retrofit-" + "'", str24, "Retrofit-");
        org.junit.Assert.assertNotNull(typedString25);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(server28);
        org.junit.Assert.assertNotNull(request29);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = builder0.server;
        retrofit.Profiler profiler2 = builder0.profiler;
        retrofit.client.Client.Provider provider3 = null;
        builder0.setclientProvider(provider3);
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider6 = null;
        builder0.clientProvider = provider6;
        retrofit.Server server10 = new retrofit.Server("Retrofit-Idle", "Retrofit-");
        java.lang.String str11 = server10.getapiUrl();
        java.lang.String str12 = server10.getDEFAULT_NAME();
        java.lang.String str13 = server10.getName();
        retrofit.RestAdapter.Builder builder14 = builder0.setServer(server10);
        java.util.concurrent.Executor executor15 = builder14.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.Server server17 = builder16.server;
        retrofit.Profiler profiler18 = builder16.profiler;
        retrofit.client.Client.Provider provider19 = null;
        builder16.setclientProvider(provider19);
        java.util.concurrent.Executor executor21 = builder16.getcallbackExecutor();
        retrofit.client.Client.Provider provider22 = null;
        builder16.clientProvider = provider22;
        retrofit.Server server24 = null;
        retrofit.client.Client.Provider provider25 = null;
        java.util.concurrent.Executor executor26 = null;
        java.util.concurrent.Executor executor27 = null;
        retrofit.RequestInterceptor requestInterceptor28 = null;
        retrofit.converter.Converter converter29 = null;
        retrofit.Profiler profiler30 = null;
        retrofit.ErrorHandler errorHandler31 = null;
        retrofit.RestAdapter.Log log32 = null;
        retrofit.RestAdapter.LogLevel logLevel33 = null;
        retrofit.RestAdapter restAdapter34 = new retrofit.RestAdapter(server24, provider25, executor26, executor27, requestInterceptor28, converter29, profiler30, errorHandler31, log32, logLevel33);
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request36 = serializedObjectSupporter35.deserializeObjectRequest6();
        restAdapter34.serializedObjectSupporter = serializedObjectSupporter35;
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter35.deserializeObjectConverter7();
        builder16.converter = gsonConverter38;
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        java.lang.String str41 = serializedObjectSupporter40.deserializeObjectString2();
        retrofit.client.Request request42 = serializedObjectSupporter40.deserializeObjectRequest7();
        retrofit.ErrorHandler errorHandler43 = serializedObjectSupporter40.deserializeObjectErrorHandler1();
        builder16.errorHandler = errorHandler43;
        retrofit.RestAdapter.Builder builder45 = builder14.setErrorHandler(errorHandler43);
        retrofit.Server server46 = null;
        retrofit.client.Client.Provider provider47 = null;
        java.util.concurrent.Executor executor48 = null;
        java.util.concurrent.Executor executor49 = null;
        retrofit.RequestInterceptor requestInterceptor50 = null;
        retrofit.converter.Converter converter51 = null;
        retrofit.Profiler profiler52 = null;
        retrofit.ErrorHandler errorHandler53 = null;
        retrofit.RestAdapter.Log log54 = null;
        retrofit.RestAdapter.LogLevel logLevel55 = null;
        retrofit.RestAdapter restAdapter56 = new retrofit.RestAdapter(server46, provider47, executor48, executor49, requestInterceptor50, converter51, profiler52, errorHandler53, log54, logLevel55);
        retrofit.SerializedObjectSupporter serializedObjectSupporter57 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request58 = serializedObjectSupporter57.deserializeObjectRequest6();
        restAdapter56.serializedObjectSupporter = serializedObjectSupporter57;
        retrofit.converter.GsonConverter gsonConverter60 = serializedObjectSupporter57.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter61 = serializedObjectSupporter57.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter62 = serializedObjectSupporter57.deserializeObjectConverter1();
        retrofit.client.Request request63 = serializedObjectSupporter57.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor64 = serializedObjectSupporter57.deserializeObjectRequestInterceptor1();
        retrofit.client.Request request65 = serializedObjectSupporter57.deserializeObjectRequest4();
        retrofit.converter.GsonConverter gsonConverter66 = serializedObjectSupporter57.deserializeObjectConverter4();
        retrofit.Server server67 = serializedObjectSupporter57.deserializeObjectServer1();
        java.lang.String str68 = server67.getapiUrl();
        retrofit.RestAdapter.Builder builder69 = builder45.setServer(server67);
        retrofit.client.Client.Provider provider70 = builder45.clientProvider;
        org.junit.Assert.assertNull(server1);
        org.junit.Assert.assertNull(profiler2);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Retrofit-Idle" + "'", str11, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "default" + "'", str12, "default");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(executor21);
        org.junit.Assert.assertNotNull(request36);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Retrofit-Idle" + "'", str41, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request42);
        org.junit.Assert.assertNotNull(errorHandler43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(request58);
        org.junit.Assert.assertNotNull(gsonConverter60);
        org.junit.Assert.assertNotNull(gsonConverter61);
        org.junit.Assert.assertNotNull(gsonConverter62);
        org.junit.Assert.assertNotNull(request63);
        org.junit.Assert.assertNotNull(requestInterceptor64);
        org.junit.Assert.assertNotNull(request65);
        org.junit.Assert.assertNotNull(gsonConverter66);
        org.junit.Assert.assertNotNull(server67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "http://example.com" + "'", str68, "http://example.com");
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNull(provider70);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request16 = serializedObjectSupporter15.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString4();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.client.Request request21 = serializedObjectSupporter15.deserializeObjectRequest4();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter15.deserializeObjectConverter8();
        retrofit.client.Request request23 = serializedObjectSupporter15.deserializeObjectRequest5();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(request23);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.Server server5 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(server5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-Idle" + "'", str7, "Retrofit-Idle");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor12 = restAdapter10.getcallbackExecutor();
        int int13 = restAdapter10.getLOG_CHUNK_SIZE();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4000 + "'", int13 == 4000);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Server server16 = restAdapter10.server;
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(server16);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter7();
        java.lang.String str15 = serializedObjectSupporter11.deserializeObjectString1();
        retrofit.Server server16 = serializedObjectSupporter11.deserializeObjectServer1();
        retrofit.client.Request request17 = serializedObjectSupporter11.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter11.deserializeObjectConverter1();
        java.lang.String str19 = serializedObjectSupporter11.deserializeObjectString2();
        retrofit.client.Request request20 = serializedObjectSupporter11.deserializeObjectRequest4();
        java.lang.String str21 = request20.getMethod();
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GET" + "'", str21, "GET");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.getcallbackExecutor();
        retrofit.Server server2 = builder0.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.converter.Converter converter4 = builder0.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString2();
        retrofit.client.Request request7 = serializedObjectSupporter5.deserializeObjectRequest7();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString5();
        retrofit.Server server9 = serializedObjectSupporter5.deserializeObjectServer1();
        builder0.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter5.deserializeObjectConverter7();
        java.lang.String str12 = serializedObjectSupporter5.deserializeObjectString2();
        retrofit.client.Request request13 = serializedObjectSupporter5.deserializeObjectRequest2();
        retrofit.client.Request request14 = serializedObjectSupporter5.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter5.deserializeObjectConverter5();
        java.lang.String str16 = serializedObjectSupporter5.deserializeObjectString2();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(server2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Retrofit-Idle" + "'", str6, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "POST" + "'", str8, "POST");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-Idle" + "'", str12, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        retrofit.Server server2 = new retrofit.Server("http://example.com", "default");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.client.Request request3 = serializedObjectSupporter0.deserializeObjectRequest5();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter5 = serializedObjectSupporter0.deserializeObjectLogLevel3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(errorHandler4);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.client.Request request14 = serializedObjectSupporter11.deserializeObjectRequest4();
        retrofit.client.Request request15 = serializedObjectSupporter11.deserializeObjectRequest3();
        retrofit.client.Request request16 = serializedObjectSupporter11.deserializeObjectRequest2();
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertNotNull(request16);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        retrofit.Server server1 = new retrofit.Server("Retrofit-");
        java.lang.String str2 = server1.name;
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.Server server12 = builder11.server;
        java.util.concurrent.Executor executor13 = null;
        builder11.httpExecutor = executor13;
        java.util.concurrent.Executor executor15 = builder11.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.FULL;
        builder11.logLevel = logLevel16;
        retrofit.RestAdapter restAdapter18 = new retrofit.RestAdapter(server1, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel16);
        java.util.concurrent.Executor executor19 = restAdapter18.getcallbackExecutor();
        int int20 = restAdapter18.getLOG_CHUNK_SIZE();
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = request25.getBody();
        java.lang.String str27 = request25.url;
        retrofit.mime.TypedOutput typedOutput28 = request25.getBody();
        java.lang.String str29 = request25.getUrl();
        retrofit.client.Request request30 = restAdapter18.logAndReplaceRequest(request25);
        retrofit.RequestInterceptor requestInterceptor31 = restAdapter18.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler32 = restAdapter18.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler33 = restAdapter18.new RestHandler();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4000 + "'", int20 == 4000);
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNull(requestInterceptor31);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestInterceptor requestInterceptor5 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest8();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestInterceptor5);
        org.junit.Assert.assertNotNull(request6);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request16 = serializedObjectSupporter15.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString4();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.ErrorHandler errorHandler21 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor22 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.Server server24 = builder23.server;
        retrofit.converter.Converter converter25 = null;
        builder23.converter = converter25;
        retrofit.RestAdapter.Log log27 = builder23.log;
        retrofit.RestAdapter.LogLevel logLevel28 = builder23.logLevel;
        restAdapter10.logLevel = logLevel28;
        retrofit.RestAdapter.RestHandler restHandler30 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter31.deserializeObjectConverter3();
        retrofit.client.Request request33 = serializedObjectSupporter31.deserializeObjectRequest2();
        java.lang.String str34 = serializedObjectSupporter31.deserializeObjectString4();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler21);
        org.junit.Assert.assertNull(executor22);
        org.junit.Assert.assertNull(server24);
        org.junit.Assert.assertNull(log27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(serializedObjectSupporter31);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest6();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest4();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(request5);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel14 = null;
        restAdapter10.logLevel = logLevel14;
        retrofit.client.Client.Provider provider16 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter18 = restAdapter10.getconverter();
        retrofit.Server server19 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter21 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(server19);
        org.junit.Assert.assertNull(converter21);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.getcallbackExecutor();
        retrofit.Server server2 = builder0.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = builder0.serializedObjectSupporter;
        retrofit.converter.Converter converter4 = builder0.converter;
        retrofit.Server server5 = null;
        retrofit.client.Client.Provider provider6 = null;
        java.util.concurrent.Executor executor7 = null;
        java.util.concurrent.Executor executor8 = null;
        retrofit.RequestInterceptor requestInterceptor9 = null;
        retrofit.converter.Converter converter10 = null;
        retrofit.Profiler profiler11 = null;
        retrofit.ErrorHandler errorHandler12 = null;
        retrofit.RestAdapter.Log log13 = null;
        retrofit.RestAdapter.LogLevel logLevel14 = null;
        retrofit.RestAdapter restAdapter15 = new retrofit.RestAdapter(server5, provider6, executor7, executor8, requestInterceptor9, converter10, profiler11, errorHandler12, log13, logLevel14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request17 = serializedObjectSupporter16.deserializeObjectRequest6();
        restAdapter15.serializedObjectSupporter = serializedObjectSupporter16;
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter16.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter16.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter16.deserializeObjectConverter1();
        retrofit.client.Request request22 = serializedObjectSupporter16.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor23 = serializedObjectSupporter16.deserializeObjectRequestInterceptor1();
        retrofit.RestAdapter.Builder builder24 = builder0.setRequestInterceptor(requestInterceptor23);
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.Server server27 = builder26.server;
        retrofit.converter.Converter converter28 = null;
        builder26.converter = converter28;
        retrofit.ErrorHandler errorHandler30 = builder26.errorHandler;
        retrofit.Server server32 = new retrofit.Server("Retrofit-");
        java.lang.String str33 = server32.name;
        retrofit.client.Client.Provider provider34 = null;
        java.util.concurrent.Executor executor35 = null;
        java.util.concurrent.Executor executor36 = null;
        retrofit.RequestInterceptor requestInterceptor37 = null;
        retrofit.converter.Converter converter38 = null;
        retrofit.Profiler profiler39 = null;
        retrofit.ErrorHandler errorHandler40 = null;
        retrofit.RestAdapter.Log log41 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        retrofit.Server server43 = builder42.server;
        java.util.concurrent.Executor executor44 = null;
        builder42.httpExecutor = executor44;
        java.util.concurrent.Executor executor46 = builder42.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.FULL;
        builder42.logLevel = logLevel47;
        retrofit.RestAdapter restAdapter49 = new retrofit.RestAdapter(server32, provider34, executor35, executor36, requestInterceptor37, converter38, profiler39, errorHandler40, log41, logLevel47);
        retrofit.RestAdapter.LogLevel logLevel50 = restAdapter49.getLogLevel();
        retrofit.RestAdapter.Builder builder51 = builder26.setLogLevel(logLevel50);
        retrofit.client.Client.Provider provider52 = builder26.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter53 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request54 = serializedObjectSupporter53.deserializeObjectRequest6();
        java.lang.String str55 = serializedObjectSupporter53.deserializeObjectString4();
        java.lang.String str56 = serializedObjectSupporter53.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler57 = serializedObjectSupporter53.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder58 = builder26.setErrorHandler(errorHandler57);
        builder0.errorHandler = errorHandler57;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(server2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(requestInterceptor23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(server27);
        org.junit.Assert.assertNull(errorHandler30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "default" + "'", str33, "default");
        org.junit.Assert.assertNotNull(log41);
        org.junit.Assert.assertNull(server43);
        org.junit.Assert.assertNull(executor46);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNull(provider52);
        org.junit.Assert.assertNotNull(request54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "http://example.com/" + "'", str55, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "http://example.com/" + "'", str56, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler57);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter1.deserializeObjectConverter3();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("http://example.com/");
        retrofit.client.Client.Provider provider8 = builder0.clientProvider;
        java.util.concurrent.Executor executor9 = builder0.gethttpExecutor();
        retrofit.client.Client.Provider provider10 = builder0.getclientProvider();
        retrofit.Server server12 = new retrofit.Server("Retrofit-");
        java.lang.String str13 = server12.name;
        java.lang.String str14 = server12.apiUrl;
        java.lang.String str15 = server12.getUrl();
        java.lang.String str16 = server12.name;
        java.lang.String str17 = server12.getUrl();
        java.lang.String str18 = server12.apiUrl;
        retrofit.RestAdapter.Builder builder19 = builder0.setServer(server12);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request21 = serializedObjectSupporter20.deserializeObjectRequest2();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter20.deserializeObjectConverter4();
        retrofit.RequestInterceptor requestInterceptor23 = serializedObjectSupporter20.deserializeObjectRequestInterceptor1();
        retrofit.Server server24 = serializedObjectSupporter20.deserializeObjectServer1();
        retrofit.client.Request request25 = serializedObjectSupporter20.deserializeObjectRequest1();
        builder0.serializedObjectSupporter = serializedObjectSupporter20;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-Idle" + "'", str2, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "default" + "'", str13, "default");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-" + "'", str15, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "default" + "'", str16, "default");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-" + "'", str18, "Retrofit-");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(requestInterceptor23);
        org.junit.Assert.assertNotNull(server24);
        org.junit.Assert.assertNotNull(request25);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.getcallbackExecutor();
        retrofit.Server server2 = builder0.server;
        retrofit.Profiler profiler3 = builder0.profiler;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter6.deserializeObjectConverter3();
        builder5.serializedObjectSupporter = serializedObjectSupporter6;
        java.util.concurrent.Executor executor10 = null;
        builder5.callbackExecutor = executor10;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = builder5.serializedObjectSupporter;
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString1();
        retrofit.mime.TypedString typedString14 = serializedObjectSupporter12.deserializeObjectTypedOutput2();
        retrofit.Server server15 = serializedObjectSupporter12.deserializeObjectServer1();
        retrofit.mime.TypedString typedString16 = serializedObjectSupporter12.deserializeObjectTypedOutput2();
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString5();
        builder0.serializedObjectSupporter = serializedObjectSupporter12;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(server2);
        org.junit.Assert.assertNull(profiler3);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Retrofit-Idle" + "'", str7, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(serializedObjectSupporter12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNotNull(typedString14);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertNotNull(typedString16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "POST" + "'", str17, "POST");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        java.lang.String str17 = serializedObjectSupporter16.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter16.deserializeObjectConverter3();
        builder15.serializedObjectSupporter = serializedObjectSupporter16;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter16;
        java.lang.String str21 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler22 = restAdapter10.profiler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-" + "'", str21, "Retrofit-");
        org.junit.Assert.assertNull(profiler22);
        org.junit.Assert.assertNotNull(serializedObjectSupporter23);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter1.deserializeObjectConverter3();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.getcallbackExecutor();
        retrofit.Server server10 = builder8.server;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider12 = null;
        builder11.setclientProvider(provider12);
        retrofit.Server server15 = new retrofit.Server("Retrofit-");
        java.lang.String str16 = server15.name;
        retrofit.client.Client.Provider provider17 = null;
        java.util.concurrent.Executor executor18 = null;
        java.util.concurrent.Executor executor19 = null;
        retrofit.RequestInterceptor requestInterceptor20 = null;
        retrofit.converter.Converter converter21 = null;
        retrofit.Profiler profiler22 = null;
        retrofit.ErrorHandler errorHandler23 = null;
        retrofit.RestAdapter.Log log24 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.Server server26 = builder25.server;
        java.util.concurrent.Executor executor27 = null;
        builder25.httpExecutor = executor27;
        java.util.concurrent.Executor executor29 = builder25.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.FULL;
        builder25.logLevel = logLevel30;
        retrofit.RestAdapter restAdapter32 = new retrofit.RestAdapter(server15, provider17, executor18, executor19, requestInterceptor20, converter21, profiler22, errorHandler23, log24, logLevel30);
        retrofit.RestAdapter.Builder builder33 = builder11.setLog(log24);
        retrofit.RestAdapter.Builder builder34 = builder8.setLog(log24);
        retrofit.Server server35 = null;
        retrofit.client.Client.Provider provider36 = null;
        java.util.concurrent.Executor executor37 = null;
        java.util.concurrent.Executor executor38 = null;
        retrofit.RequestInterceptor requestInterceptor39 = null;
        retrofit.converter.Converter converter40 = null;
        retrofit.Profiler profiler41 = null;
        retrofit.ErrorHandler errorHandler42 = null;
        retrofit.RestAdapter.Log log43 = null;
        retrofit.RestAdapter.LogLevel logLevel44 = null;
        retrofit.RestAdapter restAdapter45 = new retrofit.RestAdapter(server35, provider36, executor37, executor38, requestInterceptor39, converter40, profiler41, errorHandler42, log43, logLevel44);
        retrofit.SerializedObjectSupporter serializedObjectSupporter46 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request47 = serializedObjectSupporter46.deserializeObjectRequest6();
        restAdapter45.serializedObjectSupporter = serializedObjectSupporter46;
        retrofit.converter.GsonConverter gsonConverter49 = serializedObjectSupporter46.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter46.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter46.deserializeObjectConverter1();
        retrofit.client.Request request52 = serializedObjectSupporter46.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor53 = serializedObjectSupporter46.deserializeObjectRequestInterceptor1();
        builder34.requestInterceptor = requestInterceptor53;
        retrofit.RestAdapter.Builder builder55 = builder7.setRequestInterceptor(requestInterceptor53);
        java.util.concurrent.Executor executor56 = builder7.httpExecutor;
        retrofit.RestAdapter.Builder builder57 = new retrofit.RestAdapter.Builder();
        retrofit.Server server58 = builder57.server;
        java.util.concurrent.Executor executor59 = null;
        builder57.httpExecutor = executor59;
        java.util.concurrent.Executor executor61 = null;
        builder57.callbackExecutor = executor61;
        java.util.concurrent.Executor executor63 = null;
        builder57.callbackExecutor = executor63;
        builder57.ensureSaneDefaults();
        retrofit.client.Client.Provider provider66 = builder57.clientProvider;
        retrofit.Profiler profiler67 = builder57.profiler;
        retrofit.RequestInterceptor requestInterceptor68 = builder57.requestInterceptor;
        builder7.requestInterceptor = requestInterceptor68;
        retrofit.RestAdapter.Builder builder70 = new retrofit.RestAdapter.Builder();
        retrofit.Server server71 = builder70.server;
        java.util.concurrent.Executor executor72 = null;
        builder70.httpExecutor = executor72;
        java.util.concurrent.Executor executor74 = null;
        builder70.callbackExecutor = executor74;
        java.util.concurrent.Executor executor76 = null;
        builder70.callbackExecutor = executor76;
        builder70.ensureSaneDefaults();
        retrofit.client.Client.Provider provider79 = builder70.clientProvider;
        retrofit.Profiler profiler80 = builder70.profiler;
        retrofit.RequestInterceptor requestInterceptor81 = builder70.requestInterceptor;
        builder7.requestInterceptor = requestInterceptor81;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-Idle" + "'", str2, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(server10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "default" + "'", str16, "default");
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNull(server26);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertNotNull(gsonConverter49);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNotNull(request52);
        org.junit.Assert.assertNotNull(requestInterceptor53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNull(executor56);
        org.junit.Assert.assertNull(server58);
        org.junit.Assert.assertNotNull(provider66);
        org.junit.Assert.assertNull(profiler67);
        org.junit.Assert.assertNotNull(requestInterceptor68);
        org.junit.Assert.assertNull(server71);
        org.junit.Assert.assertNotNull(provider79);
        org.junit.Assert.assertNull(profiler80);
        org.junit.Assert.assertNotNull(requestInterceptor81);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter1.deserializeObjectConverter3();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor9 = builder8.getcallbackExecutor();
        retrofit.Server server10 = builder8.server;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider12 = null;
        builder11.setclientProvider(provider12);
        retrofit.Server server15 = new retrofit.Server("Retrofit-");
        java.lang.String str16 = server15.name;
        retrofit.client.Client.Provider provider17 = null;
        java.util.concurrent.Executor executor18 = null;
        java.util.concurrent.Executor executor19 = null;
        retrofit.RequestInterceptor requestInterceptor20 = null;
        retrofit.converter.Converter converter21 = null;
        retrofit.Profiler profiler22 = null;
        retrofit.ErrorHandler errorHandler23 = null;
        retrofit.RestAdapter.Log log24 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.Server server26 = builder25.server;
        java.util.concurrent.Executor executor27 = null;
        builder25.httpExecutor = executor27;
        java.util.concurrent.Executor executor29 = builder25.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.FULL;
        builder25.logLevel = logLevel30;
        retrofit.RestAdapter restAdapter32 = new retrofit.RestAdapter(server15, provider17, executor18, executor19, requestInterceptor20, converter21, profiler22, errorHandler23, log24, logLevel30);
        retrofit.RestAdapter.Builder builder33 = builder11.setLog(log24);
        retrofit.RestAdapter.Builder builder34 = builder8.setLog(log24);
        retrofit.Server server35 = null;
        retrofit.client.Client.Provider provider36 = null;
        java.util.concurrent.Executor executor37 = null;
        java.util.concurrent.Executor executor38 = null;
        retrofit.RequestInterceptor requestInterceptor39 = null;
        retrofit.converter.Converter converter40 = null;
        retrofit.Profiler profiler41 = null;
        retrofit.ErrorHandler errorHandler42 = null;
        retrofit.RestAdapter.Log log43 = null;
        retrofit.RestAdapter.LogLevel logLevel44 = null;
        retrofit.RestAdapter restAdapter45 = new retrofit.RestAdapter(server35, provider36, executor37, executor38, requestInterceptor39, converter40, profiler41, errorHandler42, log43, logLevel44);
        retrofit.SerializedObjectSupporter serializedObjectSupporter46 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request47 = serializedObjectSupporter46.deserializeObjectRequest6();
        restAdapter45.serializedObjectSupporter = serializedObjectSupporter46;
        retrofit.converter.GsonConverter gsonConverter49 = serializedObjectSupporter46.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter46.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter46.deserializeObjectConverter1();
        retrofit.client.Request request52 = serializedObjectSupporter46.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor53 = serializedObjectSupporter46.deserializeObjectRequestInterceptor1();
        builder34.requestInterceptor = requestInterceptor53;
        retrofit.RestAdapter.Builder builder55 = builder7.setRequestInterceptor(requestInterceptor53);
        retrofit.RestAdapter.LogLevel logLevel56 = builder55.logLevel;
        retrofit.client.Client.Provider provider57 = builder55.clientProvider;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-Idle" + "'", str2, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(server10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "default" + "'", str16, "default");
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNull(server26);
        org.junit.Assert.assertNull(executor29);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertNotNull(gsonConverter49);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertNotNull(gsonConverter51);
        org.junit.Assert.assertNotNull(request52);
        org.junit.Assert.assertNotNull(requestInterceptor53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertTrue("'" + logLevel56 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel56.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider57);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = null;
        builder0.setclientProvider(provider1);
        retrofit.Server server4 = new retrofit.Server("Retrofit-");
        java.lang.String str5 = server4.name;
        retrofit.client.Client.Provider provider6 = null;
        java.util.concurrent.Executor executor7 = null;
        java.util.concurrent.Executor executor8 = null;
        retrofit.RequestInterceptor requestInterceptor9 = null;
        retrofit.converter.Converter converter10 = null;
        retrofit.Profiler profiler11 = null;
        retrofit.ErrorHandler errorHandler12 = null;
        retrofit.RestAdapter.Log log13 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        retrofit.Server server15 = builder14.server;
        java.util.concurrent.Executor executor16 = null;
        builder14.httpExecutor = executor16;
        java.util.concurrent.Executor executor18 = builder14.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.FULL;
        builder14.logLevel = logLevel19;
        retrofit.RestAdapter restAdapter21 = new retrofit.RestAdapter(server4, provider6, executor7, executor8, requestInterceptor9, converter10, profiler11, errorHandler12, log13, logLevel19);
        retrofit.RestAdapter.Builder builder22 = builder0.setLog(log13);
        retrofit.converter.Converter converter23 = builder22.converter;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "default" + "'", str5, "default");
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(converter23);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor17 = restAdapter10.getcallbackExecutor();
        retrofit.converter.Converter converter18 = restAdapter10.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = restAdapter10.serializedObjectSupporter;
        java.lang.String str20 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Profiler profiler21 = restAdapter10.getprofiler();
        retrofit.Profiler profiler22 = restAdapter10.profiler;
        retrofit.Server server23 = null;
        retrofit.client.Client.Provider provider24 = null;
        java.util.concurrent.Executor executor25 = null;
        java.util.concurrent.Executor executor26 = null;
        retrofit.RequestInterceptor requestInterceptor27 = null;
        retrofit.converter.Converter converter28 = null;
        retrofit.Profiler profiler29 = null;
        retrofit.ErrorHandler errorHandler30 = null;
        retrofit.RestAdapter.Log log31 = null;
        retrofit.RestAdapter.LogLevel logLevel32 = null;
        retrofit.RestAdapter restAdapter33 = new retrofit.RestAdapter(server23, provider24, executor25, executor26, requestInterceptor27, converter28, profiler29, errorHandler30, log31, logLevel32);
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request35 = serializedObjectSupporter34.deserializeObjectRequest6();
        restAdapter33.serializedObjectSupporter = serializedObjectSupporter34;
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter34.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter34.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter34.deserializeObjectConverter1();
        retrofit.client.Request request40 = serializedObjectSupporter34.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor41 = serializedObjectSupporter34.deserializeObjectRequestInterceptor1();
        retrofit.client.Request request42 = serializedObjectSupporter34.deserializeObjectRequest4();
        retrofit.ErrorHandler errorHandler43 = serializedObjectSupporter34.deserializeObjectErrorHandler1();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter34;
        java.util.concurrent.Executor executor45 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(serializedObjectSupporter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Retrofit-Idle" + "'", str20, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler21);
        org.junit.Assert.assertNull(profiler22);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(requestInterceptor41);
        org.junit.Assert.assertNotNull(request42);
        org.junit.Assert.assertNotNull(errorHandler43);
        org.junit.Assert.assertNull(executor45);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.client.Client.Provider provider14 = restAdapter10.clientProvider;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        java.lang.String str17 = serializedObjectSupporter16.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter16.deserializeObjectConverter3();
        builder15.serializedObjectSupporter = serializedObjectSupporter16;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter16;
        java.lang.String str21 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.Log log22 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler23 = restAdapter10.new RestHandler();
        retrofit.Server server24 = null;
        retrofit.client.Client.Provider provider25 = null;
        java.util.concurrent.Executor executor26 = null;
        java.util.concurrent.Executor executor27 = null;
        retrofit.RequestInterceptor requestInterceptor28 = null;
        retrofit.converter.Converter converter29 = null;
        retrofit.Profiler profiler30 = null;
        retrofit.ErrorHandler errorHandler31 = null;
        retrofit.RestAdapter.Log log32 = null;
        retrofit.RestAdapter.LogLevel logLevel33 = null;
        retrofit.RestAdapter restAdapter34 = new retrofit.RestAdapter(server24, provider25, executor26, executor27, requestInterceptor28, converter29, profiler30, errorHandler31, log32, logLevel33);
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request36 = serializedObjectSupporter35.deserializeObjectRequest6();
        restAdapter34.serializedObjectSupporter = serializedObjectSupporter35;
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter35.deserializeObjectConverter7();
        java.lang.String str39 = serializedObjectSupporter35.deserializeObjectString1();
        retrofit.client.Request request40 = serializedObjectSupporter35.deserializeObjectRequest6();
        retrofit.Server server41 = serializedObjectSupporter35.deserializeObjectServer1();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter35.deserializeObjectConverter2();
        restHandler23.serializedObjectSupporter = serializedObjectSupporter35;
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-" + "'", str21, "Retrofit-");
        org.junit.Assert.assertNull(log22);
        org.junit.Assert.assertNotNull(request36);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Retrofit-" + "'", str39, "Retrofit-");
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(server41);
        org.junit.Assert.assertNotNull(gsonConverter42);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel14 = null;
        restAdapter10.logLevel = logLevel14;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel16;
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        retrofit.Profiler profiler19 = restAdapter10.profiler;
        java.util.concurrent.Executor executor20 = restAdapter10.httpExecutor;
        retrofit.Profiler profiler21 = restAdapter10.profiler;
        retrofit.RestAdapter.Log log22 = restAdapter10.log;
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(profiler19);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNull(profiler21);
        org.junit.Assert.assertNull(log22);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter7();
        retrofit.Server server15 = serializedObjectSupporter11.deserializeObjectServer1();
        java.lang.String str16 = serializedObjectSupporter11.deserializeObjectString4();
        retrofit.client.Request request17 = serializedObjectSupporter11.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter11.deserializeObjectConverter2();
        java.lang.String str19 = serializedObjectSupporter11.deserializeObjectString2();
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(server15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = builder0.server;
        retrofit.Profiler profiler2 = builder0.profiler;
        retrofit.client.Client.Provider provider3 = null;
        builder0.setclientProvider(provider3);
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider6 = null;
        builder0.clientProvider = provider6;
        retrofit.Server server8 = null;
        retrofit.client.Client.Provider provider9 = null;
        java.util.concurrent.Executor executor10 = null;
        java.util.concurrent.Executor executor11 = null;
        retrofit.RequestInterceptor requestInterceptor12 = null;
        retrofit.converter.Converter converter13 = null;
        retrofit.Profiler profiler14 = null;
        retrofit.ErrorHandler errorHandler15 = null;
        retrofit.RestAdapter.Log log16 = null;
        retrofit.RestAdapter.LogLevel logLevel17 = null;
        retrofit.RestAdapter restAdapter18 = new retrofit.RestAdapter(server8, provider9, executor10, executor11, requestInterceptor12, converter13, profiler14, errorHandler15, log16, logLevel17);
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request20 = serializedObjectSupporter19.deserializeObjectRequest6();
        restAdapter18.serializedObjectSupporter = serializedObjectSupporter19;
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter19.deserializeObjectConverter7();
        builder0.converter = gsonConverter22;
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor25 = builder24.getcallbackExecutor();
        retrofit.Server server26 = builder24.server;
        retrofit.Server server29 = new retrofit.Server("Retrofit-Idle", "Retrofit-");
        java.lang.String str30 = server29.getapiUrl();
        retrofit.client.Client.Provider provider31 = null;
        java.util.concurrent.Executor executor32 = null;
        java.util.concurrent.Executor executor33 = null;
        retrofit.RequestInterceptor requestInterceptor34 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter35.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter35.deserializeObjectConverter7();
        retrofit.Profiler profiler39 = null;
        retrofit.ErrorHandler errorHandler40 = null;
        retrofit.RestAdapter.Log log41 = null;
        retrofit.Server server42 = null;
        retrofit.client.Client.Provider provider43 = null;
        java.util.concurrent.Executor executor44 = null;
        java.util.concurrent.Executor executor45 = null;
        retrofit.RequestInterceptor requestInterceptor46 = null;
        retrofit.converter.Converter converter47 = null;
        retrofit.Profiler profiler48 = null;
        retrofit.ErrorHandler errorHandler49 = null;
        retrofit.RestAdapter.Log log50 = null;
        retrofit.RestAdapter.LogLevel logLevel51 = null;
        retrofit.RestAdapter restAdapter52 = new retrofit.RestAdapter(server42, provider43, executor44, executor45, requestInterceptor46, converter47, profiler48, errorHandler49, log50, logLevel51);
        retrofit.RestAdapter.RestHandler restHandler53 = restAdapter52.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler54 = restAdapter52.new RestHandler();
        java.util.concurrent.Executor executor55 = restAdapter52.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler56 = restAdapter52.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel57 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter52.logLevel = logLevel57;
        retrofit.RestAdapter restAdapter59 = new retrofit.RestAdapter(server29, provider31, executor32, executor33, requestInterceptor34, (retrofit.converter.Converter) gsonConverter38, profiler39, errorHandler40, log41, logLevel57);
        retrofit.RestAdapter.LogLevel logLevel60 = restAdapter59.logLevel;
        retrofit.RestAdapter.Builder builder61 = builder24.setLogLevel(logLevel60);
        retrofit.SerializedObjectSupporter serializedObjectSupporter62 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request63 = serializedObjectSupporter62.deserializeObjectRequest2();
        retrofit.converter.GsonConverter gsonConverter64 = serializedObjectSupporter62.deserializeObjectConverter4();
        retrofit.RequestInterceptor requestInterceptor65 = serializedObjectSupporter62.deserializeObjectRequestInterceptor1();
        retrofit.RestAdapter.Builder builder66 = builder61.setRequestInterceptor(requestInterceptor65);
        builder0.requestInterceptor = requestInterceptor65;
        org.junit.Assert.assertNull(server1);
        org.junit.Assert.assertNull(profiler2);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNull(server26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Retrofit-Idle" + "'", str30, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Retrofit-Idle" + "'", str36, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNull(executor55);
        org.junit.Assert.assertTrue("'" + logLevel57 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel57.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(request63);
        org.junit.Assert.assertNotNull(gsonConverter64);
        org.junit.Assert.assertNotNull(requestInterceptor65);
        org.junit.Assert.assertNotNull(builder66);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = builder0.server;
        retrofit.RestAdapter.Builder builder2 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor3 = builder2.getcallbackExecutor();
        retrofit.Server server4 = builder2.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = builder2.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = builder6.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor8 = null;
        builder6.requestInterceptor = requestInterceptor8;
        java.util.concurrent.Executor executor10 = null;
        builder6.setcallbackExecutor(executor10);
        retrofit.Server server13 = new retrofit.Server("POST");
        retrofit.client.Client.Provider provider14 = null;
        java.util.concurrent.Executor executor15 = null;
        java.util.concurrent.Executor executor16 = null;
        retrofit.RequestInterceptor requestInterceptor17 = null;
        retrofit.Server server18 = null;
        retrofit.client.Client.Provider provider19 = null;
        java.util.concurrent.Executor executor20 = null;
        java.util.concurrent.Executor executor21 = null;
        retrofit.RequestInterceptor requestInterceptor22 = null;
        retrofit.converter.Converter converter23 = null;
        retrofit.Profiler profiler24 = null;
        retrofit.ErrorHandler errorHandler25 = null;
        retrofit.RestAdapter.Log log26 = null;
        retrofit.RestAdapter.LogLevel logLevel27 = null;
        retrofit.RestAdapter restAdapter28 = new retrofit.RestAdapter(server18, provider19, executor20, executor21, requestInterceptor22, converter23, profiler24, errorHandler25, log26, logLevel27);
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request30 = serializedObjectSupporter29.deserializeObjectRequest6();
        restAdapter28.serializedObjectSupporter = serializedObjectSupporter29;
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter29.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter29.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter29.deserializeObjectConverter1();
        retrofit.Profiler profiler35 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request37 = serializedObjectSupporter36.deserializeObjectRequest6();
        java.lang.String str38 = serializedObjectSupporter36.deserializeObjectString4();
        java.lang.String str39 = serializedObjectSupporter36.deserializeObjectString5();
        retrofit.ErrorHandler errorHandler40 = serializedObjectSupporter36.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor42 = builder41.getcallbackExecutor();
        retrofit.Server server43 = builder41.server;
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider45 = null;
        builder44.setclientProvider(provider45);
        retrofit.Server server48 = new retrofit.Server("Retrofit-");
        java.lang.String str49 = server48.name;
        retrofit.client.Client.Provider provider50 = null;
        java.util.concurrent.Executor executor51 = null;
        java.util.concurrent.Executor executor52 = null;
        retrofit.RequestInterceptor requestInterceptor53 = null;
        retrofit.converter.Converter converter54 = null;
        retrofit.Profiler profiler55 = null;
        retrofit.ErrorHandler errorHandler56 = null;
        retrofit.RestAdapter.Log log57 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder58 = new retrofit.RestAdapter.Builder();
        retrofit.Server server59 = builder58.server;
        java.util.concurrent.Executor executor60 = null;
        builder58.httpExecutor = executor60;
        java.util.concurrent.Executor executor62 = builder58.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel63 = retrofit.RestAdapter.LogLevel.FULL;
        builder58.logLevel = logLevel63;
        retrofit.RestAdapter restAdapter65 = new retrofit.RestAdapter(server48, provider50, executor51, executor52, requestInterceptor53, converter54, profiler55, errorHandler56, log57, logLevel63);
        retrofit.RestAdapter.Builder builder66 = builder44.setLog(log57);
        retrofit.RestAdapter.Builder builder67 = builder41.setLog(log57);
        retrofit.RestAdapter.Builder builder68 = new retrofit.RestAdapter.Builder();
        retrofit.Server server69 = builder68.server;
        retrofit.converter.Converter converter70 = null;
        builder68.converter = converter70;
        retrofit.RestAdapter.Log log72 = builder68.log;
        retrofit.RestAdapter.LogLevel logLevel73 = builder68.logLevel;
        retrofit.RestAdapter restAdapter74 = new retrofit.RestAdapter(server13, provider14, executor15, executor16, requestInterceptor17, (retrofit.converter.Converter) gsonConverter34, profiler35, errorHandler40, log57, logLevel73);
        builder6.errorHandler = errorHandler40;
        java.util.concurrent.Executor executor76 = null;
        builder6.callbackExecutor = executor76;
        retrofit.RestAdapter.Builder builder78 = new retrofit.RestAdapter.Builder();
        retrofit.Server server79 = builder78.server;
        java.util.concurrent.Executor executor80 = null;
        builder78.httpExecutor = executor80;
        java.util.concurrent.Executor executor82 = null;
        builder78.callbackExecutor = executor82;
        java.util.concurrent.Executor executor84 = null;
        builder78.callbackExecutor = executor84;
        builder78.ensureSaneDefaults();
        retrofit.client.Client.Provider provider87 = builder78.clientProvider;
        builder6.clientProvider = provider87;
        retrofit.RestAdapter.Builder builder89 = builder2.setClient(provider87);
        builder0.clientProvider = provider87;
        retrofit.RestAdapter.Log log91 = builder0.log;
        org.junit.Assert.assertNull(server1);
        org.junit.Assert.assertNull(executor3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNotNull(gsonConverter34);
        org.junit.Assert.assertNotNull(request37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "http://example.com/" + "'", str38, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "POST" + "'", str39, "POST");
        org.junit.Assert.assertNotNull(errorHandler40);
        org.junit.Assert.assertNull(executor42);
        org.junit.Assert.assertNull(server43);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "default" + "'", str49, "default");
        org.junit.Assert.assertNotNull(log57);
        org.junit.Assert.assertNull(server59);
        org.junit.Assert.assertNull(executor62);
        org.junit.Assert.assertTrue("'" + logLevel63 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel63.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNull(server69);
        org.junit.Assert.assertNull(log72);
        org.junit.Assert.assertTrue("'" + logLevel73 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel73.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(server79);
        org.junit.Assert.assertNotNull(provider87);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNull(log91);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        retrofit.Server server1 = new retrofit.Server("Retrofit-");
        java.lang.String str2 = server1.name;
        retrofit.client.Client.Provider provider3 = null;
        java.util.concurrent.Executor executor4 = null;
        java.util.concurrent.Executor executor5 = null;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        retrofit.converter.Converter converter7 = null;
        retrofit.Profiler profiler8 = null;
        retrofit.ErrorHandler errorHandler9 = null;
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.Server server12 = builder11.server;
        java.util.concurrent.Executor executor13 = null;
        builder11.httpExecutor = executor13;
        java.util.concurrent.Executor executor15 = builder11.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.FULL;
        builder11.logLevel = logLevel16;
        retrofit.RestAdapter restAdapter18 = new retrofit.RestAdapter(server1, provider3, executor4, executor5, requestInterceptor6, converter7, profiler8, errorHandler9, log10, logLevel16);
        java.util.concurrent.Executor executor19 = restAdapter18.getcallbackExecutor();
        int int20 = restAdapter18.getLOG_CHUNK_SIZE();
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = request25.getBody();
        java.lang.String str27 = request25.url;
        retrofit.mime.TypedOutput typedOutput28 = request25.getBody();
        java.lang.String str29 = request25.getUrl();
        retrofit.client.Request request30 = restAdapter18.logAndReplaceRequest(request25);
        retrofit.RequestInterceptor requestInterceptor31 = restAdapter18.getrequestInterceptor();
        retrofit.client.Client.Provider provider32 = restAdapter18.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler33 = restAdapter18.new RestHandler();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4000 + "'", int20 == 4000);
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNull(requestInterceptor31);
        org.junit.Assert.assertNull(provider32);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest5();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest3();
        retrofit.ErrorHandler errorHandler7 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-" + "'", str4, "Retrofit-");
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(errorHandler7);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter11.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter11.deserializeObjectConverter1();
        retrofit.client.Request request17 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.mime.TypedOutput typedOutput18 = request17.body;
        java.lang.String str19 = request17.url;
        retrofit.mime.TypedOutput typedOutput20 = request17.body;
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNull(typedOutput20);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request16 = serializedObjectSupporter15.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString4();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.ErrorHandler errorHandler21 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor22 = restAdapter10.httpExecutor;
        int int23 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler25 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor26 = restAdapter10.callbackExecutor;
        int int27 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.converter.Converter converter28 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler21);
        org.junit.Assert.assertNull(executor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4000 + "'", int23 == 4000);
        org.junit.Assert.assertNull(logLevel24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4000 + "'", int27 == 4000);
        org.junit.Assert.assertNull(converter28);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        retrofit.Server server2 = new retrofit.Server("Retrofit-Idle", "Retrofit-");
        java.lang.String str3 = server2.getapiUrl();
        retrofit.client.Client.Provider provider4 = null;
        java.util.concurrent.Executor executor5 = null;
        java.util.concurrent.Executor executor6 = null;
        retrofit.RequestInterceptor requestInterceptor7 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter8.deserializeObjectConverter7();
        retrofit.Profiler profiler12 = null;
        retrofit.ErrorHandler errorHandler13 = null;
        retrofit.RestAdapter.Log log14 = null;
        retrofit.Server server15 = null;
        retrofit.client.Client.Provider provider16 = null;
        java.util.concurrent.Executor executor17 = null;
        java.util.concurrent.Executor executor18 = null;
        retrofit.RequestInterceptor requestInterceptor19 = null;
        retrofit.converter.Converter converter20 = null;
        retrofit.Profiler profiler21 = null;
        retrofit.ErrorHandler errorHandler22 = null;
        retrofit.RestAdapter.Log log23 = null;
        retrofit.RestAdapter.LogLevel logLevel24 = null;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server15, provider16, executor17, executor18, requestInterceptor19, converter20, profiler21, errorHandler22, log23, logLevel24);
        retrofit.RestAdapter.RestHandler restHandler26 = restAdapter25.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter25.new RestHandler();
        java.util.concurrent.Executor executor28 = restAdapter25.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler29 = restAdapter25.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter25.logLevel = logLevel30;
        retrofit.RestAdapter restAdapter32 = new retrofit.RestAdapter(server2, provider4, executor5, executor6, requestInterceptor7, (retrofit.converter.Converter) gsonConverter11, profiler12, errorHandler13, log14, logLevel30);
        retrofit.RestAdapter.LogLevel logLevel33 = restAdapter32.logLevel;
        java.util.concurrent.Executor executor34 = restAdapter32.gethttpExecutor();
        retrofit.Server server35 = null;
        retrofit.client.Client.Provider provider36 = null;
        java.util.concurrent.Executor executor37 = null;
        java.util.concurrent.Executor executor38 = null;
        retrofit.RequestInterceptor requestInterceptor39 = null;
        retrofit.converter.Converter converter40 = null;
        retrofit.Profiler profiler41 = null;
        retrofit.ErrorHandler errorHandler42 = null;
        retrofit.RestAdapter.Log log43 = null;
        retrofit.RestAdapter.LogLevel logLevel44 = null;
        retrofit.RestAdapter restAdapter45 = new retrofit.RestAdapter(server35, provider36, executor37, executor38, requestInterceptor39, converter40, profiler41, errorHandler42, log43, logLevel44);
        retrofit.RestAdapter.RestHandler restHandler46 = restAdapter45.new RestHandler();
        retrofit.Server server47 = restAdapter45.server;
        retrofit.RestAdapter.LogLevel logLevel48 = restAdapter45.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor49 = restAdapter45.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request51 = serializedObjectSupporter50.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter50.deserializeObjectConverter1();
        java.lang.String str53 = serializedObjectSupporter50.deserializeObjectString4();
        java.lang.String str54 = serializedObjectSupporter50.deserializeObjectString4();
        restAdapter45.serializedObjectSupporter = serializedObjectSupporter50;
        retrofit.ErrorHandler errorHandler56 = restAdapter45.geterrorHandler();
        java.util.concurrent.Executor executor57 = restAdapter45.httpExecutor;
        retrofit.RestAdapter.Builder builder58 = new retrofit.RestAdapter.Builder();
        retrofit.Server server59 = builder58.server;
        retrofit.converter.Converter converter60 = null;
        builder58.converter = converter60;
        retrofit.RestAdapter.Log log62 = builder58.log;
        retrofit.RestAdapter.LogLevel logLevel63 = builder58.logLevel;
        restAdapter45.logLevel = logLevel63;
        restAdapter32.setLogLevel(logLevel63);
        retrofit.RequestInterceptor requestInterceptor66 = restAdapter32.getrequestInterceptor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Retrofit-Idle" + "'", str9, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNull(executor28);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor34);
        org.junit.Assert.assertNull(server47);
        org.junit.Assert.assertNull(logLevel48);
        org.junit.Assert.assertNull(requestInterceptor49);
        org.junit.Assert.assertNotNull(request51);
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "http://example.com/" + "'", str53, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "http://example.com/" + "'", str54, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler56);
        org.junit.Assert.assertNull(executor57);
        org.junit.Assert.assertNull(server59);
        org.junit.Assert.assertNull(log62);
        org.junit.Assert.assertTrue("'" + logLevel63 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel63.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(requestInterceptor66);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request16 = serializedObjectSupporter15.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString4();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.ErrorHandler errorHandler21 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor22 = restAdapter10.httpExecutor;
        int int23 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler25 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor26 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        java.lang.String str29 = serializedObjectSupporter28.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter28.deserializeObjectConverter3();
        builder27.serializedObjectSupporter = serializedObjectSupporter28;
        java.util.concurrent.Executor executor32 = null;
        builder27.callbackExecutor = executor32;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = builder27.serializedObjectSupporter;
        java.lang.String str35 = serializedObjectSupporter34.deserializeObjectString1();
        retrofit.mime.TypedString typedString36 = serializedObjectSupporter34.deserializeObjectTypedOutput2();
        retrofit.client.Request request37 = serializedObjectSupporter34.deserializeObjectRequest5();
        retrofit.client.Request request38 = serializedObjectSupporter34.deserializeObjectRequest6();
        retrofit.Server server39 = serializedObjectSupporter34.deserializeObjectServer1();
        retrofit.client.Request request40 = serializedObjectSupporter34.deserializeObjectRequest1();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request41 = restAdapter10.logAndReplaceRequest(request40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler21);
        org.junit.Assert.assertNull(executor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4000 + "'", int23 == 4000);
        org.junit.Assert.assertNull(logLevel24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Retrofit-Idle" + "'", str29, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter30);
        org.junit.Assert.assertNotNull(serializedObjectSupporter34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Retrofit-" + "'", str35, "Retrofit-");
        org.junit.Assert.assertNotNull(typedString36);
        org.junit.Assert.assertNotNull(request37);
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertNotNull(server39);
        org.junit.Assert.assertNotNull(request40);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter13 = restAdapter10.converter;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Server server16 = null;
        retrofit.client.Client.Provider provider17 = null;
        java.util.concurrent.Executor executor18 = null;
        java.util.concurrent.Executor executor19 = null;
        retrofit.RequestInterceptor requestInterceptor20 = null;
        retrofit.converter.Converter converter21 = null;
        retrofit.Profiler profiler22 = null;
        retrofit.ErrorHandler errorHandler23 = null;
        retrofit.RestAdapter.Log log24 = null;
        retrofit.RestAdapter.LogLevel logLevel25 = null;
        retrofit.RestAdapter restAdapter26 = new retrofit.RestAdapter(server16, provider17, executor18, executor19, requestInterceptor20, converter21, profiler22, errorHandler23, log24, logLevel25);
        retrofit.RestAdapter.RestHandler restHandler27 = restAdapter26.new RestHandler();
        retrofit.Server server28 = restAdapter26.server;
        retrofit.RestAdapter.LogLevel logLevel29 = restAdapter26.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel30 = null;
        restAdapter26.logLevel = logLevel30;
        retrofit.client.Client.Provider provider32 = restAdapter26.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler33 = restAdapter26.new RestHandler();
        java.lang.String str34 = restAdapter26.getIDLE_THREAD_NAME();
        retrofit.Server server35 = null;
        retrofit.client.Client.Provider provider36 = null;
        java.util.concurrent.Executor executor37 = null;
        java.util.concurrent.Executor executor38 = null;
        retrofit.RequestInterceptor requestInterceptor39 = null;
        retrofit.converter.Converter converter40 = null;
        retrofit.Profiler profiler41 = null;
        retrofit.ErrorHandler errorHandler42 = null;
        retrofit.RestAdapter.Log log43 = null;
        retrofit.RestAdapter.LogLevel logLevel44 = null;
        retrofit.RestAdapter restAdapter45 = new retrofit.RestAdapter(server35, provider36, executor37, executor38, requestInterceptor39, converter40, profiler41, errorHandler42, log43, logLevel44);
        retrofit.RestAdapter.RestHandler restHandler46 = restAdapter45.new RestHandler();
        retrofit.Server server47 = restAdapter45.server;
        retrofit.RestAdapter.LogLevel logLevel48 = restAdapter45.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel49 = null;
        restAdapter45.logLevel = logLevel49;
        retrofit.RestAdapter.LogLevel logLevel51 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter45.logLevel = logLevel51;
        restAdapter26.logLevel = logLevel51;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(server28);
        org.junit.Assert.assertNull(logLevel29);
        org.junit.Assert.assertNull(provider32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Retrofit-Idle" + "'", str34, "Retrofit-Idle");
        org.junit.Assert.assertNull(server47);
        org.junit.Assert.assertNull(logLevel48);
        org.junit.Assert.assertTrue("'" + logLevel51 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel51.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.Log log16 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel18 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(log16);
        org.junit.Assert.assertNull(logLevel17);
        org.junit.Assert.assertNull(logLevel18);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor2 = null;
        builder0.requestInterceptor = requestInterceptor2;
        retrofit.Server server4 = null;
        retrofit.client.Client.Provider provider5 = null;
        java.util.concurrent.Executor executor6 = null;
        java.util.concurrent.Executor executor7 = null;
        retrofit.RequestInterceptor requestInterceptor8 = null;
        retrofit.converter.Converter converter9 = null;
        retrofit.Profiler profiler10 = null;
        retrofit.ErrorHandler errorHandler11 = null;
        retrofit.RestAdapter.Log log12 = null;
        retrofit.RestAdapter.LogLevel logLevel13 = null;
        retrofit.RestAdapter restAdapter14 = new retrofit.RestAdapter(server4, provider5, executor6, executor7, requestInterceptor8, converter9, profiler10, errorHandler11, log12, logLevel13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request16 = serializedObjectSupporter15.deserializeObjectRequest6();
        restAdapter14.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter15.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter15.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter15.deserializeObjectConverter1();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter15.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder22 = builder0.setErrorHandler(errorHandler21);
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor24 = builder23.getcallbackExecutor();
        retrofit.ErrorHandler errorHandler25 = builder23.errorHandler;
        java.util.concurrent.Executor executor26 = null;
        builder23.setcallbackExecutor(executor26);
        builder23.ensureSaneDefaults();
        java.util.concurrent.Executor executor29 = builder23.gethttpExecutor();
        java.util.concurrent.Executor executor30 = builder23.gethttpExecutor();
        retrofit.RestAdapter.Builder builder31 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor32 = builder31.getcallbackExecutor();
        retrofit.Server server33 = builder31.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = builder31.serializedObjectSupporter;
        java.util.concurrent.Executor executor35 = builder31.callbackExecutor;
        retrofit.RestAdapter.Builder builder36 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor37 = builder36.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor38 = null;
        builder36.requestInterceptor = requestInterceptor38;
        java.util.concurrent.Executor executor40 = builder36.callbackExecutor;
        retrofit.RestAdapter.Builder builder42 = builder36.setServer("default");
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        retrofit.Server server44 = builder43.server;
        retrofit.converter.Converter converter45 = null;
        builder43.converter = converter45;
        retrofit.RestAdapter.Log log47 = builder43.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request49 = serializedObjectSupporter48.deserializeObjectRequest6();
        java.lang.String str50 = serializedObjectSupporter48.deserializeObjectString4();
        java.lang.String str51 = serializedObjectSupporter48.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler52 = serializedObjectSupporter48.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder53 = builder43.setErrorHandler(errorHandler52);
        retrofit.SerializedObjectSupporter serializedObjectSupporter54 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter55 = serializedObjectSupporter54.deserializeObjectConverter5();
        retrofit.Server server56 = serializedObjectSupporter54.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler57 = serializedObjectSupporter54.deserializeObjectErrorHandler1();
        builder43.errorHandler = errorHandler57;
        builder42.errorHandler = errorHandler57;
        builder31.errorHandler = errorHandler57;
        retrofit.RestAdapter.Builder builder61 = builder23.setErrorHandler(errorHandler57);
        builder0.errorHandler = errorHandler57;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNull(errorHandler25);
        org.junit.Assert.assertNotNull(executor29);
        org.junit.Assert.assertNotNull(executor30);
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertNull(server33);
        org.junit.Assert.assertNull(serializedObjectSupporter34);
        org.junit.Assert.assertNull(executor35);
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertNull(executor40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNull(server44);
        org.junit.Assert.assertNull(log47);
        org.junit.Assert.assertNotNull(request49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "http://example.com/" + "'", str50, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://example.com/" + "'", str51, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(gsonConverter55);
        org.junit.Assert.assertNotNull(server56);
        org.junit.Assert.assertNotNull(errorHandler57);
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request16 = serializedObjectSupporter15.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString4();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.ErrorHandler errorHandler21 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor22 = restAdapter10.httpExecutor;
        int int23 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler25 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor26 = restAdapter10.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor27 = restAdapter10.requestInterceptor;
        retrofit.client.Client.Provider provider28 = restAdapter10.clientProvider;
        retrofit.Server server29 = restAdapter10.server;
        java.util.concurrent.Executor executor30 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler21);
        org.junit.Assert.assertNull(executor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4000 + "'", int23 == 4000);
        org.junit.Assert.assertNull(logLevel24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNull(requestInterceptor27);
        org.junit.Assert.assertNull(provider28);
        org.junit.Assert.assertNull(server29);
        org.junit.Assert.assertNull(executor30);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest5();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest4();
        java.lang.String str7 = request6.url;
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-" + "'", str4, "Retrofit-");
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request16 = serializedObjectSupporter15.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString4();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.ErrorHandler errorHandler21 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor22 = restAdapter10.httpExecutor;
        int int23 = restAdapter10.getLOG_CHUNK_SIZE();
        retrofit.RestAdapter.LogLevel logLevel24 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler25 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor26 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.LogLevel logLevel27 = restAdapter10.getLogLevel();
        retrofit.Server server28 = null;
        retrofit.client.Client.Provider provider29 = null;
        java.util.concurrent.Executor executor30 = null;
        java.util.concurrent.Executor executor31 = null;
        retrofit.RequestInterceptor requestInterceptor32 = null;
        retrofit.converter.Converter converter33 = null;
        retrofit.Profiler profiler34 = null;
        retrofit.ErrorHandler errorHandler35 = null;
        retrofit.RestAdapter.Log log36 = null;
        retrofit.RestAdapter.LogLevel logLevel37 = null;
        retrofit.RestAdapter restAdapter38 = new retrofit.RestAdapter(server28, provider29, executor30, executor31, requestInterceptor32, converter33, profiler34, errorHandler35, log36, logLevel37);
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request40 = serializedObjectSupporter39.deserializeObjectRequest6();
        restAdapter38.serializedObjectSupporter = serializedObjectSupporter39;
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter39.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter43 = serializedObjectSupporter39.deserializeObjectConverter7();
        retrofit.client.Request request44 = serializedObjectSupporter39.deserializeObjectRequest6();
        retrofit.client.Request request45 = serializedObjectSupporter39.deserializeObjectRequest3();
        retrofit.client.Request request46 = serializedObjectSupporter39.deserializeObjectRequest2();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request47 = restAdapter10.logAndReplaceRequest(request46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler21);
        org.junit.Assert.assertNull(executor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4000 + "'", int23 == 4000);
        org.junit.Assert.assertNull(logLevel24);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNull(logLevel27);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertNotNull(gsonConverter43);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertNotNull(request45);
        org.junit.Assert.assertNotNull(request46);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        java.lang.String str2 = serializedObjectSupporter1.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter1.deserializeObjectConverter3();
        builder0.serializedObjectSupporter = serializedObjectSupporter1;
        retrofit.RestAdapter.Log log5 = builder0.log;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = builder6.getcallbackExecutor();
        retrofit.Server server8 = builder6.server;
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider10 = null;
        builder9.setclientProvider(provider10);
        retrofit.Server server13 = new retrofit.Server("Retrofit-");
        java.lang.String str14 = server13.name;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.Server server24 = builder23.server;
        java.util.concurrent.Executor executor25 = null;
        builder23.httpExecutor = executor25;
        java.util.concurrent.Executor executor27 = builder23.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.FULL;
        builder23.logLevel = logLevel28;
        retrofit.RestAdapter restAdapter30 = new retrofit.RestAdapter(server13, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel28);
        retrofit.RestAdapter.Builder builder31 = builder9.setLog(log22);
        retrofit.RestAdapter.Builder builder32 = builder6.setLog(log22);
        retrofit.converter.Converter converter33 = builder32.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request35 = serializedObjectSupporter34.deserializeObjectRequest6();
        java.lang.String str36 = serializedObjectSupporter34.deserializeObjectString4();
        java.lang.String str37 = serializedObjectSupporter34.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter34.deserializeObjectConverter3();
        retrofit.ErrorHandler errorHandler39 = serializedObjectSupporter34.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder40 = builder32.setErrorHandler(errorHandler39);
        builder0.errorHandler = errorHandler39;
        builder0.ensureSaneDefaults();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Retrofit-Idle" + "'", str2, "Retrofit-Idle");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(log5);
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNull(server8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "default" + "'", str14, "default");
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertNull(server24);
        org.junit.Assert.assertNull(executor27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(converter33);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com/" + "'", str36, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "http://example.com/" + "'", str37, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNotNull(errorHandler39);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest3();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestInterceptor requestInterceptor5 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        retrofit.client.Request request6 = serializedObjectSupporter0.deserializeObjectRequest7();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestInterceptor5);
        org.junit.Assert.assertNotNull(request6);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = builder0.server;
        retrofit.Profiler profiler2 = builder0.profiler;
        retrofit.client.Client.Provider provider3 = null;
        builder0.setclientProvider(provider3);
        retrofit.Server server6 = new retrofit.Server("Retrofit-");
        java.lang.String str7 = server6.name;
        builder0.server = server6;
        retrofit.Server server9 = builder0.server;
        retrofit.Server server10 = null;
        retrofit.client.Client.Provider provider11 = null;
        java.util.concurrent.Executor executor12 = null;
        java.util.concurrent.Executor executor13 = null;
        retrofit.RequestInterceptor requestInterceptor14 = null;
        retrofit.converter.Converter converter15 = null;
        retrofit.Profiler profiler16 = null;
        retrofit.ErrorHandler errorHandler17 = null;
        retrofit.RestAdapter.Log log18 = null;
        retrofit.RestAdapter.LogLevel logLevel19 = null;
        retrofit.RestAdapter restAdapter20 = new retrofit.RestAdapter(server10, provider11, executor12, executor13, requestInterceptor14, converter15, profiler16, errorHandler17, log18, logLevel19);
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request22 = serializedObjectSupporter21.deserializeObjectRequest6();
        restAdapter20.serializedObjectSupporter = serializedObjectSupporter21;
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter21.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter21.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter21.deserializeObjectConverter1();
        retrofit.client.Request request27 = serializedObjectSupporter21.deserializeObjectRequest5();
        retrofit.RequestInterceptor requestInterceptor28 = serializedObjectSupporter21.deserializeObjectRequestInterceptor1();
        retrofit.RestAdapter.Builder builder29 = builder0.setRequestInterceptor(requestInterceptor28);
        retrofit.Profiler profiler30 = builder29.profiler;
        org.junit.Assert.assertNull(server1);
        org.junit.Assert.assertNull(profiler2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "default" + "'", str7, "default");
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(requestInterceptor28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(profiler30);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request16 = serializedObjectSupporter15.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString4();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.ErrorHandler errorHandler21 = restAdapter10.geterrorHandler();
        java.util.concurrent.Executor executor22 = restAdapter10.httpExecutor;
        retrofit.Server server23 = restAdapter10.server;
        retrofit.client.Client.Provider provider24 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler25 = restAdapter10.getprofiler();
        retrofit.Profiler profiler26 = restAdapter10.getprofiler();
        retrofit.Server server27 = restAdapter10.server;
        retrofit.RequestInterceptor requestInterceptor28 = restAdapter10.requestInterceptor;
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler21);
        org.junit.Assert.assertNull(executor22);
        org.junit.Assert.assertNull(server23);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertNull(profiler25);
        org.junit.Assert.assertNull(profiler26);
        org.junit.Assert.assertNull(server27);
        org.junit.Assert.assertNull(requestInterceptor28);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.getcallbackExecutor();
        retrofit.ErrorHandler errorHandler2 = builder0.errorHandler;
        java.util.concurrent.Executor executor3 = null;
        builder0.setcallbackExecutor(executor3);
        retrofit.Profiler profiler5 = null;
        builder0.profiler = profiler5;
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("GET");
        retrofit.Server server9 = builder8.server;
        retrofit.Server server11 = new retrofit.Server("Retrofit-");
        java.lang.String str12 = server11.name;
        retrofit.client.Client.Provider provider13 = null;
        java.util.concurrent.Executor executor14 = null;
        java.util.concurrent.Executor executor15 = null;
        retrofit.RequestInterceptor requestInterceptor16 = null;
        retrofit.converter.Converter converter17 = null;
        retrofit.Profiler profiler18 = null;
        retrofit.ErrorHandler errorHandler19 = null;
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.Server server22 = builder21.server;
        java.util.concurrent.Executor executor23 = null;
        builder21.httpExecutor = executor23;
        java.util.concurrent.Executor executor25 = builder21.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.FULL;
        builder21.logLevel = logLevel26;
        retrofit.RestAdapter restAdapter28 = new retrofit.RestAdapter(server11, provider13, executor14, executor15, requestInterceptor16, converter17, profiler18, errorHandler19, log20, logLevel26);
        retrofit.RestAdapter.LogLevel logLevel29 = restAdapter28.getLogLevel();
        retrofit.Server server30 = null;
        retrofit.client.Client.Provider provider31 = null;
        java.util.concurrent.Executor executor32 = null;
        java.util.concurrent.Executor executor33 = null;
        retrofit.RequestInterceptor requestInterceptor34 = null;
        retrofit.converter.Converter converter35 = null;
        retrofit.Profiler profiler36 = null;
        retrofit.ErrorHandler errorHandler37 = null;
        retrofit.RestAdapter.Log log38 = null;
        retrofit.RestAdapter.LogLevel logLevel39 = null;
        retrofit.RestAdapter restAdapter40 = new retrofit.RestAdapter(server30, provider31, executor32, executor33, requestInterceptor34, converter35, profiler36, errorHandler37, log38, logLevel39);
        retrofit.RestAdapter.RestHandler restHandler41 = restAdapter40.new RestHandler();
        retrofit.Server server42 = restAdapter40.server;
        retrofit.RestAdapter.LogLevel logLevel43 = restAdapter40.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor44 = restAdapter40.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request46 = serializedObjectSupporter45.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter47 = serializedObjectSupporter45.deserializeObjectConverter1();
        java.lang.String str48 = serializedObjectSupporter45.deserializeObjectString4();
        java.lang.String str49 = serializedObjectSupporter45.deserializeObjectString4();
        restAdapter40.serializedObjectSupporter = serializedObjectSupporter45;
        retrofit.ErrorHandler errorHandler51 = restAdapter40.geterrorHandler();
        java.util.concurrent.Executor executor52 = restAdapter40.httpExecutor;
        retrofit.RestAdapter.Builder builder53 = new retrofit.RestAdapter.Builder();
        retrofit.Server server54 = builder53.server;
        retrofit.converter.Converter converter55 = null;
        builder53.converter = converter55;
        retrofit.RestAdapter.Log log57 = builder53.log;
        retrofit.RestAdapter.LogLevel logLevel58 = builder53.logLevel;
        restAdapter40.logLevel = logLevel58;
        restAdapter28.logLevel = logLevel58;
        builder8.logLevel = logLevel58;
        retrofit.RestAdapter.LogLevel logLevel62 = builder8.logLevel;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(errorHandler2);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(server9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "default" + "'", str12, "default");
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNull(server22);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(server42);
        org.junit.Assert.assertNull(logLevel43);
        org.junit.Assert.assertNull(requestInterceptor44);
        org.junit.Assert.assertNotNull(request46);
        org.junit.Assert.assertNotNull(gsonConverter47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "http://example.com/" + "'", str48, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "http://example.com/" + "'", str49, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler51);
        org.junit.Assert.assertNull(executor52);
        org.junit.Assert.assertNull(server54);
        org.junit.Assert.assertNull(log57);
        org.junit.Assert.assertTrue("'" + logLevel58 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel58.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel62 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel62.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.client.Request request2 = serializedObjectSupporter0.deserializeObjectRequest8();
        java.util.List<retrofit.client.Header> headerList3 = request2.headers;
        java.lang.String str4 = request2.url;
        java.util.List<retrofit.client.Header> headerList5 = request2.getHeaders();
        retrofit.mime.TypedOutput typedOutput6 = request2.getBody();
        java.util.List<retrofit.client.Header> headerList7 = request2.getHeaders();
        retrofit.mime.TypedOutput typedOutput8 = request2.getBody();
        java.lang.String str9 = request2.url;
        java.lang.String str10 = request2.getMethod();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(headerList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GET" + "'", str10, "GET");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest6();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        retrofit.ErrorHandler errorHandler4 = serializedObjectSupporter0.deserializeObjectErrorHandler1();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Request request7 = serializedObjectSupporter0.deserializeObjectRequest6();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "POST" + "'", str3, "POST");
        org.junit.Assert.assertNotNull(errorHandler4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(request7);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.mime.TypedString typedString6 = serializedObjectSupporter0.deserializeObjectTypedOutput2();
        retrofit.mime.TypedString typedString7 = serializedObjectSupporter0.deserializeObjectTypedOutput2();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Retrofit-" + "'", str4, "Retrofit-");
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(typedString6);
        org.junit.Assert.assertNotNull(typedString7);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel15;
        java.lang.String str17 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor18 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler19 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler20 = restAdapter10.getprofiler();
        retrofit.Server server21 = restAdapter10.server;
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-Idle" + "'", str17, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor18);
        org.junit.Assert.assertNull(profiler20);
        org.junit.Assert.assertNull(server21);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = builder0.server;
        retrofit.converter.Converter converter2 = null;
        builder0.converter = converter2;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.LogLevel logLevel5 = builder0.logLevel;
        retrofit.Server server6 = builder0.server;
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.getcallbackExecutor();
        retrofit.Server server10 = new retrofit.Server("Retrofit-");
        java.lang.String str11 = server10.name;
        retrofit.client.Client.Provider provider12 = null;
        java.util.concurrent.Executor executor13 = null;
        java.util.concurrent.Executor executor14 = null;
        retrofit.RequestInterceptor requestInterceptor15 = null;
        retrofit.converter.Converter converter16 = null;
        retrofit.Profiler profiler17 = null;
        retrofit.ErrorHandler errorHandler18 = null;
        retrofit.RestAdapter.Log log19 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.Server server21 = builder20.server;
        java.util.concurrent.Executor executor22 = null;
        builder20.httpExecutor = executor22;
        java.util.concurrent.Executor executor24 = builder20.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.FULL;
        builder20.logLevel = logLevel25;
        retrofit.RestAdapter restAdapter27 = new retrofit.RestAdapter(server10, provider12, executor13, executor14, requestInterceptor15, converter16, profiler17, errorHandler18, log19, logLevel25);
        java.util.concurrent.Executor executor28 = restAdapter27.getcallbackExecutor();
        int int29 = restAdapter27.getLOG_CHUNK_SIZE();
        java.util.List<retrofit.client.Header> headerList32 = null;
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "", headerList32, typedOutput33);
        retrofit.mime.TypedOutput typedOutput35 = request34.getBody();
        java.lang.String str36 = request34.url;
        retrofit.mime.TypedOutput typedOutput37 = request34.getBody();
        java.lang.String str38 = request34.getUrl();
        retrofit.client.Request request39 = restAdapter27.logAndReplaceRequest(request34);
        retrofit.RequestInterceptor requestInterceptor40 = restAdapter27.getrequestInterceptor();
        retrofit.Profiler profiler41 = restAdapter27.getprofiler();
        retrofit.Server server42 = restAdapter27.getserver();
        retrofit.Server server44 = new retrofit.Server("Retrofit-");
        java.lang.String str45 = server44.name;
        retrofit.client.Client.Provider provider46 = null;
        java.util.concurrent.Executor executor47 = null;
        java.util.concurrent.Executor executor48 = null;
        retrofit.RequestInterceptor requestInterceptor49 = null;
        retrofit.converter.Converter converter50 = null;
        retrofit.Profiler profiler51 = null;
        retrofit.ErrorHandler errorHandler52 = null;
        retrofit.RestAdapter.Log log53 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        retrofit.Server server55 = builder54.server;
        java.util.concurrent.Executor executor56 = null;
        builder54.httpExecutor = executor56;
        java.util.concurrent.Executor executor58 = builder54.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel59 = retrofit.RestAdapter.LogLevel.FULL;
        builder54.logLevel = logLevel59;
        retrofit.RestAdapter restAdapter61 = new retrofit.RestAdapter(server44, provider46, executor47, executor48, requestInterceptor49, converter50, profiler51, errorHandler52, log53, logLevel59);
        java.util.concurrent.Executor executor62 = restAdapter61.getcallbackExecutor();
        retrofit.converter.Converter converter63 = restAdapter61.converter;
        retrofit.RestAdapter.LogLevel logLevel64 = restAdapter61.logLevel;
        restAdapter27.logLevel = logLevel64;
        builder7.logLevel = logLevel64;
        builder0.logLevel = logLevel64;
        retrofit.RestAdapter.Log log68 = builder0.log;
        org.junit.Assert.assertNull(server1);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(server6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "default" + "'", str11, "default");
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(server21);
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4000 + "'", int29 == 4000);
        org.junit.Assert.assertNull(typedOutput35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(typedOutput37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNull(requestInterceptor40);
        org.junit.Assert.assertNull(profiler41);
        org.junit.Assert.assertNotNull(server42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "default" + "'", str45, "default");
        org.junit.Assert.assertNotNull(log53);
        org.junit.Assert.assertNull(server55);
        org.junit.Assert.assertNull(executor58);
        org.junit.Assert.assertTrue("'" + logLevel59 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel59.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor62);
        org.junit.Assert.assertNull(converter63);
        org.junit.Assert.assertTrue("'" + logLevel64 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel64.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(log68);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor19 = restAdapter10.getcallbackExecutor();
        retrofit.Server server20 = restAdapter10.getserver();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(errorHandler16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(server20);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel14 = null;
        restAdapter10.logLevel = logLevel14;
        retrofit.RestAdapter.LogLevel logLevel16 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter10.logLevel = logLevel16;
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        retrofit.Profiler profiler19 = restAdapter10.profiler;
        java.util.concurrent.Executor executor20 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel21 = restAdapter10.logLevel;
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertTrue("'" + logLevel16 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel16.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(profiler19);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.BASIC));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.mime.TypedString typedString3 = serializedObjectSupporter0.deserializeObjectTypedOutput2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.client.Request request5 = serializedObjectSupporter0.deserializeObjectRequest6();
        java.lang.String str6 = request5.method;
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(typedString3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GET" + "'", str6, "GET");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = builder0.server;
        retrofit.converter.Converter converter2 = null;
        builder0.converter = converter2;
        retrofit.RestAdapter.Log log4 = builder0.log;
        retrofit.RestAdapter.LogLevel logLevel5 = builder0.logLevel;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider7 = null;
        builder6.setclientProvider(provider7);
        retrofit.ErrorHandler errorHandler9 = builder6.errorHandler;
        retrofit.Server server12 = new retrofit.Server("POST", "");
        java.lang.String str13 = server12.getName();
        retrofit.RestAdapter.Builder builder14 = builder6.setServer(server12);
        retrofit.Server server15 = null;
        retrofit.client.Client.Provider provider16 = null;
        java.util.concurrent.Executor executor17 = null;
        java.util.concurrent.Executor executor18 = null;
        retrofit.RequestInterceptor requestInterceptor19 = null;
        retrofit.converter.Converter converter20 = null;
        retrofit.Profiler profiler21 = null;
        retrofit.ErrorHandler errorHandler22 = null;
        retrofit.RestAdapter.Log log23 = null;
        retrofit.RestAdapter.LogLevel logLevel24 = null;
        retrofit.RestAdapter restAdapter25 = new retrofit.RestAdapter(server15, provider16, executor17, executor18, requestInterceptor19, converter20, profiler21, errorHandler22, log23, logLevel24);
        retrofit.RestAdapter.RestHandler restHandler26 = restAdapter25.new RestHandler();
        retrofit.Server server27 = restAdapter25.server;
        retrofit.RestAdapter.LogLevel logLevel28 = restAdapter25.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor29 = restAdapter25.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request31 = serializedObjectSupporter30.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter30.deserializeObjectConverter1();
        java.lang.String str33 = serializedObjectSupporter30.deserializeObjectString4();
        java.lang.String str34 = serializedObjectSupporter30.deserializeObjectString4();
        restAdapter25.serializedObjectSupporter = serializedObjectSupporter30;
        retrofit.ErrorHandler errorHandler36 = restAdapter25.geterrorHandler();
        java.util.concurrent.Executor executor37 = restAdapter25.httpExecutor;
        retrofit.RestAdapter.Builder builder38 = new retrofit.RestAdapter.Builder();
        retrofit.Server server39 = builder38.server;
        retrofit.converter.Converter converter40 = null;
        builder38.converter = converter40;
        retrofit.RestAdapter.Log log42 = builder38.log;
        retrofit.RestAdapter.LogLevel logLevel43 = builder38.logLevel;
        restAdapter25.logLevel = logLevel43;
        retrofit.RestAdapter.Builder builder45 = builder6.setLogLevel(logLevel43);
        retrofit.RestAdapter.Builder builder46 = new retrofit.RestAdapter.Builder();
        retrofit.Server server47 = builder46.server;
        retrofit.converter.Converter converter48 = null;
        builder46.converter = converter48;
        retrofit.RestAdapter.Log log50 = builder46.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter51 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request52 = serializedObjectSupporter51.deserializeObjectRequest6();
        java.lang.String str53 = serializedObjectSupporter51.deserializeObjectString4();
        java.lang.String str54 = serializedObjectSupporter51.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler55 = serializedObjectSupporter51.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder56 = builder46.setErrorHandler(errorHandler55);
        java.util.concurrent.Executor executor57 = builder46.gethttpExecutor();
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request59 = serializedObjectSupporter58.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter60 = serializedObjectSupporter58.deserializeObjectConverter1();
        java.lang.String str61 = serializedObjectSupporter58.deserializeObjectString4();
        java.lang.String str62 = serializedObjectSupporter58.deserializeObjectString4();
        retrofit.client.Request request63 = serializedObjectSupporter58.deserializeObjectRequest3();
        retrofit.client.Request request64 = serializedObjectSupporter58.deserializeObjectRequest4();
        retrofit.ErrorHandler errorHandler65 = serializedObjectSupporter58.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder66 = builder46.setErrorHandler(errorHandler65);
        retrofit.RestAdapter.Builder builder67 = builder45.setErrorHandler(errorHandler65);
        retrofit.RestAdapter.Builder builder68 = builder0.setErrorHandler(errorHandler65);
        org.junit.Assert.assertNull(server1);
        org.junit.Assert.assertNull(log4);
        org.junit.Assert.assertTrue("'" + logLevel5 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel5.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(server27);
        org.junit.Assert.assertNull(logLevel28);
        org.junit.Assert.assertNull(requestInterceptor29);
        org.junit.Assert.assertNotNull(request31);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "http://example.com/" + "'", str33, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
        org.junit.Assert.assertNull(errorHandler36);
        org.junit.Assert.assertNull(executor37);
        org.junit.Assert.assertNull(server39);
        org.junit.Assert.assertNull(log42);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(server47);
        org.junit.Assert.assertNull(log50);
        org.junit.Assert.assertNotNull(request52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "http://example.com/" + "'", str53, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "http://example.com/" + "'", str54, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNull(executor57);
        org.junit.Assert.assertNotNull(request59);
        org.junit.Assert.assertNotNull(gsonConverter60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "http://example.com/" + "'", str61, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "http://example.com/" + "'", str62, "http://example.com/");
        org.junit.Assert.assertNotNull(request63);
        org.junit.Assert.assertNotNull(request64);
        org.junit.Assert.assertNotNull(errorHandler65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.getcallbackExecutor();
        retrofit.RequestInterceptor requestInterceptor2 = null;
        builder0.requestInterceptor = requestInterceptor2;
        java.util.concurrent.Executor executor4 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("default");
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.Server server8 = builder7.server;
        retrofit.converter.Converter converter9 = null;
        builder7.converter = converter9;
        retrofit.RestAdapter.Log log11 = builder7.log;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request13 = serializedObjectSupporter12.deserializeObjectRequest6();
        java.lang.String str14 = serializedObjectSupporter12.deserializeObjectString4();
        java.lang.String str15 = serializedObjectSupporter12.deserializeObjectString4();
        retrofit.ErrorHandler errorHandler16 = serializedObjectSupporter12.deserializeObjectErrorHandler1();
        retrofit.RestAdapter.Builder builder17 = builder7.setErrorHandler(errorHandler16);
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter5();
        retrofit.Server server20 = serializedObjectSupporter18.deserializeObjectServer1();
        retrofit.ErrorHandler errorHandler21 = serializedObjectSupporter18.deserializeObjectErrorHandler1();
        builder7.errorHandler = errorHandler21;
        builder6.errorHandler = errorHandler21;
        retrofit.client.Client.Provider provider24 = builder6.clientProvider;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(executor4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(server8);
        org.junit.Assert.assertNull(log11);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com/" + "'", str15, "http://example.com/");
        org.junit.Assert.assertNotNull(errorHandler16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(server20);
        org.junit.Assert.assertNotNull(errorHandler21);
        org.junit.Assert.assertNull(provider24);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.RestAdapter.RestHandler restHandler11 = restAdapter10.new RestHandler();
        retrofit.Server server12 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel13 = restAdapter10.getLogLevel();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request16 = serializedObjectSupporter15.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter1();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString4();
        java.lang.String str19 = serializedObjectSupporter15.deserializeObjectString4();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.client.Request request21 = serializedObjectSupporter15.deserializeObjectRequest1();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter15.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter15.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter15.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter15.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter15.deserializeObjectConverter8();
        retrofit.client.Request request27 = serializedObjectSupporter15.deserializeObjectRequest5();
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(logLevel13);
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(request27);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        retrofit.Server server0 = null;
        retrofit.client.Client.Provider provider1 = null;
        java.util.concurrent.Executor executor2 = null;
        java.util.concurrent.Executor executor3 = null;
        retrofit.RequestInterceptor requestInterceptor4 = null;
        retrofit.converter.Converter converter5 = null;
        retrofit.Profiler profiler6 = null;
        retrofit.ErrorHandler errorHandler7 = null;
        retrofit.RestAdapter.Log log8 = null;
        retrofit.RestAdapter.LogLevel logLevel9 = null;
        retrofit.RestAdapter restAdapter10 = new retrofit.RestAdapter(server0, provider1, executor2, executor3, requestInterceptor4, converter5, profiler6, errorHandler7, log8, logLevel9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request12 = serializedObjectSupporter11.deserializeObjectRequest6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter11;
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter11.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter11.deserializeObjectConverter1();
        retrofit.client.Request request17 = serializedObjectSupporter11.deserializeObjectRequest5();
        retrofit.client.Request request18 = serializedObjectSupporter11.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter11.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(gsonConverter19);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request1 = serializedObjectSupporter0.deserializeObjectRequest6();
        retrofit.client.Request request2 = serializedObjectSupporter0.deserializeObjectRequest8();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GET" + "'", str4, "GET");
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.getcallbackExecutor();
        retrofit.Server server2 = builder0.server;
        retrofit.RestAdapter.Log log3 = builder0.log;
        retrofit.Server server4 = builder0.server;
        retrofit.converter.Converter converter5 = builder0.converter;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("http://example.com/");
        retrofit.ErrorHandler errorHandler8 = builder7.errorHandler;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(server2);
        org.junit.Assert.assertNull(log3);
        org.junit.Assert.assertNull(server4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(errorHandler8);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.Server server1 = builder0.server;
        retrofit.Profiler profiler2 = builder0.profiler;
        retrofit.client.Client.Provider provider3 = null;
        builder0.setclientProvider(provider3);
        java.util.concurrent.Executor executor5 = builder0.getcallbackExecutor();
        retrofit.client.Client.Provider provider6 = null;
        builder0.clientProvider = provider6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Request request9 = serializedObjectSupporter8.deserializeObjectRequest6();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter8.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter8.deserializeObjectConverter4();
        retrofit.RestAdapter.Builder builder13 = builder0.setConverter((retrofit.converter.Converter) gsonConverter12);
        retrofit.Server server14 = null;
        retrofit.client.Client.Provider provider15 = null;
        java.util.concurrent.Executor executor16 = null;
        java.util.concurrent.Executor executor17 = null;
        retrofit.RequestInterceptor requestInterceptor18 = null;
        retrofit.converter.Converter converter19 = null;
        retrofit.Profiler profiler20 = null;
        retrofit.ErrorHandler errorHandler21 = null;
        retrofit.RestAdapter.Log log22 = null;
        retrofit.RestAdapter.LogLevel logLevel23 = null;
        retrofit.RestAdapter restAdapter24 = new retrofit.RestAdapter(server14, provider15, executor16, executor17, requestInterceptor18, converter19, profiler20, errorHandler21, log22, logLevel23);
        retrofit.RestAdapter.RestHandler restHandler25 = restAdapter24.new RestHandler();
        retrofit.Server server26 = restAdapter24.server;
        retrofit.RestAdapter.LogLevel logLevel27 = restAdapter24.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel28 = null;
        restAdapter24.logLevel = logLevel28;
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter24.logLevel = logLevel30;
        retrofit.client.Client.Provider provider32 = restAdapter24.clientProvider;
        retrofit.client.Client.Provider provider33 = restAdapter24.getclientProvider();
        retrofit.Server server34 = null;
        retrofit.client.Client.Provider provider35 = null;
        java.util.concurrent.Executor executor36 = null;
        java.util.concurrent.Executor executor37 = null;
        retrofit.RequestInterceptor requestInterceptor38 = null;
        retrofit.converter.Converter converter39 = null;
        retrofit.Profiler profiler40 = null;
        retrofit.ErrorHandler errorHandler41 = null;
        retrofit.RestAdapter.Log log42 = null;
        retrofit.RestAdapter.LogLevel logLevel43 = null;
        retrofit.RestAdapter restAdapter44 = new retrofit.RestAdapter(server34, provider35, executor36, executor37, requestInterceptor38, converter39, profiler40, errorHandler41, log42, logLevel43);
        retrofit.RestAdapter.RestHandler restHandler45 = restAdapter44.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler46 = restAdapter44.new RestHandler();
        java.util.concurrent.Executor executor47 = restAdapter44.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler48 = restAdapter44.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel49 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter44.logLevel = logLevel49;
        restAdapter24.setLogLevel(logLevel49);
        retrofit.RestAdapter.Builder builder52 = builder0.setLogLevel(logLevel49);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder54 = builder0.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server1);
        org.junit.Assert.assertNull(profiler2);
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(server26);
        org.junit.Assert.assertNull(logLevel27);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(provider32);
        org.junit.Assert.assertNull(provider33);
        org.junit.Assert.assertNull(executor47);
        org.junit.Assert.assertTrue("'" + logLevel49 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel49.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(builder52);
    }
}

