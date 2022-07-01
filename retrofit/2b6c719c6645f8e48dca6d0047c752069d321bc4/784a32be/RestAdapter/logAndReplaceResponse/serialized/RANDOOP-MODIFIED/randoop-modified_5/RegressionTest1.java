import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler17 = restAdapter10.getprofiler();
        retrofit.ErrorHandler errorHandler18 = restAdapter10.errorHandler;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(errorHandler18);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = builder15.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter2();
        builder15.serializedObjectSupporter = serializedObjectSupporter17;
        retrofit.RestAdapter.Builder builder22 = builder15.setServer("Retrofit-");
        java.util.concurrent.Executor executor23 = builder22.httpExecutor;
        java.util.concurrent.Executor executor24 = null;
        builder22.sethttpExecutor(executor24);
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = builder22.serializedObjectSupporter;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter26;
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter26.deserializeObjectConverter8();
        retrofit.ErrorHandler errorHandler29 = serializedObjectSupporter26.deserializeObjectErrorHandler1();
        retrofit.client.Response response30 = serializedObjectSupporter26.deserializeObjectResponse7();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(executor23);
        org.junit.Assert.assertNotNull(serializedObjectSupporter26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(errorHandler29);
        org.junit.Assert.assertNotNull(response30);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        builder0.requestInterceptor = requestInterceptor6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server10 = serializedObjectSupporter9.deserializeObjectServer1();
        builder8.server = server10;
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.BASIC;
        builder8.logLevel = logLevel12;
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server16 = serializedObjectSupporter15.deserializeObjectServer1();
        builder14.server = server16;
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.BASIC;
        builder14.logLevel = logLevel18;
        retrofit.RestAdapter restAdapter20 = builder14.build();
        java.util.concurrent.Executor executor21 = builder14.getcallbackExecutor();
        builder8.setcallbackExecutor(executor21);
        builder0.httpExecutor = executor21;
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor25 = builder24.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter26.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter26.deserializeObjectConverter2();
        builder24.serializedObjectSupporter = serializedObjectSupporter26;
        retrofit.RestAdapter.Builder builder31 = builder24.setServer("Retrofit-");
        java.util.concurrent.Executor executor32 = builder31.httpExecutor;
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server35 = serializedObjectSupporter34.deserializeObjectServer1();
        builder33.server = server35;
        retrofit.RestAdapter.LogLevel logLevel37 = builder33.logLevel;
        builder33.ensureSaneDefaults();
        java.util.concurrent.Executor executor39 = null;
        builder33.setcallbackExecutor(executor39);
        java.util.concurrent.Executor executor41 = null;
        builder33.callbackExecutor = executor41;
        retrofit.client.Client.Provider provider43 = builder33.clientProvider;
        builder31.setclientProvider(provider43);
        java.util.concurrent.Executor executor45 = builder31.gethttpExecutor();
        retrofit.RestAdapter restAdapter46 = builder31.build();
        java.util.concurrent.Executor executor47 = restAdapter46.httpExecutor;
        builder0.setcallbackExecutor(executor47);
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server51 = serializedObjectSupporter50.deserializeObjectServer1();
        builder49.server = server51;
        java.util.concurrent.Executor executor53 = null;
        builder49.setcallbackExecutor(executor53);
        retrofit.RestAdapter.LogLevel logLevel55 = retrofit.RestAdapter.LogLevel.FULL;
        builder49.logLevel = logLevel55;
        retrofit.RestAdapter.Log log57 = retrofit.RestAdapter.Log.NONE;
        builder49.log = log57;
        log57.log("");
        log57.log("http://example.com/");
        retrofit.RestAdapter.Builder builder63 = builder0.setLog(log57);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(server10);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter20);
        org.junit.Assert.assertNotNull(executor21);
        org.junit.Assert.assertNull(executor25);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(executor32);
        org.junit.Assert.assertNotNull(server35);
        org.junit.Assert.assertTrue("'" + logLevel37 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel37.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider43);
        org.junit.Assert.assertNull(executor45);
        org.junit.Assert.assertNotNull(restAdapter46);
        org.junit.Assert.assertNotNull(executor47);
        org.junit.Assert.assertNotNull(server51);
        org.junit.Assert.assertTrue("'" + logLevel55 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel55.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(log57);
        org.junit.Assert.assertNotNull(builder63);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.Log log16 = restAdapter10.log;
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        java.lang.String str18 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(log16);
        org.junit.Assert.assertNull(logLevel17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-" + "'", str18, "Retrofit-");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = builder15.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter2();
        builder15.serializedObjectSupporter = serializedObjectSupporter17;
        retrofit.RestAdapter.Builder builder22 = builder15.setServer("Retrofit-");
        java.util.concurrent.Executor executor23 = builder22.httpExecutor;
        java.util.concurrent.Executor executor24 = null;
        builder22.sethttpExecutor(executor24);
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = builder22.serializedObjectSupporter;
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter26;
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter26.deserializeObjectConverter8();
        retrofit.ErrorHandler errorHandler29 = serializedObjectSupporter26.deserializeObjectErrorHandler1();
        java.lang.String str30 = serializedObjectSupporter26.deserializeObjectString6();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter31 = serializedObjectSupporter26.deserializeObjectLogLevel1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: retrofit.RestAdapter$LogLevel cannot be cast to retrofit.RestAdapter");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(executor23);
        org.junit.Assert.assertNotNull(serializedObjectSupporter26);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(errorHandler29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://example.com/" + "'", str30, "http://example.com/");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.lang.Class class4 = serializedObjectSupporter0.deserializeObjectClass1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(class4);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        builder0.requestInterceptor = requestInterceptor6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server10 = serializedObjectSupporter9.deserializeObjectServer1();
        builder8.server = server10;
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.BASIC;
        builder8.logLevel = logLevel12;
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server16 = serializedObjectSupporter15.deserializeObjectServer1();
        builder14.server = server16;
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.BASIC;
        builder14.logLevel = logLevel18;
        retrofit.RestAdapter restAdapter20 = builder14.build();
        java.util.concurrent.Executor executor21 = builder14.getcallbackExecutor();
        builder8.setcallbackExecutor(executor21);
        builder0.httpExecutor = executor21;
        retrofit.RestAdapter.Builder builder25 = builder0.setServer("Internal Server Error");
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(server10);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter20);
        org.junit.Assert.assertNotNull(executor21);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        retrofit.Server server17 = restAdapter10.getserver();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(server17);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        java.util.concurrent.Executor executor16 = restAdapter10.httpExecutor;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter2();
        builder0.converter = gsonConverter10;
        retrofit.RequestInterceptor requestInterceptor12 = builder0.requestInterceptor;
        retrofit.Profiler profiler13 = builder0.profiler;
        retrofit.client.Client.Provider provider14 = builder0.clientProvider;
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor16 = builder15.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter17.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter2();
        builder15.serializedObjectSupporter = serializedObjectSupporter17;
        retrofit.Profiler profiler21 = null;
        builder15.profiler = profiler21;
        retrofit.RestAdapter.Builder builder24 = builder15.setServer("Retrofit-");
        retrofit.RestAdapter.LogLevel logLevel25 = builder24.logLevel;
        retrofit.RestAdapter.Builder builder26 = builder0.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder28 = builder0.setServer("http://example.com/");
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        java.util.concurrent.Executor executor6 = null;
        builder0.callbackExecutor = executor6;
        java.util.concurrent.Executor executor8 = builder0.gethttpExecutor();
        retrofit.ErrorHandler errorHandler9 = builder0.errorHandler;
        retrofit.converter.Converter converter10 = builder0.converter;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor12 = builder11.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter13.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter2();
        builder11.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.RestAdapter.Builder builder18 = builder11.setServer("Retrofit-");
        java.util.concurrent.Executor executor19 = builder18.httpExecutor;
        java.util.concurrent.Executor executor20 = null;
        builder18.sethttpExecutor(executor20);
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor23 = builder22.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter24.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter24.deserializeObjectConverter2();
        builder22.serializedObjectSupporter = serializedObjectSupporter24;
        retrofit.RestAdapter.Builder builder29 = builder22.setServer("Retrofit-");
        java.util.concurrent.Executor executor30 = builder29.httpExecutor;
        retrofit.RestAdapter.Builder builder31 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server33 = serializedObjectSupporter32.deserializeObjectServer1();
        builder31.server = server33;
        retrofit.RestAdapter.LogLevel logLevel35 = builder31.logLevel;
        builder31.ensureSaneDefaults();
        java.util.concurrent.Executor executor37 = null;
        builder31.setcallbackExecutor(executor37);
        java.util.concurrent.Executor executor39 = null;
        builder31.callbackExecutor = executor39;
        retrofit.client.Client.Provider provider41 = builder31.clientProvider;
        builder29.setclientProvider(provider41);
        builder18.setclientProvider(provider41);
        builder0.setclientProvider(provider41);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(errorHandler9);
        org.junit.Assert.assertNull(converter10);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(executor23);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(executor30);
        org.junit.Assert.assertNotNull(server33);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider41);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        retrofit.Profiler profiler17 = restAdapter10.getprofiler();
        retrofit.RestAdapter.Log log18 = restAdapter10.log;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertNull(log18);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler13);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.Profiler profiler6 = null;
        builder0.profiler = profiler6;
        builder0.ensureSaneDefaults();
        java.util.concurrent.Executor executor9 = builder0.callbackExecutor;
        retrofit.Profiler profiler10 = null;
        builder0.profiler = profiler10;
        retrofit.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder13 = builder0.setClient(client12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(executor9);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
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
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler16 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(errorHandler16);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = builder17.httpExecutor;
        retrofit.Profiler profiler19 = null;
        builder17.profiler = profiler19;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server23 = serializedObjectSupporter22.deserializeObjectServer1();
        builder21.server = server23;
        retrofit.RestAdapter.LogLevel logLevel25 = builder21.logLevel;
        java.util.concurrent.Executor executor26 = null;
        builder21.setcallbackExecutor(executor26);
        retrofit.ErrorHandler errorHandler28 = builder21.errorHandler;
        java.util.concurrent.Executor executor29 = null;
        builder21.setcallbackExecutor(executor29);
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter31.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter31.deserializeObjectConverter2();
        builder21.serializedObjectSupporter = serializedObjectSupporter31;
        retrofit.RestAdapter.Builder builder35 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor36 = builder35.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter37.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter37.deserializeObjectConverter2();
        builder35.serializedObjectSupporter = serializedObjectSupporter37;
        retrofit.RestAdapter.Builder builder42 = builder35.setServer("Retrofit-");
        java.util.concurrent.Executor executor43 = builder42.httpExecutor;
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server46 = serializedObjectSupporter45.deserializeObjectServer1();
        builder44.server = server46;
        retrofit.RestAdapter.LogLevel logLevel48 = builder44.logLevel;
        builder44.ensureSaneDefaults();
        java.util.concurrent.Executor executor50 = null;
        builder44.setcallbackExecutor(executor50);
        java.util.concurrent.Executor executor52 = null;
        builder44.callbackExecutor = executor52;
        retrofit.client.Client.Provider provider54 = builder44.clientProvider;
        builder42.setclientProvider(provider54);
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor57 = builder56.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter59 = serializedObjectSupporter58.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter60 = serializedObjectSupporter58.deserializeObjectConverter2();
        builder56.serializedObjectSupporter = serializedObjectSupporter58;
        retrofit.RestAdapter.Builder builder63 = builder56.setServer("Retrofit-");
        java.util.concurrent.Executor executor64 = builder63.httpExecutor;
        retrofit.RestAdapter.Builder builder65 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter66 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server67 = serializedObjectSupporter66.deserializeObjectServer1();
        builder65.server = server67;
        retrofit.RestAdapter.LogLevel logLevel69 = builder65.logLevel;
        builder65.ensureSaneDefaults();
        java.util.concurrent.Executor executor71 = null;
        builder65.setcallbackExecutor(executor71);
        java.util.concurrent.Executor executor73 = null;
        builder65.callbackExecutor = executor73;
        retrofit.client.Client.Provider provider75 = builder65.clientProvider;
        builder63.setclientProvider(provider75);
        builder42.setclientProvider(provider75);
        builder21.setclientProvider(provider75);
        retrofit.RestAdapter.Builder builder79 = builder17.setClient(provider75);
        retrofit.RestAdapter.Builder builder80 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter81 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server82 = serializedObjectSupporter81.deserializeObjectServer1();
        builder80.server = server82;
        retrofit.RestAdapter.LogLevel logLevel84 = builder80.logLevel;
        java.util.concurrent.Executor executor85 = null;
        builder80.setcallbackExecutor(executor85);
        retrofit.ErrorHandler errorHandler87 = builder80.errorHandler;
        java.util.concurrent.Executor executor88 = null;
        builder80.setcallbackExecutor(executor88);
        retrofit.RestAdapter.LogLevel logLevel90 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder91 = builder80.setLogLevel(logLevel90);
        builder79.logLevel = logLevel90;
        restAdapter10.logLevel = logLevel90;
        retrofit.RequestInterceptor requestInterceptor94 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.LogLevel logLevel95 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNotNull(server23);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler28);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNull(executor36);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNull(executor43);
        org.junit.Assert.assertNotNull(server46);
        org.junit.Assert.assertTrue("'" + logLevel48 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel48.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider54);
        org.junit.Assert.assertNull(executor57);
        org.junit.Assert.assertNotNull(gsonConverter59);
        org.junit.Assert.assertNotNull(gsonConverter60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNull(executor64);
        org.junit.Assert.assertNotNull(server67);
        org.junit.Assert.assertTrue("'" + logLevel69 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel69.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider75);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(server82);
        org.junit.Assert.assertTrue("'" + logLevel84 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel84.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler87);
        org.junit.Assert.assertTrue("'" + logLevel90 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel90.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNull(requestInterceptor94);
        org.junit.Assert.assertTrue("'" + logLevel95 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel95.equals(retrofit.RestAdapter.LogLevel.FULL));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        retrofit.Server server13 = restAdapter10.getserver();
        retrofit.converter.Converter converter14 = restAdapter10.getconverter();
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        retrofit.Server server16 = restAdapter10.server;
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertNull(server16);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        retrofit.client.Client.Provider provider18 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor19 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter10.new RestHandler();
        retrofit.Server server21 = restAdapter10.server;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNull(server21);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = restAdapter10.serializedObjectSupporter;
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.geterrorHandler();
        retrofit.RestAdapter.Log log15 = restAdapter10.log;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(log15);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Server server16 = restAdapter10.server;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor18 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider1 = builder0.clientProvider;
        retrofit.Profiler profiler2 = null;
        builder0.profiler = profiler2;
        builder0.ensureSaneDefaults();
        java.util.concurrent.Executor executor5 = null;
        builder0.callbackExecutor = executor5;
        org.junit.Assert.assertNull(provider1);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        retrofit.Server server14 = restAdapter10.server;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        retrofit.Server server16 = restAdapter10.getserver();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(server14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(server16);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Retrofit-Idle" + "'", str3, "Retrofit-Idle");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.client.Response response1 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.Class class2 = serializedObjectSupporter0.deserializeObjectClass1();
        retrofit.RequestInterceptor requestInterceptor3 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(requestInterceptor3);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.client.Request request19 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request20 = restAdapter10.logAndReplaceRequest(request19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.lang.String str7 = response6.reason;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restHandler17.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.LogLevel logLevel1 = builder0.logLevel;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter2 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + logLevel1 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel1.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.logLevel;
        java.lang.String str18 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(logLevel17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-" + "'", str18, "Retrofit-");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse4();
        java.lang.String str6 = response5.reason;
        java.lang.String str7 = response5.getReason();
        retrofit.mime.TypedInput typedInput8 = response5.body;
        int int9 = response5.status;
        retrofit.mime.TypedInput typedInput10 = response5.body;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OK" + "'", str7, "OK");
        org.junit.Assert.assertNull(typedInput8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertNull(typedInput10);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse4();
        retrofit.mime.TypedInput typedInput3 = response2.getBody();
        int int4 = response2.getStatus();
        int int5 = response2.status;
        retrofit.mime.TypedInput typedInput6 = response2.body;
        retrofit.mime.TypedInput typedInput7 = response2.body;
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(typedInput3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertNull(typedInput6);
        org.junit.Assert.assertNull(typedInput7);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        java.util.concurrent.Executor executor6 = builder0.getcallbackExecutor();
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor8 = builder7.httpExecutor;
        retrofit.RestAdapter.Log log9 = null;
        builder7.log = log9;
        java.util.concurrent.Executor executor11 = null;
        builder7.callbackExecutor = executor11;
        retrofit.Profiler profiler13 = null;
        builder7.profiler = profiler13;
        builder7.ensureSaneDefaults();
        java.util.concurrent.Executor executor16 = builder7.callbackExecutor;
        builder0.setcallbackExecutor(executor16);
        builder0.ensureSaneDefaults();
        retrofit.Server server19 = builder0.server;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(executor16);
        org.junit.Assert.assertNotNull(server19);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor17 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.BASIC;
        builder0.logLevel = logLevel4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = builder6.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter2();
        builder6.serializedObjectSupporter = serializedObjectSupporter8;
        java.util.concurrent.Executor executor12 = null;
        builder6.callbackExecutor = executor12;
        retrofit.Profiler profiler14 = null;
        builder6.profiler = profiler14;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor17 = builder16.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter2();
        builder16.serializedObjectSupporter = serializedObjectSupporter18;
        retrofit.RestAdapter.Builder builder23 = builder16.setServer("Retrofit-");
        java.util.concurrent.Executor executor24 = builder23.httpExecutor;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server27 = serializedObjectSupporter26.deserializeObjectServer1();
        builder25.server = server27;
        retrofit.RestAdapter.LogLevel logLevel29 = builder25.logLevel;
        builder25.ensureSaneDefaults();
        java.util.concurrent.Executor executor31 = null;
        builder25.setcallbackExecutor(executor31);
        java.util.concurrent.Executor executor33 = null;
        builder25.callbackExecutor = executor33;
        retrofit.client.Client.Provider provider35 = builder25.clientProvider;
        builder23.setclientProvider(provider35);
        retrofit.RestAdapter.Builder builder37 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor38 = builder37.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter40 = serializedObjectSupporter39.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter39.deserializeObjectConverter2();
        builder37.serializedObjectSupporter = serializedObjectSupporter39;
        retrofit.RestAdapter.Builder builder44 = builder37.setServer("Retrofit-");
        java.util.concurrent.Executor executor45 = builder44.httpExecutor;
        retrofit.RestAdapter.Builder builder46 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server48 = serializedObjectSupporter47.deserializeObjectServer1();
        builder46.server = server48;
        retrofit.RestAdapter.LogLevel logLevel50 = builder46.logLevel;
        builder46.ensureSaneDefaults();
        java.util.concurrent.Executor executor52 = null;
        builder46.setcallbackExecutor(executor52);
        java.util.concurrent.Executor executor54 = null;
        builder46.callbackExecutor = executor54;
        retrofit.client.Client.Provider provider56 = builder46.clientProvider;
        builder44.setclientProvider(provider56);
        builder23.setclientProvider(provider56);
        retrofit.RestAdapter.Builder builder59 = builder6.setClient(provider56);
        builder0.setclientProvider(provider56);
        retrofit.RequestInterceptor requestInterceptor61 = builder0.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor62 = null;
        builder0.requestInterceptor = requestInterceptor62;
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server66 = serializedObjectSupporter65.deserializeObjectServer1();
        builder64.server = server66;
        retrofit.RestAdapter.LogLevel logLevel68 = builder64.logLevel;
        retrofit.RestAdapter.Builder builder69 = builder0.setLogLevel(logLevel68);
        boolean boolean70 = logLevel68.log();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider35);
        org.junit.Assert.assertNull(executor38);
        org.junit.Assert.assertNotNull(gsonConverter40);
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNull(executor45);
        org.junit.Assert.assertNotNull(server48);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNull(requestInterceptor61);
        org.junit.Assert.assertNotNull(server66);
        org.junit.Assert.assertTrue("'" + logLevel68 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel68.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.ErrorHandler errorHandler7 = null;
        builder0.errorHandler = errorHandler7;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = builder0.serializedObjectSupporter;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(requestInterceptor6);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
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
        java.util.concurrent.Executor executor12 = restAdapter10.callbackExecutor;
        retrofit.client.Client.Provider provider13 = restAdapter10.getclientProvider();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.getrequestInterceptor();
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(requestInterceptor14);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter2();
        builder0.converter = gsonConverter10;
        retrofit.RequestInterceptor requestInterceptor12 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor13 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder15 = builder0.setServer("OK");
        retrofit.RestAdapter.Builder builder17 = builder15.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server20 = serializedObjectSupporter19.deserializeObjectServer1();
        builder18.server = server20;
        builder15.server = server20;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(server20);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
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
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        java.lang.Throwable throwable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable16, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(logLevel14);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
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
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor15 = restAdapter10.getrequestInterceptor();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(requestInterceptor15);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restAdapter10.serializedObjectSupporter;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.converter.Converter converter17 = restAdapter10.converter;
        retrofit.client.Request request18 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request19 = restAdapter10.logAndReplaceRequest(request18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(converter17);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.BASIC;
        builder0.logLevel = logLevel4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server8 = serializedObjectSupporter7.deserializeObjectServer1();
        builder6.server = server8;
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.BASIC;
        builder6.logLevel = logLevel10;
        retrofit.RestAdapter restAdapter12 = builder6.build();
        java.util.concurrent.Executor executor13 = builder6.getcallbackExecutor();
        builder0.setcallbackExecutor(executor13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter15.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter2();
        retrofit.client.Response response18 = serializedObjectSupporter15.deserializeObjectResponse4();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter15.deserializeObjectConverter2();
        retrofit.RestAdapter.Builder builder20 = builder0.setConverter((retrofit.converter.Converter) gsonConverter19);
        retrofit.Profiler profiler21 = builder20.profiler;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server8);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter12);
        org.junit.Assert.assertNotNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(profiler21);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter5();
        java.lang.String str18 = serializedObjectSupporter16.deserializeObjectString3();
        java.lang.String str19 = serializedObjectSupporter16.deserializeObjectString6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter16;
        retrofit.converter.Converter converter21 = restAdapter10.converter;
        java.util.concurrent.Executor executor22 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNull(converter21);
        org.junit.Assert.assertNull(executor22);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor15 = restAdapter10.httpExecutor;
        java.lang.String str16 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.Server server17 = restAdapter10.getserver();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(server17);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = null;
        builder0.requestInterceptor = requestInterceptor6;
        retrofit.RestAdapter.Builder builder8 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server10 = serializedObjectSupporter9.deserializeObjectServer1();
        builder8.server = server10;
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.BASIC;
        builder8.logLevel = logLevel12;
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server16 = serializedObjectSupporter15.deserializeObjectServer1();
        builder14.server = server16;
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.BASIC;
        builder14.logLevel = logLevel18;
        retrofit.RestAdapter restAdapter20 = builder14.build();
        java.util.concurrent.Executor executor21 = builder14.getcallbackExecutor();
        builder8.setcallbackExecutor(executor21);
        builder0.httpExecutor = executor21;
        retrofit.client.Client.Provider provider24 = builder0.clientProvider;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(server10);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server16);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter20);
        org.junit.Assert.assertNotNull(executor21);
        org.junit.Assert.assertNull(provider24);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        java.lang.String str13 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-" + "'", str13, "Retrofit-");
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler17 = restAdapter10.errorHandler;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(errorHandler17);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        java.util.concurrent.Executor executor18 = restAdapter10.callbackExecutor;
        retrofit.client.Client.Provider provider19 = restAdapter10.clientProvider;
        retrofit.client.Client.Provider provider20 = restAdapter10.getclientProvider();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.Server server15 = restAdapter10.server;
        retrofit.Profiler profiler16 = restAdapter10.getprofiler();
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.getrequestInterceptor();
        java.util.concurrent.Executor executor18 = restAdapter10.getcallbackExecutor();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(profiler16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter5();
        java.lang.String str18 = serializedObjectSupporter16.deserializeObjectString3();
        java.lang.String str19 = serializedObjectSupporter16.deserializeObjectString6();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter16;
        retrofit.converter.Converter converter21 = restAdapter10.converter;
        java.lang.Throwable throwable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable22, "Internal Server Error");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com/" + "'", str19, "http://example.com/");
        org.junit.Assert.assertNull(converter21);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter16 = restAdapter10.converter;
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        retrofit.RequestInterceptor requestInterceptor16 = restAdapter10.requestInterceptor;
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor18 = builder17.httpExecutor;
        retrofit.Profiler profiler19 = null;
        builder17.profiler = profiler19;
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server23 = serializedObjectSupporter22.deserializeObjectServer1();
        builder21.server = server23;
        retrofit.RestAdapter.LogLevel logLevel25 = builder21.logLevel;
        java.util.concurrent.Executor executor26 = null;
        builder21.setcallbackExecutor(executor26);
        retrofit.ErrorHandler errorHandler28 = builder21.errorHandler;
        java.util.concurrent.Executor executor29 = null;
        builder21.setcallbackExecutor(executor29);
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter31.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter31.deserializeObjectConverter2();
        builder21.serializedObjectSupporter = serializedObjectSupporter31;
        retrofit.RestAdapter.Builder builder35 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor36 = builder35.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter37.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter37.deserializeObjectConverter2();
        builder35.serializedObjectSupporter = serializedObjectSupporter37;
        retrofit.RestAdapter.Builder builder42 = builder35.setServer("Retrofit-");
        java.util.concurrent.Executor executor43 = builder42.httpExecutor;
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server46 = serializedObjectSupporter45.deserializeObjectServer1();
        builder44.server = server46;
        retrofit.RestAdapter.LogLevel logLevel48 = builder44.logLevel;
        builder44.ensureSaneDefaults();
        java.util.concurrent.Executor executor50 = null;
        builder44.setcallbackExecutor(executor50);
        java.util.concurrent.Executor executor52 = null;
        builder44.callbackExecutor = executor52;
        retrofit.client.Client.Provider provider54 = builder44.clientProvider;
        builder42.setclientProvider(provider54);
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor57 = builder56.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter59 = serializedObjectSupporter58.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter60 = serializedObjectSupporter58.deserializeObjectConverter2();
        builder56.serializedObjectSupporter = serializedObjectSupporter58;
        retrofit.RestAdapter.Builder builder63 = builder56.setServer("Retrofit-");
        java.util.concurrent.Executor executor64 = builder63.httpExecutor;
        retrofit.RestAdapter.Builder builder65 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter66 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server67 = serializedObjectSupporter66.deserializeObjectServer1();
        builder65.server = server67;
        retrofit.RestAdapter.LogLevel logLevel69 = builder65.logLevel;
        builder65.ensureSaneDefaults();
        java.util.concurrent.Executor executor71 = null;
        builder65.setcallbackExecutor(executor71);
        java.util.concurrent.Executor executor73 = null;
        builder65.callbackExecutor = executor73;
        retrofit.client.Client.Provider provider75 = builder65.clientProvider;
        builder63.setclientProvider(provider75);
        builder42.setclientProvider(provider75);
        builder21.setclientProvider(provider75);
        retrofit.RestAdapter.Builder builder79 = builder17.setClient(provider75);
        retrofit.RestAdapter.Builder builder80 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter81 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server82 = serializedObjectSupporter81.deserializeObjectServer1();
        builder80.server = server82;
        retrofit.RestAdapter.LogLevel logLevel84 = builder80.logLevel;
        java.util.concurrent.Executor executor85 = null;
        builder80.setcallbackExecutor(executor85);
        retrofit.ErrorHandler errorHandler87 = builder80.errorHandler;
        java.util.concurrent.Executor executor88 = null;
        builder80.setcallbackExecutor(executor88);
        retrofit.RestAdapter.LogLevel logLevel90 = retrofit.RestAdapter.LogLevel.FULL;
        retrofit.RestAdapter.Builder builder91 = builder80.setLogLevel(logLevel90);
        builder79.logLevel = logLevel90;
        restAdapter10.logLevel = logLevel90;
        retrofit.RestAdapter.Log log94 = restAdapter10.log;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(requestInterceptor16);
        org.junit.Assert.assertNull(executor18);
        org.junit.Assert.assertNotNull(server23);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler28);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNull(executor36);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNull(executor43);
        org.junit.Assert.assertNotNull(server46);
        org.junit.Assert.assertTrue("'" + logLevel48 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel48.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider54);
        org.junit.Assert.assertNull(executor57);
        org.junit.Assert.assertNotNull(gsonConverter59);
        org.junit.Assert.assertNotNull(gsonConverter60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNull(executor64);
        org.junit.Assert.assertNotNull(server67);
        org.junit.Assert.assertTrue("'" + logLevel69 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel69.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider75);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(server82);
        org.junit.Assert.assertTrue("'" + logLevel84 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel84.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler87);
        org.junit.Assert.assertTrue("'" + logLevel90 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel90.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNull(log94);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        java.util.concurrent.Executor executor6 = null;
        builder0.callbackExecutor = executor6;
        java.util.concurrent.Executor executor8 = builder0.gethttpExecutor();
        java.util.concurrent.Executor executor9 = builder0.gethttpExecutor();
        builder0.ensureSaneDefaults();
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.client.Client.Provider provider12 = builder11.clientProvider;
        retrofit.Profiler profiler13 = null;
        builder11.profiler = profiler13;
        builder11.ensureSaneDefaults();
        retrofit.client.Client.Provider provider16 = builder11.clientProvider;
        builder0.setclientProvider(provider16);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(executor9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(provider16);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        java.util.concurrent.Executor executor17 = restAdapter10.getcallbackExecutor();
        retrofit.converter.Converter converter18 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(converter18);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.logLevel;
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNull(converter16);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(errorHandler14);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.Server server13 = restAdapter10.getserver();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(server13);
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.converter.Converter converter15 = restAdapter10.getconverter();
        retrofit.client.Client.Provider provider16 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        retrofit.Server server18 = restAdapter10.server;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(server18);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse3();
        java.util.List<retrofit.client.Header> headerList5 = response4.headers;
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(headerList5);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.RestAdapter.Log log2 = null;
        builder0.log = log2;
        java.util.concurrent.Executor executor4 = null;
        builder0.callbackExecutor = executor4;
        retrofit.RequestInterceptor requestInterceptor6 = builder0.requestInterceptor;
        retrofit.converter.Converter converter7 = builder0.converter;
        retrofit.ErrorHandler errorHandler8 = builder0.errorHandler;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = builder0.serializedObjectSupporter;
        java.util.concurrent.Executor executor10 = null;
        builder0.sethttpExecutor(executor10);
        java.util.concurrent.Executor executor12 = builder0.gethttpExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(requestInterceptor6);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(errorHandler8);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNull(executor12);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        java.lang.String str18 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.Profiler profiler19 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor20 = restAdapter10.callbackExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
        org.junit.Assert.assertNull(profiler19);
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNull(serializedObjectSupporter21);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse1();
        java.lang.String str6 = response5.getReason();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OK" + "'", str6, "OK");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        java.util.concurrent.Executor executor6 = null;
        builder0.callbackExecutor = executor6;
        java.util.concurrent.Executor executor8 = builder0.gethttpExecutor();
        retrofit.RestAdapter.Builder builder10 = builder0.setServer("Retrofit-Idle");
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server13 = serializedObjectSupporter12.deserializeObjectServer1();
        builder11.server = server13;
        java.util.concurrent.Executor executor15 = null;
        builder11.setcallbackExecutor(executor15);
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.FULL;
        builder11.logLevel = logLevel17;
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor20 = builder19.httpExecutor;
        retrofit.RestAdapter.Log log21 = null;
        builder19.log = log21;
        java.util.concurrent.Executor executor23 = null;
        builder19.callbackExecutor = executor23;
        retrofit.RequestInterceptor requestInterceptor25 = null;
        builder19.requestInterceptor = requestInterceptor25;
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server29 = serializedObjectSupporter28.deserializeObjectServer1();
        builder27.server = server29;
        retrofit.RestAdapter.LogLevel logLevel31 = retrofit.RestAdapter.LogLevel.BASIC;
        builder27.logLevel = logLevel31;
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server35 = serializedObjectSupporter34.deserializeObjectServer1();
        builder33.server = server35;
        retrofit.RestAdapter.LogLevel logLevel37 = retrofit.RestAdapter.LogLevel.BASIC;
        builder33.logLevel = logLevel37;
        retrofit.RestAdapter restAdapter39 = builder33.build();
        java.util.concurrent.Executor executor40 = builder33.getcallbackExecutor();
        builder27.setcallbackExecutor(executor40);
        builder19.httpExecutor = executor40;
        builder11.setcallbackExecutor(executor40);
        java.util.concurrent.Executor executor44 = builder11.getcallbackExecutor();
        builder0.setcallbackExecutor(executor44);
        retrofit.RestAdapter.Log log46 = builder0.log;
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(server13);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertNull(executor20);
        org.junit.Assert.assertNotNull(server29);
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(server35);
        org.junit.Assert.assertTrue("'" + logLevel37 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel37.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNotNull(restAdapter39);
        org.junit.Assert.assertNotNull(executor40);
        org.junit.Assert.assertNotNull(executor44);
        org.junit.Assert.assertNull(log46);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor15 = restAdapter10.getcallbackExecutor();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        java.lang.String str17 = restAdapter10.getTHREAD_PREFIX();
        retrofit.Profiler profiler18 = restAdapter10.profiler;
        retrofit.converter.Converter converter19 = restAdapter10.getconverter();
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.BASIC;
        boolean boolean21 = logLevel20.log();
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.setLogLevel(logLevel20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Log level may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(executor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Retrofit-" + "'", str17, "Retrofit-");
        org.junit.Assert.assertNull(profiler18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.RestAdapter.LogLevel logLevel15 = restAdapter10.getLogLevel();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter16.deserializeObjectConverter5();
        java.lang.String str18 = serializedObjectSupporter16.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter16.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter16.deserializeObjectConverter3();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter16;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(logLevel15);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restAdapter10.serializedObjectSupporter;
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider18 = restAdapter10.getclientProvider();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
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
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = restAdapter10.serializedObjectSupporter;
        retrofit.Server server19 = restAdapter10.server;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNull(server19);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.Profiler profiler2 = null;
        builder0.profiler = profiler2;
        retrofit.RestAdapter.Builder builder4 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server6 = serializedObjectSupporter5.deserializeObjectServer1();
        builder4.server = server6;
        retrofit.RestAdapter.LogLevel logLevel8 = builder4.logLevel;
        java.util.concurrent.Executor executor9 = null;
        builder4.setcallbackExecutor(executor9);
        retrofit.ErrorHandler errorHandler11 = builder4.errorHandler;
        java.util.concurrent.Executor executor12 = null;
        builder4.setcallbackExecutor(executor12);
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter14.deserializeObjectConverter2();
        builder4.serializedObjectSupporter = serializedObjectSupporter14;
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor19 = builder18.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter20.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter20.deserializeObjectConverter2();
        builder18.serializedObjectSupporter = serializedObjectSupporter20;
        retrofit.RestAdapter.Builder builder25 = builder18.setServer("Retrofit-");
        java.util.concurrent.Executor executor26 = builder25.httpExecutor;
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server29 = serializedObjectSupporter28.deserializeObjectServer1();
        builder27.server = server29;
        retrofit.RestAdapter.LogLevel logLevel31 = builder27.logLevel;
        builder27.ensureSaneDefaults();
        java.util.concurrent.Executor executor33 = null;
        builder27.setcallbackExecutor(executor33);
        java.util.concurrent.Executor executor35 = null;
        builder27.callbackExecutor = executor35;
        retrofit.client.Client.Provider provider37 = builder27.clientProvider;
        builder25.setclientProvider(provider37);
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor40 = builder39.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter42 = serializedObjectSupporter41.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter43 = serializedObjectSupporter41.deserializeObjectConverter2();
        builder39.serializedObjectSupporter = serializedObjectSupporter41;
        retrofit.RestAdapter.Builder builder46 = builder39.setServer("Retrofit-");
        java.util.concurrent.Executor executor47 = builder46.httpExecutor;
        retrofit.RestAdapter.Builder builder48 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server50 = serializedObjectSupporter49.deserializeObjectServer1();
        builder48.server = server50;
        retrofit.RestAdapter.LogLevel logLevel52 = builder48.logLevel;
        builder48.ensureSaneDefaults();
        java.util.concurrent.Executor executor54 = null;
        builder48.setcallbackExecutor(executor54);
        java.util.concurrent.Executor executor56 = null;
        builder48.callbackExecutor = executor56;
        retrofit.client.Client.Provider provider58 = builder48.clientProvider;
        builder46.setclientProvider(provider58);
        builder25.setclientProvider(provider58);
        builder4.setclientProvider(provider58);
        retrofit.RestAdapter.Builder builder62 = builder0.setClient(provider58);
        retrofit.RestAdapter.Builder builder64 = builder62.setServer("http://example.com/");
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(server6);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler11);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNull(executor19);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(executor26);
        org.junit.Assert.assertNotNull(server29);
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider37);
        org.junit.Assert.assertNull(executor40);
        org.junit.Assert.assertNotNull(gsonConverter42);
        org.junit.Assert.assertNotNull(gsonConverter43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNull(executor47);
        org.junit.Assert.assertNotNull(server50);
        org.junit.Assert.assertTrue("'" + logLevel52 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel52.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider58);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.Server server17 = restAdapter10.getserver();
        retrofit.client.Request request18 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request19 = restAdapter10.logAndReplaceRequest(request18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(server17);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
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
        retrofit.converter.Converter converter12 = restAdapter10.getconverter();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter14.deserializeObjectConverter2();
        java.lang.String str17 = serializedObjectSupporter14.deserializeObjectString10();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter14;
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter10.new RestHandler();
        retrofit.client.Client.Provider provider21 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel22 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNull(logLevel19);
        org.junit.Assert.assertNull(provider21);
        org.junit.Assert.assertNull(logLevel22);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.gethttpExecutor();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Server server16 = restAdapter10.server;
        java.util.concurrent.Executor executor17 = restAdapter10.callbackExecutor;
        retrofit.client.Client.Provider provider18 = restAdapter10.clientProvider;
        java.lang.String str19 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.client.Client.Provider provider20 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler21 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Retrofit-Idle" + "'", str19, "Retrofit-Idle");
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
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
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        java.lang.String str13 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RequestInterceptor requestInterceptor14 = restAdapter10.requestInterceptor;
        retrofit.ErrorHandler errorHandler15 = restAdapter10.geterrorHandler();
        java.lang.String str16 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.Log log17 = restAdapter10.log;
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Retrofit-Idle" + "'", str13, "Retrofit-Idle");
        org.junit.Assert.assertNull(requestInterceptor14);
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-Idle" + "'", str16, "Retrofit-Idle");
        org.junit.Assert.assertNull(log17);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.ErrorHandler errorHandler17 = restAdapter10.errorHandler;
        retrofit.converter.Converter converter18 = restAdapter10.getconverter();
        retrofit.converter.Converter converter19 = restAdapter10.getconverter();
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter10.logLevel;
        java.lang.String str21 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(logLevel20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Retrofit-Idle" + "'", str21, "Retrofit-Idle");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
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
        retrofit.Server server14 = restAdapter10.server;
        org.junit.Assert.assertNull(server14);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = restAdapter10.serializedObjectSupporter;
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        java.util.concurrent.Executor executor14 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        retrofit.client.Response response2 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response3);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.Profiler profiler14 = restAdapter10.profiler;
        retrofit.Server server15 = restAdapter10.getserver();
        retrofit.Server server16 = restAdapter10.getserver();
        retrofit.client.Client.Provider provider17 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor18 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(executor18);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
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
        retrofit.converter.Converter converter12 = restAdapter10.getconverter();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter14.deserializeObjectConverter2();
        java.lang.String str17 = serializedObjectSupporter14.deserializeObjectString10();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter14;
        retrofit.RestAdapter.Log log19 = restAdapter10.log;
        retrofit.RestAdapter.RestHandler restHandler20 = restAdapter10.new RestHandler();
        retrofit.converter.Converter converter21 = restAdapter10.converter;
        retrofit.RestAdapter.LogLevel logLevel22 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNull(log19);
        org.junit.Assert.assertNull(converter21);
        org.junit.Assert.assertNull(logLevel22);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Server server16 = restAdapter10.server;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        retrofit.Server server18 = restAdapter10.getserver();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(server16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(server18);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        java.lang.String str14 = restAdapter10.getTHREAD_PREFIX();
        retrofit.converter.Converter converter15 = restAdapter10.getconverter();
        retrofit.client.Client.Provider provider16 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor17 = restAdapter10.gethttpExecutor();
        java.lang.String str18 = restAdapter10.getIDLE_THREAD_NAME();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Retrofit-" + "'", str14, "Retrofit-");
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Retrofit-Idle" + "'", str18, "Retrofit-Idle");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.Server server17 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler18 = restAdapter10.new RestHandler();
        retrofit.client.Request request19 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request20 = restAdapter10.logAndReplaceRequest(request19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(server17);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.client.Response response3 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.RequestInterceptor requestInterceptor4 = serializedObjectSupporter0.deserializeObjectRequestInterceptor1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(requestInterceptor4);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.logLevel;
        retrofit.client.Client.Provider provider15 = restAdapter10.getclientProvider();
        retrofit.Profiler profiler16 = restAdapter10.profiler;
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(profiler16);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server1 = serializedObjectSupporter0.deserializeObjectServer1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString10();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.client.Response response4 = serializedObjectSupporter0.deserializeObjectResponse7();
        org.junit.Assert.assertNotNull(server1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = builder0.httpExecutor;
        java.util.concurrent.Executor executor6 = builder0.getcallbackExecutor();
        retrofit.Profiler profiler7 = null;
        builder0.profiler = profiler7;
        java.util.concurrent.Executor executor9 = builder0.getcallbackExecutor();
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(executor5);
        org.junit.Assert.assertNull(executor6);
        org.junit.Assert.assertNull(executor9);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter2();
        builder0.serializedObjectSupporter = serializedObjectSupporter2;
        retrofit.RestAdapter.Builder builder7 = builder0.setServer("Retrofit-");
        retrofit.RestAdapter.Log log8 = builder0.log;
        retrofit.Profiler profiler9 = null;
        builder0.profiler = profiler9;
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor12 = builder11.httpExecutor;
        retrofit.RestAdapter.Log log13 = null;
        builder11.log = log13;
        java.util.concurrent.Executor executor15 = null;
        builder11.callbackExecutor = executor15;
        java.util.concurrent.Executor executor17 = builder11.gethttpExecutor();
        retrofit.RestAdapter.LogLevel logLevel18 = builder11.logLevel;
        retrofit.RestAdapter.Builder builder20 = builder11.setServer("hi!");
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server23 = serializedObjectSupporter22.deserializeObjectServer1();
        builder21.server = server23;
        retrofit.RestAdapter.LogLevel logLevel25 = builder21.logLevel;
        java.util.concurrent.Executor executor26 = null;
        builder21.setcallbackExecutor(executor26);
        retrofit.ErrorHandler errorHandler28 = builder21.errorHandler;
        java.util.concurrent.Executor executor29 = null;
        builder21.setcallbackExecutor(executor29);
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter31.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter31.deserializeObjectConverter2();
        builder21.serializedObjectSupporter = serializedObjectSupporter31;
        retrofit.RestAdapter.Builder builder35 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor36 = builder35.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter37.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter37.deserializeObjectConverter2();
        builder35.serializedObjectSupporter = serializedObjectSupporter37;
        retrofit.RestAdapter.Builder builder42 = builder35.setServer("Retrofit-");
        java.util.concurrent.Executor executor43 = builder42.httpExecutor;
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server46 = serializedObjectSupporter45.deserializeObjectServer1();
        builder44.server = server46;
        retrofit.RestAdapter.LogLevel logLevel48 = builder44.logLevel;
        builder44.ensureSaneDefaults();
        java.util.concurrent.Executor executor50 = null;
        builder44.setcallbackExecutor(executor50);
        java.util.concurrent.Executor executor52 = null;
        builder44.callbackExecutor = executor52;
        retrofit.client.Client.Provider provider54 = builder44.clientProvider;
        builder42.setclientProvider(provider54);
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor57 = builder56.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter59 = serializedObjectSupporter58.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter60 = serializedObjectSupporter58.deserializeObjectConverter2();
        builder56.serializedObjectSupporter = serializedObjectSupporter58;
        retrofit.RestAdapter.Builder builder63 = builder56.setServer("Retrofit-");
        java.util.concurrent.Executor executor64 = builder63.httpExecutor;
        retrofit.RestAdapter.Builder builder65 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter66 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server67 = serializedObjectSupporter66.deserializeObjectServer1();
        builder65.server = server67;
        retrofit.RestAdapter.LogLevel logLevel69 = builder65.logLevel;
        builder65.ensureSaneDefaults();
        java.util.concurrent.Executor executor71 = null;
        builder65.setcallbackExecutor(executor71);
        java.util.concurrent.Executor executor73 = null;
        builder65.callbackExecutor = executor73;
        retrofit.client.Client.Provider provider75 = builder65.clientProvider;
        builder63.setclientProvider(provider75);
        builder42.setclientProvider(provider75);
        builder21.setclientProvider(provider75);
        retrofit.RestAdapter.Builder builder79 = builder20.setClient(provider75);
        builder0.setclientProvider(provider75);
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(log8);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(server23);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(errorHandler28);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertNull(executor36);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNull(executor43);
        org.junit.Assert.assertNotNull(server46);
        org.junit.Assert.assertTrue("'" + logLevel48 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel48.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider54);
        org.junit.Assert.assertNull(executor57);
        org.junit.Assert.assertNotNull(gsonConverter59);
        org.junit.Assert.assertNotNull(gsonConverter60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNull(executor64);
        org.junit.Assert.assertNotNull(server67);
        org.junit.Assert.assertTrue("'" + logLevel69 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel69.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider75);
        org.junit.Assert.assertNotNull(builder79);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = retrofit.RestAdapter.LogLevel.BASIC;
        builder0.logLevel = logLevel4;
        retrofit.RestAdapter.Builder builder6 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor7 = builder6.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter2();
        builder6.serializedObjectSupporter = serializedObjectSupporter8;
        java.util.concurrent.Executor executor12 = null;
        builder6.callbackExecutor = executor12;
        retrofit.Profiler profiler14 = null;
        builder6.profiler = profiler14;
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor17 = builder16.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter18.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter2();
        builder16.serializedObjectSupporter = serializedObjectSupporter18;
        retrofit.RestAdapter.Builder builder23 = builder16.setServer("Retrofit-");
        java.util.concurrent.Executor executor24 = builder23.httpExecutor;
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server27 = serializedObjectSupporter26.deserializeObjectServer1();
        builder25.server = server27;
        retrofit.RestAdapter.LogLevel logLevel29 = builder25.logLevel;
        builder25.ensureSaneDefaults();
        java.util.concurrent.Executor executor31 = null;
        builder25.setcallbackExecutor(executor31);
        java.util.concurrent.Executor executor33 = null;
        builder25.callbackExecutor = executor33;
        retrofit.client.Client.Provider provider35 = builder25.clientProvider;
        builder23.setclientProvider(provider35);
        retrofit.RestAdapter.Builder builder37 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor38 = builder37.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter40 = serializedObjectSupporter39.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter39.deserializeObjectConverter2();
        builder37.serializedObjectSupporter = serializedObjectSupporter39;
        retrofit.RestAdapter.Builder builder44 = builder37.setServer("Retrofit-");
        java.util.concurrent.Executor executor45 = builder44.httpExecutor;
        retrofit.RestAdapter.Builder builder46 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server48 = serializedObjectSupporter47.deserializeObjectServer1();
        builder46.server = server48;
        retrofit.RestAdapter.LogLevel logLevel50 = builder46.logLevel;
        builder46.ensureSaneDefaults();
        java.util.concurrent.Executor executor52 = null;
        builder46.setcallbackExecutor(executor52);
        java.util.concurrent.Executor executor54 = null;
        builder46.callbackExecutor = executor54;
        retrofit.client.Client.Provider provider56 = builder46.clientProvider;
        builder44.setclientProvider(provider56);
        builder23.setclientProvider(provider56);
        retrofit.RestAdapter.Builder builder59 = builder6.setClient(provider56);
        builder0.setclientProvider(provider56);
        retrofit.RequestInterceptor requestInterceptor61 = builder0.requestInterceptor;
        retrofit.RequestInterceptor requestInterceptor62 = null;
        builder0.requestInterceptor = requestInterceptor62;
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server66 = serializedObjectSupporter65.deserializeObjectServer1();
        builder64.server = server66;
        retrofit.RestAdapter.LogLevel logLevel68 = builder64.logLevel;
        retrofit.RestAdapter.Builder builder69 = builder0.setLogLevel(logLevel68);
        retrofit.RestAdapter.Log log70 = builder69.log;
        java.util.concurrent.Executor executor71 = builder69.httpExecutor;
        retrofit.client.Client client72 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder73 = builder69.setClient(client72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.BASIC));
        org.junit.Assert.assertNull(executor7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNull(executor17);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(executor24);
        org.junit.Assert.assertNotNull(server27);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider35);
        org.junit.Assert.assertNull(executor38);
        org.junit.Assert.assertNotNull(gsonConverter40);
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNull(executor45);
        org.junit.Assert.assertNotNull(server48);
        org.junit.Assert.assertTrue("'" + logLevel50 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel50.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNull(requestInterceptor61);
        org.junit.Assert.assertNotNull(server66);
        org.junit.Assert.assertTrue("'" + logLevel68 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel68.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNull(log70);
        org.junit.Assert.assertNull(executor71);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter2();
        builder0.converter = gsonConverter10;
        retrofit.RequestInterceptor requestInterceptor12 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor13 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder15 = builder0.setServer("OK");
        retrofit.RestAdapter.Builder builder17 = builder15.setServer("http://example.com/");
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server20 = serializedObjectSupporter19.deserializeObjectServer1();
        builder18.server = server20;
        retrofit.RestAdapter.LogLevel logLevel22 = builder18.logLevel;
        java.util.concurrent.Executor executor23 = null;
        builder18.setcallbackExecutor(executor23);
        retrofit.client.Client.Provider provider25 = builder18.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter26.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter26.deserializeObjectConverter2();
        builder18.converter = gsonConverter28;
        retrofit.RequestInterceptor requestInterceptor30 = builder18.requestInterceptor;
        java.util.concurrent.Executor executor31 = builder18.callbackExecutor;
        retrofit.converter.Converter converter32 = builder18.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = builder18.serializedObjectSupporter;
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor35 = builder34.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter36.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter36.deserializeObjectConverter2();
        builder34.serializedObjectSupporter = serializedObjectSupporter36;
        retrofit.RestAdapter.Builder builder41 = builder34.setServer("Retrofit-");
        java.util.concurrent.Executor executor42 = builder41.httpExecutor;
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server45 = serializedObjectSupporter44.deserializeObjectServer1();
        builder43.server = server45;
        retrofit.RestAdapter.LogLevel logLevel47 = builder43.logLevel;
        builder43.ensureSaneDefaults();
        java.util.concurrent.Executor executor49 = null;
        builder43.setcallbackExecutor(executor49);
        java.util.concurrent.Executor executor51 = null;
        builder43.callbackExecutor = executor51;
        retrofit.client.Client.Provider provider53 = builder43.clientProvider;
        builder41.setclientProvider(provider53);
        java.util.concurrent.Executor executor55 = builder41.gethttpExecutor();
        retrofit.RestAdapter restAdapter56 = builder41.build();
        java.util.concurrent.Executor executor57 = restAdapter56.httpExecutor;
        builder18.callbackExecutor = executor57;
        retrofit.RestAdapter.Builder builder59 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor60 = builder59.httpExecutor;
        retrofit.RestAdapter.Log log61 = null;
        builder59.log = log61;
        java.util.concurrent.Executor executor63 = null;
        builder59.callbackExecutor = executor63;
        retrofit.Profiler profiler65 = null;
        builder59.profiler = profiler65;
        builder59.ensureSaneDefaults();
        java.util.concurrent.Executor executor68 = builder59.callbackExecutor;
        builder18.setcallbackExecutor(executor68);
        builder15.callbackExecutor = executor68;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(server20);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider25);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNull(requestInterceptor30);
        org.junit.Assert.assertNull(executor31);
        org.junit.Assert.assertNotNull(converter32);
        org.junit.Assert.assertNull(serializedObjectSupporter33);
        org.junit.Assert.assertNull(executor35);
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(executor42);
        org.junit.Assert.assertNotNull(server45);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNotNull(provider53);
        org.junit.Assert.assertNull(executor55);
        org.junit.Assert.assertNotNull(restAdapter56);
        org.junit.Assert.assertNotNull(executor57);
        org.junit.Assert.assertNull(executor60);
        org.junit.Assert.assertNotNull(executor68);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler17 = restAdapter10.getprofiler();
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.NONE;
        restAdapter10.logLevel = logLevel18;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(profiler17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://example.com/" + "'", str1, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter2();
        builder0.converter = gsonConverter10;
        retrofit.RequestInterceptor requestInterceptor12 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor13 = builder0.callbackExecutor;
        retrofit.RestAdapter.Builder builder15 = builder0.setServer("OK");
        retrofit.RestAdapter.Builder builder17 = builder15.setServer("http://example.com/");
        retrofit.RestAdapter.Log log18 = builder15.log;
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(log18);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.converter.Converter converter14 = restAdapter10.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restAdapter10.serializedObjectSupporter;
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        java.util.concurrent.Executor executor13 = restAdapter10.getcallbackExecutor();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.ErrorHandler errorHandler15 = restAdapter10.errorHandler;
        java.util.concurrent.Executor executor16 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(errorHandler15);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.Profiler profiler15 = restAdapter10.getprofiler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider17 = restAdapter10.clientProvider;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(profiler15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.ErrorHandler errorHandler14 = restAdapter10.errorHandler;
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.Server server16 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler17 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(errorHandler14);
        org.junit.Assert.assertNull(server16);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = restAdapter10.serializedObjectSupporter;
        retrofit.converter.Converter converter16 = restAdapter10.getconverter();
        java.util.concurrent.Executor executor17 = restAdapter10.httpExecutor;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(serializedObjectSupporter15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor13 = restAdapter10.requestInterceptor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = restAdapter10.serializedObjectSupporter;
        retrofit.client.Client.Provider provider15 = restAdapter10.clientProvider;
        java.lang.String str16 = restAdapter10.getTHREAD_PREFIX();
        retrofit.converter.Converter converter17 = restAdapter10.converter;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(requestInterceptor13);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Retrofit-" + "'", str16, "Retrofit-");
        org.junit.Assert.assertNull(converter17);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.LogLevel logLevel14 = restAdapter10.getLogLevel();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        java.lang.Throwable throwable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            restAdapter10.logException(throwable17, "http://example.com/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(logLevel14);
        org.junit.Assert.assertNull(executor16);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.LogLevel logLevel17 = restAdapter10.getLogLevel();
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(profiler14);
        org.junit.Assert.assertNull(logLevel17);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.client.Response response5 = serializedObjectSupporter0.deserializeObjectResponse7();
        retrofit.client.Response response6 = serializedObjectSupporter0.deserializeObjectResponse1();
        retrofit.client.Response response7 = serializedObjectSupporter0.deserializeObjectResponse3();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.client.Client.Provider provider13 = restAdapter10.clientProvider;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        retrofit.RestAdapter.LogLevel logLevel16 = restAdapter10.logLevel;
        retrofit.ErrorHandler errorHandler17 = restAdapter10.errorHandler;
        retrofit.converter.Converter converter18 = restAdapter10.getconverter();
        retrofit.converter.Converter converter19 = restAdapter10.getconverter();
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter10.logLevel;
        retrofit.client.Client.Provider provider21 = restAdapter10.getclientProvider();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(logLevel16);
        org.junit.Assert.assertNull(errorHandler17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(logLevel20);
        org.junit.Assert.assertNull(provider21);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
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
        retrofit.Server server11 = restAdapter10.getserver();
        retrofit.Server server12 = restAdapter10.getserver();
        retrofit.RestAdapter.RestHandler restHandler13 = restAdapter10.new RestHandler();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler15 = restAdapter10.new RestHandler();
        retrofit.RestAdapter.RestHandler restHandler16 = restAdapter10.new RestHandler();
        retrofit.client.Request request17 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request18 = restAdapter10.logAndReplaceRequest(request17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(server11);
        org.junit.Assert.assertNull(server12);
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString8();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.Server server4 = serializedObjectSupporter0.deserializeObjectServer1();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(server4);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        java.util.concurrent.Executor executor12 = restAdapter10.gethttpExecutor();
        retrofit.Profiler profiler13 = restAdapter10.getprofiler();
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        retrofit.Server server15 = restAdapter10.server;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = restAdapter10.serializedObjectSupporter;
        retrofit.RequestInterceptor requestInterceptor17 = restAdapter10.getrequestInterceptor();
        retrofit.ErrorHandler errorHandler18 = restAdapter10.geterrorHandler();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(executor12);
        org.junit.Assert.assertNull(profiler13);
        org.junit.Assert.assertNull(server15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNull(requestInterceptor17);
        org.junit.Assert.assertNull(errorHandler18);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.SerializedObjectSupporter serializedObjectSupporter1 = new retrofit.SerializedObjectSupporter();
        retrofit.Server server2 = serializedObjectSupporter1.deserializeObjectServer1();
        builder0.server = server2;
        retrofit.RestAdapter.LogLevel logLevel4 = builder0.logLevel;
        java.util.concurrent.Executor executor5 = null;
        builder0.setcallbackExecutor(executor5);
        retrofit.client.Client.Provider provider7 = builder0.clientProvider;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter8.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter2();
        builder0.converter = gsonConverter10;
        retrofit.RequestInterceptor requestInterceptor12 = builder0.requestInterceptor;
        retrofit.Profiler profiler13 = builder0.profiler;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder15 = builder0.setServer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be blank.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(server2);
        org.junit.Assert.assertTrue("'" + logLevel4 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel4.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNull(requestInterceptor12);
        org.junit.Assert.assertNull(profiler13);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter2.deserializeObjectConverter5();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter2.deserializeObjectConverter2();
        retrofit.RestAdapter.Builder builder6 = builder0.setConverter((retrofit.converter.Converter) gsonConverter5);
        retrofit.RequestInterceptor requestInterceptor7 = builder0.requestInterceptor;
        java.util.concurrent.Executor executor8 = builder0.callbackExecutor;
        retrofit.Profiler profiler9 = null;
        builder0.profiler = profiler9;
        java.util.concurrent.Executor executor11 = builder0.gethttpExecutor();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(requestInterceptor7);
        org.junit.Assert.assertNull(executor8);
        org.junit.Assert.assertNull(executor11);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
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
        retrofit.converter.Converter converter12 = restAdapter10.getconverter();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter14.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter14.deserializeObjectConverter2();
        java.lang.String str17 = serializedObjectSupporter14.deserializeObjectString10();
        restAdapter10.serializedObjectSupporter = serializedObjectSupporter14;
        retrofit.client.Client.Provider provider19 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.LogLevel logLevel20 = restAdapter10.getLogLevel();
        retrofit.Server server21 = restAdapter10.getserver();
        retrofit.client.Client.Provider provider22 = restAdapter10.getclientProvider();
        retrofit.RestAdapter.RestHandler restHandler23 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com/" + "'", str17, "http://example.com/");
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(logLevel20);
        org.junit.Assert.assertNull(server21);
        org.junit.Assert.assertNull(provider22);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.client.Client.Provider provider12 = restAdapter10.getclientProvider();
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        retrofit.RestAdapter.RestHandler restHandler14 = restAdapter10.new RestHandler();
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(executor13);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
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
        retrofit.Profiler profiler11 = restAdapter10.getprofiler();
        retrofit.converter.Converter converter12 = restAdapter10.converter;
        java.util.concurrent.Executor executor13 = restAdapter10.httpExecutor;
        java.util.concurrent.Executor executor14 = restAdapter10.getcallbackExecutor();
        java.lang.String str15 = restAdapter10.getIDLE_THREAD_NAME();
        java.util.concurrent.Executor executor16 = restAdapter10.gethttpExecutor();
        java.util.concurrent.Executor executor17 = restAdapter10.callbackExecutor;
        org.junit.Assert.assertNull(profiler11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(executor13);
        org.junit.Assert.assertNull(executor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Retrofit-Idle" + "'", str15, "Retrofit-Idle");
        org.junit.Assert.assertNull(executor16);
        org.junit.Assert.assertNull(executor17);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        java.util.concurrent.Executor executor1 = builder0.gethttpExecutor();
        retrofit.RequestInterceptor requestInterceptor2 = null;
        builder0.requestInterceptor = requestInterceptor2;
        retrofit.client.Client.Provider provider4 = builder0.getclientProvider();
        org.junit.Assert.assertNull(executor1);
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
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
        java.lang.String str12 = restAdapter10.getTHREAD_PREFIX();
        retrofit.ErrorHandler errorHandler13 = restAdapter10.geterrorHandler();
        retrofit.Profiler profiler14 = restAdapter10.getprofiler();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Retrofit-" + "'", str12, "Retrofit-");
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(profiler14);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
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
        retrofit.converter.Converter converter11 = restAdapter10.getconverter();
        retrofit.RestAdapter.RestHandler restHandler12 = restAdapter10.new RestHandler();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = restHandler12.serializedObjectSupporter;
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
    }
}

